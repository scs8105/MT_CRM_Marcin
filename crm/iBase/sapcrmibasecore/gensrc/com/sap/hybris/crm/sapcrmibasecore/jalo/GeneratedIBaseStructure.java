/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmibasecore.jalo;

import com.sap.hybris.crm.sapcrmibasecore.constants.SapcrmibasecoreConstants;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBase;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBaseComponent;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem IBaseStructure}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedIBaseStructure extends GenericItem
{
	/** Qualifier of the <code>IBaseStructure.guid</code> attribute **/
	public static final String GUID = "guid";
	/** Qualifier of the <code>IBaseStructure.objectGuid</code> attribute **/
	public static final String OBJECTGUID = "objectGuid";
	/** Qualifier of the <code>IBaseStructure.parentObjectGuid</code> attribute **/
	public static final String PARENTOBJECTGUID = "parentObjectGuid";
	/** Qualifier of the <code>IBaseStructure.rootObjectGuid</code> attribute **/
	public static final String ROOTOBJECTGUID = "rootObjectGuid";
	/** Qualifier of the <code>IBaseStructure.changeNumber</code> attribute **/
	public static final String CHANGENUMBER = "changeNumber";
	/** Qualifier of the <code>IBaseStructure.archiveFlag</code> attribute **/
	public static final String ARCHIVEFLAG = "archiveFlag";
	/** Qualifier of the <code>IBaseStructure.instanceNumber</code> attribute **/
	public static final String INSTANCENUMBER = "instanceNumber";
	/** Qualifier of the <code>IBaseStructure.position</code> attribute **/
	public static final String POSITION = "position";
	/** Qualifier of the <code>IBaseStructure.parent</code> attribute **/
	public static final String PARENT = "parent";
	/** Qualifier of the <code>IBaseStructure.root</code> attribute **/
	public static final String ROOT = "root";
	/** Qualifier of the <code>IBaseStructure.justification</code> attribute **/
	public static final String JUSTIFICATION = "justification";
	/** Qualifier of the <code>IBaseStructure.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>IBaseStructure.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>IBaseStructure.sapCreatedTime</code> attribute **/
	public static final String SAPCREATEDTIME = "sapCreatedTime";
	/** Qualifier of the <code>IBaseStructure.sapCreatedBy</code> attribute **/
	public static final String SAPCREATEDBY = "sapCreatedBy";
	/** Qualifier of the <code>IBaseStructure.sapModifiedTime</code> attribute **/
	public static final String SAPMODIFIEDTIME = "sapModifiedTime";
	/** Qualifier of the <code>IBaseStructure.sapModifiedBy</code> attribute **/
	public static final String SAPMODIFIEDBY = "sapModifiedBy";
	/** Qualifier of the <code>IBaseStructure.iBase</code> attribute **/
	public static final String IBASE = "iBase";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n IBASE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedIBaseStructure> IBASEHANDLER = new BidirectionalOneToManyHandler<GeneratedIBaseStructure>(
	SapcrmibasecoreConstants.TC.IBASESTRUCTURE,
	false,
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
		tmp.put(PARENTOBJECTGUID, AttributeMode.INITIAL);
		tmp.put(ROOTOBJECTGUID, AttributeMode.INITIAL);
		tmp.put(CHANGENUMBER, AttributeMode.INITIAL);
		tmp.put(ARCHIVEFLAG, AttributeMode.INITIAL);
		tmp.put(INSTANCENUMBER, AttributeMode.INITIAL);
		tmp.put(POSITION, AttributeMode.INITIAL);
		tmp.put(PARENT, AttributeMode.INITIAL);
		tmp.put(ROOT, AttributeMode.INITIAL);
		tmp.put(JUSTIFICATION, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(SAPCREATEDTIME, AttributeMode.INITIAL);
		tmp.put(SAPCREATEDBY, AttributeMode.INITIAL);
		tmp.put(SAPMODIFIEDTIME, AttributeMode.INITIAL);
		tmp.put(SAPMODIFIEDBY, AttributeMode.INITIAL);
		tmp.put(IBASE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.archiveFlag</code> attribute.
	 * @return the archiveFlag - Archive Flag
	 */
	public Boolean isArchiveFlag(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ARCHIVEFLAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.archiveFlag</code> attribute.
	 * @return the archiveFlag - Archive Flag
	 */
	public Boolean isArchiveFlag()
	{
		return isArchiveFlag( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.archiveFlag</code> attribute. 
	 * @return the archiveFlag - Archive Flag
	 */
	public boolean isArchiveFlagAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isArchiveFlag( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.archiveFlag</code> attribute. 
	 * @return the archiveFlag - Archive Flag
	 */
	public boolean isArchiveFlagAsPrimitive()
	{
		return isArchiveFlagAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.archiveFlag</code> attribute. 
	 * @param value the archiveFlag - Archive Flag
	 */
	public void setArchiveFlag(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ARCHIVEFLAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.archiveFlag</code> attribute. 
	 * @param value the archiveFlag - Archive Flag
	 */
	public void setArchiveFlag(final Boolean value)
	{
		setArchiveFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.archiveFlag</code> attribute. 
	 * @param value the archiveFlag - Archive Flag
	 */
	public void setArchiveFlag(final SessionContext ctx, final boolean value)
	{
		setArchiveFlag( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.archiveFlag</code> attribute. 
	 * @param value the archiveFlag - Archive Flag
	 */
	public void setArchiveFlag(final boolean value)
	{
		setArchiveFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.changeNumber</code> attribute.
	 * @return the changeNumber - Change Number
	 */
	public String getChangeNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHANGENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.changeNumber</code> attribute.
	 * @return the changeNumber - Change Number
	 */
	public String getChangeNumber()
	{
		return getChangeNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.changeNumber</code> attribute. 
	 * @param value the changeNumber - Change Number
	 */
	public void setChangeNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHANGENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.changeNumber</code> attribute. 
	 * @param value the changeNumber - Change Number
	 */
	public void setChangeNumber(final String value)
	{
		setChangeNumber( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		IBASEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.guid</code> attribute.
	 * @return the guid - Structure GUID
	 */
	public String getGuid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.guid</code> attribute.
	 * @return the guid - Structure GUID
	 */
	public String getGuid()
	{
		return getGuid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.guid</code> attribute. 
	 * @param value the guid - Structure GUID
	 */
	public void setGuid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.guid</code> attribute. 
	 * @param value the guid - Structure GUID
	 */
	public void setGuid(final String value)
	{
		setGuid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.iBase</code> attribute.
	 * @return the iBase
	 */
	public IBase getIBase(final SessionContext ctx)
	{
		return (IBase)getProperty( ctx, IBASE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.iBase</code> attribute.
	 * @return the iBase
	 */
	public IBase getIBase()
	{
		return getIBase( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.iBase</code> attribute. 
	 * @param value the iBase
	 */
	public void setIBase(final SessionContext ctx, final IBase value)
	{
		IBASEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.iBase</code> attribute. 
	 * @param value the iBase
	 */
	public void setIBase(final IBase value)
	{
		setIBase( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.instanceNumber</code> attribute.
	 * @return the instanceNumber - Instance
	 */
	public String getInstanceNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INSTANCENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.instanceNumber</code> attribute.
	 * @return the instanceNumber - Instance
	 */
	public String getInstanceNumber()
	{
		return getInstanceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.instanceNumber</code> attribute. 
	 * @param value the instanceNumber - Instance
	 */
	public void setInstanceNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INSTANCENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.instanceNumber</code> attribute. 
	 * @param value the instanceNumber - Instance
	 */
	public void setInstanceNumber(final String value)
	{
		setInstanceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.justification</code> attribute.
	 * @return the justification - Justification
	 */
	public String getJustification(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JUSTIFICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.justification</code> attribute.
	 * @return the justification - Justification
	 */
	public String getJustification()
	{
		return getJustification( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.justification</code> attribute. 
	 * @param value the justification - Justification
	 */
	public void setJustification(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JUSTIFICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.justification</code> attribute. 
	 * @param value the justification - Justification
	 */
	public void setJustification(final String value)
	{
		setJustification( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.objectGuid</code> attribute.
	 * @return the objectGuid - Object GUID
	 */
	public IBaseComponent getObjectGuid(final SessionContext ctx)
	{
		return (IBaseComponent)getProperty( ctx, OBJECTGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.objectGuid</code> attribute.
	 * @return the objectGuid - Object GUID
	 */
	public IBaseComponent getObjectGuid()
	{
		return getObjectGuid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.objectGuid</code> attribute. 
	 * @param value the objectGuid - Object GUID
	 */
	public void setObjectGuid(final SessionContext ctx, final IBaseComponent value)
	{
		setProperty(ctx, OBJECTGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.objectGuid</code> attribute. 
	 * @param value the objectGuid - Object GUID
	 */
	public void setObjectGuid(final IBaseComponent value)
	{
		setObjectGuid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.parent</code> attribute.
	 * @return the parent - Parent
	 */
	public String getParent(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.parent</code> attribute.
	 * @return the parent - Parent
	 */
	public String getParent()
	{
		return getParent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.parent</code> attribute. 
	 * @param value the parent - Parent
	 */
	public void setParent(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.parent</code> attribute. 
	 * @param value the parent - Parent
	 */
	public void setParent(final String value)
	{
		setParent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.parentObjectGuid</code> attribute.
	 * @return the parentObjectGuid - Parent Object GUID
	 */
	public IBaseComponent getParentObjectGuid(final SessionContext ctx)
	{
		return (IBaseComponent)getProperty( ctx, PARENTOBJECTGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.parentObjectGuid</code> attribute.
	 * @return the parentObjectGuid - Parent Object GUID
	 */
	public IBaseComponent getParentObjectGuid()
	{
		return getParentObjectGuid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.parentObjectGuid</code> attribute. 
	 * @param value the parentObjectGuid - Parent Object GUID
	 */
	public void setParentObjectGuid(final SessionContext ctx, final IBaseComponent value)
	{
		setProperty(ctx, PARENTOBJECTGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.parentObjectGuid</code> attribute. 
	 * @param value the parentObjectGuid - Parent Object GUID
	 */
	public void setParentObjectGuid(final IBaseComponent value)
	{
		setParentObjectGuid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.position</code> attribute.
	 * @return the position - Position
	 */
	public String getPosition(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.position</code> attribute.
	 * @return the position - Position
	 */
	public String getPosition()
	{
		return getPosition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.position</code> attribute. 
	 * @param value the position - Position
	 */
	public void setPosition(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.position</code> attribute. 
	 * @param value the position - Position
	 */
	public void setPosition(final String value)
	{
		setPosition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.root</code> attribute.
	 * @return the root - Root
	 */
	public String getRoot(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROOT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.root</code> attribute.
	 * @return the root - Root
	 */
	public String getRoot()
	{
		return getRoot( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.root</code> attribute. 
	 * @param value the root - Root
	 */
	public void setRoot(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROOT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.root</code> attribute. 
	 * @param value the root - Root
	 */
	public void setRoot(final String value)
	{
		setRoot( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.rootObjectGuid</code> attribute.
	 * @return the rootObjectGuid - Root Object GUID
	 */
	public IBaseComponent getRootObjectGuid(final SessionContext ctx)
	{
		return (IBaseComponent)getProperty( ctx, ROOTOBJECTGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.rootObjectGuid</code> attribute.
	 * @return the rootObjectGuid - Root Object GUID
	 */
	public IBaseComponent getRootObjectGuid()
	{
		return getRootObjectGuid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.rootObjectGuid</code> attribute. 
	 * @param value the rootObjectGuid - Root Object GUID
	 */
	public void setRootObjectGuid(final SessionContext ctx, final IBaseComponent value)
	{
		setProperty(ctx, ROOTOBJECTGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.rootObjectGuid</code> attribute. 
	 * @param value the rootObjectGuid - Root Object GUID
	 */
	public void setRootObjectGuid(final IBaseComponent value)
	{
		setRootObjectGuid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.sapCreatedBy</code> attribute.
	 * @return the sapCreatedBy - SAP Created By
	 */
	public String getSapCreatedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPCREATEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.sapCreatedBy</code> attribute.
	 * @return the sapCreatedBy - SAP Created By
	 */
	public String getSapCreatedBy()
	{
		return getSapCreatedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.sapCreatedBy</code> attribute. 
	 * @param value the sapCreatedBy - SAP Created By
	 */
	public void setSapCreatedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPCREATEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.sapCreatedBy</code> attribute. 
	 * @param value the sapCreatedBy - SAP Created By
	 */
	public void setSapCreatedBy(final String value)
	{
		setSapCreatedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.sapCreatedTime</code> attribute.
	 * @return the sapCreatedTime - SAP Create Time
	 */
	public Date getSapCreatedTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SAPCREATEDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.sapCreatedTime</code> attribute.
	 * @return the sapCreatedTime - SAP Create Time
	 */
	public Date getSapCreatedTime()
	{
		return getSapCreatedTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.sapCreatedTime</code> attribute. 
	 * @param value the sapCreatedTime - SAP Create Time
	 */
	public void setSapCreatedTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SAPCREATEDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.sapCreatedTime</code> attribute. 
	 * @param value the sapCreatedTime - SAP Create Time
	 */
	public void setSapCreatedTime(final Date value)
	{
		setSapCreatedTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.sapModifiedBy</code> attribute.
	 * @return the sapModifiedBy - SAP Modified By
	 */
	public String getSapModifiedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPMODIFIEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.sapModifiedBy</code> attribute.
	 * @return the sapModifiedBy - SAP Modified By
	 */
	public String getSapModifiedBy()
	{
		return getSapModifiedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.sapModifiedBy</code> attribute. 
	 * @param value the sapModifiedBy - SAP Modified By
	 */
	public void setSapModifiedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPMODIFIEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.sapModifiedBy</code> attribute. 
	 * @param value the sapModifiedBy - SAP Modified By
	 */
	public void setSapModifiedBy(final String value)
	{
		setSapModifiedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.sapModifiedTime</code> attribute.
	 * @return the sapModifiedTime - SAP Modified Time
	 */
	public Date getSapModifiedTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SAPMODIFIEDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.sapModifiedTime</code> attribute.
	 * @return the sapModifiedTime - SAP Modified Time
	 */
	public Date getSapModifiedTime()
	{
		return getSapModifiedTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.sapModifiedTime</code> attribute. 
	 * @param value the sapModifiedTime - SAP Modified Time
	 */
	public void setSapModifiedTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SAPMODIFIEDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.sapModifiedTime</code> attribute. 
	 * @param value the sapModifiedTime - SAP Modified Time
	 */
	public void setSapModifiedTime(final Date value)
	{
		setSapModifiedTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.validFrom</code> attribute.
	 * @return the validFrom - Structure Valid From
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.validFrom</code> attribute.
	 * @return the validFrom - Structure Valid From
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.validFrom</code> attribute. 
	 * @param value the validFrom - Structure Valid From
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.validFrom</code> attribute. 
	 * @param value the validFrom - Structure Valid From
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.validTo</code> attribute.
	 * @return the validTo - Structure Valid To
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseStructure.validTo</code> attribute.
	 * @return the validTo - Structure Valid To
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.validTo</code> attribute. 
	 * @param value the validTo - Structure Valid To
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseStructure.validTo</code> attribute. 
	 * @param value the validTo - Structure Valid To
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
