/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmmodel.models.jalo;

import com.sap.hybris.crm.sapcrmmodel.models.constants.SapcrmmodelConstants;
import com.sap.hybris.crm.sapcrmmodel.models.jalo.PartnerFunction;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.order.payment.PaymentInfo;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.ordersplitting.jalo.Warehouse;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SapcrmmodelManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcrmmodelManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("incoterms1", AttributeMode.INITIAL);
		tmp.put("incoterms2", AttributeMode.INITIAL);
		tmp.put("crmGuid", AttributeMode.INITIAL);
		tmp.put("erpCustomerId", AttributeMode.INITIAL);
		tmp.put("sapIsReplicatedFromHybris", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("incoterms1", AttributeMode.INITIAL);
		tmp.put("incoterms2", AttributeMode.INITIAL);
		tmp.put("referenceCustomerguid", AttributeMode.INITIAL);
		tmp.put("saperp_salesOrganization", AttributeMode.INITIAL);
		tmp.put("saperp_distributionChannel", AttributeMode.INITIAL);
		tmp.put("saperp_division", AttributeMode.INITIAL);
		tmp.put("sap_serviceOrg", AttributeMode.INITIAL);
		tmp.put("sap_serviceOrgResp", AttributeMode.INITIAL);
		tmp.put("sap_serviceProcessType", AttributeMode.INITIAL);
		tmp.put("sap_servOrgShort", AttributeMode.INITIAL);
		tmp.put("serviceOrderProcessType", AttributeMode.INITIAL);
		tmp.put("sapcommon_salesOrgResponsible", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("guid", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("guid", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.category.jalo.Category", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("invoiceNumber", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Order", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapCrmCode", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.ordersplitting.jalo.Warehouse", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapIsReplicated", AttributeMode.INITIAL);
		tmp.put("sapReplicationInfo", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("issuer", AttributeMode.INITIAL);
		tmp.put("issuingDate", AttributeMode.INITIAL);
		tmp.put("isDefault", AttributeMode.INITIAL);
		tmp.put("cardInc", AttributeMode.INITIAL);
		tmp.put("sapIsReplicated", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.payment.PaymentInfo", Collections.unmodifiableMap(tmp));
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.cardInc</code> attribute.
	 * @return the cardInc
	 */
	public String getCardInc(final SessionContext ctx, final PaymentInfo item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.CreditCardPaymentInfo.CARDINC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.cardInc</code> attribute.
	 * @return the cardInc
	 */
	public String getCardInc(final PaymentInfo item)
	{
		return getCardInc( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.cardInc</code> attribute. 
	 * @param value the cardInc
	 */
	public void setCardInc(final SessionContext ctx, final PaymentInfo item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.CreditCardPaymentInfo.CARDINC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.cardInc</code> attribute. 
	 * @param value the cardInc
	 */
	public void setCardInc(final PaymentInfo item, final String value)
	{
		setCardInc( getSession().getSessionContext(), item, value );
	}
	
	public PartnerFunction createPartnerFunction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmmodelConstants.TC.PARTNERFUNCTION );
			return (PartnerFunction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PartnerFunction : "+e.getMessage(), 0 );
		}
	}
	
	public PartnerFunction createPartnerFunction(final Map attributeValues)
	{
		return createPartnerFunction( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.crmGuid</code> attribute.
	 * @return the crmGuid - Customer GUID
	 */
	public String getCrmGuid(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.Customer.CRMGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.crmGuid</code> attribute.
	 * @return the crmGuid - Customer GUID
	 */
	public String getCrmGuid(final Customer item)
	{
		return getCrmGuid( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.crmGuid</code> attribute. 
	 * @param value the crmGuid - Customer GUID
	 */
	public void setCrmGuid(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.Customer.CRMGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.crmGuid</code> attribute. 
	 * @param value the crmGuid - Customer GUID
	 */
	public void setCrmGuid(final Customer item, final String value)
	{
		setCrmGuid( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.erpCustomerId</code> attribute.
	 * @return the erpCustomerId - ERP Customer Id
	 */
	public String getErpCustomerId(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.Customer.ERPCUSTOMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.erpCustomerId</code> attribute.
	 * @return the erpCustomerId - ERP Customer Id
	 */
	public String getErpCustomerId(final Customer item)
	{
		return getErpCustomerId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.erpCustomerId</code> attribute. 
	 * @param value the erpCustomerId - ERP Customer Id
	 */
	public void setErpCustomerId(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.Customer.ERPCUSTOMERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.erpCustomerId</code> attribute. 
	 * @param value the erpCustomerId - ERP Customer Id
	 */
	public void setErpCustomerId(final Customer item, final String value)
	{
		setErpCustomerId( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return SapcrmmodelConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.guid</code> attribute.
	 * @return the guid - Product GUID
	 */
	public String getGuid(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.Product.GUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.guid</code> attribute.
	 * @return the guid - Product GUID
	 */
	public String getGuid(final Product item)
	{
		return getGuid( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.guid</code> attribute. 
	 * @param value the guid - Product GUID
	 */
	public void setGuid(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.Product.GUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.guid</code> attribute. 
	 * @param value the guid - Product GUID
	 */
	public void setGuid(final Product item, final String value)
	{
		setGuid( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.guid</code> attribute.
	 * @return the guid - Category GUID
	 */
	public String getGuid(final SessionContext ctx, final Category item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.Category.GUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.guid</code> attribute.
	 * @return the guid - Category GUID
	 */
	public String getGuid(final Category item)
	{
		return getGuid( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.guid</code> attribute. 
	 * @param value the guid - Category GUID
	 */
	public void setGuid(final SessionContext ctx, final Category item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.Category.GUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.guid</code> attribute. 
	 * @param value the guid - Category GUID
	 */
	public void setGuid(final Category item, final String value)
	{
		setGuid( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.incoterms1</code> attribute.
	 * @return the incoterms1 - Customer Incoterms 1
	 */
	public String getIncoterms1(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.Customer.INCOTERMS1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.incoterms1</code> attribute.
	 * @return the incoterms1 - Customer Incoterms 1
	 */
	public String getIncoterms1(final Customer item)
	{
		return getIncoterms1( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.incoterms1</code> attribute. 
	 * @param value the incoterms1 - Customer Incoterms 1
	 */
	public void setIncoterms1(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.Customer.INCOTERMS1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.incoterms1</code> attribute. 
	 * @param value the incoterms1 - Customer Incoterms 1
	 */
	public void setIncoterms1(final Customer item, final String value)
	{
		setIncoterms1( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.incoterms1</code> attribute.
	 * @return the incoterms1 - Incoterms1 for anonymous Customer
	 */
	public String getIncoterms1(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.INCOTERMS1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.incoterms1</code> attribute.
	 * @return the incoterms1 - Incoterms1 for anonymous Customer
	 */
	public String getIncoterms1(final SAPConfiguration item)
	{
		return getIncoterms1( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.incoterms1</code> attribute. 
	 * @param value the incoterms1 - Incoterms1 for anonymous Customer
	 */
	public void setIncoterms1(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.INCOTERMS1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.incoterms1</code> attribute. 
	 * @param value the incoterms1 - Incoterms1 for anonymous Customer
	 */
	public void setIncoterms1(final SAPConfiguration item, final String value)
	{
		setIncoterms1( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.incoterms2</code> attribute.
	 * @return the incoterms2 - >Customer Incoterms 2
	 */
	public String getIncoterms2(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.Customer.INCOTERMS2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.incoterms2</code> attribute.
	 * @return the incoterms2 - >Customer Incoterms 2
	 */
	public String getIncoterms2(final Customer item)
	{
		return getIncoterms2( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.incoterms2</code> attribute. 
	 * @param value the incoterms2 - >Customer Incoterms 2
	 */
	public void setIncoterms2(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.Customer.INCOTERMS2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.incoterms2</code> attribute. 
	 * @param value the incoterms2 - >Customer Incoterms 2
	 */
	public void setIncoterms2(final Customer item, final String value)
	{
		setIncoterms2( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.incoterms2</code> attribute.
	 * @return the incoterms2 - Incoterms2 for anonymous Customer
	 */
	public String getIncoterms2(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.INCOTERMS2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.incoterms2</code> attribute.
	 * @return the incoterms2 - Incoterms2 for anonymous Customer
	 */
	public String getIncoterms2(final SAPConfiguration item)
	{
		return getIncoterms2( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.incoterms2</code> attribute. 
	 * @param value the incoterms2 - Incoterms2 for anonymous Customer
	 */
	public void setIncoterms2(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.INCOTERMS2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.incoterms2</code> attribute. 
	 * @param value the incoterms2 - Incoterms2 for anonymous Customer
	 */
	public void setIncoterms2(final SAPConfiguration item, final String value)
	{
		setIncoterms2( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.invoiceNumber</code> attribute.
	 * @return the invoiceNumber - Saving billing number in order model
	 */
	public Integer getInvoiceNumber(final SessionContext ctx, final Order item)
	{
		return (Integer)item.getProperty( ctx, SapcrmmodelConstants.Attributes.Order.INVOICENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.invoiceNumber</code> attribute.
	 * @return the invoiceNumber - Saving billing number in order model
	 */
	public Integer getInvoiceNumber(final Order item)
	{
		return getInvoiceNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.invoiceNumber</code> attribute. 
	 * @return the invoiceNumber - Saving billing number in order model
	 */
	public int getInvoiceNumberAsPrimitive(final SessionContext ctx, final Order item)
	{
		Integer value = getInvoiceNumber( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.invoiceNumber</code> attribute. 
	 * @return the invoiceNumber - Saving billing number in order model
	 */
	public int getInvoiceNumberAsPrimitive(final Order item)
	{
		return getInvoiceNumberAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.invoiceNumber</code> attribute. 
	 * @param value the invoiceNumber - Saving billing number in order model
	 */
	public void setInvoiceNumber(final SessionContext ctx, final Order item, final Integer value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.Order.INVOICENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.invoiceNumber</code> attribute. 
	 * @param value the invoiceNumber - Saving billing number in order model
	 */
	public void setInvoiceNumber(final Order item, final Integer value)
	{
		setInvoiceNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.invoiceNumber</code> attribute. 
	 * @param value the invoiceNumber - Saving billing number in order model
	 */
	public void setInvoiceNumber(final SessionContext ctx, final Order item, final int value)
	{
		setInvoiceNumber( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.invoiceNumber</code> attribute. 
	 * @param value the invoiceNumber - Saving billing number in order model
	 */
	public void setInvoiceNumber(final Order item, final int value)
	{
		setInvoiceNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.isDefault</code> attribute.
	 * @return the isDefault
	 */
	public Boolean isIsDefault(final SessionContext ctx, final PaymentInfo item)
	{
		return (Boolean)item.getProperty( ctx, SapcrmmodelConstants.Attributes.CreditCardPaymentInfo.ISDEFAULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.isDefault</code> attribute.
	 * @return the isDefault
	 */
	public Boolean isIsDefault(final PaymentInfo item)
	{
		return isIsDefault( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.isDefault</code> attribute. 
	 * @return the isDefault
	 */
	public boolean isIsDefaultAsPrimitive(final SessionContext ctx, final PaymentInfo item)
	{
		Boolean value = isIsDefault( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.isDefault</code> attribute. 
	 * @return the isDefault
	 */
	public boolean isIsDefaultAsPrimitive(final PaymentInfo item)
	{
		return isIsDefaultAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.isDefault</code> attribute. 
	 * @param value the isDefault
	 */
	public void setIsDefault(final SessionContext ctx, final PaymentInfo item, final Boolean value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.CreditCardPaymentInfo.ISDEFAULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.isDefault</code> attribute. 
	 * @param value the isDefault
	 */
	public void setIsDefault(final PaymentInfo item, final Boolean value)
	{
		setIsDefault( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.isDefault</code> attribute. 
	 * @param value the isDefault
	 */
	public void setIsDefault(final SessionContext ctx, final PaymentInfo item, final boolean value)
	{
		setIsDefault( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.isDefault</code> attribute. 
	 * @param value the isDefault
	 */
	public void setIsDefault(final PaymentInfo item, final boolean value)
	{
		setIsDefault( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.issuer</code> attribute.
	 * @return the issuer
	 */
	public String getIssuer(final SessionContext ctx, final PaymentInfo item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.CreditCardPaymentInfo.ISSUER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.issuer</code> attribute.
	 * @return the issuer
	 */
	public String getIssuer(final PaymentInfo item)
	{
		return getIssuer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.issuer</code> attribute. 
	 * @param value the issuer
	 */
	public void setIssuer(final SessionContext ctx, final PaymentInfo item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.CreditCardPaymentInfo.ISSUER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.issuer</code> attribute. 
	 * @param value the issuer
	 */
	public void setIssuer(final PaymentInfo item, final String value)
	{
		setIssuer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.issuingDate</code> attribute.
	 * @return the issuingDate
	 */
	public String getIssuingDate(final SessionContext ctx, final PaymentInfo item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.CreditCardPaymentInfo.ISSUINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.issuingDate</code> attribute.
	 * @return the issuingDate
	 */
	public String getIssuingDate(final PaymentInfo item)
	{
		return getIssuingDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.issuingDate</code> attribute. 
	 * @param value the issuingDate
	 */
	public void setIssuingDate(final SessionContext ctx, final PaymentInfo item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.CreditCardPaymentInfo.ISSUINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.issuingDate</code> attribute. 
	 * @param value the issuingDate
	 */
	public void setIssuingDate(final PaymentInfo item, final String value)
	{
		setIssuingDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.referenceCustomerguid</code> attribute.
	 * @return the referenceCustomerguid - Reference Customer GUID
	 */
	public String getReferenceCustomerguid(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.REFERENCECUSTOMERGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.referenceCustomerguid</code> attribute.
	 * @return the referenceCustomerguid - Reference Customer GUID
	 */
	public String getReferenceCustomerguid(final SAPConfiguration item)
	{
		return getReferenceCustomerguid( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.referenceCustomerguid</code> attribute. 
	 * @param value the referenceCustomerguid - Reference Customer GUID
	 */
	public void setReferenceCustomerguid(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.REFERENCECUSTOMERGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.referenceCustomerguid</code> attribute. 
	 * @param value the referenceCustomerguid - Reference Customer GUID
	 */
	public void setReferenceCustomerguid(final SAPConfiguration item, final String value)
	{
		setReferenceCustomerguid( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sap_serviceOrg</code> attribute.
	 * @return the sap_serviceOrg - Service org
	 */
	public String getSap_serviceOrg(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAP_SERVICEORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sap_serviceOrg</code> attribute.
	 * @return the sap_serviceOrg - Service org
	 */
	public String getSap_serviceOrg(final SAPConfiguration item)
	{
		return getSap_serviceOrg( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sap_serviceOrg</code> attribute. 
	 * @param value the sap_serviceOrg - Service org
	 */
	public void setSap_serviceOrg(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAP_SERVICEORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sap_serviceOrg</code> attribute. 
	 * @param value the sap_serviceOrg - Service org
	 */
	public void setSap_serviceOrg(final SAPConfiguration item, final String value)
	{
		setSap_serviceOrg( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sap_serviceOrgResp</code> attribute.
	 * @return the sap_serviceOrgResp - Service org Responsible
	 */
	public String getSap_serviceOrgResp(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAP_SERVICEORGRESP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sap_serviceOrgResp</code> attribute.
	 * @return the sap_serviceOrgResp - Service org Responsible
	 */
	public String getSap_serviceOrgResp(final SAPConfiguration item)
	{
		return getSap_serviceOrgResp( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sap_serviceOrgResp</code> attribute. 
	 * @param value the sap_serviceOrgResp - Service org Responsible
	 */
	public void setSap_serviceOrgResp(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAP_SERVICEORGRESP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sap_serviceOrgResp</code> attribute. 
	 * @param value the sap_serviceOrgResp - Service org Responsible
	 */
	public void setSap_serviceOrgResp(final SAPConfiguration item, final String value)
	{
		setSap_serviceOrgResp( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sap_serviceProcessType</code> attribute.
	 * @return the sap_serviceProcessType - Service Transaction Type
	 */
	public String getSap_serviceProcessType(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAP_SERVICEPROCESSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sap_serviceProcessType</code> attribute.
	 * @return the sap_serviceProcessType - Service Transaction Type
	 */
	public String getSap_serviceProcessType(final SAPConfiguration item)
	{
		return getSap_serviceProcessType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sap_serviceProcessType</code> attribute. 
	 * @param value the sap_serviceProcessType - Service Transaction Type
	 */
	public void setSap_serviceProcessType(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAP_SERVICEPROCESSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sap_serviceProcessType</code> attribute. 
	 * @param value the sap_serviceProcessType - Service Transaction Type
	 */
	public void setSap_serviceProcessType(final SAPConfiguration item, final String value)
	{
		setSap_serviceProcessType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sap_servOrgShort</code> attribute.
	 * @return the sap_servOrgShort - Service Org Short
	 */
	public String getSap_servOrgShort(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAP_SERVORGSHORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sap_servOrgShort</code> attribute.
	 * @return the sap_servOrgShort - Service Org Short
	 */
	public String getSap_servOrgShort(final SAPConfiguration item)
	{
		return getSap_servOrgShort( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sap_servOrgShort</code> attribute. 
	 * @param value the sap_servOrgShort - Service Org Short
	 */
	public void setSap_servOrgShort(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAP_SERVORGSHORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sap_servOrgShort</code> attribute. 
	 * @param value the sap_servOrgShort - Service Org Short
	 */
	public void setSap_servOrgShort(final SAPConfiguration item, final String value)
	{
		setSap_servOrgShort( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_salesOrgResponsible</code> attribute.
	 * @return the sapcommon_salesOrgResponsible
	 */
	public String getSapcommon_salesOrgResponsible(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAPCOMMON_SALESORGRESPONSIBLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_salesOrgResponsible</code> attribute.
	 * @return the sapcommon_salesOrgResponsible
	 */
	public String getSapcommon_salesOrgResponsible(final SAPConfiguration item)
	{
		return getSapcommon_salesOrgResponsible( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcommon_salesOrgResponsible</code> attribute. 
	 * @param value the sapcommon_salesOrgResponsible
	 */
	public void setSapcommon_salesOrgResponsible(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAPCOMMON_SALESORGRESPONSIBLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcommon_salesOrgResponsible</code> attribute. 
	 * @param value the sapcommon_salesOrgResponsible
	 */
	public void setSapcommon_salesOrgResponsible(final SAPConfiguration item, final String value)
	{
		setSapcommon_salesOrgResponsible( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warehouse.sapCrmCode</code> attribute.
	 * @return the sapCrmCode - Saving vendor information from CRM in warehouse model
	 */
	public String getSapCrmCode(final SessionContext ctx, final Warehouse item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.Warehouse.SAPCRMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warehouse.sapCrmCode</code> attribute.
	 * @return the sapCrmCode - Saving vendor information from CRM in warehouse model
	 */
	public String getSapCrmCode(final Warehouse item)
	{
		return getSapCrmCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Warehouse.sapCrmCode</code> attribute. 
	 * @param value the sapCrmCode - Saving vendor information from CRM in warehouse model
	 */
	public void setSapCrmCode(final SessionContext ctx, final Warehouse item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.Warehouse.SAPCRMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Warehouse.sapCrmCode</code> attribute. 
	 * @param value the sapCrmCode - Saving vendor information from CRM in warehouse model
	 */
	public void setSapCrmCode(final Warehouse item, final String value)
	{
		setSapCrmCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saperp_distributionChannel</code> attribute.
	 * @return the saperp_distributionChannel - Distribution Channel for Pricing
	 */
	public String getSaperp_distributionChannel(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAPERP_DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saperp_distributionChannel</code> attribute.
	 * @return the saperp_distributionChannel - Distribution Channel for Pricing
	 */
	public String getSaperp_distributionChannel(final SAPConfiguration item)
	{
		return getSaperp_distributionChannel( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saperp_distributionChannel</code> attribute. 
	 * @param value the saperp_distributionChannel - Distribution Channel for Pricing
	 */
	public void setSaperp_distributionChannel(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAPERP_DISTRIBUTIONCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saperp_distributionChannel</code> attribute. 
	 * @param value the saperp_distributionChannel - Distribution Channel for Pricing
	 */
	public void setSaperp_distributionChannel(final SAPConfiguration item, final String value)
	{
		setSaperp_distributionChannel( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saperp_division</code> attribute.
	 * @return the saperp_division - Division for ERP
	 */
	public String getSaperp_division(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAPERP_DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saperp_division</code> attribute.
	 * @return the saperp_division - Division for ERP
	 */
	public String getSaperp_division(final SAPConfiguration item)
	{
		return getSaperp_division( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saperp_division</code> attribute. 
	 * @param value the saperp_division - Division for ERP
	 */
	public void setSaperp_division(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAPERP_DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saperp_division</code> attribute. 
	 * @param value the saperp_division - Division for ERP
	 */
	public void setSaperp_division(final SAPConfiguration item, final String value)
	{
		setSaperp_division( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saperp_salesOrganization</code> attribute.
	 * @return the saperp_salesOrganization - Sales Organization for ERP
	 */
	public String getSaperp_salesOrganization(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAPERP_SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saperp_salesOrganization</code> attribute.
	 * @return the saperp_salesOrganization - Sales Organization for ERP
	 */
	public String getSaperp_salesOrganization(final SAPConfiguration item)
	{
		return getSaperp_salesOrganization( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saperp_salesOrganization</code> attribute. 
	 * @param value the saperp_salesOrganization - Sales Organization for ERP
	 */
	public void setSaperp_salesOrganization(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SAPERP_SALESORGANIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saperp_salesOrganization</code> attribute. 
	 * @param value the saperp_salesOrganization - Sales Organization for ERP
	 */
	public void setSaperp_salesOrganization(final SAPConfiguration item, final String value)
	{
		setSaperp_salesOrganization( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sapIsReplicated</code> attribute.
	 * @return the sapIsReplicated - Indicates if the address has been replicated to the SAP system
	 */
	public Boolean isSapIsReplicated(final SessionContext ctx, final Address item)
	{
		return (Boolean)item.getProperty( ctx, SapcrmmodelConstants.Attributes.Address.SAPISREPLICATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sapIsReplicated</code> attribute.
	 * @return the sapIsReplicated - Indicates if the address has been replicated to the SAP system
	 */
	public Boolean isSapIsReplicated(final Address item)
	{
		return isSapIsReplicated( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sapIsReplicated</code> attribute. 
	 * @return the sapIsReplicated - Indicates if the address has been replicated to the SAP system
	 */
	public boolean isSapIsReplicatedAsPrimitive(final SessionContext ctx, final Address item)
	{
		Boolean value = isSapIsReplicated( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sapIsReplicated</code> attribute. 
	 * @return the sapIsReplicated - Indicates if the address has been replicated to the SAP system
	 */
	public boolean isSapIsReplicatedAsPrimitive(final Address item)
	{
		return isSapIsReplicatedAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Indicates if the address has been replicated to the SAP system
	 */
	public void setSapIsReplicated(final SessionContext ctx, final Address item, final Boolean value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.Address.SAPISREPLICATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Indicates if the address has been replicated to the SAP system
	 */
	public void setSapIsReplicated(final Address item, final Boolean value)
	{
		setSapIsReplicated( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Indicates if the address has been replicated to the SAP system
	 */
	public void setSapIsReplicated(final SessionContext ctx, final Address item, final boolean value)
	{
		setSapIsReplicated( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Indicates if the address has been replicated to the SAP system
	 */
	public void setSapIsReplicated(final Address item, final boolean value)
	{
		setSapIsReplicated( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.sapIsReplicated</code> attribute.
	 * @return the sapIsReplicated - Indicates if the Credit has been replicated to the SAP system
	 */
	public Boolean isSapIsReplicated(final SessionContext ctx, final PaymentInfo item)
	{
		return (Boolean)item.getProperty( ctx, SapcrmmodelConstants.Attributes.CreditCardPaymentInfo.SAPISREPLICATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.sapIsReplicated</code> attribute.
	 * @return the sapIsReplicated - Indicates if the Credit has been replicated to the SAP system
	 */
	public Boolean isSapIsReplicated(final PaymentInfo item)
	{
		return isSapIsReplicated( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.sapIsReplicated</code> attribute. 
	 * @return the sapIsReplicated - Indicates if the Credit has been replicated to the SAP system
	 */
	public boolean isSapIsReplicatedAsPrimitive(final SessionContext ctx, final PaymentInfo item)
	{
		Boolean value = isSapIsReplicated( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.sapIsReplicated</code> attribute. 
	 * @return the sapIsReplicated - Indicates if the Credit has been replicated to the SAP system
	 */
	public boolean isSapIsReplicatedAsPrimitive(final PaymentInfo item)
	{
		return isSapIsReplicatedAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Indicates if the Credit has been replicated to the SAP system
	 */
	public void setSapIsReplicated(final SessionContext ctx, final PaymentInfo item, final Boolean value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.CreditCardPaymentInfo.SAPISREPLICATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Indicates if the Credit has been replicated to the SAP system
	 */
	public void setSapIsReplicated(final PaymentInfo item, final Boolean value)
	{
		setSapIsReplicated( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Indicates if the Credit has been replicated to the SAP system
	 */
	public void setSapIsReplicated(final SessionContext ctx, final PaymentInfo item, final boolean value)
	{
		setSapIsReplicated( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Indicates if the Credit has been replicated to the SAP system
	 */
	public void setSapIsReplicated(final PaymentInfo item, final boolean value)
	{
		setSapIsReplicated( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapIsReplicatedFromHybris</code> attribute.
	 * @return the sapIsReplicatedFromHybris - Indicates if the Customer was replicated from Hybris
	 */
	public Boolean isSapIsReplicatedFromHybris(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, SapcrmmodelConstants.Attributes.Customer.SAPISREPLICATEDFROMHYBRIS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapIsReplicatedFromHybris</code> attribute.
	 * @return the sapIsReplicatedFromHybris - Indicates if the Customer was replicated from Hybris
	 */
	public Boolean isSapIsReplicatedFromHybris(final Customer item)
	{
		return isSapIsReplicatedFromHybris( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapIsReplicatedFromHybris</code> attribute. 
	 * @return the sapIsReplicatedFromHybris - Indicates if the Customer was replicated from Hybris
	 */
	public boolean isSapIsReplicatedFromHybrisAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isSapIsReplicatedFromHybris( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapIsReplicatedFromHybris</code> attribute. 
	 * @return the sapIsReplicatedFromHybris - Indicates if the Customer was replicated from Hybris
	 */
	public boolean isSapIsReplicatedFromHybrisAsPrimitive(final Customer item)
	{
		return isSapIsReplicatedFromHybrisAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapIsReplicatedFromHybris</code> attribute. 
	 * @param value the sapIsReplicatedFromHybris - Indicates if the Customer was replicated from Hybris
	 */
	public void setSapIsReplicatedFromHybris(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.Customer.SAPISREPLICATEDFROMHYBRIS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapIsReplicatedFromHybris</code> attribute. 
	 * @param value the sapIsReplicatedFromHybris - Indicates if the Customer was replicated from Hybris
	 */
	public void setSapIsReplicatedFromHybris(final Customer item, final Boolean value)
	{
		setSapIsReplicatedFromHybris( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapIsReplicatedFromHybris</code> attribute. 
	 * @param value the sapIsReplicatedFromHybris - Indicates if the Customer was replicated from Hybris
	 */
	public void setSapIsReplicatedFromHybris(final SessionContext ctx, final Customer item, final boolean value)
	{
		setSapIsReplicatedFromHybris( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapIsReplicatedFromHybris</code> attribute. 
	 * @param value the sapIsReplicatedFromHybris - Indicates if the Customer was replicated from Hybris
	 */
	public void setSapIsReplicatedFromHybris(final Customer item, final boolean value)
	{
		setSapIsReplicatedFromHybris( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sapReplicationInfo</code> attribute.
	 * @return the sapReplicationInfo - Information related to the replication to the SAP system
	 */
	public String getSapReplicationInfo(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.Address.SAPREPLICATIONINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sapReplicationInfo</code> attribute.
	 * @return the sapReplicationInfo - Information related to the replication to the SAP system
	 */
	public String getSapReplicationInfo(final Address item)
	{
		return getSapReplicationInfo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sapReplicationInfo</code> attribute. 
	 * @param value the sapReplicationInfo - Information related to the replication to the SAP system
	 */
	public void setSapReplicationInfo(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.Address.SAPREPLICATIONINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sapReplicationInfo</code> attribute. 
	 * @param value the sapReplicationInfo - Information related to the replication to the SAP system
	 */
	public void setSapReplicationInfo(final Address item, final String value)
	{
		setSapReplicationInfo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.serviceOrderProcessType</code> attribute.
	 * @return the serviceOrderProcessType - Service Order Type
	 */
	public String getServiceOrderProcessType(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SERVICEORDERPROCESSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.serviceOrderProcessType</code> attribute.
	 * @return the serviceOrderProcessType - Service Order Type
	 */
	public String getServiceOrderProcessType(final SAPConfiguration item)
	{
		return getServiceOrderProcessType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.serviceOrderProcessType</code> attribute. 
	 * @param value the serviceOrderProcessType - Service Order Type
	 */
	public void setServiceOrderProcessType(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmmodelConstants.Attributes.SAPConfiguration.SERVICEORDERPROCESSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.serviceOrderProcessType</code> attribute. 
	 * @param value the serviceOrderProcessType - Service Order Type
	 */
	public void setServiceOrderProcessType(final SAPConfiguration item, final String value)
	{
		setServiceOrderProcessType( getSession().getSessionContext(), item, value );
	}
	
}
