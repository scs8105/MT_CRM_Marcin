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
package de.hybris.platform.sap.sapcrminvoiceaddon.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.core.configuration.jalo.SAPRFCDestination;
import de.hybris.platform.sap.sapcrminvoiceaddon.constants.SapcrminvoiceaddonConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SapcrminvoiceaddonManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcrminvoiceaddonManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("saperp_logicalDestination", AttributeMode.INITIAL);
		tmp.put("sapbilling_RFCDestination", AttributeMode.INITIAL);
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
		return SapcrminvoiceaddonConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapbilling_RFCDestination</code> attribute.
	 * @return the sapbilling_RFCDestination - RFC Destination for Billing
	 */
	public SAPRFCDestination getSapbilling_RFCDestination(final SessionContext ctx, final GenericItem item)
	{
		return (SAPRFCDestination)item.getProperty( ctx, SapcrminvoiceaddonConstants.Attributes.SAPConfiguration.SAPBILLING_RFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapbilling_RFCDestination</code> attribute.
	 * @return the sapbilling_RFCDestination - RFC Destination for Billing
	 */
	public SAPRFCDestination getSapbilling_RFCDestination(final SAPConfiguration item)
	{
		return getSapbilling_RFCDestination( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapbilling_RFCDestination</code> attribute. 
	 * @param value the sapbilling_RFCDestination - RFC Destination for Billing
	 */
	public void setSapbilling_RFCDestination(final SessionContext ctx, final GenericItem item, final SAPRFCDestination value)
	{
		item.setProperty(ctx, SapcrminvoiceaddonConstants.Attributes.SAPConfiguration.SAPBILLING_RFCDESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapbilling_RFCDestination</code> attribute. 
	 * @param value the sapbilling_RFCDestination - RFC Destination for Billing
	 */
	public void setSapbilling_RFCDestination(final SAPConfiguration item, final SAPRFCDestination value)
	{
		setSapbilling_RFCDestination( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saperp_logicalDestination</code> attribute.
	 * @return the saperp_logicalDestination - Division for ERP
	 */
	public String getSaperp_logicalDestination(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrminvoiceaddonConstants.Attributes.SAPConfiguration.SAPERP_LOGICALDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saperp_logicalDestination</code> attribute.
	 * @return the saperp_logicalDestination - Division for ERP
	 */
	public String getSaperp_logicalDestination(final SAPConfiguration item)
	{
		return getSaperp_logicalDestination( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saperp_logicalDestination</code> attribute. 
	 * @param value the saperp_logicalDestination - Division for ERP
	 */
	public void setSaperp_logicalDestination(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrminvoiceaddonConstants.Attributes.SAPConfiguration.SAPERP_LOGICALDESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saperp_logicalDestination</code> attribute. 
	 * @param value the saperp_logicalDestination - Division for ERP
	 */
	public void setSaperp_logicalDestination(final SAPConfiguration item, final String value)
	{
		setSaperp_logicalDestination( getSession().getSessionContext(), item, value );
	}
	
}
