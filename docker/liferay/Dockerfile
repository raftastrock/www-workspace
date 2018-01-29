FROM alpine:latest

MAINTAINER Ryan Schuhler <ryan.schuhler@liferay.com>

ARG JAVA_PACKAGE=openjdk8
ARG LIFERAY_BUNDLE=liferay-bundle.zip

RUN apk update \
  && apk upgrade \
  && apk add --no-cache bash curl $JAVA_PACKAGE tree unzip zip \
  && addgroup -S liferay \
  && adduser -S -G liferay liferay

ARG LIFERAY_DOWNLOAD_URL
ARG LIFERAY_FIXPACK_DOWNLOAD_URLS

ENV LIFERAY_HOME /opt/java/liferay

USER liferay

COPY --chown=liferay:liferay ./*.zip /opt/java/

RUN if [ ! -f "/opt/java/${LIFERAY_BUNDLE}" ] && [ "$LIFERAY_DOWNLOAD_URL" != "" ] \
  ; then \
    set -x \
    && curl -fSL "$LIFERAY_DOWNLOAD_URL" > /opt/java/${LIFERAY_BUNDLE} \
  ; fi

RUN if [[ ! -f "/opt/java/*.zip" ]] \
  ; then \
    set -x \
    && unzip /opt/java/${LIFERAY_BUNDLE} -d /opt/java \
    && rm /opt/java/*.zip \
    && find /opt/java -depth -maxdepth 1 -type d -name "liferay-*" -exec mv {} /opt/java/liferay \; \
    && mkdir -p /opt/java/liferay/deploy \
    && find /opt/java/liferay -depth -maxdepth 1 -type d -name "tomcat-*" -exec mv {} /opt/java/liferay/tomcat \; \
  ; fi

COPY --chown=liferay:liferay ./*.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/*.sh

EXPOSE 8080/tcp
EXPOSE 11311/tcp

COPY --chown=liferay:liferay ./resources/ ${LIFERAY_HOME}/

RUN apply-fix-packs.sh $LIFERAY_FIXPACK_DOWNLOAD_URLS

ENTRYPOINT ["entrypoint.sh"]
CMD ["/opt/java/liferay/tomcat/bin/catalina.sh", "run"]