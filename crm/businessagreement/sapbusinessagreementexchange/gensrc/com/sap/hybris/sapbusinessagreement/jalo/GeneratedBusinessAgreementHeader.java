/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapbusinessagreement.jalo;

import com.sap.hybris.sapbusinessagreement.constants.SapbusinessagreementexchangeConstants;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreement;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreementPartners;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreementRuleHeader;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementClass;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementTaxCategory;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementTaxCode;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BusinessAgreementHeader}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBusinessAgreementHeader extends GenericItem
{
	/** Qualifier of the <code>BusinessAgreementHeader.validto</code> attribute **/
	public static final String VALIDTO = "validto";
	/** Qualifier of the <code>BusinessAgreementHeader.validfrom</code> attribute **/
	public static final String VALIDFROM = "validfrom";
	/** Qualifier of the <code>BusinessAgreementHeader.businessagreementdefault</code> attribute **/
	public static final String BUSINESSAGREEMENTDEFAULT = "businessagreementdefault";
	/** Qualifier of the <code>BusinessAgreementHeader.businessagreementclass</code> attribute **/
	public static final String BUSINESSAGREEMENTCLASS = "businessagreementclass";
	/** Qualifier of the <code>BusinessAgreementHeader.bankidinc</code> attribute **/
	public static final String BANKIDINC = "bankidinc";
	/** Qualifier of the <code>BusinessAgreementHeader.bankidout</code> attribute **/
	public static final String BANKIDOUT = "bankidout";
	/** Qualifier of the <code>BusinessAgreementHeader.creditcardinc</code> attribute **/
	public static final String CREDITCARDINC = "creditcardinc";
	/** Qualifier of the <code>BusinessAgreementHeader.creditcardout</code> attribute **/
	public static final String CREDITCARDOUT = "creditcardout";
	/** Qualifier of the <code>BusinessAgreementHeader.addresscorrespondenceguid</code> attribute **/
	public static final String ADDRESSCORRESPONDENCEGUID = "addresscorrespondenceguid";
	/** Qualifier of the <code>BusinessAgreementHeader.addressdunningguid</code> attribute **/
	public static final String ADDRESSDUNNINGGUID = "addressdunningguid";
	/** Qualifier of the <code>BusinessAgreementHeader.addresspayerguid</code> attribute **/
	public static final String ADDRESSPAYERGUID = "addresspayerguid";
	/** Qualifier of the <code>BusinessAgreementHeader.addressrecipientguid</code> attribute **/
	public static final String ADDRESSRECIPIENTGUID = "addressrecipientguid";
	/** Qualifier of the <code>BusinessAgreementHeader.addressirguid</code> attribute **/
	public static final String ADDRESSIRGUID = "addressirguid";
	/** Qualifier of the <code>BusinessAgreementHeader.addresstaxguid</code> attribute **/
	public static final String ADDRESSTAXGUID = "addresstaxguid";
	/** Qualifier of the <code>BusinessAgreementHeader.businessagreementpayer</code> attribute **/
	public static final String BUSINESSAGREEMENTPAYER = "businessagreementpayer";
	/** Qualifier of the <code>BusinessAgreementHeader.taxcategory</code> attribute **/
	public static final String TAXCATEGORY = "taxcategory";
	/** Qualifier of the <code>BusinessAgreementHeader.taxcode</code> attribute **/
	public static final String TAXCODE = "taxcode";
	/** Qualifier of the <code>BusinessAgreementHeader.refnumber</code> attribute **/
	public static final String REFNUMBER = "refnumber";
	/** Qualifier of the <code>BusinessAgreementHeader.replicationNumberHeader</code> attribute **/
	public static final String REPLICATIONNUMBERHEADER = "replicationNumberHeader";
	/** Qualifier of the <code>BusinessAgreementHeader.businessagreement</code> attribute **/
	public static final String BUSINESSAGREEMENT = "businessagreement";
	/** Qualifier of the <code>BusinessAgreementHeader.businessagreementpartners</code> attribute **/
	public static final String BUSINESSAGREEMENTPARTNERS = "businessagreementpartners";
	/** Qualifier of the <code>BusinessAgreementHeader.businessruleHeader</code> attribute **/
	public static final String BUSINESSRULEHEADER = "businessruleHeader";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BUSINESSAGREEMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBusinessAgreementHeader> BUSINESSAGREEMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedBusinessAgreementHeader>(
	SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENTHEADER,
	false,
	"businessagreement",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BUSINESSAGREEMENTPARTNERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BusinessAgreementPartners> BUSINESSAGREEMENTPARTNERSHANDLER = new OneToManyHandler<BusinessAgreementPartners>(
	SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENTPARTNERS,
	true,
	"businessagreementheader",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BUSINESSRULEHEADER's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BusinessAgreementRuleHeader> BUSINESSRULEHEADERHANDLER = new OneToManyHandler<BusinessAgreementRuleHeader>(
	SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENTRULEHEADER,
	true,
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
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(BUSINESSAGREEMENTDEFAULT, AttributeMode.INITIAL);
		tmp.put(BUSINESSAGREEMENTCLASS, AttributeMode.INITIAL);
		tmp.put(BANKIDINC, AttributeMode.INITIAL);
		tmp.put(BANKIDOUT, AttributeMode.INITIAL);
		tmp.put(CREDITCARDINC, AttributeMode.INITIAL);
		tmp.put(CREDITCARDOUT, AttributeMode.INITIAL);
		tmp.put(ADDRESSCORRESPONDENCEGUID, AttributeMode.INITIAL);
		tmp.put(ADDRESSDUNNINGGUID, AttributeMode.INITIAL);
		tmp.put(ADDRESSPAYERGUID, AttributeMode.INITIAL);
		tmp.put(ADDRESSRECIPIENTGUID, AttributeMode.INITIAL);
		tmp.put(ADDRESSIRGUID, AttributeMode.INITIAL);
		tmp.put(ADDRESSTAXGUID, AttributeMode.INITIAL);
		tmp.put(BUSINESSAGREEMENTPAYER, AttributeMode.INITIAL);
		tmp.put(TAXCATEGORY, AttributeMode.INITIAL);
		tmp.put(TAXCODE, AttributeMode.INITIAL);
		tmp.put(REFNUMBER, AttributeMode.INITIAL);
		tmp.put(REPLICATIONNUMBERHEADER, AttributeMode.INITIAL);
		tmp.put(BUSINESSAGREEMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.addresscorrespondenceguid</code> attribute.
	 * @return the addresscorrespondenceguid - Address GUID of Correspondence Address
	 */
	public String getAddresscorrespondenceguid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSCORRESPONDENCEGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.addresscorrespondenceguid</code> attribute.
	 * @return the addresscorrespondenceguid - Address GUID of Correspondence Address
	 */
	public String getAddresscorrespondenceguid()
	{
		return getAddresscorrespondenceguid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.addresscorrespondenceguid</code> attribute. 
	 * @param value the addresscorrespondenceguid - Address GUID of Correspondence Address
	 */
	public void setAddresscorrespondenceguid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSCORRESPONDENCEGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.addresscorrespondenceguid</code> attribute. 
	 * @param value the addresscorrespondenceguid - Address GUID of Correspondence Address
	 */
	public void setAddresscorrespondenceguid(final String value)
	{
		setAddresscorrespondenceguid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.addressdunningguid</code> attribute.
	 * @return the addressdunningguid - Address GUID for Alternative Dunning Recipient
	 */
	public String getAddressdunningguid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSDUNNINGGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.addressdunningguid</code> attribute.
	 * @return the addressdunningguid - Address GUID for Alternative Dunning Recipient
	 */
	public String getAddressdunningguid()
	{
		return getAddressdunningguid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.addressdunningguid</code> attribute. 
	 * @param value the addressdunningguid - Address GUID for Alternative Dunning Recipient
	 */
	public void setAddressdunningguid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSDUNNINGGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.addressdunningguid</code> attribute. 
	 * @param value the addressdunningguid - Address GUID for Alternative Dunning Recipient
	 */
	public void setAddressdunningguid(final String value)
	{
		setAddressdunningguid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.addressirguid</code> attribute.
	 * @return the addressirguid - Address GUID for Alternative Bill-To Party
	 */
	public String getAddressirguid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSIRGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.addressirguid</code> attribute.
	 * @return the addressirguid - Address GUID for Alternative Bill-To Party
	 */
	public String getAddressirguid()
	{
		return getAddressirguid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.addressirguid</code> attribute. 
	 * @param value the addressirguid - Address GUID for Alternative Bill-To Party
	 */
	public void setAddressirguid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSIRGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.addressirguid</code> attribute. 
	 * @param value the addressirguid - Address GUID for Alternative Bill-To Party
	 */
	public void setAddressirguid(final String value)
	{
		setAddressirguid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.addresspayerguid</code> attribute.
	 * @return the addresspayerguid - >Address GUID of Payer
	 */
	public String getAddresspayerguid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSPAYERGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.addresspayerguid</code> attribute.
	 * @return the addresspayerguid - >Address GUID of Payer
	 */
	public String getAddresspayerguid()
	{
		return getAddresspayerguid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.addresspayerguid</code> attribute. 
	 * @param value the addresspayerguid - >Address GUID of Payer
	 */
	public void setAddresspayerguid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSPAYERGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.addresspayerguid</code> attribute. 
	 * @param value the addresspayerguid - >Address GUID of Payer
	 */
	public void setAddresspayerguid(final String value)
	{
		setAddresspayerguid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.addressrecipientguid</code> attribute.
	 * @return the addressrecipientguid - >Address GUID of Recipient
	 */
	public String getAddressrecipientguid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSRECIPIENTGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.addressrecipientguid</code> attribute.
	 * @return the addressrecipientguid - >Address GUID of Recipient
	 */
	public String getAddressrecipientguid()
	{
		return getAddressrecipientguid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.addressrecipientguid</code> attribute. 
	 * @param value the addressrecipientguid - >Address GUID of Recipient
	 */
	public void setAddressrecipientguid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSRECIPIENTGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.addressrecipientguid</code> attribute. 
	 * @param value the addressrecipientguid - >Address GUID of Recipient
	 */
	public void setAddressrecipientguid(final String value)
	{
		setAddressrecipientguid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.addresstaxguid</code> attribute.
	 * @return the addresstaxguid - Address GUID for Tax-Relevant Address
	 */
	public String getAddresstaxguid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSTAXGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.addresstaxguid</code> attribute.
	 * @return the addresstaxguid - Address GUID for Tax-Relevant Address
	 */
	public String getAddresstaxguid()
	{
		return getAddresstaxguid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.addresstaxguid</code> attribute. 
	 * @param value the addresstaxguid - Address GUID for Tax-Relevant Address
	 */
	public void setAddresstaxguid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSTAXGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.addresstaxguid</code> attribute. 
	 * @param value the addresstaxguid - Address GUID for Tax-Relevant Address
	 */
	public void setAddresstaxguid(final String value)
	{
		setAddresstaxguid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.bankidinc</code> attribute.
	 * @return the bankidinc - Bank Detail ID Incoming
	 */
	public String getBankidinc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BANKIDINC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.bankidinc</code> attribute.
	 * @return the bankidinc - Bank Detail ID Incoming
	 */
	public String getBankidinc()
	{
		return getBankidinc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.bankidinc</code> attribute. 
	 * @param value the bankidinc - Bank Detail ID Incoming
	 */
	public void setBankidinc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BANKIDINC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.bankidinc</code> attribute. 
	 * @param value the bankidinc - Bank Detail ID Incoming
	 */
	public void setBankidinc(final String value)
	{
		setBankidinc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.bankidout</code> attribute.
	 * @return the bankidout - Bank Detail ID Outgoing
	 */
	public String getBankidout(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BANKIDOUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.bankidout</code> attribute.
	 * @return the bankidout - Bank Detail ID Outgoing
	 */
	public String getBankidout()
	{
		return getBankidout( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.bankidout</code> attribute. 
	 * @param value the bankidout - Bank Detail ID Outgoing
	 */
	public void setBankidout(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BANKIDOUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.bankidout</code> attribute. 
	 * @param value the bankidout - Bank Detail ID Outgoing
	 */
	public void setBankidout(final String value)
	{
		setBankidout( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessagreement</code> attribute.
	 * @return the businessagreement - Business Agreement
	 */
	public BusinessAgreement getBusinessagreement(final SessionContext ctx)
	{
		return (BusinessAgreement)getProperty( ctx, BUSINESSAGREEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessagreement</code> attribute.
	 * @return the businessagreement - Business Agreement
	 */
	public BusinessAgreement getBusinessagreement()
	{
		return getBusinessagreement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessagreement</code> attribute. 
	 * @param value the businessagreement - Business Agreement
	 */
	public void setBusinessagreement(final SessionContext ctx, final BusinessAgreement value)
	{
		BUSINESSAGREEMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessagreement</code> attribute. 
	 * @param value the businessagreement - Business Agreement
	 */
	public void setBusinessagreement(final BusinessAgreement value)
	{
		setBusinessagreement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessagreementclass</code> attribute.
	 * @return the businessagreementclass - Business Agreement Class
	 */
	public CRMBusinessAgreementClass getBusinessagreementclass(final SessionContext ctx)
	{
		return (CRMBusinessAgreementClass)getProperty( ctx, BUSINESSAGREEMENTCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessagreementclass</code> attribute.
	 * @return the businessagreementclass - Business Agreement Class
	 */
	public CRMBusinessAgreementClass getBusinessagreementclass()
	{
		return getBusinessagreementclass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessagreementclass</code> attribute. 
	 * @param value the businessagreementclass - Business Agreement Class
	 */
	public void setBusinessagreementclass(final SessionContext ctx, final CRMBusinessAgreementClass value)
	{
		setProperty(ctx, BUSINESSAGREEMENTCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessagreementclass</code> attribute. 
	 * @param value the businessagreementclass - Business Agreement Class
	 */
	public void setBusinessagreementclass(final CRMBusinessAgreementClass value)
	{
		setBusinessagreementclass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessagreementdefault</code> attribute.
	 * @return the businessagreementdefault - Default Business Agreement
	 */
	public Boolean isBusinessagreementdefault(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BUSINESSAGREEMENTDEFAULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessagreementdefault</code> attribute.
	 * @return the businessagreementdefault - Default Business Agreement
	 */
	public Boolean isBusinessagreementdefault()
	{
		return isBusinessagreementdefault( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessagreementdefault</code> attribute. 
	 * @return the businessagreementdefault - Default Business Agreement
	 */
	public boolean isBusinessagreementdefaultAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBusinessagreementdefault( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessagreementdefault</code> attribute. 
	 * @return the businessagreementdefault - Default Business Agreement
	 */
	public boolean isBusinessagreementdefaultAsPrimitive()
	{
		return isBusinessagreementdefaultAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessagreementdefault</code> attribute. 
	 * @param value the businessagreementdefault - Default Business Agreement
	 */
	public void setBusinessagreementdefault(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BUSINESSAGREEMENTDEFAULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessagreementdefault</code> attribute. 
	 * @param value the businessagreementdefault - Default Business Agreement
	 */
	public void setBusinessagreementdefault(final Boolean value)
	{
		setBusinessagreementdefault( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessagreementdefault</code> attribute. 
	 * @param value the businessagreementdefault - Default Business Agreement
	 */
	public void setBusinessagreementdefault(final SessionContext ctx, final boolean value)
	{
		setBusinessagreementdefault( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessagreementdefault</code> attribute. 
	 * @param value the businessagreementdefault - Default Business Agreement
	 */
	public void setBusinessagreementdefault(final boolean value)
	{
		setBusinessagreementdefault( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessagreementpartners</code> attribute.
	 * @return the businessagreementpartners - Business Agreement Header
	 */
	public Set<BusinessAgreementPartners> getBusinessagreementpartners(final SessionContext ctx)
	{
		return (Set<BusinessAgreementPartners>)BUSINESSAGREEMENTPARTNERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessagreementpartners</code> attribute.
	 * @return the businessagreementpartners - Business Agreement Header
	 */
	public Set<BusinessAgreementPartners> getBusinessagreementpartners()
	{
		return getBusinessagreementpartners( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessagreementpartners</code> attribute. 
	 * @param value the businessagreementpartners - Business Agreement Header
	 */
	public void setBusinessagreementpartners(final SessionContext ctx, final Set<BusinessAgreementPartners> value)
	{
		BUSINESSAGREEMENTPARTNERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessagreementpartners</code> attribute. 
	 * @param value the businessagreementpartners - Business Agreement Header
	 */
	public void setBusinessagreementpartners(final Set<BusinessAgreementPartners> value)
	{
		setBusinessagreementpartners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessagreementpartners. 
	 * @param value the item to add to businessagreementpartners - Business Agreement Header
	 */
	public void addToBusinessagreementpartners(final SessionContext ctx, final BusinessAgreementPartners value)
	{
		BUSINESSAGREEMENTPARTNERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessagreementpartners. 
	 * @param value the item to add to businessagreementpartners - Business Agreement Header
	 */
	public void addToBusinessagreementpartners(final BusinessAgreementPartners value)
	{
		addToBusinessagreementpartners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessagreementpartners. 
	 * @param value the item to remove from businessagreementpartners - Business Agreement Header
	 */
	public void removeFromBusinessagreementpartners(final SessionContext ctx, final BusinessAgreementPartners value)
	{
		BUSINESSAGREEMENTPARTNERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessagreementpartners. 
	 * @param value the item to remove from businessagreementpartners - Business Agreement Header
	 */
	public void removeFromBusinessagreementpartners(final BusinessAgreementPartners value)
	{
		removeFromBusinessagreementpartners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessagreementpayer</code> attribute.
	 * @return the businessagreementpayer - Business Agreement Payer
	 */
	public String getBusinessagreementpayer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSAGREEMENTPAYER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessagreementpayer</code> attribute.
	 * @return the businessagreementpayer - Business Agreement Payer
	 */
	public String getBusinessagreementpayer()
	{
		return getBusinessagreementpayer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessagreementpayer</code> attribute. 
	 * @param value the businessagreementpayer - Business Agreement Payer
	 */
	public void setBusinessagreementpayer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSAGREEMENTPAYER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessagreementpayer</code> attribute. 
	 * @param value the businessagreementpayer - Business Agreement Payer
	 */
	public void setBusinessagreementpayer(final String value)
	{
		setBusinessagreementpayer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessruleHeader</code> attribute.
	 * @return the businessruleHeader - Business Agreement Header
	 */
	public Set<BusinessAgreementRuleHeader> getBusinessruleHeader(final SessionContext ctx)
	{
		return (Set<BusinessAgreementRuleHeader>)BUSINESSRULEHEADERHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.businessruleHeader</code> attribute.
	 * @return the businessruleHeader - Business Agreement Header
	 */
	public Set<BusinessAgreementRuleHeader> getBusinessruleHeader()
	{
		return getBusinessruleHeader( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessruleHeader</code> attribute. 
	 * @param value the businessruleHeader - Business Agreement Header
	 */
	public void setBusinessruleHeader(final SessionContext ctx, final Set<BusinessAgreementRuleHeader> value)
	{
		BUSINESSRULEHEADERHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.businessruleHeader</code> attribute. 
	 * @param value the businessruleHeader - Business Agreement Header
	 */
	public void setBusinessruleHeader(final Set<BusinessAgreementRuleHeader> value)
	{
		setBusinessruleHeader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessruleHeader. 
	 * @param value the item to add to businessruleHeader - Business Agreement Header
	 */
	public void addToBusinessruleHeader(final SessionContext ctx, final BusinessAgreementRuleHeader value)
	{
		BUSINESSRULEHEADERHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessruleHeader. 
	 * @param value the item to add to businessruleHeader - Business Agreement Header
	 */
	public void addToBusinessruleHeader(final BusinessAgreementRuleHeader value)
	{
		addToBusinessruleHeader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessruleHeader. 
	 * @param value the item to remove from businessruleHeader - Business Agreement Header
	 */
	public void removeFromBusinessruleHeader(final SessionContext ctx, final BusinessAgreementRuleHeader value)
	{
		BUSINESSRULEHEADERHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessruleHeader. 
	 * @param value the item to remove from businessruleHeader - Business Agreement Header
	 */
	public void removeFromBusinessruleHeader(final BusinessAgreementRuleHeader value)
	{
		removeFromBusinessruleHeader( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BUSINESSAGREEMENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.creditcardinc</code> attribute.
	 * @return the creditcardinc - Credit Card Incoming
	 */
	public String getCreditcardinc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDITCARDINC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.creditcardinc</code> attribute.
	 * @return the creditcardinc - Credit Card Incoming
	 */
	public String getCreditcardinc()
	{
		return getCreditcardinc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.creditcardinc</code> attribute. 
	 * @param value the creditcardinc - Credit Card Incoming
	 */
	public void setCreditcardinc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDITCARDINC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.creditcardinc</code> attribute. 
	 * @param value the creditcardinc - Credit Card Incoming
	 */
	public void setCreditcardinc(final String value)
	{
		setCreditcardinc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.creditcardout</code> attribute.
	 * @return the creditcardout - Credit Card Outgoing
	 */
	public String getCreditcardout(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDITCARDOUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.creditcardout</code> attribute.
	 * @return the creditcardout - Credit Card Outgoing
	 */
	public String getCreditcardout()
	{
		return getCreditcardout( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.creditcardout</code> attribute. 
	 * @param value the creditcardout - Credit Card Outgoing
	 */
	public void setCreditcardout(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDITCARDOUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.creditcardout</code> attribute. 
	 * @param value the creditcardout - Credit Card Outgoing
	 */
	public void setCreditcardout(final String value)
	{
		setCreditcardout( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.refnumber</code> attribute.
	 * @return the refnumber - Reference Number
	 */
	public String getRefnumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REFNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.refnumber</code> attribute.
	 * @return the refnumber - Reference Number
	 */
	public String getRefnumber()
	{
		return getRefnumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.refnumber</code> attribute. 
	 * @param value the refnumber - Reference Number
	 */
	public void setRefnumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REFNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.refnumber</code> attribute. 
	 * @param value the refnumber - Reference Number
	 */
	public void setRefnumber(final String value)
	{
		setRefnumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.replicationNumberHeader</code> attribute.
	 * @return the replicationNumberHeader - Business Agreement replication number
	 */
	public String getReplicationNumberHeader(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REPLICATIONNUMBERHEADER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.replicationNumberHeader</code> attribute.
	 * @return the replicationNumberHeader - Business Agreement replication number
	 */
	public String getReplicationNumberHeader()
	{
		return getReplicationNumberHeader( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.replicationNumberHeader</code> attribute. 
	 * @param value the replicationNumberHeader - Business Agreement replication number
	 */
	public void setReplicationNumberHeader(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REPLICATIONNUMBERHEADER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.replicationNumberHeader</code> attribute. 
	 * @param value the replicationNumberHeader - Business Agreement replication number
	 */
	public void setReplicationNumberHeader(final String value)
	{
		setReplicationNumberHeader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.taxcategory</code> attribute.
	 * @return the taxcategory - Tax Category
	 */
	public CRMBusinessAgreementTaxCategory getTaxcategory(final SessionContext ctx)
	{
		return (CRMBusinessAgreementTaxCategory)getProperty( ctx, TAXCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.taxcategory</code> attribute.
	 * @return the taxcategory - Tax Category
	 */
	public CRMBusinessAgreementTaxCategory getTaxcategory()
	{
		return getTaxcategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.taxcategory</code> attribute. 
	 * @param value the taxcategory - Tax Category
	 */
	public void setTaxcategory(final SessionContext ctx, final CRMBusinessAgreementTaxCategory value)
	{
		setProperty(ctx, TAXCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.taxcategory</code> attribute. 
	 * @param value the taxcategory - Tax Category
	 */
	public void setTaxcategory(final CRMBusinessAgreementTaxCategory value)
	{
		setTaxcategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.taxcode</code> attribute.
	 * @return the taxcode - Tax Code
	 */
	public CRMBusinessAgreementTaxCode getTaxcode(final SessionContext ctx)
	{
		return (CRMBusinessAgreementTaxCode)getProperty( ctx, TAXCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.taxcode</code> attribute.
	 * @return the taxcode - Tax Code
	 */
	public CRMBusinessAgreementTaxCode getTaxcode()
	{
		return getTaxcode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.taxcode</code> attribute. 
	 * @param value the taxcode - Tax Code
	 */
	public void setTaxcode(final SessionContext ctx, final CRMBusinessAgreementTaxCode value)
	{
		setProperty(ctx, TAXCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.taxcode</code> attribute. 
	 * @param value the taxcode - Tax Code
	 */
	public void setTaxcode(final CRMBusinessAgreementTaxCode value)
	{
		setTaxcode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.validfrom</code> attribute.
	 * @return the validfrom - Valid From
	 */
	public String getValidfrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.validfrom</code> attribute.
	 * @return the validfrom - Valid From
	 */
	public String getValidfrom()
	{
		return getValidfrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.validfrom</code> attribute. 
	 * @param value the validfrom - Valid From
	 */
	public void setValidfrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.validfrom</code> attribute. 
	 * @param value the validfrom - Valid From
	 */
	public void setValidfrom(final String value)
	{
		setValidfrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.validto</code> attribute.
	 * @return the validto - Valid To
	 */
	public String getValidto(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementHeader.validto</code> attribute.
	 * @return the validto - Valid To
	 */
	public String getValidto()
	{
		return getValidto( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.validto</code> attribute. 
	 * @param value the validto - Valid To
	 */
	public void setValidto(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementHeader.validto</code> attribute. 
	 * @param value the validto - Valid To
	 */
	public void setValidto(final String value)
	{
		setValidto( getSession().getSessionContext(), value );
	}
	
}
