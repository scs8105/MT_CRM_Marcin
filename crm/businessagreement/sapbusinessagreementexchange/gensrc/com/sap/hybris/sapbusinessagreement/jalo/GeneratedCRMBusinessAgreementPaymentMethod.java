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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CRMBusinessAgreementPaymentMethod}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCRMBusinessAgreementPaymentMethod extends GenericItem
{
	/** Qualifier of the <code>CRMBusinessAgreementPaymentMethod.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>CRMBusinessAgreementPaymentMethod.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>CRMBusinessAgreementPaymentMethod.paymentuasge</code> attribute **/
	public static final String PAYMENTUASGE = "paymentuasge";
	/** Qualifier of the <code>CRMBusinessAgreementPaymentMethod.actvbankdetail</code> attribute **/
	public static final String ACTVBANKDETAIL = "actvbankdetail";
	/** Qualifier of the <code>CRMBusinessAgreementPaymentMethod.actvaddress</code> attribute **/
	public static final String ACTVADDRESS = "actvaddress";
	/** Qualifier of the <code>CRMBusinessAgreementPaymentMethod.sepa</code> attribute **/
	public static final String SEPA = "sepa";
	/** Qualifier of the <code>CRMBusinessAgreementPaymentMethod.dataorigin</code> attribute **/
	public static final String DATAORIGIN = "dataorigin";
	/** Qualifier of the <code>CRMBusinessAgreementPaymentMethod.text</code> attribute **/
	public static final String TEXT = "text";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(PAYMENTUASGE, AttributeMode.INITIAL);
		tmp.put(ACTVBANKDETAIL, AttributeMode.INITIAL);
		tmp.put(ACTVADDRESS, AttributeMode.INITIAL);
		tmp.put(SEPA, AttributeMode.INITIAL);
		tmp.put(DATAORIGIN, AttributeMode.INITIAL);
		tmp.put(TEXT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.actvaddress</code> attribute.
	 * @return the actvaddress - Bank Details/Payment Card Required
	 */
	public String getActvaddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACTVADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.actvaddress</code> attribute.
	 * @return the actvaddress - Bank Details/Payment Card Required
	 */
	public String getActvaddress()
	{
		return getActvaddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.actvaddress</code> attribute. 
	 * @param value the actvaddress - Bank Details/Payment Card Required
	 */
	public void setActvaddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACTVADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.actvaddress</code> attribute. 
	 * @param value the actvaddress - Bank Details/Payment Card Required
	 */
	public void setActvaddress(final String value)
	{
		setActvaddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.actvbankdetail</code> attribute.
	 * @return the actvbankdetail - Bank Details/Payment Card Required
	 */
	public String getActvbankdetail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACTVBANKDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.actvbankdetail</code> attribute.
	 * @return the actvbankdetail - Bank Details/Payment Card Required
	 */
	public String getActvbankdetail()
	{
		return getActvbankdetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.actvbankdetail</code> attribute. 
	 * @param value the actvbankdetail - Bank Details/Payment Card Required
	 */
	public void setActvbankdetail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACTVBANKDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.actvbankdetail</code> attribute. 
	 * @param value the actvbankdetail - Bank Details/Payment Card Required
	 */
	public void setActvbankdetail(final String value)
	{
		setActvbankdetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.code</code> attribute.
	 * @return the code - Payment Method
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.code</code> attribute.
	 * @return the code - Payment Method
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.code</code> attribute. 
	 * @param value the code - Payment Method
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.code</code> attribute. 
	 * @param value the code - Payment Method
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.country</code> attribute.
	 * @return the country - Country of Company
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.country</code> attribute.
	 * @return the country - Country of Company
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.country</code> attribute. 
	 * @param value the country - Country of Company
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.country</code> attribute. 
	 * @param value the country - Country of Company
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.dataorigin</code> attribute.
	 * @return the dataorigin - Payment Method: Data Origin of Customizing
	 */
	public String getDataorigin(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DATAORIGIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.dataorigin</code> attribute.
	 * @return the dataorigin - Payment Method: Data Origin of Customizing
	 */
	public String getDataorigin()
	{
		return getDataorigin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.dataorigin</code> attribute. 
	 * @param value the dataorigin - Payment Method: Data Origin of Customizing
	 */
	public void setDataorigin(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DATAORIGIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.dataorigin</code> attribute. 
	 * @param value the dataorigin - Payment Method: Data Origin of Customizing
	 */
	public void setDataorigin(final String value)
	{
		setDataorigin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.paymentuasge</code> attribute.
	 * @return the paymentuasge - Usage of Payment Method
	 */
	public String getPaymentuasge(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTUASGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.paymentuasge</code> attribute.
	 * @return the paymentuasge - Usage of Payment Method
	 */
	public String getPaymentuasge()
	{
		return getPaymentuasge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.paymentuasge</code> attribute. 
	 * @param value the paymentuasge - Usage of Payment Method
	 */
	public void setPaymentuasge(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTUASGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.paymentuasge</code> attribute. 
	 * @param value the paymentuasge - Usage of Payment Method
	 */
	public void setPaymentuasge(final String value)
	{
		setPaymentuasge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.sepa</code> attribute.
	 * @return the sepa - Indicator: SEPA Mandate Required for Payment Method
	 */
	public Boolean isSepa(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SEPA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.sepa</code> attribute.
	 * @return the sepa - Indicator: SEPA Mandate Required for Payment Method
	 */
	public Boolean isSepa()
	{
		return isSepa( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.sepa</code> attribute. 
	 * @return the sepa - Indicator: SEPA Mandate Required for Payment Method
	 */
	public boolean isSepaAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSepa( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.sepa</code> attribute. 
	 * @return the sepa - Indicator: SEPA Mandate Required for Payment Method
	 */
	public boolean isSepaAsPrimitive()
	{
		return isSepaAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.sepa</code> attribute. 
	 * @param value the sepa - Indicator: SEPA Mandate Required for Payment Method
	 */
	public void setSepa(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SEPA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.sepa</code> attribute. 
	 * @param value the sepa - Indicator: SEPA Mandate Required for Payment Method
	 */
	public void setSepa(final Boolean value)
	{
		setSepa( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.sepa</code> attribute. 
	 * @param value the sepa - Indicator: SEPA Mandate Required for Payment Method
	 */
	public void setSepa(final SessionContext ctx, final boolean value)
	{
		setSepa( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.sepa</code> attribute. 
	 * @param value the sepa - Indicator: SEPA Mandate Required for Payment Method
	 */
	public void setSepa(final boolean value)
	{
		setSepa( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.text</code> attribute.
	 * @return the text - Text for Payment Method
	 */
	public String getText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementPaymentMethod.text</code> attribute.
	 * @return the text - Text for Payment Method
	 */
	public String getText()
	{
		return getText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.text</code> attribute. 
	 * @param value the text - Text for Payment Method
	 */
	public void setText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementPaymentMethod.text</code> attribute. 
	 * @param value the text - Text for Payment Method
	 */
	public void setText(final String value)
	{
		setText( getSession().getSessionContext(), value );
	}
	
}
