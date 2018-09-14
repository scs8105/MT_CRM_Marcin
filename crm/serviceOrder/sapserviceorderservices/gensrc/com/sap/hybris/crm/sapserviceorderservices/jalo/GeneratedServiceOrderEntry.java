/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapserviceorderservices.jalo;

import com.sap.hybris.crm.sapserviceorderservices.constants.SapserviceorderservicesConstants;
import com.sap.hybris.crm.sapserviceorderservices.jalo.ScheduleEntry;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.OrderEntry;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.order.OrderEntry ServiceOrderEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedServiceOrderEntry extends OrderEntry
{
	/** Qualifier of the <code>ServiceOrderEntry.itemguid</code> attribute **/
	public static final String ITEMGUID = "itemguid";
	/** Qualifier of the <code>ServiceOrderEntry.requestedstartdate</code> attribute **/
	public static final String REQUESTEDSTARTDATE = "requestedstartdate";
	/** Qualifier of the <code>ServiceOrderEntry.requestedenddate</code> attribute **/
	public static final String REQUESTEDENDDATE = "requestedenddate";
	/** Qualifier of the <code>ServiceOrderEntry.ScheduleEntry</code> attribute **/
	public static final String SCHEDULEENTRY = "ScheduleEntry";
	/**
	* {@link OneToManyHandler} for handling 1:n SCHEDULEENTRY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ScheduleEntry> SCHEDULEENTRYHANDLER = new OneToManyHandler<ScheduleEntry>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(OrderEntry.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ITEMGUID, AttributeMode.INITIAL);
		tmp.put(REQUESTEDSTARTDATE, AttributeMode.INITIAL);
		tmp.put(REQUESTEDENDDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrderEntry.itemguid</code> attribute.
	 * @return the itemguid - Item GUID
	 */
	public String getItemguid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITEMGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrderEntry.itemguid</code> attribute.
	 * @return the itemguid - Item GUID
	 */
	public String getItemguid()
	{
		return getItemguid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrderEntry.itemguid</code> attribute. 
	 * @param value the itemguid - Item GUID
	 */
	public void setItemguid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITEMGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrderEntry.itemguid</code> attribute. 
	 * @param value the itemguid - Item GUID
	 */
	public void setItemguid(final String value)
	{
		setItemguid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrderEntry.requestedenddate</code> attribute.
	 * @return the requestedenddate - Requested end date for the item
	 */
	public Date getRequestedenddate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, REQUESTEDENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrderEntry.requestedenddate</code> attribute.
	 * @return the requestedenddate - Requested end date for the item
	 */
	public Date getRequestedenddate()
	{
		return getRequestedenddate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrderEntry.requestedenddate</code> attribute. 
	 * @param value the requestedenddate - Requested end date for the item
	 */
	public void setRequestedenddate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, REQUESTEDENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrderEntry.requestedenddate</code> attribute. 
	 * @param value the requestedenddate - Requested end date for the item
	 */
	public void setRequestedenddate(final Date value)
	{
		setRequestedenddate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrderEntry.requestedstartdate</code> attribute.
	 * @return the requestedstartdate - Requested start date for the item
	 */
	public Date getRequestedstartdate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, REQUESTEDSTARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrderEntry.requestedstartdate</code> attribute.
	 * @return the requestedstartdate - Requested start date for the item
	 */
	public Date getRequestedstartdate()
	{
		return getRequestedstartdate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrderEntry.requestedstartdate</code> attribute. 
	 * @param value the requestedstartdate - Requested start date for the item
	 */
	public void setRequestedstartdate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, REQUESTEDSTARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrderEntry.requestedstartdate</code> attribute. 
	 * @param value the requestedstartdate - Requested start date for the item
	 */
	public void setRequestedstartdate(final Date value)
	{
		setRequestedstartdate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrderEntry.ScheduleEntry</code> attribute.
	 * @return the ScheduleEntry
	 */
	public List<ScheduleEntry> getScheduleEntry(final SessionContext ctx)
	{
		return (List<ScheduleEntry>)SCHEDULEENTRYHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrderEntry.ScheduleEntry</code> attribute.
	 * @return the ScheduleEntry
	 */
	public List<ScheduleEntry> getScheduleEntry()
	{
		return getScheduleEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrderEntry.ScheduleEntry</code> attribute. 
	 * @param value the ScheduleEntry
	 */
	public void setScheduleEntry(final SessionContext ctx, final List<ScheduleEntry> value)
	{
		SCHEDULEENTRYHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrderEntry.ScheduleEntry</code> attribute. 
	 * @param value the ScheduleEntry
	 */
	public void setScheduleEntry(final List<ScheduleEntry> value)
	{
		setScheduleEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ScheduleEntry. 
	 * @param value the item to add to ScheduleEntry
	 */
	public void addToScheduleEntry(final SessionContext ctx, final ScheduleEntry value)
	{
		SCHEDULEENTRYHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ScheduleEntry. 
	 * @param value the item to add to ScheduleEntry
	 */
	public void addToScheduleEntry(final ScheduleEntry value)
	{
		addToScheduleEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ScheduleEntry. 
	 * @param value the item to remove from ScheduleEntry
	 */
	public void removeFromScheduleEntry(final SessionContext ctx, final ScheduleEntry value)
	{
		SCHEDULEENTRYHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ScheduleEntry. 
	 * @param value the item to remove from ScheduleEntry
	 */
	public void removeFromScheduleEntry(final ScheduleEntry value)
	{
		removeFromScheduleEntry( getSession().getSessionContext(), value );
	}
	
}
