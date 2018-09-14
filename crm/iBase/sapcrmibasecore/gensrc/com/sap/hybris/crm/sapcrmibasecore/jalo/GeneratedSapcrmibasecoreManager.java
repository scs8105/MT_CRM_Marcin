/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmibasecore.jalo;

import com.sap.hybris.crm.sapcrmibasecore.constants.SapcrmibasecoreConstants;
import com.sap.hybris.crm.sapcrmibasecore.jalo.ClassType;
import com.sap.hybris.crm.sapcrmibasecore.jalo.FileId;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBase;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBaseAddress;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBaseComponent;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBasePartner;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBaseStatus;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBaseStructure;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBaseType;
import com.sap.hybris.crm.sapcrmibasecore.jalo.InternalState;
import com.sap.hybris.crm.sapcrmibasecore.jalo.ObjectType;
import com.sap.hybris.crm.sapcrmibasecore.jalo.PermissionGroup;
import com.sap.hybris.crm.sapcrmibasecore.jalo.ProductObject;
import com.sap.hybris.crm.sapcrmibasecore.jalo.ValidationType;
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
 * Generated class for type <code>SapcrmibasecoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcrmibasecoreManager extends Extension
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
	
	public ClassType createClassType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.CLASSTYPE );
			return (ClassType)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ClassType : "+e.getMessage(), 0 );
		}
	}
	
	public ClassType createClassType(final Map attributeValues)
	{
		return createClassType( getSession().getSessionContext(), attributeValues );
	}
	
	public FileId createFileId(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.FILEID );
			return (FileId)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FileId : "+e.getMessage(), 0 );
		}
	}
	
	public FileId createFileId(final Map attributeValues)
	{
		return createFileId( getSession().getSessionContext(), attributeValues );
	}
	
	public IBase createIBase(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.IBASE );
			return (IBase)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating IBase : "+e.getMessage(), 0 );
		}
	}
	
	public IBase createIBase(final Map attributeValues)
	{
		return createIBase( getSession().getSessionContext(), attributeValues );
	}
	
	public IBaseAddress createIBaseAddress(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.IBASEADDRESS );
			return (IBaseAddress)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating IBaseAddress : "+e.getMessage(), 0 );
		}
	}
	
	public IBaseAddress createIBaseAddress(final Map attributeValues)
	{
		return createIBaseAddress( getSession().getSessionContext(), attributeValues );
	}
	
	public IBaseComponent createIBaseComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.IBASECOMPONENT );
			return (IBaseComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating IBaseComponent : "+e.getMessage(), 0 );
		}
	}
	
	public IBaseComponent createIBaseComponent(final Map attributeValues)
	{
		return createIBaseComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public IBasePartner createIBasePartner(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.IBASEPARTNER );
			return (IBasePartner)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating IBasePartner : "+e.getMessage(), 0 );
		}
	}
	
	public IBasePartner createIBasePartner(final Map attributeValues)
	{
		return createIBasePartner( getSession().getSessionContext(), attributeValues );
	}
	
	public IBaseStatus createIBaseStatus(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.IBASESTATUS );
			return (IBaseStatus)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating IBaseStatus : "+e.getMessage(), 0 );
		}
	}
	
	public IBaseStatus createIBaseStatus(final Map attributeValues)
	{
		return createIBaseStatus( getSession().getSessionContext(), attributeValues );
	}
	
	public IBaseStructure createIBaseStructure(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.IBASESTRUCTURE );
			return (IBaseStructure)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating IBaseStructure : "+e.getMessage(), 0 );
		}
	}
	
	public IBaseStructure createIBaseStructure(final Map attributeValues)
	{
		return createIBaseStructure( getSession().getSessionContext(), attributeValues );
	}
	
	public IBaseType createIBaseType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.IBASETYPE );
			return (IBaseType)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating IBaseType : "+e.getMessage(), 0 );
		}
	}
	
	public IBaseType createIBaseType(final Map attributeValues)
	{
		return createIBaseType( getSession().getSessionContext(), attributeValues );
	}
	
	public InternalState createInternalState(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.INTERNALSTATE );
			return (InternalState)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating InternalState : "+e.getMessage(), 0 );
		}
	}
	
	public InternalState createInternalState(final Map attributeValues)
	{
		return createInternalState( getSession().getSessionContext(), attributeValues );
	}
	
	public ObjectType createObjectType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.OBJECTTYPE );
			return (ObjectType)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ObjectType : "+e.getMessage(), 0 );
		}
	}
	
	public ObjectType createObjectType(final Map attributeValues)
	{
		return createObjectType( getSession().getSessionContext(), attributeValues );
	}
	
	public PermissionGroup createPermissionGroup(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.PERMISSIONGROUP );
			return (PermissionGroup)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PermissionGroup : "+e.getMessage(), 0 );
		}
	}
	
	public PermissionGroup createPermissionGroup(final Map attributeValues)
	{
		return createPermissionGroup( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductObject createProductObject(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.PRODUCTOBJECT );
			return (ProductObject)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ProductObject : "+e.getMessage(), 0 );
		}
	}
	
	public ProductObject createProductObject(final Map attributeValues)
	{
		return createProductObject( getSession().getSessionContext(), attributeValues );
	}
	
	public ValidationType createValidationType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmibasecoreConstants.TC.VALIDATIONTYPE );
			return (ValidationType)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ValidationType : "+e.getMessage(), 0 );
		}
	}
	
	public ValidationType createValidationType(final Map attributeValues)
	{
		return createValidationType( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SapcrmibasecoreConstants.EXTENSIONNAME;
	}
	
}
