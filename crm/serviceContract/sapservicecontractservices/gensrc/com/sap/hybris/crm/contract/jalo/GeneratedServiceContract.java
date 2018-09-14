/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.contract.jalo;

import com.sap.hybris.crm.contract.jalo.ContractBillPlan;
import com.sap.hybris.crm.contract.jalo.SAPContractStatus;
import com.sap.hybris.crm.contract.jalo.ServiceProduct;
import com.sap.hybris.crm.sapservicecontractservices.constants.SapservicecontractservicesConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.sap.hybris.crm.contract.jalo.ServiceContract ServiceContract}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedServiceContract extends Order
{
	/** Qualifier of the <code>ServiceContract.ContractId</code> attribute **/
	public static final String CONTRACTID = "ContractId";
	/** Qualifier of the <code>ServiceContract.startDate</code> attribute **/
	public static final String STARTDATE = "startDate";
	/** Qualifier of the <code>ServiceContract.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>ServiceContract.netValue</code> attribute **/
	public static final String NETVALUE = "netValue";
	/** Qualifier of the <code>ServiceContract.grossValue</code> attribute **/
	public static final String GROSSVALUE = "grossValue";
	/** Qualifier of the <code>ServiceContract.contractStatus</code> attribute **/
	public static final String CONTRACTSTATUS = "contractStatus";
	/** Qualifier of the <code>ServiceContract.notes</code> attribute **/
	public static final String NOTES = "notes";
	/** Qualifier of the <code>ServiceContract.billPlan</code> attribute **/
	public static final String BILLPLAN = "billPlan";
	/** Qualifier of the <code>ServiceContract.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/** Qualifier of the <code>ServiceContract.product</code> attribute **/
	public static final String PRODUCT = "product";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CUSTOMER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedServiceContract> CUSTOMERHANDLER = new BidirectionalOneToManyHandler<GeneratedServiceContract>(
	SapservicecontractservicesConstants.TC.SERVICECONTRACT,
	false,
	"customer",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ServiceProduct> PRODUCTHANDLER = new OneToManyHandler<ServiceProduct>(
	SapservicecontractservicesConstants.TC.SERVICEPRODUCT,
	false,
	"contract",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Order.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CONTRACTID, AttributeMode.INITIAL);
		tmp.put(STARTDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		tmp.put(NETVALUE, AttributeMode.INITIAL);
		tmp.put(GROSSVALUE, AttributeMode.INITIAL);
		tmp.put(CONTRACTSTATUS, AttributeMode.INITIAL);
		tmp.put(NOTES, AttributeMode.INITIAL);
		tmp.put(BILLPLAN, AttributeMode.INITIAL);
		tmp.put(CUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.billPlan</code> attribute.
	 * @return the billPlan - Contract bill plan
	 */
	public ContractBillPlan getBillPlan(final SessionContext ctx)
	{
		return (ContractBillPlan)getProperty( ctx, BILLPLAN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.billPlan</code> attribute.
	 * @return the billPlan - Contract bill plan
	 */
	public ContractBillPlan getBillPlan()
	{
		return getBillPlan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.billPlan</code> attribute. 
	 * @param value the billPlan - Contract bill plan
	 */
	public void setBillPlan(final SessionContext ctx, final ContractBillPlan value)
	{
		setProperty(ctx, BILLPLAN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.billPlan</code> attribute. 
	 * @param value the billPlan - Contract bill plan
	 */
	public void setBillPlan(final ContractBillPlan value)
	{
		setBillPlan( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.ContractId</code> attribute.
	 * @return the ContractId
	 */
	public String getContractId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTRACTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.ContractId</code> attribute.
	 * @return the ContractId
	 */
	public String getContractId()
	{
		return getContractId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.ContractId</code> attribute. 
	 * @param value the ContractId
	 */
	public void setContractId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTRACTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.ContractId</code> attribute. 
	 * @param value the ContractId
	 */
	public void setContractId(final String value)
	{
		setContractId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.contractStatus</code> attribute.
	 * @return the contractStatus - The status of this particular export
	 */
	public SAPContractStatus getContractStatus(final SessionContext ctx)
	{
		return (SAPContractStatus)getProperty( ctx, CONTRACTSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.contractStatus</code> attribute.
	 * @return the contractStatus - The status of this particular export
	 */
	public SAPContractStatus getContractStatus()
	{
		return getContractStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.contractStatus</code> attribute. 
	 * @param value the contractStatus - The status of this particular export
	 */
	public void setContractStatus(final SessionContext ctx, final SAPContractStatus value)
	{
		setProperty(ctx, CONTRACTSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.contractStatus</code> attribute. 
	 * @param value the contractStatus - The status of this particular export
	 */
	public void setContractStatus(final SAPContractStatus value)
	{
		setContractStatus( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CUSTOMERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, CUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final Customer value)
	{
		CUSTOMERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final Customer value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.endDate</code> attribute.
	 * @return the endDate - End Date
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.endDate</code> attribute.
	 * @return the endDate - End Date
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.endDate</code> attribute. 
	 * @param value the endDate - End Date
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.endDate</code> attribute. 
	 * @param value the endDate - End Date
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.grossValue</code> attribute.
	 * @return the grossValue - Gross Value of Contract
	 */
	public Double getGrossValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, GROSSVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.grossValue</code> attribute.
	 * @return the grossValue - Gross Value of Contract
	 */
	public Double getGrossValue()
	{
		return getGrossValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.grossValue</code> attribute. 
	 * @return the grossValue - Gross Value of Contract
	 */
	public double getGrossValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getGrossValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.grossValue</code> attribute. 
	 * @return the grossValue - Gross Value of Contract
	 */
	public double getGrossValueAsPrimitive()
	{
		return getGrossValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.grossValue</code> attribute. 
	 * @param value the grossValue - Gross Value of Contract
	 */
	public void setGrossValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, GROSSVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.grossValue</code> attribute. 
	 * @param value the grossValue - Gross Value of Contract
	 */
	public void setGrossValue(final Double value)
	{
		setGrossValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.grossValue</code> attribute. 
	 * @param value the grossValue - Gross Value of Contract
	 */
	public void setGrossValue(final SessionContext ctx, final double value)
	{
		setGrossValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.grossValue</code> attribute. 
	 * @param value the grossValue - Gross Value of Contract
	 */
	public void setGrossValue(final double value)
	{
		setGrossValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.netValue</code> attribute.
	 * @return the netValue - Net Value of Contract
	 */
	public Double getNetValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, NETVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.netValue</code> attribute.
	 * @return the netValue - Net Value of Contract
	 */
	public Double getNetValue()
	{
		return getNetValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.netValue</code> attribute. 
	 * @return the netValue - Net Value of Contract
	 */
	public double getNetValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getNetValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.netValue</code> attribute. 
	 * @return the netValue - Net Value of Contract
	 */
	public double getNetValueAsPrimitive()
	{
		return getNetValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.netValue</code> attribute. 
	 * @param value the netValue - Net Value of Contract
	 */
	public void setNetValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, NETVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.netValue</code> attribute. 
	 * @param value the netValue - Net Value of Contract
	 */
	public void setNetValue(final Double value)
	{
		setNetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.netValue</code> attribute. 
	 * @param value the netValue - Net Value of Contract
	 */
	public void setNetValue(final SessionContext ctx, final double value)
	{
		setNetValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.netValue</code> attribute. 
	 * @param value the netValue - Net Value of Contract
	 */
	public void setNetValue(final double value)
	{
		setNetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.notes</code> attribute.
	 * @return the notes - Contract notes
	 */
	public Collection<String> getNotes(final SessionContext ctx)
	{
		Collection<String> coll = (Collection<String>)getProperty( ctx, NOTES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.notes</code> attribute.
	 * @return the notes - Contract notes
	 */
	public Collection<String> getNotes()
	{
		return getNotes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.notes</code> attribute. 
	 * @param value the notes - Contract notes
	 */
	public void setNotes(final SessionContext ctx, final Collection<String> value)
	{
		setProperty(ctx, NOTES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.notes</code> attribute. 
	 * @param value the notes - Contract notes
	 */
	public void setNotes(final Collection<String> value)
	{
		setNotes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.product</code> attribute.
	 * @return the product
	 */
	public List<ServiceProduct> getProduct(final SessionContext ctx)
	{
		return (List<ServiceProduct>)PRODUCTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.product</code> attribute.
	 * @return the product
	 */
	public List<ServiceProduct> getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final List<ServiceProduct> value)
	{
		PRODUCTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final List<ServiceProduct> value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to product. 
	 * @param value the item to add to product
	 */
	public void addToProduct(final SessionContext ctx, final ServiceProduct value)
	{
		PRODUCTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to product. 
	 * @param value the item to add to product
	 */
	public void addToProduct(final ServiceProduct value)
	{
		addToProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from product. 
	 * @param value the item to remove from product
	 */
	public void removeFromProduct(final SessionContext ctx, final ServiceProduct value)
	{
		PRODUCTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from product. 
	 * @param value the item to remove from product
	 */
	public void removeFromProduct(final ServiceProduct value)
	{
		removeFromProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.startDate</code> attribute.
	 * @return the startDate - Start Date
	 */
	public Date getStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceContract.startDate</code> attribute.
	 * @return the startDate - Start Date
	 */
	public Date getStartDate()
	{
		return getStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.startDate</code> attribute. 
	 * @param value the startDate - Start Date
	 */
	public void setStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceContract.startDate</code> attribute. 
	 * @param value the startDate - Start Date
	 */
	public void setStartDate(final Date value)
	{
		setStartDate( getSession().getSessionContext(), value );
	}
	
}
