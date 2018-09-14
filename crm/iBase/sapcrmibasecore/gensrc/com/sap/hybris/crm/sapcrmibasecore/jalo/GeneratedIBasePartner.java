/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmibasecore.jalo;

import com.sap.hybris.crm.sapcrmibasecore.constants.SapcrmibasecoreConstants;
import com.sap.hybris.crm.sapcrmibasecore.jalo.IBase;
import com.sap.hybris.crm.sapcrmmodel.models.jalo.PartnerFunction;
import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem IBasePartner}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedIBasePartner extends GenericItem
{
	/** Qualifier of the <code>IBasePartner.guid</code> attribute **/
	public static final String GUID = "guid";
	/** Qualifier of the <code>IBasePartner.function</code> attribute **/
	public static final String FUNCTION = "function";
	/** Qualifier of the <code>IBasePartner.partner</code> attribute **/
	public static final String PARTNER = "partner";
	/** Qualifier of the <code>IBasePartner.mainPartner</code> attribute **/
	public static final String MAINPARTNER = "mainPartner";
	/** Qualifier of the <code>IBasePartner.displayType</code> attribute **/
	public static final String DISPLAYTYPE = "displayType";
	/** Qualifier of the <code>IBasePartner.refPartner</code> attribute **/
	public static final String REFPARTNER = "refPartner";
	/** Qualifier of the <code>IBasePartner.refPartnerFunction</code> attribute **/
	public static final String REFPARTNERFUNCTION = "refPartnerFunction";
	/** Qualifier of the <code>IBasePartner.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>IBasePartner.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>IBasePartner.sapCreatedTime</code> attribute **/
	public static final String SAPCREATEDTIME = "sapCreatedTime";
	/** Qualifier of the <code>IBasePartner.sapCreatedBy</code> attribute **/
	public static final String SAPCREATEDBY = "sapCreatedBy";
	/** Qualifier of the <code>IBasePartner.sapModifiedTime</code> attribute **/
	public static final String SAPMODIFIEDTIME = "sapModifiedTime";
	/** Qualifier of the <code>IBasePartner.sapModifiedBy</code> attribute **/
	public static final String SAPMODIFIEDBY = "sapModifiedBy";
	/** Qualifier of the <code>IBasePartner.b2bUnit</code> attribute **/
	public static final String B2BUNIT = "b2bUnit";
	/** Qualifier of the <code>IBasePartner.iBase</code> attribute **/
	public static final String IBASE = "iBase";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n IBASE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedIBasePartner> IBASEHANDLER = new BidirectionalOneToManyHandler<GeneratedIBasePartner>(
	SapcrmibasecoreConstants.TC.IBASEPARTNER,
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
		tmp.put(FUNCTION, AttributeMode.INITIAL);
		tmp.put(PARTNER, AttributeMode.INITIAL);
		tmp.put(MAINPARTNER, AttributeMode.INITIAL);
		tmp.put(DISPLAYTYPE, AttributeMode.INITIAL);
		tmp.put(REFPARTNER, AttributeMode.INITIAL);
		tmp.put(REFPARTNERFUNCTION, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(SAPCREATEDTIME, AttributeMode.INITIAL);
		tmp.put(SAPCREATEDBY, AttributeMode.INITIAL);
		tmp.put(SAPMODIFIEDTIME, AttributeMode.INITIAL);
		tmp.put(SAPMODIFIEDBY, AttributeMode.INITIAL);
		tmp.put(B2BUNIT, AttributeMode.INITIAL);
		tmp.put(IBASE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.b2bUnit</code> attribute.
	 * @return the b2bUnit - IBase B2B Unit
	 */
	public B2BUnit getB2bUnit(final SessionContext ctx)
	{
		return (B2BUnit)getProperty( ctx, B2BUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.b2bUnit</code> attribute.
	 * @return the b2bUnit - IBase B2B Unit
	 */
	public B2BUnit getB2bUnit()
	{
		return getB2bUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.b2bUnit</code> attribute. 
	 * @param value the b2bUnit - IBase B2B Unit
	 */
	public void setB2bUnit(final SessionContext ctx, final B2BUnit value)
	{
		setProperty(ctx, B2BUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.b2bUnit</code> attribute. 
	 * @param value the b2bUnit - IBase B2B Unit
	 */
	public void setB2bUnit(final B2BUnit value)
	{
		setB2bUnit( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		IBASEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.displayType</code> attribute.
	 * @return the displayType - Display Type
	 */
	public String getDisplayType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISPLAYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.displayType</code> attribute.
	 * @return the displayType - Display Type
	 */
	public String getDisplayType()
	{
		return getDisplayType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.displayType</code> attribute. 
	 * @param value the displayType - Display Type
	 */
	public void setDisplayType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISPLAYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.displayType</code> attribute. 
	 * @param value the displayType - Display Type
	 */
	public void setDisplayType(final String value)
	{
		setDisplayType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.function</code> attribute.
	 * @return the function - Partner Function
	 */
	public PartnerFunction getFunction(final SessionContext ctx)
	{
		return (PartnerFunction)getProperty( ctx, FUNCTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.function</code> attribute.
	 * @return the function - Partner Function
	 */
	public PartnerFunction getFunction()
	{
		return getFunction( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.function</code> attribute. 
	 * @param value the function - Partner Function
	 */
	public void setFunction(final SessionContext ctx, final PartnerFunction value)
	{
		setProperty(ctx, FUNCTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.function</code> attribute. 
	 * @param value the function - Partner Function
	 */
	public void setFunction(final PartnerFunction value)
	{
		setFunction( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.guid</code> attribute.
	 * @return the guid - Partner GUID
	 */
	public String getGuid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.guid</code> attribute.
	 * @return the guid - Partner GUID
	 */
	public String getGuid()
	{
		return getGuid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.guid</code> attribute. 
	 * @param value the guid - Partner GUID
	 */
	public void setGuid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.guid</code> attribute. 
	 * @param value the guid - Partner GUID
	 */
	public void setGuid(final String value)
	{
		setGuid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.iBase</code> attribute.
	 * @return the iBase
	 */
	public IBase getIBase(final SessionContext ctx)
	{
		return (IBase)getProperty( ctx, IBASE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.iBase</code> attribute.
	 * @return the iBase
	 */
	public IBase getIBase()
	{
		return getIBase( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.iBase</code> attribute. 
	 * @param value the iBase
	 */
	public void setIBase(final SessionContext ctx, final IBase value)
	{
		IBASEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.iBase</code> attribute. 
	 * @param value the iBase
	 */
	public void setIBase(final IBase value)
	{
		setIBase( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.mainPartner</code> attribute.
	 * @return the mainPartner - Main Partner Indicator
	 */
	public Boolean isMainPartner(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MAINPARTNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.mainPartner</code> attribute.
	 * @return the mainPartner - Main Partner Indicator
	 */
	public Boolean isMainPartner()
	{
		return isMainPartner( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.mainPartner</code> attribute. 
	 * @return the mainPartner - Main Partner Indicator
	 */
	public boolean isMainPartnerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMainPartner( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.mainPartner</code> attribute. 
	 * @return the mainPartner - Main Partner Indicator
	 */
	public boolean isMainPartnerAsPrimitive()
	{
		return isMainPartnerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.mainPartner</code> attribute. 
	 * @param value the mainPartner - Main Partner Indicator
	 */
	public void setMainPartner(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MAINPARTNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.mainPartner</code> attribute. 
	 * @param value the mainPartner - Main Partner Indicator
	 */
	public void setMainPartner(final Boolean value)
	{
		setMainPartner( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.mainPartner</code> attribute. 
	 * @param value the mainPartner - Main Partner Indicator
	 */
	public void setMainPartner(final SessionContext ctx, final boolean value)
	{
		setMainPartner( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.mainPartner</code> attribute. 
	 * @param value the mainPartner - Main Partner Indicator
	 */
	public void setMainPartner(final boolean value)
	{
		setMainPartner( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.partner</code> attribute.
	 * @return the partner - IBase Partner/User
	 */
	public User getPartner(final SessionContext ctx)
	{
		return (User)getProperty( ctx, PARTNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.partner</code> attribute.
	 * @return the partner - IBase Partner/User
	 */
	public User getPartner()
	{
		return getPartner( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.partner</code> attribute. 
	 * @param value the partner - IBase Partner/User
	 */
	public void setPartner(final SessionContext ctx, final User value)
	{
		setProperty(ctx, PARTNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.partner</code> attribute. 
	 * @param value the partner - IBase Partner/User
	 */
	public void setPartner(final User value)
	{
		setPartner( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.refPartner</code> attribute.
	 * @return the refPartner - Reference Partner/User
	 */
	public User getRefPartner(final SessionContext ctx)
	{
		return (User)getProperty( ctx, REFPARTNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.refPartner</code> attribute.
	 * @return the refPartner - Reference Partner/User
	 */
	public User getRefPartner()
	{
		return getRefPartner( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.refPartner</code> attribute. 
	 * @param value the refPartner - Reference Partner/User
	 */
	public void setRefPartner(final SessionContext ctx, final User value)
	{
		setProperty(ctx, REFPARTNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.refPartner</code> attribute. 
	 * @param value the refPartner - Reference Partner/User
	 */
	public void setRefPartner(final User value)
	{
		setRefPartner( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.refPartnerFunction</code> attribute.
	 * @return the refPartnerFunction - Reference Partner Function
	 */
	public PartnerFunction getRefPartnerFunction(final SessionContext ctx)
	{
		return (PartnerFunction)getProperty( ctx, REFPARTNERFUNCTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.refPartnerFunction</code> attribute.
	 * @return the refPartnerFunction - Reference Partner Function
	 */
	public PartnerFunction getRefPartnerFunction()
	{
		return getRefPartnerFunction( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.refPartnerFunction</code> attribute. 
	 * @param value the refPartnerFunction - Reference Partner Function
	 */
	public void setRefPartnerFunction(final SessionContext ctx, final PartnerFunction value)
	{
		setProperty(ctx, REFPARTNERFUNCTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.refPartnerFunction</code> attribute. 
	 * @param value the refPartnerFunction - Reference Partner Function
	 */
	public void setRefPartnerFunction(final PartnerFunction value)
	{
		setRefPartnerFunction( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.sapCreatedBy</code> attribute.
	 * @return the sapCreatedBy - SAP Created By
	 */
	public String getSapCreatedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPCREATEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.sapCreatedBy</code> attribute.
	 * @return the sapCreatedBy - SAP Created By
	 */
	public String getSapCreatedBy()
	{
		return getSapCreatedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.sapCreatedBy</code> attribute. 
	 * @param value the sapCreatedBy - SAP Created By
	 */
	public void setSapCreatedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPCREATEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.sapCreatedBy</code> attribute. 
	 * @param value the sapCreatedBy - SAP Created By
	 */
	public void setSapCreatedBy(final String value)
	{
		setSapCreatedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.sapCreatedTime</code> attribute.
	 * @return the sapCreatedTime - SAP Create Time
	 */
	public Date getSapCreatedTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SAPCREATEDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.sapCreatedTime</code> attribute.
	 * @return the sapCreatedTime - SAP Create Time
	 */
	public Date getSapCreatedTime()
	{
		return getSapCreatedTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.sapCreatedTime</code> attribute. 
	 * @param value the sapCreatedTime - SAP Create Time
	 */
	public void setSapCreatedTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SAPCREATEDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.sapCreatedTime</code> attribute. 
	 * @param value the sapCreatedTime - SAP Create Time
	 */
	public void setSapCreatedTime(final Date value)
	{
		setSapCreatedTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.sapModifiedBy</code> attribute.
	 * @return the sapModifiedBy - SAP Modified By
	 */
	public String getSapModifiedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPMODIFIEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.sapModifiedBy</code> attribute.
	 * @return the sapModifiedBy - SAP Modified By
	 */
	public String getSapModifiedBy()
	{
		return getSapModifiedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.sapModifiedBy</code> attribute. 
	 * @param value the sapModifiedBy - SAP Modified By
	 */
	public void setSapModifiedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPMODIFIEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.sapModifiedBy</code> attribute. 
	 * @param value the sapModifiedBy - SAP Modified By
	 */
	public void setSapModifiedBy(final String value)
	{
		setSapModifiedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.sapModifiedTime</code> attribute.
	 * @return the sapModifiedTime - SAP Modified Time
	 */
	public Date getSapModifiedTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SAPMODIFIEDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.sapModifiedTime</code> attribute.
	 * @return the sapModifiedTime - SAP Modified Time
	 */
	public Date getSapModifiedTime()
	{
		return getSapModifiedTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.sapModifiedTime</code> attribute. 
	 * @param value the sapModifiedTime - SAP Modified Time
	 */
	public void setSapModifiedTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SAPMODIFIEDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.sapModifiedTime</code> attribute. 
	 * @param value the sapModifiedTime - SAP Modified Time
	 */
	public void setSapModifiedTime(final Date value)
	{
		setSapModifiedTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.validFrom</code> attribute.
	 * @return the validFrom - Partner Valid From
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.validFrom</code> attribute.
	 * @return the validFrom - Partner Valid From
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.validFrom</code> attribute. 
	 * @param value the validFrom - Partner Valid From
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.validFrom</code> attribute. 
	 * @param value the validFrom - Partner Valid From
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.validTo</code> attribute.
	 * @return the validTo - Partner Valid To
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBasePartner.validTo</code> attribute.
	 * @return the validTo - Partner Valid To
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.validTo</code> attribute. 
	 * @param value the validTo - Partner Valid To
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBasePartner.validTo</code> attribute. 
	 * @param value the validTo - Partner Valid To
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
