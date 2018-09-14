/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmpricingbol.jalo;

import com.sap.hybris.crm.sapcrmpricingbol.constants.SapcrmpricingbolConstants;
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
 * Generated class for type <code>SapcrmpricingbolManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcrmpricingbolManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("sappricing_RFCDestination", AttributeMode.INITIAL);
		tmp.put("sapcrmpricingprocedure", AttributeMode.INITIAL);
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
		return SapcrmpricingbolConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcrmpricingprocedure</code> attribute.
	 * @return the sapcrmpricingprocedure - SAP CRM- Pricing Procedure
	 */
	public String getSapcrmpricingprocedure(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmpricingbolConstants.Attributes.SAPConfiguration.SAPCRMPRICINGPROCEDURE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcrmpricingprocedure</code> attribute.
	 * @return the sapcrmpricingprocedure - SAP CRM- Pricing Procedure
	 */
	public String getSapcrmpricingprocedure(final SAPConfiguration item)
	{
		return getSapcrmpricingprocedure( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcrmpricingprocedure</code> attribute. 
	 * @param value the sapcrmpricingprocedure - SAP CRM- Pricing Procedure
	 */
	public void setSapcrmpricingprocedure(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmpricingbolConstants.Attributes.SAPConfiguration.SAPCRMPRICINGPROCEDURE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcrmpricingprocedure</code> attribute. 
	 * @param value the sapcrmpricingprocedure - SAP CRM- Pricing Procedure
	 */
	public void setSapcrmpricingprocedure(final SAPConfiguration item, final String value)
	{
		setSapcrmpricingprocedure( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricing_RFCDestination</code> attribute.
	 * @return the sappricing_RFCDestination - RFC Destination for Pricing
	 */
	public SAPRFCDestination getSappricing_RFCDestination(final SessionContext ctx, final GenericItem item)
	{
		return (SAPRFCDestination)item.getProperty( ctx, SapcrmpricingbolConstants.Attributes.SAPConfiguration.SAPPRICING_RFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricing_RFCDestination</code> attribute.
	 * @return the sappricing_RFCDestination - RFC Destination for Pricing
	 */
	public SAPRFCDestination getSappricing_RFCDestination(final SAPConfiguration item)
	{
		return getSappricing_RFCDestination( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricing_RFCDestination</code> attribute. 
	 * @param value the sappricing_RFCDestination - RFC Destination for Pricing
	 */
	public void setSappricing_RFCDestination(final SessionContext ctx, final GenericItem item, final SAPRFCDestination value)
	{
		item.setProperty(ctx, SapcrmpricingbolConstants.Attributes.SAPConfiguration.SAPPRICING_RFCDESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricing_RFCDestination</code> attribute. 
	 * @param value the sappricing_RFCDestination - RFC Destination for Pricing
	 */
	public void setSappricing_RFCDestination(final SAPConfiguration item, final SAPRFCDestination value)
	{
		setSappricing_RFCDestination( getSession().getSessionContext(), item, value );
	}
	
}
