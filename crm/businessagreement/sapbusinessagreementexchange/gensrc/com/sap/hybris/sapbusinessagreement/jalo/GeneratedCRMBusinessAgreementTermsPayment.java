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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CRMBusinessAgreementTermsPayment}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCRMBusinessAgreementTermsPayment extends GenericItem
{
	/** Qualifier of the <code>CRMBusinessAgreementTermsPayment.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>CRMBusinessAgreementTermsPayment.daysfrom1</code> attribute **/
	public static final String DAYSFROM1 = "daysfrom1";
	/** Qualifier of the <code>CRMBusinessAgreementTermsPayment.percentage1</code> attribute **/
	public static final String PERCENTAGE1 = "percentage1";
	/** Qualifier of the <code>CRMBusinessAgreementTermsPayment.daysfrom2</code> attribute **/
	public static final String DAYSFROM2 = "daysfrom2";
	/** Qualifier of the <code>CRMBusinessAgreementTermsPayment.percentage2</code> attribute **/
	public static final String PERCENTAGE2 = "percentage2";
	/** Qualifier of the <code>CRMBusinessAgreementTermsPayment.daysfrom3</code> attribute **/
	public static final String DAYSFROM3 = "daysfrom3";
	/** Qualifier of the <code>CRMBusinessAgreementTermsPayment.paymentmethod</code> attribute **/
	public static final String PAYMENTMETHOD = "paymentmethod";
	/** Qualifier of the <code>CRMBusinessAgreementTermsPayment.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(DAYSFROM1, AttributeMode.INITIAL);
		tmp.put(PERCENTAGE1, AttributeMode.INITIAL);
		tmp.put(DAYSFROM2, AttributeMode.INITIAL);
		tmp.put(PERCENTAGE2, AttributeMode.INITIAL);
		tmp.put(DAYSFROM3, AttributeMode.INITIAL);
		tmp.put(PAYMENTMETHOD, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.code</code> attribute.
	 * @return the code - Terms of Payment
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.code</code> attribute.
	 * @return the code - Terms of Payment
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.code</code> attribute. 
	 * @param value the code - Terms of Payment
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.code</code> attribute. 
	 * @param value the code - Terms of Payment
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.daysfrom1</code> attribute.
	 * @return the daysfrom1 - Days From Payment Deadline Base Date 1st Level
	 */
	public String getDaysfrom1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DAYSFROM1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.daysfrom1</code> attribute.
	 * @return the daysfrom1 - Days From Payment Deadline Base Date 1st Level
	 */
	public String getDaysfrom1()
	{
		return getDaysfrom1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.daysfrom1</code> attribute. 
	 * @param value the daysfrom1 - Days From Payment Deadline Base Date 1st Level
	 */
	public void setDaysfrom1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DAYSFROM1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.daysfrom1</code> attribute. 
	 * @param value the daysfrom1 - Days From Payment Deadline Base Date 1st Level
	 */
	public void setDaysfrom1(final String value)
	{
		setDaysfrom1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.daysfrom2</code> attribute.
	 * @return the daysfrom2 - Days from payment deadline base date, 2nd level
	 */
	public String getDaysfrom2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DAYSFROM2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.daysfrom2</code> attribute.
	 * @return the daysfrom2 - Days from payment deadline base date, 2nd level
	 */
	public String getDaysfrom2()
	{
		return getDaysfrom2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.daysfrom2</code> attribute. 
	 * @param value the daysfrom2 - Days from payment deadline base date, 2nd level
	 */
	public void setDaysfrom2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DAYSFROM2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.daysfrom2</code> attribute. 
	 * @param value the daysfrom2 - Days from payment deadline base date, 2nd level
	 */
	public void setDaysfrom2(final String value)
	{
		setDaysfrom2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.daysfrom3</code> attribute.
	 * @return the daysfrom3 - Days from Payment Deadline Base Date (Due Date Net Payment)
	 */
	public String getDaysfrom3(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DAYSFROM3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.daysfrom3</code> attribute.
	 * @return the daysfrom3 - Days from Payment Deadline Base Date (Due Date Net Payment)
	 */
	public String getDaysfrom3()
	{
		return getDaysfrom3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.daysfrom3</code> attribute. 
	 * @param value the daysfrom3 - Days from Payment Deadline Base Date (Due Date Net Payment)
	 */
	public void setDaysfrom3(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DAYSFROM3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.daysfrom3</code> attribute. 
	 * @param value the daysfrom3 - Days from Payment Deadline Base Date (Due Date Net Payment)
	 */
	public void setDaysfrom3(final String value)
	{
		setDaysfrom3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.description</code> attribute.
	 * @return the description - Explanation of Payment Terms
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.description</code> attribute.
	 * @return the description - Explanation of Payment Terms
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.description</code> attribute. 
	 * @param value the description - Explanation of Payment Terms
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.description</code> attribute. 
	 * @param value the description - Explanation of Payment Terms
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.paymentmethod</code> attribute.
	 * @return the paymentmethod - Payment Method
	 */
	public String getPaymentmethod(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTMETHOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.paymentmethod</code> attribute.
	 * @return the paymentmethod - Payment Method
	 */
	public String getPaymentmethod()
	{
		return getPaymentmethod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.paymentmethod</code> attribute. 
	 * @param value the paymentmethod - Payment Method
	 */
	public void setPaymentmethod(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTMETHOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.paymentmethod</code> attribute. 
	 * @param value the paymentmethod - Payment Method
	 */
	public void setPaymentmethod(final String value)
	{
		setPaymentmethod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.percentage1</code> attribute.
	 * @return the percentage1 - Cash Discount Rate, Level 1
	 */
	public String getPercentage1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PERCENTAGE1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.percentage1</code> attribute.
	 * @return the percentage1 - Cash Discount Rate, Level 1
	 */
	public String getPercentage1()
	{
		return getPercentage1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.percentage1</code> attribute. 
	 * @param value the percentage1 - Cash Discount Rate, Level 1
	 */
	public void setPercentage1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PERCENTAGE1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.percentage1</code> attribute. 
	 * @param value the percentage1 - Cash Discount Rate, Level 1
	 */
	public void setPercentage1(final String value)
	{
		setPercentage1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.percentage2</code> attribute.
	 * @return the percentage2 - Casn Discount Rate, Level 2
	 */
	public String getPercentage2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PERCENTAGE2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementTermsPayment.percentage2</code> attribute.
	 * @return the percentage2 - Casn Discount Rate, Level 2
	 */
	public String getPercentage2()
	{
		return getPercentage2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.percentage2</code> attribute. 
	 * @param value the percentage2 - Casn Discount Rate, Level 2
	 */
	public void setPercentage2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PERCENTAGE2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementTermsPayment.percentage2</code> attribute. 
	 * @param value the percentage2 - Casn Discount Rate, Level 2
	 */
	public void setPercentage2(final String value)
	{
		setPercentage2( getSession().getSessionContext(), value );
	}
	
}
