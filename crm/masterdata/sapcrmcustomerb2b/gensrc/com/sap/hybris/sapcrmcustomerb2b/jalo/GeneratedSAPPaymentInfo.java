/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapcrmcustomerb2b.jalo;

import com.sap.hybris.sapcrmcustomerb2b.constants.Sapcrmcustomerb2bConstants;
import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SAPPaymentInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPPaymentInfo extends GenericItem
{
	/** Qualifier of the <code>SAPPaymentInfo.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>SAPPaymentInfo.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>SAPPaymentInfo.b2bunit</code> attribute **/
	public static final String B2BUNIT = "b2bunit";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n B2BUNIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSAPPaymentInfo> B2BUNITHANDLER = new BidirectionalOneToManyHandler<GeneratedSAPPaymentInfo>(
	Sapcrmcustomerb2bConstants.TC.SAPPAYMENTINFO,
	false,
	"b2bunit",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(B2BUNIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentInfo.b2bunit</code> attribute.
	 * @return the b2bunit
	 */
	public B2BUnit getB2bunit(final SessionContext ctx)
	{
		return (B2BUnit)getProperty( ctx, B2BUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentInfo.b2bunit</code> attribute.
	 * @return the b2bunit
	 */
	public B2BUnit getB2bunit()
	{
		return getB2bunit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentInfo.b2bunit</code> attribute. 
	 * @param value the b2bunit
	 */
	public void setB2bunit(final SessionContext ctx, final B2BUnit value)
	{
		B2BUNITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentInfo.b2bunit</code> attribute. 
	 * @param value the b2bunit
	 */
	public void setB2bunit(final B2BUnit value)
	{
		setB2bunit( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		B2BUNITHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentInfo.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public String getValidFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentInfo.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public String getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentInfo.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentInfo.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final String value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentInfo.validTo</code> attribute.
	 * @return the validTo
	 */
	public String getValidTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentInfo.validTo</code> attribute.
	 * @return the validTo
	 */
	public String getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentInfo.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentInfo.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final String value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
