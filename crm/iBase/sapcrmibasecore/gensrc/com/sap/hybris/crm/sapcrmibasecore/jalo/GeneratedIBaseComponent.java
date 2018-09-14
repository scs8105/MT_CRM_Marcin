/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmibasecore.jalo;

import com.sap.hybris.crm.sapcrmibasecore.constants.SapcrmibasecoreConstants;
import com.sap.hybris.crm.sapcrmibasecore.jalo.ClassType;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBase;
import com.sap.hybris.crm.sapcrmibasecore.jalo.ObjectType;
import com.sap.hybris.crm.sapcrmibasecore.jalo.ProductObject;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem IBaseComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedIBaseComponent extends GenericItem
{
	/** Qualifier of the <code>IBaseComponent.guid</code> attribute **/
	public static final String GUID = "guid";
	/** Qualifier of the <code>IBaseComponent.objectGuid</code> attribute **/
	public static final String OBJECTGUID = "objectGuid";
	/** Qualifier of the <code>IBaseComponent.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>IBaseComponent.componentIBase</code> attribute **/
	public static final String COMPONENTIBASE = "componentIBase";
	/** Qualifier of the <code>IBaseComponent.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>IBaseComponent.object</code> attribute **/
	public static final String OBJECT = "object";
	/** Qualifier of the <code>IBaseComponent.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>IBaseComponent.instanceNumber</code> attribute **/
	public static final String INSTANCENUMBER = "instanceNumber";
	/** Qualifier of the <code>IBaseComponent.objectAllocation</code> attribute **/
	public static final String OBJECTALLOCATION = "objectAllocation";
	/** Qualifier of the <code>IBaseComponent.objectType</code> attribute **/
	public static final String OBJECTTYPE = "objectType";
	/** Qualifier of the <code>IBaseComponent.classType</code> attribute **/
	public static final String CLASSTYPE = "classType";
	/** Qualifier of the <code>IBaseComponent.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>IBaseComponent.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>IBaseComponent.sapCreatedTime</code> attribute **/
	public static final String SAPCREATEDTIME = "sapCreatedTime";
	/** Qualifier of the <code>IBaseComponent.sapCreatedBy</code> attribute **/
	public static final String SAPCREATEDBY = "sapCreatedBy";
	/** Qualifier of the <code>IBaseComponent.sapModifiedTime</code> attribute **/
	public static final String SAPMODIFIEDTIME = "sapModifiedTime";
	/** Qualifier of the <code>IBaseComponent.sapModifiedBy</code> attribute **/
	public static final String SAPMODIFIEDBY = "sapModifiedBy";
	/** Qualifier of the <code>IBaseComponent.changeNumber</code> attribute **/
	public static final String CHANGENUMBER = "changeNumber";
	/** Qualifier of the <code>IBaseComponent.archiveFlag</code> attribute **/
	public static final String ARCHIVEFLAG = "archiveFlag";
	/** Qualifier of the <code>IBaseComponent.sorter</code> attribute **/
	public static final String SORTER = "sorter";
	/** Qualifier of the <code>IBaseComponent.unit</code> attribute **/
	public static final String UNIT = "unit";
	/** Qualifier of the <code>IBaseComponent.configState</code> attribute **/
	public static final String CONFIGSTATE = "configState";
	/** Qualifier of the <code>IBaseComponent.counter</code> attribute **/
	public static final String COUNTER = "counter";
	/** Qualifier of the <code>IBaseComponent.expert</code> attribute **/
	public static final String EXPERT = "expert";
	/** Qualifier of the <code>IBaseComponent.quantity</code> attribute **/
	public static final String QUANTITY = "quantity";
	/** Qualifier of the <code>IBaseComponent.technicalState</code> attribute **/
	public static final String TECHNICALSTATE = "technicalState";
	/** Qualifier of the <code>IBaseComponent.justification</code> attribute **/
	public static final String JUSTIFICATION = "justification";
	/** Qualifier of the <code>IBaseComponent.warrantyStartDate</code> attribute **/
	public static final String WARRANTYSTARTDATE = "warrantyStartDate";
	/** Qualifier of the <code>IBaseComponent.warrantyEndDate</code> attribute **/
	public static final String WARRANTYENDDATE = "warrantyEndDate";
	/** Qualifier of the <code>IBaseComponent.iBase</code> attribute **/
	public static final String IBASE = "iBase";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n IBASE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedIBaseComponent> IBASEHANDLER = new BidirectionalOneToManyHandler<GeneratedIBaseComponent>(
	SapcrmibasecoreConstants.TC.IBASECOMPONENT,
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
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(COMPONENTIBASE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(OBJECT, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(INSTANCENUMBER, AttributeMode.INITIAL);
		tmp.put(OBJECTALLOCATION, AttributeMode.INITIAL);
		tmp.put(OBJECTTYPE, AttributeMode.INITIAL);
		tmp.put(CLASSTYPE, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(SAPCREATEDTIME, AttributeMode.INITIAL);
		tmp.put(SAPCREATEDBY, AttributeMode.INITIAL);
		tmp.put(SAPMODIFIEDTIME, AttributeMode.INITIAL);
		tmp.put(SAPMODIFIEDBY, AttributeMode.INITIAL);
		tmp.put(CHANGENUMBER, AttributeMode.INITIAL);
		tmp.put(ARCHIVEFLAG, AttributeMode.INITIAL);
		tmp.put(SORTER, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		tmp.put(CONFIGSTATE, AttributeMode.INITIAL);
		tmp.put(COUNTER, AttributeMode.INITIAL);
		tmp.put(EXPERT, AttributeMode.INITIAL);
		tmp.put(QUANTITY, AttributeMode.INITIAL);
		tmp.put(TECHNICALSTATE, AttributeMode.INITIAL);
		tmp.put(JUSTIFICATION, AttributeMode.INITIAL);
		tmp.put(WARRANTYSTARTDATE, AttributeMode.INITIAL);
		tmp.put(WARRANTYENDDATE, AttributeMode.INITIAL);
		tmp.put(IBASE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.archiveFlag</code> attribute.
	 * @return the archiveFlag - Archive Flag
	 */
	public Boolean isArchiveFlag(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ARCHIVEFLAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.archiveFlag</code> attribute.
	 * @return the archiveFlag - Archive Flag
	 */
	public Boolean isArchiveFlag()
	{
		return isArchiveFlag( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.archiveFlag</code> attribute. 
	 * @return the archiveFlag - Archive Flag
	 */
	public boolean isArchiveFlagAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isArchiveFlag( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.archiveFlag</code> attribute. 
	 * @return the archiveFlag - Archive Flag
	 */
	public boolean isArchiveFlagAsPrimitive()
	{
		return isArchiveFlagAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.archiveFlag</code> attribute. 
	 * @param value the archiveFlag - Archive Flag
	 */
	public void setArchiveFlag(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ARCHIVEFLAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.archiveFlag</code> attribute. 
	 * @param value the archiveFlag - Archive Flag
	 */
	public void setArchiveFlag(final Boolean value)
	{
		setArchiveFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.archiveFlag</code> attribute. 
	 * @param value the archiveFlag - Archive Flag
	 */
	public void setArchiveFlag(final SessionContext ctx, final boolean value)
	{
		setArchiveFlag( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.archiveFlag</code> attribute. 
	 * @param value the archiveFlag - Archive Flag
	 */
	public void setArchiveFlag(final boolean value)
	{
		setArchiveFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.changeNumber</code> attribute.
	 * @return the changeNumber - Change Number
	 */
	public String getChangeNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHANGENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.changeNumber</code> attribute.
	 * @return the changeNumber - Change Number
	 */
	public String getChangeNumber()
	{
		return getChangeNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.changeNumber</code> attribute. 
	 * @param value the changeNumber - Change Number
	 */
	public void setChangeNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHANGENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.changeNumber</code> attribute. 
	 * @param value the changeNumber - Change Number
	 */
	public void setChangeNumber(final String value)
	{
		setChangeNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.classType</code> attribute.
	 * @return the classType - Class Type
	 */
	public ClassType getClassType(final SessionContext ctx)
	{
		return (ClassType)getProperty( ctx, CLASSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.classType</code> attribute.
	 * @return the classType - Class Type
	 */
	public ClassType getClassType()
	{
		return getClassType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.classType</code> attribute. 
	 * @param value the classType - Class Type
	 */
	public void setClassType(final SessionContext ctx, final ClassType value)
	{
		setProperty(ctx, CLASSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.classType</code> attribute. 
	 * @param value the classType - Class Type
	 */
	public void setClassType(final ClassType value)
	{
		setClassType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.componentIBase</code> attribute.
	 * @return the componentIBase - IBase Partner
	 */
	public IBase getComponentIBase(final SessionContext ctx)
	{
		return (IBase)getProperty( ctx, COMPONENTIBASE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.componentIBase</code> attribute.
	 * @return the componentIBase - IBase Partner
	 */
	public IBase getComponentIBase()
	{
		return getComponentIBase( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.componentIBase</code> attribute. 
	 * @param value the componentIBase - IBase Partner
	 */
	public void setComponentIBase(final SessionContext ctx, final IBase value)
	{
		setProperty(ctx, COMPONENTIBASE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.componentIBase</code> attribute. 
	 * @param value the componentIBase - IBase Partner
	 */
	public void setComponentIBase(final IBase value)
	{
		setComponentIBase( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.configState</code> attribute.
	 * @return the configState - Configuration State
	 */
	public String getConfigState(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONFIGSTATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.configState</code> attribute.
	 * @return the configState - Configuration State
	 */
	public String getConfigState()
	{
		return getConfigState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.configState</code> attribute. 
	 * @param value the configState - Configuration State
	 */
	public void setConfigState(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONFIGSTATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.configState</code> attribute. 
	 * @param value the configState - Configuration State
	 */
	public void setConfigState(final String value)
	{
		setConfigState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.counter</code> attribute.
	 * @return the counter - Counter
	 */
	public String getCounter(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.counter</code> attribute.
	 * @return the counter - Counter
	 */
	public String getCounter()
	{
		return getCounter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.counter</code> attribute. 
	 * @param value the counter - Counter
	 */
	public void setCounter(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.counter</code> attribute. 
	 * @param value the counter - Counter
	 */
	public void setCounter(final String value)
	{
		setCounter( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		IBASEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedIBaseComponent.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.description</code> attribute. 
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
			throw new JaloInvalidParameterException("GeneratedIBaseComponent.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.expert</code> attribute.
	 * @return the expert - Expert
	 */
	public String getExpert(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXPERT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.expert</code> attribute.
	 * @return the expert - Expert
	 */
	public String getExpert()
	{
		return getExpert( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.expert</code> attribute. 
	 * @param value the expert - Expert
	 */
	public void setExpert(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXPERT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.expert</code> attribute. 
	 * @param value the expert - Expert
	 */
	public void setExpert(final String value)
	{
		setExpert( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.guid</code> attribute.
	 * @return the guid - IBase Component GUID
	 */
	public String getGuid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.guid</code> attribute.
	 * @return the guid - IBase Component GUID
	 */
	public String getGuid()
	{
		return getGuid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.guid</code> attribute. 
	 * @param value the guid - IBase Component GUID
	 */
	public void setGuid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.guid</code> attribute. 
	 * @param value the guid - IBase Component GUID
	 */
	public void setGuid(final String value)
	{
		setGuid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.iBase</code> attribute.
	 * @return the iBase
	 */
	public IBase getIBase(final SessionContext ctx)
	{
		return (IBase)getProperty( ctx, IBASE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.iBase</code> attribute.
	 * @return the iBase
	 */
	public IBase getIBase()
	{
		return getIBase( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.iBase</code> attribute. 
	 * @param value the iBase
	 */
	public void setIBase(final SessionContext ctx, final IBase value)
	{
		IBASEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.iBase</code> attribute. 
	 * @param value the iBase
	 */
	public void setIBase(final IBase value)
	{
		setIBase( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.instanceNumber</code> attribute.
	 * @return the instanceNumber - Component Instance Number
	 */
	public String getInstanceNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INSTANCENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.instanceNumber</code> attribute.
	 * @return the instanceNumber - Component Instance Number
	 */
	public String getInstanceNumber()
	{
		return getInstanceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.instanceNumber</code> attribute. 
	 * @param value the instanceNumber - Component Instance Number
	 */
	public void setInstanceNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INSTANCENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.instanceNumber</code> attribute. 
	 * @param value the instanceNumber - Component Instance Number
	 */
	public void setInstanceNumber(final String value)
	{
		setInstanceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.justification</code> attribute.
	 * @return the justification - Justification
	 */
	public String getJustification(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JUSTIFICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.justification</code> attribute.
	 * @return the justification - Justification
	 */
	public String getJustification()
	{
		return getJustification( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.justification</code> attribute. 
	 * @param value the justification - Justification
	 */
	public void setJustification(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JUSTIFICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.justification</code> attribute. 
	 * @param value the justification - Justification
	 */
	public void setJustification(final String value)
	{
		setJustification( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.object</code> attribute.
	 * @return the object - Object
	 */
	public ProductObject getObject(final SessionContext ctx)
	{
		return (ProductObject)getProperty( ctx, OBJECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.object</code> attribute.
	 * @return the object - Object
	 */
	public ProductObject getObject()
	{
		return getObject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.object</code> attribute. 
	 * @param value the object - Object
	 */
	public void setObject(final SessionContext ctx, final ProductObject value)
	{
		setProperty(ctx, OBJECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.object</code> attribute. 
	 * @param value the object - Object
	 */
	public void setObject(final ProductObject value)
	{
		setObject( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.objectAllocation</code> attribute.
	 * @return the objectAllocation - OBJECT ALLOCATION
	 */
	public String getObjectAllocation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OBJECTALLOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.objectAllocation</code> attribute.
	 * @return the objectAllocation - OBJECT ALLOCATION
	 */
	public String getObjectAllocation()
	{
		return getObjectAllocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.objectAllocation</code> attribute. 
	 * @param value the objectAllocation - OBJECT ALLOCATION
	 */
	public void setObjectAllocation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OBJECTALLOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.objectAllocation</code> attribute. 
	 * @param value the objectAllocation - OBJECT ALLOCATION
	 */
	public void setObjectAllocation(final String value)
	{
		setObjectAllocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.objectGuid</code> attribute.
	 * @return the objectGuid - Object GUID
	 */
	public String getObjectGuid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OBJECTGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.objectGuid</code> attribute.
	 * @return the objectGuid - Object GUID
	 */
	public String getObjectGuid()
	{
		return getObjectGuid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.objectGuid</code> attribute. 
	 * @param value the objectGuid - Object GUID
	 */
	public void setObjectGuid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OBJECTGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.objectGuid</code> attribute. 
	 * @param value the objectGuid - Object GUID
	 */
	public void setObjectGuid(final String value)
	{
		setObjectGuid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.objectType</code> attribute.
	 * @return the objectType - Object Type
	 */
	public ObjectType getObjectType(final SessionContext ctx)
	{
		return (ObjectType)getProperty( ctx, OBJECTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.objectType</code> attribute.
	 * @return the objectType - Object Type
	 */
	public ObjectType getObjectType()
	{
		return getObjectType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.objectType</code> attribute. 
	 * @param value the objectType - Object Type
	 */
	public void setObjectType(final SessionContext ctx, final ObjectType value)
	{
		setProperty(ctx, OBJECTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.objectType</code> attribute. 
	 * @param value the objectType - Object Type
	 */
	public void setObjectType(final ObjectType value)
	{
		setObjectType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.product</code> attribute.
	 * @return the product - IBase Product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.product</code> attribute.
	 * @return the product - IBase Product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.product</code> attribute. 
	 * @param value the product - IBase Product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.product</code> attribute. 
	 * @param value the product - IBase Product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.quantity</code> attribute.
	 * @return the quantity - Quantity
	 */
	public Integer getQuantity(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.quantity</code> attribute.
	 * @return the quantity - Quantity
	 */
	public Integer getQuantity()
	{
		return getQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.quantity</code> attribute. 
	 * @return the quantity - Quantity
	 */
	public int getQuantityAsPrimitive(final SessionContext ctx)
	{
		Integer value = getQuantity( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.quantity</code> attribute. 
	 * @return the quantity - Quantity
	 */
	public int getQuantityAsPrimitive()
	{
		return getQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.quantity</code> attribute. 
	 * @param value the quantity - Quantity
	 */
	public void setQuantity(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, QUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.quantity</code> attribute. 
	 * @param value the quantity - Quantity
	 */
	public void setQuantity(final Integer value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.quantity</code> attribute. 
	 * @param value the quantity - Quantity
	 */
	public void setQuantity(final SessionContext ctx, final int value)
	{
		setQuantity( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.quantity</code> attribute. 
	 * @param value the quantity - Quantity
	 */
	public void setQuantity(final int value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.sapCreatedBy</code> attribute.
	 * @return the sapCreatedBy - SAP Created By
	 */
	public String getSapCreatedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPCREATEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.sapCreatedBy</code> attribute.
	 * @return the sapCreatedBy - SAP Created By
	 */
	public String getSapCreatedBy()
	{
		return getSapCreatedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.sapCreatedBy</code> attribute. 
	 * @param value the sapCreatedBy - SAP Created By
	 */
	public void setSapCreatedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPCREATEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.sapCreatedBy</code> attribute. 
	 * @param value the sapCreatedBy - SAP Created By
	 */
	public void setSapCreatedBy(final String value)
	{
		setSapCreatedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.sapCreatedTime</code> attribute.
	 * @return the sapCreatedTime - SAP Create Time
	 */
	public Date getSapCreatedTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SAPCREATEDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.sapCreatedTime</code> attribute.
	 * @return the sapCreatedTime - SAP Create Time
	 */
	public Date getSapCreatedTime()
	{
		return getSapCreatedTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.sapCreatedTime</code> attribute. 
	 * @param value the sapCreatedTime - SAP Create Time
	 */
	public void setSapCreatedTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SAPCREATEDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.sapCreatedTime</code> attribute. 
	 * @param value the sapCreatedTime - SAP Create Time
	 */
	public void setSapCreatedTime(final Date value)
	{
		setSapCreatedTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.sapModifiedBy</code> attribute.
	 * @return the sapModifiedBy - SAP Modified By
	 */
	public String getSapModifiedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPMODIFIEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.sapModifiedBy</code> attribute.
	 * @return the sapModifiedBy - SAP Modified By
	 */
	public String getSapModifiedBy()
	{
		return getSapModifiedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.sapModifiedBy</code> attribute. 
	 * @param value the sapModifiedBy - SAP Modified By
	 */
	public void setSapModifiedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPMODIFIEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.sapModifiedBy</code> attribute. 
	 * @param value the sapModifiedBy - SAP Modified By
	 */
	public void setSapModifiedBy(final String value)
	{
		setSapModifiedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.sapModifiedTime</code> attribute.
	 * @return the sapModifiedTime - SAP Modified Time
	 */
	public Date getSapModifiedTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SAPMODIFIEDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.sapModifiedTime</code> attribute.
	 * @return the sapModifiedTime - SAP Modified Time
	 */
	public Date getSapModifiedTime()
	{
		return getSapModifiedTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.sapModifiedTime</code> attribute. 
	 * @param value the sapModifiedTime - SAP Modified Time
	 */
	public void setSapModifiedTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SAPMODIFIEDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.sapModifiedTime</code> attribute. 
	 * @param value the sapModifiedTime - SAP Modified Time
	 */
	public void setSapModifiedTime(final Date value)
	{
		setSapModifiedTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.sorter</code> attribute.
	 * @return the sorter - Is Component a Sorter
	 */
	public String getSorter(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SORTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.sorter</code> attribute.
	 * @return the sorter - Is Component a Sorter
	 */
	public String getSorter()
	{
		return getSorter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.sorter</code> attribute. 
	 * @param value the sorter - Is Component a Sorter
	 */
	public void setSorter(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SORTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.sorter</code> attribute. 
	 * @param value the sorter - Is Component a Sorter
	 */
	public void setSorter(final String value)
	{
		setSorter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.technicalState</code> attribute.
	 * @return the technicalState - Technical State
	 */
	public String getTechnicalState(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TECHNICALSTATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.technicalState</code> attribute.
	 * @return the technicalState - Technical State
	 */
	public String getTechnicalState()
	{
		return getTechnicalState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.technicalState</code> attribute. 
	 * @param value the technicalState - Technical State
	 */
	public void setTechnicalState(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TECHNICALSTATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.technicalState</code> attribute. 
	 * @param value the technicalState - Technical State
	 */
	public void setTechnicalState(final String value)
	{
		setTechnicalState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.unit</code> attribute.
	 * @return the unit - Component Unit
	 */
	public Unit getUnit(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.unit</code> attribute.
	 * @return the unit - Component Unit
	 */
	public Unit getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.unit</code> attribute. 
	 * @param value the unit - Component Unit
	 */
	public void setUnit(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, UNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.unit</code> attribute. 
	 * @param value the unit - Component Unit
	 */
	public void setUnit(final Unit value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.validFrom</code> attribute.
	 * @return the validFrom - Component Valid From
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.validFrom</code> attribute.
	 * @return the validFrom - Component Valid From
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.validFrom</code> attribute. 
	 * @param value the validFrom - Component Valid From
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.validFrom</code> attribute. 
	 * @param value the validFrom - Component Valid From
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.validTo</code> attribute.
	 * @return the validTo - Component Valid To
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.validTo</code> attribute.
	 * @return the validTo - Component Valid To
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.validTo</code> attribute. 
	 * @param value the validTo - Component Valid To
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.validTo</code> attribute. 
	 * @param value the validTo - Component Valid To
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.warrantyEndDate</code> attribute.
	 * @return the warrantyEndDate - Warranty End Date
	 */
	public Date getWarrantyEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, WARRANTYENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.warrantyEndDate</code> attribute.
	 * @return the warrantyEndDate - Warranty End Date
	 */
	public Date getWarrantyEndDate()
	{
		return getWarrantyEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.warrantyEndDate</code> attribute. 
	 * @param value the warrantyEndDate - Warranty End Date
	 */
	public void setWarrantyEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, WARRANTYENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.warrantyEndDate</code> attribute. 
	 * @param value the warrantyEndDate - Warranty End Date
	 */
	public void setWarrantyEndDate(final Date value)
	{
		setWarrantyEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.warrantyStartDate</code> attribute.
	 * @return the warrantyStartDate - Warranty Start Date
	 */
	public Date getWarrantyStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, WARRANTYSTARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseComponent.warrantyStartDate</code> attribute.
	 * @return the warrantyStartDate - Warranty Start Date
	 */
	public Date getWarrantyStartDate()
	{
		return getWarrantyStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.warrantyStartDate</code> attribute. 
	 * @param value the warrantyStartDate - Warranty Start Date
	 */
	public void setWarrantyStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, WARRANTYSTARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseComponent.warrantyStartDate</code> attribute. 
	 * @param value the warrantyStartDate - Warranty Start Date
	 */
	public void setWarrantyStartDate(final Date value)
	{
		setWarrantyStartDate( getSession().getSessionContext(), value );
	}
	
}
