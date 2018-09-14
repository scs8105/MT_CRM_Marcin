/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmibasecore.jalo;

import com.sap.hybris.crm.sapcrmibasecore.constants.SapcrmibasecoreConstants;
import com.sap.hybris.crm.sapcrmibasecore.jalo.FileId;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBaseComponent;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBasePartner;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBaseStatus;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBaseStructure;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBaseType;
import com.sap.hybris.crm.sapcrmibasecore.jalo.InternalState;
import com.sap.hybris.crm.sapcrmibasecore.jalo.PermissionGroup;
import com.sap.hybris.crm.sapcrmibasecore.jalo.ValidationType;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem IBase}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedIBase extends GenericItem
{
	/** Qualifier of the <code>IBase.guid</code> attribute **/
	public static final String GUID = "guid";
	/** Qualifier of the <code>IBase.objectGuid</code> attribute **/
	public static final String OBJECTGUID = "objectGuid";
	/** Qualifier of the <code>IBase.externalId</code> attribute **/
	public static final String EXTERNALID = "externalId";
	/** Qualifier of the <code>IBase.number</code> attribute **/
	public static final String NUMBER = "number";
	/** Qualifier of the <code>IBase.iBaseType</code> attribute **/
	public static final String IBASETYPE = "iBaseType";
	/** Qualifier of the <code>IBase.fileId</code> attribute **/
	public static final String FILEID = "fileId";
	/** Qualifier of the <code>IBase.internalState</code> attribute **/
	public static final String INTERNALSTATE = "internalState";
	/** Qualifier of the <code>IBase.validationType</code> attribute **/
	public static final String VALIDATIONTYPE = "validationType";
	/** Qualifier of the <code>IBase.permissionGroup</code> attribute **/
	public static final String PERMISSIONGROUP = "permissionGroup";
	/** Qualifier of the <code>IBase.configLanguage</code> attribute **/
	public static final String CONFIGLANGUAGE = "configLanguage";
	/** Qualifier of the <code>IBase.componentStoreIndicator</code> attribute **/
	public static final String COMPONENTSTOREINDICATOR = "componentStoreIndicator";
	/** Qualifier of the <code>IBase.usedForVariantConfig</code> attribute **/
	public static final String USEDFORVARIANTCONFIG = "usedForVariantConfig";
	/** Qualifier of the <code>IBase.configState</code> attribute **/
	public static final String CONFIGSTATE = "configState";
	/** Qualifier of the <code>IBase.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>IBase.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>IBase.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>IBase.sapCreatedTime</code> attribute **/
	public static final String SAPCREATEDTIME = "sapCreatedTime";
	/** Qualifier of the <code>IBase.sapCreatedBy</code> attribute **/
	public static final String SAPCREATEDBY = "sapCreatedBy";
	/** Qualifier of the <code>IBase.sapModifiedTime</code> attribute **/
	public static final String SAPMODIFIEDTIME = "sapModifiedTime";
	/** Qualifier of the <code>IBase.sapModifiedBy</code> attribute **/
	public static final String SAPMODIFIEDBY = "sapModifiedBy";
	/** Qualifier of the <code>IBase.components</code> attribute **/
	public static final String COMPONENTS = "components";
	/** Qualifier of the <code>IBase.partners</code> attribute **/
	public static final String PARTNERS = "partners";
	/** Qualifier of the <code>IBase.structures</code> attribute **/
	public static final String STRUCTURES = "structures";
	/**
	* {@link OneToManyHandler} for handling 1:n COMPONENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<IBaseComponent> COMPONENTSHANDLER = new OneToManyHandler<IBaseComponent>(
	SapcrmibasecoreConstants.TC.IBASECOMPONENT,
	true,
	"iBase",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PARTNERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<IBasePartner> PARTNERSHANDLER = new OneToManyHandler<IBasePartner>(
	SapcrmibasecoreConstants.TC.IBASEPARTNER,
	true,
	"iBase",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n STRUCTURES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<IBaseStructure> STRUCTURESHANDLER = new OneToManyHandler<IBaseStructure>(
	SapcrmibasecoreConstants.TC.IBASESTRUCTURE,
	true,
	"iBase",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(GUID, AttributeMode.INITIAL);
		tmp.put(OBJECTGUID, AttributeMode.INITIAL);
		tmp.put(EXTERNALID, AttributeMode.INITIAL);
		tmp.put(NUMBER, AttributeMode.INITIAL);
		tmp.put(IBASETYPE, AttributeMode.INITIAL);
		tmp.put(FILEID, AttributeMode.INITIAL);
		tmp.put(INTERNALSTATE, AttributeMode.INITIAL);
		tmp.put(VALIDATIONTYPE, AttributeMode.INITIAL);
		tmp.put(PERMISSIONGROUP, AttributeMode.INITIAL);
		tmp.put(CONFIGLANGUAGE, AttributeMode.INITIAL);
		tmp.put(COMPONENTSTOREINDICATOR, AttributeMode.INITIAL);
		tmp.put(USEDFORVARIANTCONFIG, AttributeMode.INITIAL);
		tmp.put(CONFIGSTATE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(SAPCREATEDTIME, AttributeMode.INITIAL);
		tmp.put(SAPCREATEDBY, AttributeMode.INITIAL);
		tmp.put(SAPMODIFIEDTIME, AttributeMode.INITIAL);
		tmp.put(SAPMODIFIEDBY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.components</code> attribute.
	 * @return the components
	 */
	public List<IBaseComponent> getComponents(final SessionContext ctx)
	{
		return (List<IBaseComponent>)COMPONENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.components</code> attribute.
	 * @return the components
	 */
	public List<IBaseComponent> getComponents()
	{
		return getComponents( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.components</code> attribute. 
	 * @param value the components
	 */
	public void setComponents(final SessionContext ctx, final List<IBaseComponent> value)
	{
		COMPONENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.components</code> attribute. 
	 * @param value the components
	 */
	public void setComponents(final List<IBaseComponent> value)
	{
		setComponents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to components. 
	 * @param value the item to add to components
	 */
	public void addToComponents(final SessionContext ctx, final IBaseComponent value)
	{
		COMPONENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to components. 
	 * @param value the item to add to components
	 */
	public void addToComponents(final IBaseComponent value)
	{
		addToComponents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from components. 
	 * @param value the item to remove from components
	 */
	public void removeFromComponents(final SessionContext ctx, final IBaseComponent value)
	{
		COMPONENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from components. 
	 * @param value the item to remove from components
	 */
	public void removeFromComponents(final IBaseComponent value)
	{
		removeFromComponents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.componentStoreIndicator</code> attribute.
	 * @return the componentStoreIndicator - IBASE Component Store Indicator
	 */
	public String getComponentStoreIndicator(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPONENTSTOREINDICATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.componentStoreIndicator</code> attribute.
	 * @return the componentStoreIndicator - IBASE Component Store Indicator
	 */
	public String getComponentStoreIndicator()
	{
		return getComponentStoreIndicator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.componentStoreIndicator</code> attribute. 
	 * @param value the componentStoreIndicator - IBASE Component Store Indicator
	 */
	public void setComponentStoreIndicator(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPONENTSTOREINDICATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.componentStoreIndicator</code> attribute. 
	 * @param value the componentStoreIndicator - IBASE Component Store Indicator
	 */
	public void setComponentStoreIndicator(final String value)
	{
		setComponentStoreIndicator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.configLanguage</code> attribute.
	 * @return the configLanguage - IBASE Config language
	 */
	public Language getConfigLanguage(final SessionContext ctx)
	{
		return (Language)getProperty( ctx, CONFIGLANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.configLanguage</code> attribute.
	 * @return the configLanguage - IBASE Config language
	 */
	public Language getConfigLanguage()
	{
		return getConfigLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.configLanguage</code> attribute. 
	 * @param value the configLanguage - IBASE Config language
	 */
	public void setConfigLanguage(final SessionContext ctx, final Language value)
	{
		setProperty(ctx, CONFIGLANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.configLanguage</code> attribute. 
	 * @param value the configLanguage - IBASE Config language
	 */
	public void setConfigLanguage(final Language value)
	{
		setConfigLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.configState</code> attribute.
	 * @return the configState - IBASE Config State
	 */
	public String getConfigState(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONFIGSTATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.configState</code> attribute.
	 * @return the configState - IBASE Config State
	 */
	public String getConfigState()
	{
		return getConfigState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.configState</code> attribute. 
	 * @param value the configState - IBASE Config State
	 */
	public void setConfigState(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONFIGSTATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.configState</code> attribute. 
	 * @param value the configState - IBASE Config State
	 */
	public void setConfigState(final String value)
	{
		setConfigState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedIBase.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedIBase.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.externalId</code> attribute.
	 * @return the externalId - External ID
	 */
	public String getExternalId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXTERNALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.externalId</code> attribute.
	 * @return the externalId - External ID
	 */
	public String getExternalId()
	{
		return getExternalId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.externalId</code> attribute. 
	 * @param value the externalId - External ID
	 */
	public void setExternalId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXTERNALID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.externalId</code> attribute. 
	 * @param value the externalId - External ID
	 */
	public void setExternalId(final String value)
	{
		setExternalId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.fileId</code> attribute.
	 * @return the fileId - IBASE Field
	 */
	public FileId getFileId(final SessionContext ctx)
	{
		return (FileId)getProperty( ctx, FILEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.fileId</code> attribute.
	 * @return the fileId - IBASE Field
	 */
	public FileId getFileId()
	{
		return getFileId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.fileId</code> attribute. 
	 * @param value the fileId - IBASE Field
	 */
	public void setFileId(final SessionContext ctx, final FileId value)
	{
		setProperty(ctx, FILEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.fileId</code> attribute. 
	 * @param value the fileId - IBASE Field
	 */
	public void setFileId(final FileId value)
	{
		setFileId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.guid</code> attribute.
	 * @return the guid - IBase GUID
	 */
	public String getGuid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.guid</code> attribute.
	 * @return the guid - IBase GUID
	 */
	public String getGuid()
	{
		return getGuid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.guid</code> attribute. 
	 * @param value the guid - IBase GUID
	 */
	public void setGuid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.guid</code> attribute. 
	 * @param value the guid - IBase GUID
	 */
	public void setGuid(final String value)
	{
		setGuid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.iBaseType</code> attribute.
	 * @return the iBaseType - IBASE TYPE
	 */
	public IBaseType getIBaseType(final SessionContext ctx)
	{
		return (IBaseType)getProperty( ctx, IBASETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.iBaseType</code> attribute.
	 * @return the iBaseType - IBASE TYPE
	 */
	public IBaseType getIBaseType()
	{
		return getIBaseType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.iBaseType</code> attribute. 
	 * @param value the iBaseType - IBASE TYPE
	 */
	public void setIBaseType(final SessionContext ctx, final IBaseType value)
	{
		setProperty(ctx, IBASETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.iBaseType</code> attribute. 
	 * @param value the iBaseType - IBASE TYPE
	 */
	public void setIBaseType(final IBaseType value)
	{
		setIBaseType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.internalState</code> attribute.
	 * @return the internalState - IBASE Internal State
	 */
	public InternalState getInternalState(final SessionContext ctx)
	{
		return (InternalState)getProperty( ctx, INTERNALSTATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.internalState</code> attribute.
	 * @return the internalState - IBASE Internal State
	 */
	public InternalState getInternalState()
	{
		return getInternalState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.internalState</code> attribute. 
	 * @param value the internalState - IBASE Internal State
	 */
	public void setInternalState(final SessionContext ctx, final InternalState value)
	{
		setProperty(ctx, INTERNALSTATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.internalState</code> attribute. 
	 * @param value the internalState - IBASE Internal State
	 */
	public void setInternalState(final InternalState value)
	{
		setInternalState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.number</code> attribute.
	 * @return the number - IBase Number
	 */
	public String getNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.number</code> attribute.
	 * @return the number - IBase Number
	 */
	public String getNumber()
	{
		return getNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.number</code> attribute. 
	 * @param value the number - IBase Number
	 */
	public void setNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.number</code> attribute. 
	 * @param value the number - IBase Number
	 */
	public void setNumber(final String value)
	{
		setNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.objectGuid</code> attribute.
	 * @return the objectGuid - Object GUID
	 */
	public String getObjectGuid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OBJECTGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.objectGuid</code> attribute.
	 * @return the objectGuid - Object GUID
	 */
	public String getObjectGuid()
	{
		return getObjectGuid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.objectGuid</code> attribute. 
	 * @param value the objectGuid - Object GUID
	 */
	public void setObjectGuid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OBJECTGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.objectGuid</code> attribute. 
	 * @param value the objectGuid - Object GUID
	 */
	public void setObjectGuid(final String value)
	{
		setObjectGuid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.partners</code> attribute.
	 * @return the partners
	 */
	public List<IBasePartner> getPartners(final SessionContext ctx)
	{
		return (List<IBasePartner>)PARTNERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.partners</code> attribute.
	 * @return the partners
	 */
	public List<IBasePartner> getPartners()
	{
		return getPartners( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.partners</code> attribute. 
	 * @param value the partners
	 */
	public void setPartners(final SessionContext ctx, final List<IBasePartner> value)
	{
		PARTNERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.partners</code> attribute. 
	 * @param value the partners
	 */
	public void setPartners(final List<IBasePartner> value)
	{
		setPartners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to partners. 
	 * @param value the item to add to partners
	 */
	public void addToPartners(final SessionContext ctx, final IBasePartner value)
	{
		PARTNERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to partners. 
	 * @param value the item to add to partners
	 */
	public void addToPartners(final IBasePartner value)
	{
		addToPartners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from partners. 
	 * @param value the item to remove from partners
	 */
	public void removeFromPartners(final SessionContext ctx, final IBasePartner value)
	{
		PARTNERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from partners. 
	 * @param value the item to remove from partners
	 */
	public void removeFromPartners(final IBasePartner value)
	{
		removeFromPartners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.permissionGroup</code> attribute.
	 * @return the permissionGroup - IBASE Permission Group
	 */
	public PermissionGroup getPermissionGroup(final SessionContext ctx)
	{
		return (PermissionGroup)getProperty( ctx, PERMISSIONGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.permissionGroup</code> attribute.
	 * @return the permissionGroup - IBASE Permission Group
	 */
	public PermissionGroup getPermissionGroup()
	{
		return getPermissionGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.permissionGroup</code> attribute. 
	 * @param value the permissionGroup - IBASE Permission Group
	 */
	public void setPermissionGroup(final SessionContext ctx, final PermissionGroup value)
	{
		setProperty(ctx, PERMISSIONGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.permissionGroup</code> attribute. 
	 * @param value the permissionGroup - IBASE Permission Group
	 */
	public void setPermissionGroup(final PermissionGroup value)
	{
		setPermissionGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.sapCreatedBy</code> attribute.
	 * @return the sapCreatedBy - SAP Created By
	 */
	public String getSapCreatedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPCREATEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.sapCreatedBy</code> attribute.
	 * @return the sapCreatedBy - SAP Created By
	 */
	public String getSapCreatedBy()
	{
		return getSapCreatedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.sapCreatedBy</code> attribute. 
	 * @param value the sapCreatedBy - SAP Created By
	 */
	public void setSapCreatedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPCREATEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.sapCreatedBy</code> attribute. 
	 * @param value the sapCreatedBy - SAP Created By
	 */
	public void setSapCreatedBy(final String value)
	{
		setSapCreatedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.sapCreatedTime</code> attribute.
	 * @return the sapCreatedTime - SAP Create Time
	 */
	public Date getSapCreatedTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SAPCREATEDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.sapCreatedTime</code> attribute.
	 * @return the sapCreatedTime - SAP Create Time
	 */
	public Date getSapCreatedTime()
	{
		return getSapCreatedTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.sapCreatedTime</code> attribute. 
	 * @param value the sapCreatedTime - SAP Create Time
	 */
	public void setSapCreatedTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SAPCREATEDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.sapCreatedTime</code> attribute. 
	 * @param value the sapCreatedTime - SAP Create Time
	 */
	public void setSapCreatedTime(final Date value)
	{
		setSapCreatedTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.sapModifiedBy</code> attribute.
	 * @return the sapModifiedBy - SAP Modified By
	 */
	public String getSapModifiedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPMODIFIEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.sapModifiedBy</code> attribute.
	 * @return the sapModifiedBy - SAP Modified By
	 */
	public String getSapModifiedBy()
	{
		return getSapModifiedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.sapModifiedBy</code> attribute. 
	 * @param value the sapModifiedBy - SAP Modified By
	 */
	public void setSapModifiedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPMODIFIEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.sapModifiedBy</code> attribute. 
	 * @param value the sapModifiedBy - SAP Modified By
	 */
	public void setSapModifiedBy(final String value)
	{
		setSapModifiedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.sapModifiedTime</code> attribute.
	 * @return the sapModifiedTime - SAP Modified Time
	 */
	public Date getSapModifiedTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SAPMODIFIEDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.sapModifiedTime</code> attribute.
	 * @return the sapModifiedTime - SAP Modified Time
	 */
	public Date getSapModifiedTime()
	{
		return getSapModifiedTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.sapModifiedTime</code> attribute. 
	 * @param value the sapModifiedTime - SAP Modified Time
	 */
	public void setSapModifiedTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SAPMODIFIEDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.sapModifiedTime</code> attribute. 
	 * @param value the sapModifiedTime - SAP Modified Time
	 */
	public void setSapModifiedTime(final Date value)
	{
		setSapModifiedTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.status</code> attribute.
	 * @return the status - IBase Status
	 */
	public IBaseStatus getStatus(final SessionContext ctx)
	{
		return (IBaseStatus)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.status</code> attribute.
	 * @return the status - IBase Status
	 */
	public IBaseStatus getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.status</code> attribute. 
	 * @param value the status - IBase Status
	 */
	public void setStatus(final SessionContext ctx, final IBaseStatus value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.status</code> attribute. 
	 * @param value the status - IBase Status
	 */
	public void setStatus(final IBaseStatus value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.structures</code> attribute.
	 * @return the structures
	 */
	public List<IBaseStructure> getStructures(final SessionContext ctx)
	{
		return (List<IBaseStructure>)STRUCTURESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.structures</code> attribute.
	 * @return the structures
	 */
	public List<IBaseStructure> getStructures()
	{
		return getStructures( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.structures</code> attribute. 
	 * @param value the structures
	 */
	public void setStructures(final SessionContext ctx, final List<IBaseStructure> value)
	{
		STRUCTURESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.structures</code> attribute. 
	 * @param value the structures
	 */
	public void setStructures(final List<IBaseStructure> value)
	{
		setStructures( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to structures. 
	 * @param value the item to add to structures
	 */
	public void addToStructures(final SessionContext ctx, final IBaseStructure value)
	{
		STRUCTURESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to structures. 
	 * @param value the item to add to structures
	 */
	public void addToStructures(final IBaseStructure value)
	{
		addToStructures( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from structures. 
	 * @param value the item to remove from structures
	 */
	public void removeFromStructures(final SessionContext ctx, final IBaseStructure value)
	{
		STRUCTURESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from structures. 
	 * @param value the item to remove from structures
	 */
	public void removeFromStructures(final IBaseStructure value)
	{
		removeFromStructures( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.usedForVariantConfig</code> attribute.
	 * @return the usedForVariantConfig
	 */
	public String getUsedForVariantConfig(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USEDFORVARIANTCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.usedForVariantConfig</code> attribute.
	 * @return the usedForVariantConfig
	 */
	public String getUsedForVariantConfig()
	{
		return getUsedForVariantConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.usedForVariantConfig</code> attribute. 
	 * @param value the usedForVariantConfig
	 */
	public void setUsedForVariantConfig(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USEDFORVARIANTCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.usedForVariantConfig</code> attribute. 
	 * @param value the usedForVariantConfig
	 */
	public void setUsedForVariantConfig(final String value)
	{
		setUsedForVariantConfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.validationType</code> attribute.
	 * @return the validationType - IBASE Validation Type
	 */
	public ValidationType getValidationType(final SessionContext ctx)
	{
		return (ValidationType)getProperty( ctx, VALIDATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBase.validationType</code> attribute.
	 * @return the validationType - IBASE Validation Type
	 */
	public ValidationType getValidationType()
	{
		return getValidationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.validationType</code> attribute. 
	 * @param value the validationType - IBASE Validation Type
	 */
	public void setValidationType(final SessionContext ctx, final ValidationType value)
	{
		setProperty(ctx, VALIDATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBase.validationType</code> attribute. 
	 * @param value the validationType - IBASE Validation Type
	 */
	public void setValidationType(final ValidationType value)
	{
		setValidationType( getSession().getSessionContext(), value );
	}
	
}
