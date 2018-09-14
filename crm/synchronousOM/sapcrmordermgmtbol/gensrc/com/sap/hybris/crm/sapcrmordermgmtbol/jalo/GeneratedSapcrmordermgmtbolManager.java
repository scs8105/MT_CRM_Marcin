/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmordermgmtbol.jalo;

import com.sap.hybris.crm.sapcrmordermgmtbol.constants.SapcrmordermgmtbolConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.core.configuration.jalo.SAPRFCDestination;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SapcrmordermgmtbolManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcrmordermgmtbolManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapordermgmt_RFCDestination", AttributeMode.INITIAL);
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
		return SapcrmordermgmtbolConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_RFCDestination</code> attribute.
	 * @return the sapordermgmt_RFCDestination - RFC Destination for Synchronous Order Management
	 */
	public SAPRFCDestination getSapordermgmt_RFCDestination(final SessionContext ctx, final GenericItem item)
	{
		return (SAPRFCDestination)item.getProperty( ctx, SapcrmordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_RFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_RFCDestination</code> attribute.
	 * @return the sapordermgmt_RFCDestination - RFC Destination for Synchronous Order Management
	 */
	public SAPRFCDestination getSapordermgmt_RFCDestination(final SAPConfiguration item)
	{
		return getSapordermgmt_RFCDestination( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_RFCDestination</code> attribute. 
	 * @param value the sapordermgmt_RFCDestination - RFC Destination for Synchronous Order Management
	 */
	public void setSapordermgmt_RFCDestination(final SessionContext ctx, final GenericItem item, final SAPRFCDestination value)
	{
		item.setProperty(ctx, SapcrmordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_RFCDESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_RFCDestination</code> attribute. 
	 * @param value the sapordermgmt_RFCDestination - RFC Destination for Synchronous Order Management
	 */
	public void setSapordermgmt_RFCDestination(final SAPConfiguration item, final SAPRFCDestination value)
	{
		setSapordermgmt_RFCDestination( getSession().getSessionContext(), item, value );
	}
	
}
