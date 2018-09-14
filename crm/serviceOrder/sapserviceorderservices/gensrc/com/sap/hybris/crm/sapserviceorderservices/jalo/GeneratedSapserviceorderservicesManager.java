/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapserviceorderservices.jalo;

import com.sap.hybris.crm.sapserviceorderservices.constants.SapserviceorderservicesConstants;
import com.sap.hybris.crm.sapserviceorderservices.jalo.ScheduleEntry;
import com.sap.hybris.crm.sapserviceorderservices.jalo.ServiceOrder;
import com.sap.hybris.crm.sapserviceorderservices.jalo.ServiceOrderEntry;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SapserviceorderservicesManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapserviceorderservicesManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
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
	
	public ScheduleEntry createScheduleEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapserviceorderservicesConstants.TC.SCHEDULEENTRY );
			return (ScheduleEntry)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ScheduleEntry : "+e.getMessage(), 0 );
		}
	}
	
	public ScheduleEntry createScheduleEntry(final Map attributeValues)
	{
		return createScheduleEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public ServiceOrder createServiceOrder(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapserviceorderservicesConstants.TC.SERVICEORDER );
			return (ServiceOrder)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ServiceOrder : "+e.getMessage(), 0 );
		}
	}
	
	public ServiceOrder createServiceOrder(final Map attributeValues)
	{
		return createServiceOrder( getSession().getSessionContext(), attributeValues );
	}
	
	public ServiceOrderEntry createServiceOrderEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapserviceorderservicesConstants.TC.SERVICEORDERENTRY );
			return (ServiceOrderEntry)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ServiceOrderEntry : "+e.getMessage(), 0 );
		}
	}
	
	public ServiceOrderEntry createServiceOrderEntry(final Map attributeValues)
	{
		return createServiceOrderEntry( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SapserviceorderservicesConstants.EXTENSIONNAME;
	}
	
}
