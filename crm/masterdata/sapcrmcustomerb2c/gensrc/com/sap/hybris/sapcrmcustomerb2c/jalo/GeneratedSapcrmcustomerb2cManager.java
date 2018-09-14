/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapcrmcustomerb2c.jalo;

import com.sap.hybris.sapcrmcustomerb2c.constants.Sapcrmcustomerb2cConstants;
import de.hybris.platform.commerceservices.jalo.consent.Consent;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>Sapcrmcustomerb2cManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcrmcustomerb2cManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("consentGuid", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.commerceservices.jalo.consent.Consent", Collections.unmodifiableMap(tmp));
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consent.consentGuid</code> attribute.
	 * @return the consentGuid - Consent guid
	 */
	public String getConsentGuid(final SessionContext ctx, final Consent item)
	{
		return (String)item.getProperty( ctx, Sapcrmcustomerb2cConstants.Attributes.Consent.CONSENTGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consent.consentGuid</code> attribute.
	 * @return the consentGuid - Consent guid
	 */
	public String getConsentGuid(final Consent item)
	{
		return getConsentGuid( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Consent.consentGuid</code> attribute. 
	 * @param value the consentGuid - Consent guid
	 */
	public void setConsentGuid(final SessionContext ctx, final Consent item, final String value)
	{
		item.setProperty(ctx, Sapcrmcustomerb2cConstants.Attributes.Consent.CONSENTGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Consent.consentGuid</code> attribute. 
	 * @param value the consentGuid - Consent guid
	 */
	public void setConsentGuid(final Consent item, final String value)
	{
		setConsentGuid( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return Sapcrmcustomerb2cConstants.EXTENSIONNAME;
	}
	
}
