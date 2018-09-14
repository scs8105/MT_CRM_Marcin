/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapbusinessagreement.jalo;

import com.sap.hybris.sapbusinessagreement.constants.SapbusinessagreementexchangeConstants;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreementHeader;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementCorrepondingVariant;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementPaymentMethod;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementShippingControl;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementTermsPayment;
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BusinessAgreementRuleHeader}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBusinessAgreementRuleHeader extends GenericItem
{
	/** Qualifier of the <code>BusinessAgreementRuleHeader.businessruleguid</code> attribute **/
	public static final String BUSINESSRULEGUID = "businessruleguid";
	/** Qualifier of the <code>BusinessAgreementRuleHeader.validto</code> attribute **/
	public static final String VALIDTO = "validto";
	/** Qualifier of the <code>BusinessAgreementRuleHeader.validfrom</code> attribute **/
	public static final String VALIDFROM = "validfrom";
	/** Qualifier of the <code>BusinessAgreementRuleHeader.paymentmethodinc</code> attribute **/
	public static final String PAYMENTMETHODINC = "paymentmethodinc";
	/** Qualifier of the <code>BusinessAgreementRuleHeader.paymentmethodout</code> attribute **/
	public static final String PAYMENTMETHODOUT = "paymentmethodout";
	/** Qualifier of the <code>BusinessAgreementRuleHeader.shippingcontroldr</code> attribute **/
	public static final String SHIPPINGCONTROLDR = "shippingcontroldr";
	/** Qualifier of the <code>BusinessAgreementRuleHeader.termofpayment</code> attribute **/
	public static final String TERMOFPAYMENT = "termofpayment";
	/** Qualifier of the <code>BusinessAgreementRuleHeader.shippingcontrolbr</code> attribute **/
	public static final String SHIPPINGCONTROLBR = "shippingcontrolbr";
	/** Qualifier of the <code>BusinessAgreementRuleHeader.correpondencevariant</code> attribute **/
	public static final String CORREPONDENCEVARIANT = "correpondencevariant";
	/** Qualifier of the <code>BusinessAgreementRuleHeader.shippingcontrolbp</code> attribute **/
	public static final String SHIPPINGCONTROLBP = "shippingcontrolbp";
	/** Qualifier of the <code>BusinessAgreementRuleHeader.text</code> attribute **/
	public static final String TEXT = "text";
	/** Qualifier of the <code>BusinessAgreementRuleHeader.replicationNumberRuleHeader</code> attribute **/
	public static final String REPLICATIONNUMBERRULEHEADER = "replicationNumberRuleHeader";
	/** Qualifier of the <code>BusinessAgreementRuleHeader.businessagHeader</code> attribute **/
	public static final String BUSINESSAGHEADER = "businessagHeader";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BUSINESSAGHEADER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBusinessAgreementRuleHeader> BUSINESSAGHEADERHANDLER = new BidirectionalOneToManyHandler<GeneratedBusinessAgreementRuleHeader>(
	SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENTRULEHEADER,
	false,
	"businessagHeader",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BUSINESSRULEGUID, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(PAYMENTMETHODINC, AttributeMode.INITIAL);
		tmp.put(PAYMENTMETHODOUT, AttributeMode.INITIAL);
		tmp.put(SHIPPINGCONTROLDR, AttributeMode.INITIAL);
		tmp.put(TERMOFPAYMENT, AttributeMode.INITIAL);
		tmp.put(SHIPPINGCONTROLBR, AttributeMode.INITIAL);
		tmp.put(CORREPONDENCEVARIANT, AttributeMode.INITIAL);
		tmp.put(SHIPPINGCONTROLBP, AttributeMode.INITIAL);
		tmp.put(TEXT, AttributeMode.INITIAL);
		tmp.put(REPLICATIONNUMBERRULEHEADER, AttributeMode.INITIAL);
		tmp.put(BUSINESSAGHEADER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.businessagHeader</code> attribute.
	 * @return the businessagHeader - Business Agreement Rule Header
	 */
	public BusinessAgreementHeader getBusinessagHeader(final SessionContext ctx)
	{
		return (BusinessAgreementHeader)getProperty( ctx, BUSINESSAGHEADER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.businessagHeader</code> attribute.
	 * @return the businessagHeader - Business Agreement Rule Header
	 */
	public BusinessAgreementHeader getBusinessagHeader()
	{
		return getBusinessagHeader( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.businessagHeader</code> attribute. 
	 * @param value the businessagHeader - Business Agreement Rule Header
	 */
	public void setBusinessagHeader(final SessionContext ctx, final BusinessAgreementHeader value)
	{
		BUSINESSAGHEADERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.businessagHeader</code> attribute. 
	 * @param value the businessagHeader - Business Agreement Rule Header
	 */
	public void setBusinessagHeader(final BusinessAgreementHeader value)
	{
		setBusinessagHeader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.businessruleguid</code> attribute.
	 * @return the businessruleguid - Business Agreement Rule GUID
	 */
	public String getBusinessruleguid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSRULEGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.businessruleguid</code> attribute.
	 * @return the businessruleguid - Business Agreement Rule GUID
	 */
	public String getBusinessruleguid()
	{
		return getBusinessruleguid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.businessruleguid</code> attribute. 
	 * @param value the businessruleguid - Business Agreement Rule GUID
	 */
	public void setBusinessruleguid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSRULEGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.businessruleguid</code> attribute. 
	 * @param value the businessruleguid - Business Agreement Rule GUID
	 */
	public void setBusinessruleguid(final String value)
	{
		setBusinessruleguid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.correpondencevariant</code> attribute.
	 * @return the correpondencevariant - Correspondence variant
	 */
	public CRMBusinessAgreementCorrepondingVariant getCorrepondencevariant(final SessionContext ctx)
	{
		return (CRMBusinessAgreementCorrepondingVariant)getProperty( ctx, CORREPONDENCEVARIANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.correpondencevariant</code> attribute.
	 * @return the correpondencevariant - Correspondence variant
	 */
	public CRMBusinessAgreementCorrepondingVariant getCorrepondencevariant()
	{
		return getCorrepondencevariant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.correpondencevariant</code> attribute. 
	 * @param value the correpondencevariant - Correspondence variant
	 */
	public void setCorrepondencevariant(final SessionContext ctx, final CRMBusinessAgreementCorrepondingVariant value)
	{
		setProperty(ctx, CORREPONDENCEVARIANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.correpondencevariant</code> attribute. 
	 * @param value the correpondencevariant - Correspondence variant
	 */
	public void setCorrepondencevariant(final CRMBusinessAgreementCorrepondingVariant value)
	{
		setCorrepondencevariant( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BUSINESSAGHEADERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.paymentmethodinc</code> attribute.
	 * @return the paymentmethodinc - Payment Method Incoming
	 */
	public CRMBusinessAgreementPaymentMethod getPaymentmethodinc(final SessionContext ctx)
	{
		return (CRMBusinessAgreementPaymentMethod)getProperty( ctx, PAYMENTMETHODINC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.paymentmethodinc</code> attribute.
	 * @return the paymentmethodinc - Payment Method Incoming
	 */
	public CRMBusinessAgreementPaymentMethod getPaymentmethodinc()
	{
		return getPaymentmethodinc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.paymentmethodinc</code> attribute. 
	 * @param value the paymentmethodinc - Payment Method Incoming
	 */
	public void setPaymentmethodinc(final SessionContext ctx, final CRMBusinessAgreementPaymentMethod value)
	{
		setProperty(ctx, PAYMENTMETHODINC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.paymentmethodinc</code> attribute. 
	 * @param value the paymentmethodinc - Payment Method Incoming
	 */
	public void setPaymentmethodinc(final CRMBusinessAgreementPaymentMethod value)
	{
		setPaymentmethodinc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.paymentmethodout</code> attribute.
	 * @return the paymentmethodout - Payment Method Outgoing
	 */
	public CRMBusinessAgreementPaymentMethod getPaymentmethodout(final SessionContext ctx)
	{
		return (CRMBusinessAgreementPaymentMethod)getProperty( ctx, PAYMENTMETHODOUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.paymentmethodout</code> attribute.
	 * @return the paymentmethodout - Payment Method Outgoing
	 */
	public CRMBusinessAgreementPaymentMethod getPaymentmethodout()
	{
		return getPaymentmethodout( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.paymentmethodout</code> attribute. 
	 * @param value the paymentmethodout - Payment Method Outgoing
	 */
	public void setPaymentmethodout(final SessionContext ctx, final CRMBusinessAgreementPaymentMethod value)
	{
		setProperty(ctx, PAYMENTMETHODOUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.paymentmethodout</code> attribute. 
	 * @param value the paymentmethodout - Payment Method Outgoing
	 */
	public void setPaymentmethodout(final CRMBusinessAgreementPaymentMethod value)
	{
		setPaymentmethodout( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.replicationNumberRuleHeader</code> attribute.
	 * @return the replicationNumberRuleHeader - Business Agreement replication number
	 */
	public String getReplicationNumberRuleHeader(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REPLICATIONNUMBERRULEHEADER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.replicationNumberRuleHeader</code> attribute.
	 * @return the replicationNumberRuleHeader - Business Agreement replication number
	 */
	public String getReplicationNumberRuleHeader()
	{
		return getReplicationNumberRuleHeader( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.replicationNumberRuleHeader</code> attribute. 
	 * @param value the replicationNumberRuleHeader - Business Agreement replication number
	 */
	public void setReplicationNumberRuleHeader(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REPLICATIONNUMBERRULEHEADER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.replicationNumberRuleHeader</code> attribute. 
	 * @param value the replicationNumberRuleHeader - Business Agreement replication number
	 */
	public void setReplicationNumberRuleHeader(final String value)
	{
		setReplicationNumberRuleHeader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.shippingcontrolbp</code> attribute.
	 * @return the shippingcontrolbp - Shipping Control Business Partner
	 */
	public CRMBusinessAgreementShippingControl getShippingcontrolbp(final SessionContext ctx)
	{
		return (CRMBusinessAgreementShippingControl)getProperty( ctx, SHIPPINGCONTROLBP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.shippingcontrolbp</code> attribute.
	 * @return the shippingcontrolbp - Shipping Control Business Partner
	 */
	public CRMBusinessAgreementShippingControl getShippingcontrolbp()
	{
		return getShippingcontrolbp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.shippingcontrolbp</code> attribute. 
	 * @param value the shippingcontrolbp - Shipping Control Business Partner
	 */
	public void setShippingcontrolbp(final SessionContext ctx, final CRMBusinessAgreementShippingControl value)
	{
		setProperty(ctx, SHIPPINGCONTROLBP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.shippingcontrolbp</code> attribute. 
	 * @param value the shippingcontrolbp - Shipping Control Business Partner
	 */
	public void setShippingcontrolbp(final CRMBusinessAgreementShippingControl value)
	{
		setShippingcontrolbp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.shippingcontrolbr</code> attribute.
	 * @return the shippingcontrolbr - Shipping Control BR
	 */
	public CRMBusinessAgreementShippingControl getShippingcontrolbr(final SessionContext ctx)
	{
		return (CRMBusinessAgreementShippingControl)getProperty( ctx, SHIPPINGCONTROLBR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.shippingcontrolbr</code> attribute.
	 * @return the shippingcontrolbr - Shipping Control BR
	 */
	public CRMBusinessAgreementShippingControl getShippingcontrolbr()
	{
		return getShippingcontrolbr( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.shippingcontrolbr</code> attribute. 
	 * @param value the shippingcontrolbr - Shipping Control BR
	 */
	public void setShippingcontrolbr(final SessionContext ctx, final CRMBusinessAgreementShippingControl value)
	{
		setProperty(ctx, SHIPPINGCONTROLBR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.shippingcontrolbr</code> attribute. 
	 * @param value the shippingcontrolbr - Shipping Control BR
	 */
	public void setShippingcontrolbr(final CRMBusinessAgreementShippingControl value)
	{
		setShippingcontrolbr( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.shippingcontroldr</code> attribute.
	 * @return the shippingcontroldr - Shipping Control Dunning Recipient
	 */
	public CRMBusinessAgreementShippingControl getShippingcontroldr(final SessionContext ctx)
	{
		return (CRMBusinessAgreementShippingControl)getProperty( ctx, SHIPPINGCONTROLDR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.shippingcontroldr</code> attribute.
	 * @return the shippingcontroldr - Shipping Control Dunning Recipient
	 */
	public CRMBusinessAgreementShippingControl getShippingcontroldr()
	{
		return getShippingcontroldr( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.shippingcontroldr</code> attribute. 
	 * @param value the shippingcontroldr - Shipping Control Dunning Recipient
	 */
	public void setShippingcontroldr(final SessionContext ctx, final CRMBusinessAgreementShippingControl value)
	{
		setProperty(ctx, SHIPPINGCONTROLDR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.shippingcontroldr</code> attribute. 
	 * @param value the shippingcontroldr - Shipping Control Dunning Recipient
	 */
	public void setShippingcontroldr(final CRMBusinessAgreementShippingControl value)
	{
		setShippingcontroldr( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.termofpayment</code> attribute.
	 * @return the termofpayment - Payment Terms
	 */
	public CRMBusinessAgreementTermsPayment getTermofpayment(final SessionContext ctx)
	{
		return (CRMBusinessAgreementTermsPayment)getProperty( ctx, TERMOFPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.termofpayment</code> attribute.
	 * @return the termofpayment - Payment Terms
	 */
	public CRMBusinessAgreementTermsPayment getTermofpayment()
	{
		return getTermofpayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.termofpayment</code> attribute. 
	 * @param value the termofpayment - Payment Terms
	 */
	public void setTermofpayment(final SessionContext ctx, final CRMBusinessAgreementTermsPayment value)
	{
		setProperty(ctx, TERMOFPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.termofpayment</code> attribute. 
	 * @param value the termofpayment - Payment Terms
	 */
	public void setTermofpayment(final CRMBusinessAgreementTermsPayment value)
	{
		setTermofpayment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.text</code> attribute.
	 * @return the text - Business Rule Description
	 */
	public String getText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.text</code> attribute.
	 * @return the text - Business Rule Description
	 */
	public String getText()
	{
		return getText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.text</code> attribute. 
	 * @param value the text - Business Rule Description
	 */
	public void setText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.text</code> attribute. 
	 * @param value the text - Business Rule Description
	 */
	public void setText(final String value)
	{
		setText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.validfrom</code> attribute.
	 * @return the validfrom - Business Rule Valid From
	 */
	public String getValidfrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.validfrom</code> attribute.
	 * @return the validfrom - Business Rule Valid From
	 */
	public String getValidfrom()
	{
		return getValidfrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.validfrom</code> attribute. 
	 * @param value the validfrom - Business Rule Valid From
	 */
	public void setValidfrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.validfrom</code> attribute. 
	 * @param value the validfrom - Business Rule Valid From
	 */
	public void setValidfrom(final String value)
	{
		setValidfrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.validto</code> attribute.
	 * @return the validto - Business Agreement Rule Valid To
	 */
	public String getValidto(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementRuleHeader.validto</code> attribute.
	 * @return the validto - Business Agreement Rule Valid To
	 */
	public String getValidto()
	{
		return getValidto( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.validto</code> attribute. 
	 * @param value the validto - Business Agreement Rule Valid To
	 */
	public void setValidto(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementRuleHeader.validto</code> attribute. 
	 * @param value the validto - Business Agreement Rule Valid To
	 */
	public void setValidto(final String value)
	{
		setValidto( getSession().getSessionContext(), value );
	}
	
}
