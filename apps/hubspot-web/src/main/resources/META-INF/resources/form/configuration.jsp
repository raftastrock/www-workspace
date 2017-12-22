<%--
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
--%>

<%@ include file="/form/init.jsp" %>

<div class="container-fluid-1280 hubspot-form-portlet">
	<liferay-portlet:actionURL portletConfiguration="<%= true %>" var="configurationActionURL" />

	<aui:form action="<%= configurationActionURL %>" method="post" name="fm">
		<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />

		<liferay-ui:panel collapsible="<%= true %>" extended="<%= true %>" persistState="<%= true %>" title="hubspot-form-options">
			<aui:fieldset>
				<aui:input name="preferences--guid--" value="<%= hubSpotFormDisplayContext.getGUID() %>"/>
			</aui:fieldset>
		</liferay-ui:panel>

		<aui:button type="submit" />
	</aui:form>
</div>