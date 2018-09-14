/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.productregistrationaddon.jalo;

import com.sap.hybris.productregistrationaddon.constants.ProductregistrationaddonConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.productregistrationaddon.jalo.components.ProductRegistrationComponent;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.core.configuration.jalo.SAPRFCDestination;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>ProductregistrationaddonManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductregistrationaddonManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("productRegistrationRfcDestination", AttributeMode.INITIAL);
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
	
	public ProductRegistrationComponent createProductRegistrationComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ProductregistrationaddonConstants.TC.PRODUCTREGISTRATIONCOMPONENT );
			return (ProductRegistrationComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductRegistrationComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductRegistrationComponent createProductRegistrationComponent(final Map attributeValues)
	{
		return createProductRegistrationComponent( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return ProductregistrationaddonConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.productRegistrationRfcDestination</code> attribute.
	 * @return the productRegistrationRfcDestination - Represents the RFC destination of product registration
	 */
	public SAPRFCDestination getProductRegistrationRfcDestination(final SessionContext ctx, final GenericItem item)
	{
		return (SAPRFCDestination)item.getProperty( ctx, ProductregistrationaddonConstants.Attributes.SAPConfiguration.PRODUCTREGISTRATIONRFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.productRegistrationRfcDestination</code> attribute.
	 * @return the productRegistrationRfcDestination - Represents the RFC destination of product registration
	 */
	public SAPRFCDestination getProductRegistrationRfcDestination(final SAPConfiguration item)
	{
		return getProductRegistrationRfcDestination( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.productRegistrationRfcDestination</code> attribute. 
	 * @param value the productRegistrationRfcDestination - Represents the RFC destination of product registration
	 */
	public void setProductRegistrationRfcDestination(final SessionContext ctx, final GenericItem item, final SAPRFCDestination value)
	{
		item.setProperty(ctx, ProductregistrationaddonConstants.Attributes.SAPConfiguration.PRODUCTREGISTRATIONRFCDESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.productRegistrationRfcDestination</code> attribute. 
	 * @param value the productRegistrationRfcDestination - Represents the RFC destination of product registration
	 */
	public void setProductRegistrationRfcDestination(final SAPConfiguration item, final SAPRFCDestination value)
	{
		setProductRegistrationRfcDestination( getSession().getSessionContext(), item, value );
	}
	
}
