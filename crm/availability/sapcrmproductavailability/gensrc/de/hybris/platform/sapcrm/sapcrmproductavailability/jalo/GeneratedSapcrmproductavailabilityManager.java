/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sapcrm.sapcrmproductavailability.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.core.configuration.jalo.SAPRFCDestination;
import de.hybris.platform.sapcrm.sapcrmproductavailability.constants.SapcrmproductavailabilityConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SapcrmproductavailabilityManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcrmproductavailabilityManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapproductavailability_RFCDestination", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	@Override
	public String getName()
	{
		return SapcrmproductavailabilityConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductavailability_RFCDestination</code> attribute.
	 * @return the sapproductavailability_RFCDestination - RFC Destination for ATP
	 */
	public SAPRFCDestination getSapproductavailability_RFCDestination(final SessionContext ctx, final GenericItem item)
	{
		return (SAPRFCDestination)item.getProperty( ctx, SapcrmproductavailabilityConstants.Attributes.SAPConfiguration.SAPPRODUCTAVAILABILITY_RFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductavailability_RFCDestination</code> attribute.
	 * @return the sapproductavailability_RFCDestination - RFC Destination for ATP
	 */
	public SAPRFCDestination getSapproductavailability_RFCDestination(final SAPConfiguration item)
	{
		return getSapproductavailability_RFCDestination( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductavailability_RFCDestination</code> attribute. 
	 * @param value the sapproductavailability_RFCDestination - RFC Destination for ATP
	 */
	public void setSapproductavailability_RFCDestination(final SessionContext ctx, final GenericItem item, final SAPRFCDestination value)
	{
		item.setProperty(ctx, SapcrmproductavailabilityConstants.Attributes.SAPConfiguration.SAPPRODUCTAVAILABILITY_RFCDESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductavailability_RFCDestination</code> attribute. 
	 * @param value the sapproductavailability_RFCDestination - RFC Destination for ATP
	 */
	public void setSapproductavailability_RFCDestination(final SAPConfiguration item, final SAPRFCDestination value)
	{
		setSapproductavailability_RFCDestination( getSession().getSessionContext(), item, value );
	}
	
}
