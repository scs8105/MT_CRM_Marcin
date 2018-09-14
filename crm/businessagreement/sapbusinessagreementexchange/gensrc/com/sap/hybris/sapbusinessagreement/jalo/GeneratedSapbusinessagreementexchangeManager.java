/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapbusinessagreement.jalo;

import com.sap.hybris.sapbusinessagreement.constants.SapbusinessagreementexchangeConstants;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreement;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreementHeader;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreementPartners;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreementProcess;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreementRuleHeader;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementClass;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementCorrepondingVariant;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementPaymentMethod;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementShippingControl;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementTaxCategory;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementTaxCode;
import com.sap.hybris.sapbusinessagreement.jalo.CRMBusinessAgreementTermsPayment;
import de.hybris.platform.agreement.jalo.AgreementApprovalProcess;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.sap.core.configuration.jalo.SAPGlobalConfiguration;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>SapbusinessagreementexchangeManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapbusinessagreementexchangeManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n BUSINESSAGREEMENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BusinessAgreement> BUSINESSAGCUSTOMERRELATIONBUSINESSAGREEMENTHANDLER = new OneToManyHandler<BusinessAgreement>(
	SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENT,
	true,
	"customer",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("businessAgreement", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Order", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("businessagreementclass", AttributeMode.INITIAL);
		tmp.put("termofpayment", AttributeMode.INITIAL);
		tmp.put("paymentmethod", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.sap.core.configuration.jalo.SAPGlobalConfiguration", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>Order.businessAgreement</code> attribute.
	 * @return the businessAgreement - BusinessAgreement in order model
	 */
	public BusinessAgreement getBusinessAgreement(final SessionContext ctx, final Order item)
	{
		return (BusinessAgreement)item.getProperty( ctx, SapbusinessagreementexchangeConstants.Attributes.Order.BUSINESSAGREEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.businessAgreement</code> attribute.
	 * @return the businessAgreement - BusinessAgreement in order model
	 */
	public BusinessAgreement getBusinessAgreement(final Order item)
	{
		return getBusinessAgreement( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.businessAgreement</code> attribute. 
	 * @param value the businessAgreement - BusinessAgreement in order model
	 */
	public void setBusinessAgreement(final SessionContext ctx, final Order item, final BusinessAgreement value)
	{
		item.setProperty(ctx, SapbusinessagreementexchangeConstants.Attributes.Order.BUSINESSAGREEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.businessAgreement</code> attribute. 
	 * @param value the businessAgreement - BusinessAgreement in order model
	 */
	public void setBusinessAgreement(final Order item, final BusinessAgreement value)
	{
		setBusinessAgreement( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.businessagreement</code> attribute.
	 * @return the businessagreement - Business Agreement Header
	 */
	public Set<BusinessAgreement> getBusinessagreement(final SessionContext ctx, final Customer item)
	{
		return (Set<BusinessAgreement>)BUSINESSAGCUSTOMERRELATIONBUSINESSAGREEMENTHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.businessagreement</code> attribute.
	 * @return the businessagreement - Business Agreement Header
	 */
	public Set<BusinessAgreement> getBusinessagreement(final Customer item)
	{
		return getBusinessagreement( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.businessagreement</code> attribute. 
	 * @param value the businessagreement - Business Agreement Header
	 */
	public void setBusinessagreement(final SessionContext ctx, final Customer item, final Set<BusinessAgreement> value)
	{
		BUSINESSAGCUSTOMERRELATIONBUSINESSAGREEMENTHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.businessagreement</code> attribute. 
	 * @param value the businessagreement - Business Agreement Header
	 */
	public void setBusinessagreement(final Customer item, final Set<BusinessAgreement> value)
	{
		setBusinessagreement( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessagreement. 
	 * @param value the item to add to businessagreement - Business Agreement Header
	 */
	public void addToBusinessagreement(final SessionContext ctx, final Customer item, final BusinessAgreement value)
	{
		BUSINESSAGCUSTOMERRELATIONBUSINESSAGREEMENTHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessagreement. 
	 * @param value the item to add to businessagreement - Business Agreement Header
	 */
	public void addToBusinessagreement(final Customer item, final BusinessAgreement value)
	{
		addToBusinessagreement( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessagreement. 
	 * @param value the item to remove from businessagreement - Business Agreement Header
	 */
	public void removeFromBusinessagreement(final SessionContext ctx, final Customer item, final BusinessAgreement value)
	{
		BUSINESSAGCUSTOMERRELATIONBUSINESSAGREEMENTHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessagreement. 
	 * @param value the item to remove from businessagreement - Business Agreement Header
	 */
	public void removeFromBusinessagreement(final Customer item, final BusinessAgreement value)
	{
		removeFromBusinessagreement( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.businessagreementclass</code> attribute.
	 * @return the businessagreementclass
	 */
	public CRMBusinessAgreementClass getBusinessagreementclass(final SessionContext ctx, final GenericItem item)
	{
		return (CRMBusinessAgreementClass)item.getProperty( ctx, SapbusinessagreementexchangeConstants.Attributes.SAPGlobalConfiguration.BUSINESSAGREEMENTCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.businessagreementclass</code> attribute.
	 * @return the businessagreementclass
	 */
	public CRMBusinessAgreementClass getBusinessagreementclass(final SAPGlobalConfiguration item)
	{
		return getBusinessagreementclass( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.businessagreementclass</code> attribute. 
	 * @param value the businessagreementclass
	 */
	public void setBusinessagreementclass(final SessionContext ctx, final GenericItem item, final CRMBusinessAgreementClass value)
	{
		item.setProperty(ctx, SapbusinessagreementexchangeConstants.Attributes.SAPGlobalConfiguration.BUSINESSAGREEMENTCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.businessagreementclass</code> attribute. 
	 * @param value the businessagreementclass
	 */
	public void setBusinessagreementclass(final SAPGlobalConfiguration item, final CRMBusinessAgreementClass value)
	{
		setBusinessagreementclass( getSession().getSessionContext(), item, value );
	}
	
	public AgreementApprovalProcess createAgreementApprovalProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.AGREEMENTAPPROVALPROCESS );
			return (AgreementApprovalProcess)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AgreementApprovalProcess : "+e.getMessage(), 0 );
		}
	}
	
	public AgreementApprovalProcess createAgreementApprovalProcess(final Map attributeValues)
	{
		return createAgreementApprovalProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public BusinessAgreement createBusinessAgreement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENT );
			return (BusinessAgreement)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BusinessAgreement : "+e.getMessage(), 0 );
		}
	}
	
	public BusinessAgreement createBusinessAgreement(final Map attributeValues)
	{
		return createBusinessAgreement( getSession().getSessionContext(), attributeValues );
	}
	
	public BusinessAgreementHeader createBusinessAgreementHeader(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENTHEADER );
			return (BusinessAgreementHeader)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BusinessAgreementHeader : "+e.getMessage(), 0 );
		}
	}
	
	public BusinessAgreementHeader createBusinessAgreementHeader(final Map attributeValues)
	{
		return createBusinessAgreementHeader( getSession().getSessionContext(), attributeValues );
	}
	
	public BusinessAgreementPartners createBusinessAgreementPartners(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENTPARTNERS );
			return (BusinessAgreementPartners)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BusinessAgreementPartners : "+e.getMessage(), 0 );
		}
	}
	
	public BusinessAgreementPartners createBusinessAgreementPartners(final Map attributeValues)
	{
		return createBusinessAgreementPartners( getSession().getSessionContext(), attributeValues );
	}
	
	public BusinessAgreementProcess createBusinessAgreementProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENTPROCESS );
			return (BusinessAgreementProcess)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BusinessAgreementProcess : "+e.getMessage(), 0 );
		}
	}
	
	public BusinessAgreementProcess createBusinessAgreementProcess(final Map attributeValues)
	{
		return createBusinessAgreementProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public BusinessAgreementRuleHeader createBusinessAgreementRuleHeader(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENTRULEHEADER );
			return (BusinessAgreementRuleHeader)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BusinessAgreementRuleHeader : "+e.getMessage(), 0 );
		}
	}
	
	public BusinessAgreementRuleHeader createBusinessAgreementRuleHeader(final Map attributeValues)
	{
		return createBusinessAgreementRuleHeader( getSession().getSessionContext(), attributeValues );
	}
	
	public CRMBusinessAgreementClass createCRMBusinessAgreementClass(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.CRMBUSINESSAGREEMENTCLASS );
			return (CRMBusinessAgreementClass)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CRMBusinessAgreementClass : "+e.getMessage(), 0 );
		}
	}
	
	public CRMBusinessAgreementClass createCRMBusinessAgreementClass(final Map attributeValues)
	{
		return createCRMBusinessAgreementClass( getSession().getSessionContext(), attributeValues );
	}
	
	public CRMBusinessAgreementCorrepondingVariant createCRMBusinessAgreementCorrepondingVariant(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.CRMBUSINESSAGREEMENTCORREPONDINGVARIANT );
			return (CRMBusinessAgreementCorrepondingVariant)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CRMBusinessAgreementCorrepondingVariant : "+e.getMessage(), 0 );
		}
	}
	
	public CRMBusinessAgreementCorrepondingVariant createCRMBusinessAgreementCorrepondingVariant(final Map attributeValues)
	{
		return createCRMBusinessAgreementCorrepondingVariant( getSession().getSessionContext(), attributeValues );
	}
	
	public CRMBusinessAgreementPaymentMethod createCRMBusinessAgreementPaymentMethod(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.CRMBUSINESSAGREEMENTPAYMENTMETHOD );
			return (CRMBusinessAgreementPaymentMethod)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CRMBusinessAgreementPaymentMethod : "+e.getMessage(), 0 );
		}
	}
	
	public CRMBusinessAgreementPaymentMethod createCRMBusinessAgreementPaymentMethod(final Map attributeValues)
	{
		return createCRMBusinessAgreementPaymentMethod( getSession().getSessionContext(), attributeValues );
	}
	
	public CRMBusinessAgreementShippingControl createCRMBusinessAgreementShippingControl(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.CRMBUSINESSAGREEMENTSHIPPINGCONTROL );
			return (CRMBusinessAgreementShippingControl)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CRMBusinessAgreementShippingControl : "+e.getMessage(), 0 );
		}
	}
	
	public CRMBusinessAgreementShippingControl createCRMBusinessAgreementShippingControl(final Map attributeValues)
	{
		return createCRMBusinessAgreementShippingControl( getSession().getSessionContext(), attributeValues );
	}
	
	public CRMBusinessAgreementTaxCategory createCRMBusinessAgreementTaxCategory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.CRMBUSINESSAGREEMENTTAXCATEGORY );
			return (CRMBusinessAgreementTaxCategory)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CRMBusinessAgreementTaxCategory : "+e.getMessage(), 0 );
		}
	}
	
	public CRMBusinessAgreementTaxCategory createCRMBusinessAgreementTaxCategory(final Map attributeValues)
	{
		return createCRMBusinessAgreementTaxCategory( getSession().getSessionContext(), attributeValues );
	}
	
	public CRMBusinessAgreementTaxCode createCRMBusinessAgreementTaxCode(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.CRMBUSINESSAGREEMENTTAXCODE );
			return (CRMBusinessAgreementTaxCode)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CRMBusinessAgreementTaxCode : "+e.getMessage(), 0 );
		}
	}
	
	public CRMBusinessAgreementTaxCode createCRMBusinessAgreementTaxCode(final Map attributeValues)
	{
		return createCRMBusinessAgreementTaxCode( getSession().getSessionContext(), attributeValues );
	}
	
	public CRMBusinessAgreementTermsPayment createCRMBusinessAgreementTermsPayment(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapbusinessagreementexchangeConstants.TC.CRMBUSINESSAGREEMENTTERMSPAYMENT );
			return (CRMBusinessAgreementTermsPayment)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CRMBusinessAgreementTermsPayment : "+e.getMessage(), 0 );
		}
	}
	
	public CRMBusinessAgreementTermsPayment createCRMBusinessAgreementTermsPayment(final Map attributeValues)
	{
		return createCRMBusinessAgreementTermsPayment( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SapbusinessagreementexchangeConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.paymentmethod</code> attribute.
	 * @return the paymentmethod
	 */
	public CRMBusinessAgreementPaymentMethod getPaymentmethod(final SessionContext ctx, final GenericItem item)
	{
		return (CRMBusinessAgreementPaymentMethod)item.getProperty( ctx, SapbusinessagreementexchangeConstants.Attributes.SAPGlobalConfiguration.PAYMENTMETHOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.paymentmethod</code> attribute.
	 * @return the paymentmethod
	 */
	public CRMBusinessAgreementPaymentMethod getPaymentmethod(final SAPGlobalConfiguration item)
	{
		return getPaymentmethod( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.paymentmethod</code> attribute. 
	 * @param value the paymentmethod
	 */
	public void setPaymentmethod(final SessionContext ctx, final GenericItem item, final CRMBusinessAgreementPaymentMethod value)
	{
		item.setProperty(ctx, SapbusinessagreementexchangeConstants.Attributes.SAPGlobalConfiguration.PAYMENTMETHOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.paymentmethod</code> attribute. 
	 * @param value the paymentmethod
	 */
	public void setPaymentmethod(final SAPGlobalConfiguration item, final CRMBusinessAgreementPaymentMethod value)
	{
		setPaymentmethod( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.termofpayment</code> attribute.
	 * @return the termofpayment
	 */
	public CRMBusinessAgreementTermsPayment getTermofpayment(final SessionContext ctx, final GenericItem item)
	{
		return (CRMBusinessAgreementTermsPayment)item.getProperty( ctx, SapbusinessagreementexchangeConstants.Attributes.SAPGlobalConfiguration.TERMOFPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.termofpayment</code> attribute.
	 * @return the termofpayment
	 */
	public CRMBusinessAgreementTermsPayment getTermofpayment(final SAPGlobalConfiguration item)
	{
		return getTermofpayment( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.termofpayment</code> attribute. 
	 * @param value the termofpayment
	 */
	public void setTermofpayment(final SessionContext ctx, final GenericItem item, final CRMBusinessAgreementTermsPayment value)
	{
		item.setProperty(ctx, SapbusinessagreementexchangeConstants.Attributes.SAPGlobalConfiguration.TERMOFPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.termofpayment</code> attribute. 
	 * @param value the termofpayment
	 */
	public void setTermofpayment(final SAPGlobalConfiguration item, final CRMBusinessAgreementTermsPayment value)
	{
		setTermofpayment( getSession().getSessionContext(), item, value );
	}
	
}
