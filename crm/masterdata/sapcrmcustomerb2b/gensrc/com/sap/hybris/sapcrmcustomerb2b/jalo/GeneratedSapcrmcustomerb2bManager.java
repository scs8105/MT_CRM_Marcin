/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapcrmcustomerb2b.jalo;

import com.sap.hybris.sapcrmcustomerb2b.constants.Sapcrmcustomerb2bConstants;
import com.sap.hybris.sapcrmcustomerb2b.jalo.SAPCCPaymentInfo;
import com.sap.hybris.sapcrmcustomerb2b.jalo.SAPPaymentInfo;
import de.hybris.platform.b2b.jalo.B2BCustomer;
import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.b2b.jalo.SAPCRMB2BRelations;
import de.hybris.platform.commerceservices.jalo.OrgUnit;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>Sapcrmcustomerb2bManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcrmcustomerb2bManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n PAYMENTINFOS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SAPPaymentInfo> SAPB2BUNITPAYMENTINFORELATIONPAYMENTINFOSHANDLER = new OneToManyHandler<SAPPaymentInfo>(
	Sapcrmcustomerb2bConstants.TC.SAPPAYMENTINFO,
	true,
	"b2bunit",
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
		tmp.put("b2bunitguid", AttributeMode.INITIAL);
		tmp.put("erpcustomerid", AttributeMode.INITIAL);
		tmp.put("incoterms1", AttributeMode.INITIAL);
		tmp.put("incoterms2", AttributeMode.INITIAL);
		tmp.put("shippingconditions", AttributeMode.INITIAL);
		tmp.put("deliverypriority", AttributeMode.INITIAL);
		tmp.put("termsofpayment", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.b2b.jalo.B2BUnit", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("b2bUnitRelationSent", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.b2b.jalo.B2BCustomer", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.b2bunitguid</code> attribute.
	 * @return the b2bunitguid - B2B Unit GUID
	 */
	public String getB2bunitguid(final SessionContext ctx, final B2BUnit item)
	{
		return (String)item.getProperty( ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.B2BUNITGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.b2bunitguid</code> attribute.
	 * @return the b2bunitguid - B2B Unit GUID
	 */
	public String getB2bunitguid(final B2BUnit item)
	{
		return getB2bunitguid( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.b2bunitguid</code> attribute. 
	 * @param value the b2bunitguid - B2B Unit GUID
	 */
	public void setB2bunitguid(final SessionContext ctx, final B2BUnit item, final String value)
	{
		item.setProperty(ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.B2BUNITGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.b2bunitguid</code> attribute. 
	 * @param value the b2bunitguid - B2B Unit GUID
	 */
	public void setB2bunitguid(final B2BUnit item, final String value)
	{
		setB2bunitguid( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.b2bUnitRelationSent</code> attribute.
	 * @return the b2bUnitRelationSent - Indicates if the relationship for this customer has been sent to the SAP system
	 */
	public Boolean isB2bUnitRelationSent(final SessionContext ctx, final B2BCustomer item)
	{
		return (Boolean)item.getProperty( ctx, Sapcrmcustomerb2bConstants.Attributes.B2BCustomer.B2BUNITRELATIONSENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.b2bUnitRelationSent</code> attribute.
	 * @return the b2bUnitRelationSent - Indicates if the relationship for this customer has been sent to the SAP system
	 */
	public Boolean isB2bUnitRelationSent(final B2BCustomer item)
	{
		return isB2bUnitRelationSent( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.b2bUnitRelationSent</code> attribute. 
	 * @return the b2bUnitRelationSent - Indicates if the relationship for this customer has been sent to the SAP system
	 */
	public boolean isB2bUnitRelationSentAsPrimitive(final SessionContext ctx, final B2BCustomer item)
	{
		Boolean value = isB2bUnitRelationSent( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.b2bUnitRelationSent</code> attribute. 
	 * @return the b2bUnitRelationSent - Indicates if the relationship for this customer has been sent to the SAP system
	 */
	public boolean isB2bUnitRelationSentAsPrimitive(final B2BCustomer item)
	{
		return isB2bUnitRelationSentAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.b2bUnitRelationSent</code> attribute. 
	 * @param value the b2bUnitRelationSent - Indicates if the relationship for this customer has been sent to the SAP system
	 */
	public void setB2bUnitRelationSent(final SessionContext ctx, final B2BCustomer item, final Boolean value)
	{
		item.setProperty(ctx, Sapcrmcustomerb2bConstants.Attributes.B2BCustomer.B2BUNITRELATIONSENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.b2bUnitRelationSent</code> attribute. 
	 * @param value the b2bUnitRelationSent - Indicates if the relationship for this customer has been sent to the SAP system
	 */
	public void setB2bUnitRelationSent(final B2BCustomer item, final Boolean value)
	{
		setB2bUnitRelationSent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.b2bUnitRelationSent</code> attribute. 
	 * @param value the b2bUnitRelationSent - Indicates if the relationship for this customer has been sent to the SAP system
	 */
	public void setB2bUnitRelationSent(final SessionContext ctx, final B2BCustomer item, final boolean value)
	{
		setB2bUnitRelationSent( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.b2bUnitRelationSent</code> attribute. 
	 * @param value the b2bUnitRelationSent - Indicates if the relationship for this customer has been sent to the SAP system
	 */
	public void setB2bUnitRelationSent(final B2BCustomer item, final boolean value)
	{
		setB2bUnitRelationSent( getSession().getSessionContext(), item, value );
	}
	
	public SAPCCPaymentInfo createSAPCCPaymentInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Sapcrmcustomerb2bConstants.TC.SAPCCPAYMENTINFO );
			return (SAPCCPaymentInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPCCPaymentInfo : "+e.getMessage(), 0 );
		}
	}
	
	public SAPCCPaymentInfo createSAPCCPaymentInfo(final Map attributeValues)
	{
		return createSAPCCPaymentInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPCRMB2BRelations createSAPCRMB2BRelations(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Sapcrmcustomerb2bConstants.TC.SAPCRMB2BRELATIONS );
			return (SAPCRMB2BRelations)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPCRMB2BRelations : "+e.getMessage(), 0 );
		}
	}
	
	public SAPCRMB2BRelations createSAPCRMB2BRelations(final Map attributeValues)
	{
		return createSAPCRMB2BRelations( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPPaymentInfo createSAPPaymentInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Sapcrmcustomerb2bConstants.TC.SAPPAYMENTINFO );
			return (SAPPaymentInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPPaymentInfo : "+e.getMessage(), 0 );
		}
	}
	
	public SAPPaymentInfo createSAPPaymentInfo(final Map attributeValues)
	{
		return createSAPPaymentInfo( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.deliverypriority</code> attribute.
	 * @return the deliverypriority - >B2B Sales Area Unit Delivery Priority
	 */
	public String getDeliverypriority(final SessionContext ctx, final B2BUnit item)
	{
		return (String)item.getProperty( ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.DELIVERYPRIORITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.deliverypriority</code> attribute.
	 * @return the deliverypriority - >B2B Sales Area Unit Delivery Priority
	 */
	public String getDeliverypriority(final B2BUnit item)
	{
		return getDeliverypriority( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.deliverypriority</code> attribute. 
	 * @param value the deliverypriority - >B2B Sales Area Unit Delivery Priority
	 */
	public void setDeliverypriority(final SessionContext ctx, final B2BUnit item, final String value)
	{
		item.setProperty(ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.DELIVERYPRIORITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.deliverypriority</code> attribute. 
	 * @param value the deliverypriority - >B2B Sales Area Unit Delivery Priority
	 */
	public void setDeliverypriority(final B2BUnit item, final String value)
	{
		setDeliverypriority( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.erpcustomerid</code> attribute.
	 * @return the erpcustomerid - B2B Unit ERP Customer Id
	 */
	public String getErpcustomerid(final SessionContext ctx, final B2BUnit item)
	{
		return (String)item.getProperty( ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.ERPCUSTOMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.erpcustomerid</code> attribute.
	 * @return the erpcustomerid - B2B Unit ERP Customer Id
	 */
	public String getErpcustomerid(final B2BUnit item)
	{
		return getErpcustomerid( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.erpcustomerid</code> attribute. 
	 * @param value the erpcustomerid - B2B Unit ERP Customer Id
	 */
	public void setErpcustomerid(final SessionContext ctx, final B2BUnit item, final String value)
	{
		item.setProperty(ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.ERPCUSTOMERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.erpcustomerid</code> attribute. 
	 * @param value the erpcustomerid - B2B Unit ERP Customer Id
	 */
	public void setErpcustomerid(final B2BUnit item, final String value)
	{
		setErpcustomerid( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return Sapcrmcustomerb2bConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.incoterms1</code> attribute.
	 * @return the incoterms1 - B2B Sales Area Unit Incoterms 1
	 */
	public String getIncoterms1(final SessionContext ctx, final B2BUnit item)
	{
		return (String)item.getProperty( ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.INCOTERMS1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.incoterms1</code> attribute.
	 * @return the incoterms1 - B2B Sales Area Unit Incoterms 1
	 */
	public String getIncoterms1(final B2BUnit item)
	{
		return getIncoterms1( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.incoterms1</code> attribute. 
	 * @param value the incoterms1 - B2B Sales Area Unit Incoterms 1
	 */
	public void setIncoterms1(final SessionContext ctx, final B2BUnit item, final String value)
	{
		item.setProperty(ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.INCOTERMS1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.incoterms1</code> attribute. 
	 * @param value the incoterms1 - B2B Sales Area Unit Incoterms 1
	 */
	public void setIncoterms1(final B2BUnit item, final String value)
	{
		setIncoterms1( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.incoterms2</code> attribute.
	 * @return the incoterms2 - >B2B Sales Area Unit Incoterms 2
	 */
	public String getIncoterms2(final SessionContext ctx, final B2BUnit item)
	{
		return (String)item.getProperty( ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.INCOTERMS2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.incoterms2</code> attribute.
	 * @return the incoterms2 - >B2B Sales Area Unit Incoterms 2
	 */
	public String getIncoterms2(final B2BUnit item)
	{
		return getIncoterms2( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.incoterms2</code> attribute. 
	 * @param value the incoterms2 - >B2B Sales Area Unit Incoterms 2
	 */
	public void setIncoterms2(final SessionContext ctx, final B2BUnit item, final String value)
	{
		item.setProperty(ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.INCOTERMS2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.incoterms2</code> attribute. 
	 * @param value the incoterms2 - >B2B Sales Area Unit Incoterms 2
	 */
	public void setIncoterms2(final B2BUnit item, final String value)
	{
		setIncoterms2( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.paymentinfos</code> attribute.
	 * @return the paymentinfos
	 */
	public Set<SAPPaymentInfo> getPaymentinfos(final SessionContext ctx, final B2BUnit item)
	{
		return (Set<SAPPaymentInfo>)SAPB2BUNITPAYMENTINFORELATIONPAYMENTINFOSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.paymentinfos</code> attribute.
	 * @return the paymentinfos
	 */
	public Set<SAPPaymentInfo> getPaymentinfos(final B2BUnit item)
	{
		return getPaymentinfos( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.paymentinfos</code> attribute. 
	 * @param value the paymentinfos
	 */
	public void setPaymentinfos(final SessionContext ctx, final B2BUnit item, final Set<SAPPaymentInfo> value)
	{
		SAPB2BUNITPAYMENTINFORELATIONPAYMENTINFOSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.paymentinfos</code> attribute. 
	 * @param value the paymentinfos
	 */
	public void setPaymentinfos(final B2BUnit item, final Set<SAPPaymentInfo> value)
	{
		setPaymentinfos( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentinfos. 
	 * @param value the item to add to paymentinfos
	 */
	public void addToPaymentinfos(final SessionContext ctx, final B2BUnit item, final SAPPaymentInfo value)
	{
		SAPB2BUNITPAYMENTINFORELATIONPAYMENTINFOSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentinfos. 
	 * @param value the item to add to paymentinfos
	 */
	public void addToPaymentinfos(final B2BUnit item, final SAPPaymentInfo value)
	{
		addToPaymentinfos( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentinfos. 
	 * @param value the item to remove from paymentinfos
	 */
	public void removeFromPaymentinfos(final SessionContext ctx, final B2BUnit item, final SAPPaymentInfo value)
	{
		SAPB2BUNITPAYMENTINFORELATIONPAYMENTINFOSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentinfos. 
	 * @param value the item to remove from paymentinfos
	 */
	public void removeFromPaymentinfos(final B2BUnit item, final SAPPaymentInfo value)
	{
		removeFromPaymentinfos( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.shippingconditions</code> attribute.
	 * @return the shippingconditions - >B2B Sales Area Unit Shipping Conditions
	 */
	public String getShippingconditions(final SessionContext ctx, final B2BUnit item)
	{
		return (String)item.getProperty( ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.SHIPPINGCONDITIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.shippingconditions</code> attribute.
	 * @return the shippingconditions - >B2B Sales Area Unit Shipping Conditions
	 */
	public String getShippingconditions(final B2BUnit item)
	{
		return getShippingconditions( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.shippingconditions</code> attribute. 
	 * @param value the shippingconditions - >B2B Sales Area Unit Shipping Conditions
	 */
	public void setShippingconditions(final SessionContext ctx, final B2BUnit item, final String value)
	{
		item.setProperty(ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.SHIPPINGCONDITIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.shippingconditions</code> attribute. 
	 * @param value the shippingconditions - >B2B Sales Area Unit Shipping Conditions
	 */
	public void setShippingconditions(final B2BUnit item, final String value)
	{
		setShippingconditions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.termsofpayment</code> attribute.
	 * @return the termsofpayment - >B2B Sales Area Unit terms of payment
	 */
	public String getTermsofpayment(final SessionContext ctx, final B2BUnit item)
	{
		return (String)item.getProperty( ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.TERMSOFPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.termsofpayment</code> attribute.
	 * @return the termsofpayment - >B2B Sales Area Unit terms of payment
	 */
	public String getTermsofpayment(final B2BUnit item)
	{
		return getTermsofpayment( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.termsofpayment</code> attribute. 
	 * @param value the termsofpayment - >B2B Sales Area Unit terms of payment
	 */
	public void setTermsofpayment(final SessionContext ctx, final B2BUnit item, final String value)
	{
		item.setProperty(ctx, Sapcrmcustomerb2bConstants.Attributes.B2BUnit.TERMSOFPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.termsofpayment</code> attribute. 
	 * @param value the termsofpayment - >B2B Sales Area Unit terms of payment
	 */
	public void setTermsofpayment(final B2BUnit item, final String value)
	{
		setTermsofpayment( getSession().getSessionContext(), item, value );
	}
	
}
