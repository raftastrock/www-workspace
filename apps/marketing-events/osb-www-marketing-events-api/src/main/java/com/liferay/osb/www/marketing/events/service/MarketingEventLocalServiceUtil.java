/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.osb.www.marketing.events.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for MarketingEvent. This utility wraps
 * {@link com.liferay.osb.www.marketing.events.service.impl.MarketingEventLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MarketingEventLocalService
 * @see com.liferay.osb.www.marketing.events.service.base.MarketingEventLocalServiceBaseImpl
 * @see com.liferay.osb.www.marketing.events.service.impl.MarketingEventLocalServiceImpl
 * @generated
 */
@ProviderType
public class MarketingEventLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.osb.www.marketing.events.service.impl.MarketingEventLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.osb.www.marketing.events.model.MarketingEvent addMarketingEvent(
		long userId, int type, java.lang.String defaultLanguageId,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.lang.String titleURL, java.lang.String hostedBy,
		java.lang.String hostedByURL,
		java.util.Map<java.util.Locale, java.lang.String> summaryMap,
		long siteGroupId, long imageFileEntryId, long slidesFileEntryId,
		java.lang.String videoTitle, java.lang.String timeZoneId,
		int startDateMonth, int startDateDay, int startDateYear,
		int startDateHour, int startDateMinute, int endDateMonth,
		int endDateDay, int endDateYear, int endDateHour, int endDateMinute,
		boolean dateTBA, java.lang.String addressStreet1,
		java.lang.String addressStreet2, java.lang.String addressStreet3,
		java.lang.String addressCity, java.lang.String addressZip,
		long addressRegionId, long addressCountryId, double latitude,
		double longitude, int globalRegion, boolean online,
		int registrationType, java.lang.String registrationURL,
		java.lang.String extraSettings,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addMarketingEvent(userId, type, defaultLanguageId,
			titleMap, titleURL, hostedBy, hostedByURL, summaryMap, siteGroupId,
			imageFileEntryId, slidesFileEntryId, videoTitle, timeZoneId,
			startDateMonth, startDateDay, startDateYear, startDateHour,
			startDateMinute, endDateMonth, endDateDay, endDateYear,
			endDateHour, endDateMinute, dateTBA, addressStreet1,
			addressStreet2, addressStreet3, addressCity, addressZip,
			addressRegionId, addressCountryId, latitude, longitude,
			globalRegion, online, registrationType, registrationURL,
			extraSettings, serviceContext);
	}

	/**
	* Adds the marketing event to the database. Also notifies the appropriate model listeners.
	*
	* @param marketingEvent the marketing event
	* @return the marketing event that was added
	*/
	public static com.liferay.osb.www.marketing.events.model.MarketingEvent addMarketingEvent(
		com.liferay.osb.www.marketing.events.model.MarketingEvent marketingEvent) {
		return getService().addMarketingEvent(marketingEvent);
	}

	/**
	* Creates a new marketing event with the primary key. Does not add the marketing event to the database.
	*
	* @param marketingEventId the primary key for the new marketing event
	* @return the new marketing event
	*/
	public static com.liferay.osb.www.marketing.events.model.MarketingEvent createMarketingEvent(
		long marketingEventId) {
		return getService().createMarketingEvent(marketingEventId);
	}

	/**
	* Deletes the marketing event with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param marketingEventId the primary key of the marketing event
	* @return the marketing event that was removed
	* @throws PortalException if a marketing event with the primary key could not be found
	*/
	public static com.liferay.osb.www.marketing.events.model.MarketingEvent deleteMarketingEvent(
		long marketingEventId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteMarketingEvent(marketingEventId);
	}

	/**
	* Deletes the marketing event from the database. Also notifies the appropriate model listeners.
	*
	* @param marketingEvent the marketing event
	* @return the marketing event that was removed
	* @throws PortalException
	*/
	public static com.liferay.osb.www.marketing.events.model.MarketingEvent deleteMarketingEvent(
		com.liferay.osb.www.marketing.events.model.MarketingEvent marketingEvent)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteMarketingEvent(marketingEvent);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.osb.www.marketing.events.model.impl.MarketingEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.osb.www.marketing.events.model.impl.MarketingEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.osb.www.marketing.events.model.MarketingEvent fetchMarketingEvent(
		long marketingEventId) {
		return getService().fetchMarketingEvent(marketingEventId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the marketing event with the primary key.
	*
	* @param marketingEventId the primary key of the marketing event
	* @return the marketing event
	* @throws PortalException if a marketing event with the primary key could not be found
	*/
	public static com.liferay.osb.www.marketing.events.model.MarketingEvent getMarketingEvent(
		long marketingEventId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getMarketingEvent(marketingEventId);
	}

	public static com.liferay.osb.www.marketing.events.model.MarketingEventAgendaDisplay getMarketingEventAgendaDisplay(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getMarketingEventAgendaDisplay(groupId);
	}

	public static java.util.List<com.liferay.osb.www.marketing.events.model.MarketingEvent> getMarketingEvents(
		int type, java.util.Date startDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getService().getMarketingEvents(type, startDate, start, end, obc);
	}

	/**
	* Returns a range of all the marketing events.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.osb.www.marketing.events.model.impl.MarketingEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of marketing events
	* @param end the upper bound of the range of marketing events (not inclusive)
	* @return the range of marketing events
	*/
	public static java.util.List<com.liferay.osb.www.marketing.events.model.MarketingEvent> getMarketingEvents(
		int start, int end) {
		return getService().getMarketingEvents(start, end);
	}

	public static java.util.List<com.liferay.osb.www.marketing.events.model.MarketingEvent> getMarketingEvents(
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getService().getMarketingEvents(type, start, end, obc);
	}

	public static java.util.List<com.liferay.osb.www.marketing.events.model.MarketingEvent> getMarketingEvents(
		int[] types, int[] globalRegions, long[] countryIds,
		int[] locationTypes, boolean pastEvents,
		java.lang.String userLanguageId, java.lang.String orderByCol,
		java.lang.String orderByType) {
		return getService()
				   .getMarketingEvents(types, globalRegions, countryIds,
			locationTypes, pastEvents, userLanguageId, orderByCol, orderByType);
	}

	/**
	* Returns the number of marketing events.
	*
	* @return the number of marketing events
	*/
	public static int getMarketingEventsCount() {
		return getService().getMarketingEventsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static com.liferay.osb.www.marketing.events.model.MarketingEvent getSiteGroupMarketingEvent(
		long siteGroupId) {
		return getService().getSiteGroupMarketingEvent(siteGroupId);
	}

	public static com.liferay.portal.kernel.search.Hits search(long companyId,
		java.lang.String title, java.lang.String summary, int[] types,
		int[] globalRegions, java.util.Date startDateGT,
		java.util.Date startDateLT, boolean andSearch, int start, int end,
		com.liferay.portal.kernel.search.Sort sort) {
		return getService()
				   .search(companyId, title, summary, types, globalRegions,
			startDateGT, startDateLT, andSearch, start, end, sort);
	}

	public static com.liferay.osb.www.marketing.events.model.MarketingEvent updateMarketingEvent(
		long marketingEventId, int type, java.lang.String defaultLanguageId,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.lang.String titleURL, java.lang.String hostedBy,
		java.lang.String hostedByURL,
		java.util.Map<java.util.Locale, java.lang.String> summaryMap,
		long siteGroupId, long imageFileEntryId, long slidesFileEntryId,
		java.lang.String videoTitle, java.lang.String timeZoneId,
		int startDateMonth, int startDateDay, int startDateYear,
		int startDateHour, int startDateMinute, int endDateMonth,
		int endDateDay, int endDateYear, int endDateHour, int endDateMinute,
		boolean dateTBA, java.lang.String addressStreet1,
		java.lang.String addressStreet2, java.lang.String addressStreet3,
		java.lang.String addressCity, java.lang.String addressZip,
		long addressRegionId, long addressCountryId, double latitude,
		double longitude, int globalRegion, boolean online,
		int registrationType, java.lang.String registrationURL,
		java.lang.String extraSettings,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateMarketingEvent(marketingEventId, type,
			defaultLanguageId, titleMap, titleURL, hostedBy, hostedByURL,
			summaryMap, siteGroupId, imageFileEntryId, slidesFileEntryId,
			videoTitle, timeZoneId, startDateMonth, startDateDay,
			startDateYear, startDateHour, startDateMinute, endDateMonth,
			endDateDay, endDateYear, endDateHour, endDateMinute, dateTBA,
			addressStreet1, addressStreet2, addressStreet3, addressCity,
			addressZip, addressRegionId, addressCountryId, latitude, longitude,
			globalRegion, online, registrationType, registrationURL,
			extraSettings, serviceContext);
	}

	/**
	* Updates the marketing event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param marketingEvent the marketing event
	* @return the marketing event that was updated
	*/
	public static com.liferay.osb.www.marketing.events.model.MarketingEvent updateMarketingEvent(
		com.liferay.osb.www.marketing.events.model.MarketingEvent marketingEvent) {
		return getService().updateMarketingEvent(marketingEvent);
	}

	public static MarketingEventLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MarketingEventLocalService, MarketingEventLocalService> _serviceTracker =
		ServiceTrackerFactory.open(MarketingEventLocalService.class);
}