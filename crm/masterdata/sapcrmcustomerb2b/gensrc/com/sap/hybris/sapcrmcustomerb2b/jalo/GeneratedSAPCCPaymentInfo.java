/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapcrmcustomerb2b.jalo;

import com.sap.hybris.sapcrmcustomerb2b.constants.Sapcrmcustomerb2bConstants;
import com.sap.hybris.sapcrmcustomerb2b.jalo.SAPPaymentInfo;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SAPCCPaymentInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPCCPaymentInfo extends SAPPaymentInfo
{
	/** Qualifier of the <code>SAPCCPaymentInfo.ccOwner</code> attribute **/
	public static final String CCOWNER = "ccOwner";
	/** Qualifier of the <code>SAPCCPaymentInfo.cardId</code> attribute **/
	public static final String CARDID = "cardId";
	/** Qualifier of the <code>SAPCCPaymentInfo.cardNumber</code> attribute **/
	public static final String CARDNUMBER = "cardNumber";
	/** Qualifier of the <code>SAPCCPaymentInfo.cardType</code> attribute **/
	public static final String CARDTYPE = "cardType";
	/** Qualifier of the <code>SAPCCPaymentInfo.issuer</code> attribute **/
	public static final String ISSUER = "issuer";
	/** Qualifier of the <code>SAPCCPaymentInfo.issuingDate</code> attribute **/
	public static final String ISSUINGDATE = "issuingDate";
	/** Qualifier of the <code>SAPCCPaymentInfo.isDefault</code> attribute **/
	public static final String ISDEFAULT = "isDefault";
	/** Qualifier of the <code>SAPCCPaymentInfo.subscriptionId</code> attribute **/
	public static final String SUBSCRIPTIONID = "subscriptionId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SAPPaymentInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CCOWNER, AttributeMode.INITIAL);
		tmp.put(CARDID, AttributeMode.INITIAL);
		tmp.put(CARDNUMBER, AttributeMode.INITIAL);
		tmp.put(CARDTYPE, AttributeMode.INITIAL);
		tmp.put(ISSUER, AttributeMode.INITIAL);
		tmp.put(ISSUINGDATE, AttributeMode.INITIAL);
		tmp.put(ISDEFAULT, AttributeMode.INITIAL);
		tmp.put(SUBSCRIPTIONID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.cardId</code> attribute.
	 * @return the cardId
	 */
	public String getCardId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.cardId</code> attribute.
	 * @return the cardId
	 */
	public String getCardId()
	{
		return getCardId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.cardId</code> attribute. 
	 * @param value the cardId
	 */
	protected void setCardId(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+CARDID+"' is not changeable", 0 );
		}
		setProperty(ctx, CARDID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.cardId</code> attribute. 
	 * @param value the cardId
	 */
	protected void setCardId(final String value)
	{
		setCardId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.cardNumber</code> attribute.
	 * @return the cardNumber
	 */
	public String getCardNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.cardNumber</code> attribute.
	 * @return the cardNumber
	 */
	public String getCardNumber()
	{
		return getCardNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.cardNumber</code> attribute. 
	 * @param value the cardNumber
	 */
	public void setCardNumber(final SessionContext ctx, final String value)
	{
		new PartOfHandler<String>()
		{
			@Override
			protected String doGetValue(final SessionContext ctx)
			{
				return getCardNumber( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final String _value)
			{
				final String value = _value;
				setProperty(ctx, CARDNUMBER,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.cardNumber</code> attribute. 
	 * @param value the cardNumber
	 */
	public void setCardNumber(final String value)
	{
		setCardNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.cardType</code> attribute.
	 * @return the cardType
	 */
	public EnumerationValue getCardType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CARDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.cardType</code> attribute.
	 * @return the cardType
	 */
	public EnumerationValue getCardType()
	{
		return getCardType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.cardType</code> attribute. 
	 * @param value the cardType
	 */
	public void setCardType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CARDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.cardType</code> attribute. 
	 * @param value the cardType
	 */
	public void setCardType(final EnumerationValue value)
	{
		setCardType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.ccOwner</code> attribute.
	 * @return the ccOwner
	 */
	public String getCcOwner(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CCOWNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.ccOwner</code> attribute.
	 * @return the ccOwner
	 */
	public String getCcOwner()
	{
		return getCcOwner( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.ccOwner</code> attribute. 
	 * @param value the ccOwner
	 */
	public void setCcOwner(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CCOWNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.ccOwner</code> attribute. 
	 * @param value the ccOwner
	 */
	public void setCcOwner(final String value)
	{
		setCcOwner( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.isDefault</code> attribute.
	 * @return the isDefault
	 */
	public Boolean isIsDefault(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISDEFAULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.isDefault</code> attribute.
	 * @return the isDefault
	 */
	public Boolean isIsDefault()
	{
		return isIsDefault( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.isDefault</code> attribute. 
	 * @return the isDefault
	 */
	public boolean isIsDefaultAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsDefault( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.isDefault</code> attribute. 
	 * @return the isDefault
	 */
	public boolean isIsDefaultAsPrimitive()
	{
		return isIsDefaultAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.isDefault</code> attribute. 
	 * @param value the isDefault
	 */
	public void setIsDefault(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISDEFAULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.isDefault</code> attribute. 
	 * @param value the isDefault
	 */
	public void setIsDefault(final Boolean value)
	{
		setIsDefault( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.isDefault</code> attribute. 
	 * @param value the isDefault
	 */
	public void setIsDefault(final SessionContext ctx, final boolean value)
	{
		setIsDefault( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.isDefault</code> attribute. 
	 * @param value the isDefault
	 */
	public void setIsDefault(final boolean value)
	{
		setIsDefault( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.issuer</code> attribute.
	 * @return the issuer
	 */
	public String getIssuer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ISSUER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.issuer</code> attribute.
	 * @return the issuer
	 */
	public String getIssuer()
	{
		return getIssuer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.issuer</code> attribute. 
	 * @param value the issuer
	 */
	public void setIssuer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ISSUER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.issuer</code> attribute. 
	 * @param value the issuer
	 */
	public void setIssuer(final String value)
	{
		setIssuer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.issuingDate</code> attribute.
	 * @return the issuingDate
	 */
	public String getIssuingDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ISSUINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.issuingDate</code> attribute.
	 * @return the issuingDate
	 */
	public String getIssuingDate()
	{
		return getIssuingDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.issuingDate</code> attribute. 
	 * @param value the issuingDate
	 */
	public void setIssuingDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ISSUINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.issuingDate</code> attribute. 
	 * @param value the issuingDate
	 */
	public void setIssuingDate(final String value)
	{
		setIssuingDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.subscriptionId</code> attribute.
	 * @return the subscriptionId
	 */
	public String getSubscriptionId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBSCRIPTIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCCPaymentInfo.subscriptionId</code> attribute.
	 * @return the subscriptionId
	 */
	public String getSubscriptionId()
	{
		return getSubscriptionId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.subscriptionId</code> attribute. 
	 * @param value the subscriptionId
	 */
	public void setSubscriptionId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBSCRIPTIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCCPaymentInfo.subscriptionId</code> attribute. 
	 * @param value the subscriptionId
	 */
	public void setSubscriptionId(final String value)
	{
		setSubscriptionId( getSession().getSessionContext(), value );
	}
	
}
