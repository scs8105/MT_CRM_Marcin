/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapserviceorderservices.jalo;

import com.sap.hybris.crm.sapserviceorderservices.constants.SapserviceorderservicesConstants;
import com.sap.hybris.crm.sapserviceorderservices.jalo.ServiceOrderEntry;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ScheduleEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedScheduleEntry extends GenericItem
{
	/** Qualifier of the <code>ScheduleEntry.assignmentid</code> attribute **/
	public static final String ASSIGNMENTID = "assignmentid";
	/** Qualifier of the <code>ScheduleEntry.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>ScheduleEntry.ordernumber</code> attribute **/
	public static final String ORDERNUMBER = "ordernumber";
	/** Qualifier of the <code>ScheduleEntry.itemnumber</code> attribute **/
	public static final String ITEMNUMBER = "itemnumber";
	/** Qualifier of the <code>ScheduleEntry.startdate</code> attribute **/
	public static final String STARTDATE = "startdate";
	/** Qualifier of the <code>ScheduleEntry.enddate</code> attribute **/
	public static final String ENDDATE = "enddate";
	/** Qualifier of the <code>ScheduleEntry.serviceOrderEntry</code> attribute **/
	public static final String SERVICEORDERENTRY = "serviceOrderEntry";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SERVICEORDERENTRY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedScheduleEntry> SERVICEORDERENTRYHANDLER = new BidirectionalOneToManyHandler<GeneratedScheduleEntry>(
	SapserviceorderservicesConstants.TC.SCHEDULEENTRY,
	false,
	"serviceOrderEntry",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ASSIGNMENTID, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(ORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(ITEMNUMBER, AttributeMode.INITIAL);
		tmp.put(STARTDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		tmp.put(SERVICEORDERENTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.assignmentid</code> attribute.
	 * @return the assignmentid - Assignment id
	 */
	public String getAssignmentid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ASSIGNMENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.assignmentid</code> attribute.
	 * @return the assignmentid - Assignment id
	 */
	public String getAssignmentid()
	{
		return getAssignmentid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.assignmentid</code> attribute. 
	 * @param value the assignmentid - Assignment id
	 */
	public void setAssignmentid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ASSIGNMENTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.assignmentid</code> attribute. 
	 * @param value the assignmentid - Assignment id
	 */
	public void setAssignmentid(final String value)
	{
		setAssignmentid( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SERVICEORDERENTRYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.enddate</code> attribute.
	 * @return the enddate - Scheduled end date for an item in the service order
	 */
	public Date getEnddate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.enddate</code> attribute.
	 * @return the enddate - Scheduled end date for an item in the service order
	 */
	public Date getEnddate()
	{
		return getEnddate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.enddate</code> attribute. 
	 * @param value the enddate - Scheduled end date for an item in the service order
	 */
	public void setEnddate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.enddate</code> attribute. 
	 * @param value the enddate - Scheduled end date for an item in the service order
	 */
	public void setEnddate(final Date value)
	{
		setEnddate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.itemnumber</code> attribute.
	 * @return the itemnumber - Item Nubmer of the service order
	 */
	public String getItemnumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITEMNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.itemnumber</code> attribute.
	 * @return the itemnumber - Item Nubmer of the service order
	 */
	public String getItemnumber()
	{
		return getItemnumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.itemnumber</code> attribute. 
	 * @param value the itemnumber - Item Nubmer of the service order
	 */
	public void setItemnumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITEMNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.itemnumber</code> attribute. 
	 * @param value the itemnumber - Item Nubmer of the service order
	 */
	public void setItemnumber(final String value)
	{
		setItemnumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.ordernumber</code> attribute.
	 * @return the ordernumber - Service Order Nubmer
	 */
	public String getOrdernumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.ordernumber</code> attribute.
	 * @return the ordernumber - Service Order Nubmer
	 */
	public String getOrdernumber()
	{
		return getOrdernumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.ordernumber</code> attribute. 
	 * @param value the ordernumber - Service Order Nubmer
	 */
	public void setOrdernumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.ordernumber</code> attribute. 
	 * @param value the ordernumber - Service Order Nubmer
	 */
	public void setOrdernumber(final String value)
	{
		setOrdernumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.serviceOrderEntry</code> attribute.
	 * @return the serviceOrderEntry
	 */
	public ServiceOrderEntry getServiceOrderEntry(final SessionContext ctx)
	{
		return (ServiceOrderEntry)getProperty( ctx, SERVICEORDERENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.serviceOrderEntry</code> attribute.
	 * @return the serviceOrderEntry
	 */
	public ServiceOrderEntry getServiceOrderEntry()
	{
		return getServiceOrderEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.serviceOrderEntry</code> attribute. 
	 * @param value the serviceOrderEntry
	 */
	public void setServiceOrderEntry(final SessionContext ctx, final ServiceOrderEntry value)
	{
		SERVICEORDERENTRYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.serviceOrderEntry</code> attribute. 
	 * @param value the serviceOrderEntry
	 */
	public void setServiceOrderEntry(final ServiceOrderEntry value)
	{
		setServiceOrderEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.startdate</code> attribute.
	 * @return the startdate - Scheduled start date for an item in the service order
	 */
	public Date getStartdate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.startdate</code> attribute.
	 * @return the startdate - Scheduled start date for an item in the service order
	 */
	public Date getStartdate()
	{
		return getStartdate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.startdate</code> attribute. 
	 * @param value the startdate - Scheduled start date for an item in the service order
	 */
	public void setStartdate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.startdate</code> attribute. 
	 * @param value the startdate - Scheduled start date for an item in the service order
	 */
	public void setStartdate(final Date value)
	{
		setStartdate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.status</code> attribute.
	 * @return the status - Status Of Each Line
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleEntry.status</code> attribute.
	 * @return the status - Status Of Each Line
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.status</code> attribute. 
	 * @param value the status - Status Of Each Line
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ScheduleEntry.status</code> attribute. 
	 * @param value the status - Status Of Each Line
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
