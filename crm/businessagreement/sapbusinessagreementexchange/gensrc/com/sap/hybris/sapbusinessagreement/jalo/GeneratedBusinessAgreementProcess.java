/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapbusinessagreement.jalo;

import com.sap.hybris.sapbusinessagreement.constants.SapbusinessagreementexchangeConstants;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreement;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.payment.PaymentInfo;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.processengine.jalo.BusinessProcess BusinessAgreementProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBusinessAgreementProcess extends BusinessProcess
{
	/** Qualifier of the <code>BusinessAgreementProcess.creditCardPaymentInfo</code> attribute **/
	public static final String CREDITCARDPAYMENTINFO = "creditCardPaymentInfo";
	/** Qualifier of the <code>BusinessAgreementProcess.businessAgreement</code> attribute **/
	public static final String BUSINESSAGREEMENT = "businessAgreement";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CREDITCARDPAYMENTINFO, AttributeMode.INITIAL);
		tmp.put(BUSINESSAGREEMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementProcess.businessAgreement</code> attribute.
	 * @return the businessAgreement - business agreement  Info
	 */
	public BusinessAgreement getBusinessAgreement(final SessionContext ctx)
	{
		return (BusinessAgreement)getProperty( ctx, BUSINESSAGREEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementProcess.businessAgreement</code> attribute.
	 * @return the businessAgreement - business agreement  Info
	 */
	public BusinessAgreement getBusinessAgreement()
	{
		return getBusinessAgreement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementProcess.businessAgreement</code> attribute. 
	 * @param value the businessAgreement - business agreement  Info
	 */
	public void setBusinessAgreement(final SessionContext ctx, final BusinessAgreement value)
	{
		setProperty(ctx, BUSINESSAGREEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementProcess.businessAgreement</code> attribute. 
	 * @param value the businessAgreement - business agreement  Info
	 */
	public void setBusinessAgreement(final BusinessAgreement value)
	{
		setBusinessAgreement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementProcess.creditCardPaymentInfo</code> attribute.
	 * @return the creditCardPaymentInfo - business agreement  credit card Info
	 */
	public PaymentInfo getCreditCardPaymentInfo(final SessionContext ctx)
	{
		return (PaymentInfo)getProperty( ctx, CREDITCARDPAYMENTINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementProcess.creditCardPaymentInfo</code> attribute.
	 * @return the creditCardPaymentInfo - business agreement  credit card Info
	 */
	public PaymentInfo getCreditCardPaymentInfo()
	{
		return getCreditCardPaymentInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementProcess.creditCardPaymentInfo</code> attribute. 
	 * @param value the creditCardPaymentInfo - business agreement  credit card Info
	 */
	public void setCreditCardPaymentInfo(final SessionContext ctx, final PaymentInfo value)
	{
		setProperty(ctx, CREDITCARDPAYMENTINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementProcess.creditCardPaymentInfo</code> attribute. 
	 * @param value the creditCardPaymentInfo - business agreement  credit card Info
	 */
	public void setCreditCardPaymentInfo(final PaymentInfo value)
	{
		setCreditCardPaymentInfo( getSession().getSessionContext(), value );
	}
	
}
