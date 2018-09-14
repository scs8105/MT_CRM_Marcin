/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapserviceorderservices.jalo;

import com.sap.hybris.crm.sapserviceorderservices.constants.SapserviceorderservicesConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.order.Order;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.order.Order ServiceOrder}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedServiceOrder extends Order
{
	/** Qualifier of the <code>ServiceOrder.serviceOrderType</code> attribute **/
	public static final String SERVICEORDERTYPE = "serviceOrderType";
	/** Qualifier of the <code>ServiceOrder.ibase</code> attribute **/
	public static final String IBASE = "ibase";
	/** Qualifier of the <code>ServiceOrder.ibasecomponent</code> attribute **/
	public static final String IBASECOMPONENT = "ibasecomponent";
	/** Qualifier of the <code>ServiceOrder.objectid</code> attribute **/
	public static final String OBJECTID = "objectid";
	/** Qualifier of the <code>ServiceOrder.servicecontractid</code> attribute **/
	public static final String SERVICECONTRACTID = "servicecontractid";
	/** Qualifier of the <code>ServiceOrder.servicerequestid</code> attribute **/
	public static final String SERVICEREQUESTID = "servicerequestid";
	/** Qualifier of the <code>ServiceOrder.warrantyid</code> attribute **/
	public static final String WARRANTYID = "warrantyid";
	/** Qualifier of the <code>ServiceOrder.requestedstartdate</code> attribute **/
	public static final String REQUESTEDSTARTDATE = "requestedstartdate";
	/** Qualifier of the <code>ServiceOrder.requestedenddate</code> attribute **/
	public static final String REQUESTEDENDDATE = "requestedenddate";
	/** Qualifier of the <code>ServiceOrder.note</code> attribute **/
	public static final String NOTE = "note";
	/** Qualifier of the <code>ServiceOrder.netPrice</code> attribute **/
	public static final String NETPRICE = "netPrice";
	/** Qualifier of the <code>ServiceOrder.deleteOrderEntries</code> attribute **/
	public static final String DELETEORDERENTRIES = "deleteOrderEntries";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Order.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SERVICEORDERTYPE, AttributeMode.INITIAL);
		tmp.put(IBASE, AttributeMode.INITIAL);
		tmp.put(IBASECOMPONENT, AttributeMode.INITIAL);
		tmp.put(OBJECTID, AttributeMode.INITIAL);
		tmp.put(SERVICECONTRACTID, AttributeMode.INITIAL);
		tmp.put(SERVICEREQUESTID, AttributeMode.INITIAL);
		tmp.put(WARRANTYID, AttributeMode.INITIAL);
		tmp.put(REQUESTEDSTARTDATE, AttributeMode.INITIAL);
		tmp.put(REQUESTEDENDDATE, AttributeMode.INITIAL);
		tmp.put(NOTE, AttributeMode.INITIAL);
		tmp.put(NETPRICE, AttributeMode.INITIAL);
		tmp.put(DELETEORDERENTRIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.deleteOrderEntries</code> attribute.
	 * @return the deleteOrderEntries
	 */
	public Boolean isDeleteOrderEntries(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DELETEORDERENTRIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.deleteOrderEntries</code> attribute.
	 * @return the deleteOrderEntries
	 */
	public Boolean isDeleteOrderEntries()
	{
		return isDeleteOrderEntries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.deleteOrderEntries</code> attribute. 
	 * @return the deleteOrderEntries
	 */
	public boolean isDeleteOrderEntriesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDeleteOrderEntries( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.deleteOrderEntries</code> attribute. 
	 * @return the deleteOrderEntries
	 */
	public boolean isDeleteOrderEntriesAsPrimitive()
	{
		return isDeleteOrderEntriesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.deleteOrderEntries</code> attribute. 
	 * @param value the deleteOrderEntries
	 */
	public void setDeleteOrderEntries(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DELETEORDERENTRIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.deleteOrderEntries</code> attribute. 
	 * @param value the deleteOrderEntries
	 */
	public void setDeleteOrderEntries(final Boolean value)
	{
		setDeleteOrderEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.deleteOrderEntries</code> attribute. 
	 * @param value the deleteOrderEntries
	 */
	public void setDeleteOrderEntries(final SessionContext ctx, final boolean value)
	{
		setDeleteOrderEntries( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.deleteOrderEntries</code> attribute. 
	 * @param value the deleteOrderEntries
	 */
	public void setDeleteOrderEntries(final boolean value)
	{
		setDeleteOrderEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.ibase</code> attribute.
	 * @return the ibase - reference number for the iBase
	 */
	public String getIbase(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IBASE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.ibase</code> attribute.
	 * @return the ibase - reference number for the iBase
	 */
	public String getIbase()
	{
		return getIbase( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.ibase</code> attribute. 
	 * @param value the ibase - reference number for the iBase
	 */
	public void setIbase(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IBASE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.ibase</code> attribute. 
	 * @param value the ibase - reference number for the iBase
	 */
	public void setIbase(final String value)
	{
		setIbase( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.ibasecomponent</code> attribute.
	 * @return the ibasecomponent - reference number of the ibase component
	 */
	public String getIbasecomponent(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IBASECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.ibasecomponent</code> attribute.
	 * @return the ibasecomponent - reference number of the ibase component
	 */
	public String getIbasecomponent()
	{
		return getIbasecomponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.ibasecomponent</code> attribute. 
	 * @param value the ibasecomponent - reference number of the ibase component
	 */
	public void setIbasecomponent(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IBASECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.ibasecomponent</code> attribute. 
	 * @param value the ibasecomponent - reference number of the ibase component
	 */
	public void setIbasecomponent(final String value)
	{
		setIbasecomponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.netPrice</code> attribute.
	 * @return the netPrice
	 */
	public Double getNetPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, NETPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.netPrice</code> attribute.
	 * @return the netPrice
	 */
	public Double getNetPrice()
	{
		return getNetPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.netPrice</code> attribute. 
	 * @return the netPrice
	 */
	public double getNetPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getNetPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.netPrice</code> attribute. 
	 * @return the netPrice
	 */
	public double getNetPriceAsPrimitive()
	{
		return getNetPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.netPrice</code> attribute. 
	 * @param value the netPrice
	 */
	public void setNetPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, NETPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.netPrice</code> attribute. 
	 * @param value the netPrice
	 */
	public void setNetPrice(final Double value)
	{
		setNetPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.netPrice</code> attribute. 
	 * @param value the netPrice
	 */
	public void setNetPrice(final SessionContext ctx, final double value)
	{
		setNetPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.netPrice</code> attribute. 
	 * @param value the netPrice
	 */
	public void setNetPrice(final double value)
	{
		setNetPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.note</code> attribute.
	 * @return the note - Comments related to order
	 */
	public String getNote(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.note</code> attribute.
	 * @return the note - Comments related to order
	 */
	public String getNote()
	{
		return getNote( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.note</code> attribute. 
	 * @param value the note - Comments related to order
	 */
	public void setNote(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.note</code> attribute. 
	 * @param value the note - Comments related to order
	 */
	public void setNote(final String value)
	{
		setNote( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.objectid</code> attribute.
	 * @return the objectid - object id of the ibase
	 */
	public String getObjectid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OBJECTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.objectid</code> attribute.
	 * @return the objectid - object id of the ibase
	 */
	public String getObjectid()
	{
		return getObjectid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.objectid</code> attribute. 
	 * @param value the objectid - object id of the ibase
	 */
	public void setObjectid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OBJECTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.objectid</code> attribute. 
	 * @param value the objectid - object id of the ibase
	 */
	public void setObjectid(final String value)
	{
		setObjectid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.requestedenddate</code> attribute.
	 * @return the requestedenddate - Requested end date for the Order
	 */
	public Date getRequestedenddate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, REQUESTEDENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.requestedenddate</code> attribute.
	 * @return the requestedenddate - Requested end date for the Order
	 */
	public Date getRequestedenddate()
	{
		return getRequestedenddate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.requestedenddate</code> attribute. 
	 * @param value the requestedenddate - Requested end date for the Order
	 */
	public void setRequestedenddate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, REQUESTEDENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.requestedenddate</code> attribute. 
	 * @param value the requestedenddate - Requested end date for the Order
	 */
	public void setRequestedenddate(final Date value)
	{
		setRequestedenddate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.requestedstartdate</code> attribute.
	 * @return the requestedstartdate - Requested start date for the Order
	 */
	public Date getRequestedstartdate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, REQUESTEDSTARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.requestedstartdate</code> attribute.
	 * @return the requestedstartdate - Requested start date for the Order
	 */
	public Date getRequestedstartdate()
	{
		return getRequestedstartdate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.requestedstartdate</code> attribute. 
	 * @param value the requestedstartdate - Requested start date for the Order
	 */
	public void setRequestedstartdate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, REQUESTEDSTARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.requestedstartdate</code> attribute. 
	 * @param value the requestedstartdate - Requested start date for the Order
	 */
	public void setRequestedstartdate(final Date value)
	{
		setRequestedstartdate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.servicecontractid</code> attribute.
	 * @return the servicecontractid - Service contract id assosiated with the order
	 */
	public String getServicecontractid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SERVICECONTRACTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.servicecontractid</code> attribute.
	 * @return the servicecontractid - Service contract id assosiated with the order
	 */
	public String getServicecontractid()
	{
		return getServicecontractid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.servicecontractid</code> attribute. 
	 * @param value the servicecontractid - Service contract id assosiated with the order
	 */
	public void setServicecontractid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SERVICECONTRACTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.servicecontractid</code> attribute. 
	 * @param value the servicecontractid - Service contract id assosiated with the order
	 */
	public void setServicecontractid(final String value)
	{
		setServicecontractid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.serviceOrderType</code> attribute.
	 * @return the serviceOrderType - items for the Order
	 */
	public EnumerationValue getServiceOrderType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SERVICEORDERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.serviceOrderType</code> attribute.
	 * @return the serviceOrderType - items for the Order
	 */
	public EnumerationValue getServiceOrderType()
	{
		return getServiceOrderType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.serviceOrderType</code> attribute. 
	 * @param value the serviceOrderType - items for the Order
	 */
	public void setServiceOrderType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SERVICEORDERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.serviceOrderType</code> attribute. 
	 * @param value the serviceOrderType - items for the Order
	 */
	public void setServiceOrderType(final EnumerationValue value)
	{
		setServiceOrderType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.servicerequestid</code> attribute.
	 * @return the servicerequestid - Service request id assosiated with the order
	 */
	public String getServicerequestid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SERVICEREQUESTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.servicerequestid</code> attribute.
	 * @return the servicerequestid - Service request id assosiated with the order
	 */
	public String getServicerequestid()
	{
		return getServicerequestid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.servicerequestid</code> attribute. 
	 * @param value the servicerequestid - Service request id assosiated with the order
	 */
	public void setServicerequestid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SERVICEREQUESTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.servicerequestid</code> attribute. 
	 * @param value the servicerequestid - Service request id assosiated with the order
	 */
	public void setServicerequestid(final String value)
	{
		setServicerequestid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.warrantyid</code> attribute.
	 * @return the warrantyid - Waranty id assosiated with the Order
	 */
	public String getWarrantyid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WARRANTYID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.warrantyid</code> attribute.
	 * @return the warrantyid - Waranty id assosiated with the Order
	 */
	public String getWarrantyid()
	{
		return getWarrantyid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.warrantyid</code> attribute. 
	 * @param value the warrantyid - Waranty id assosiated with the Order
	 */
	public void setWarrantyid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WARRANTYID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.warrantyid</code> attribute. 
	 * @param value the warrantyid - Waranty id assosiated with the Order
	 */
	public void setWarrantyid(final String value)
	{
		setWarrantyid( getSession().getSessionContext(), value );
	}
	
}
