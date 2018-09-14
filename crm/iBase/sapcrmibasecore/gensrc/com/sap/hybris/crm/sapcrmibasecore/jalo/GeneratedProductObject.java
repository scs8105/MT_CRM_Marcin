/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmibasecore.jalo;

import com.sap.hybris.crm.sapcrmibasecore.constants.SapcrmibasecoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ProductObject}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductObject extends GenericItem
{
	/** Qualifier of the <code>ProductObject.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>ProductObject.refProduct</code> attribute **/
	public static final String REFPRODUCT = "refProduct";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(REFPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductObject.code</code> attribute.
	 * @return the code - Code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductObject.code</code> attribute.
	 * @return the code - Code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductObject.code</code> attribute. 
	 * @param value the code - Code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductObject.code</code> attribute. 
	 * @param value the code - Code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductObject.refProduct</code> attribute.
	 * @return the refProduct - Product
	 */
	public Product getRefProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, REFPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductObject.refProduct</code> attribute.
	 * @return the refProduct - Product
	 */
	public Product getRefProduct()
	{
		return getRefProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductObject.refProduct</code> attribute. 
	 * @param value the refProduct - Product
	 */
	public void setRefProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, REFPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductObject.refProduct</code> attribute. 
	 * @param value the refProduct - Product
	 */
	public void setRefProduct(final Product value)
	{
		setRefProduct( getSession().getSessionContext(), value );
	}
	
}
