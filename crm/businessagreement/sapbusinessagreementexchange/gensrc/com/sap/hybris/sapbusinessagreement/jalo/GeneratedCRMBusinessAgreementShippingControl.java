/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapbusinessagreement.jalo;

import com.sap.hybris.sapbusinessagreement.constants.SapbusinessagreementexchangeConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CRMBusinessAgreementShippingControl}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCRMBusinessAgreementShippingControl extends GenericItem
{
	/** Qualifier of the <code>CRMBusinessAgreementShippingControl.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>CRMBusinessAgreementShippingControl.text</code> attribute **/
	public static final String TEXT = "text";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(TEXT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementShippingControl.code</code> attribute.
	 * @return the code - Shipping Control
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementShippingControl.code</code> attribute.
	 * @return the code - Shipping Control
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementShippingControl.code</code> attribute. 
	 * @param value the code - Shipping Control
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementShippingControl.code</code> attribute. 
	 * @param value the code - Shipping Control
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementShippingControl.text</code> attribute.
	 * @return the text - Text Shipping Control Feature
	 */
	public String getText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementShippingControl.text</code> attribute.
	 * @return the text - Text Shipping Control Feature
	 */
	public String getText()
	{
		return getText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementShippingControl.text</code> attribute. 
	 * @param value the text - Text Shipping Control Feature
	 */
	public void setText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementShippingControl.text</code> attribute. 
	 * @param value the text - Text Shipping Control Feature
	 */
	public void setText(final String value)
	{
		setText( getSession().getSessionContext(), value );
	}
	
}
