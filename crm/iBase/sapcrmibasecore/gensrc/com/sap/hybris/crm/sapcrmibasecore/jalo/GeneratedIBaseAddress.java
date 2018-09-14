/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmibasecore.jalo;

import com.sap.hybris.crm.sapcrmibasecore.constants.SapcrmibasecoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Address;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.Address IBaseAddress}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedIBaseAddress extends Address
{
	/** Qualifier of the <code>IBaseAddress.addressType</code> attribute **/
	public static final String ADDRESSTYPE = "addressType";
	/** Qualifier of the <code>IBaseAddress.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>IBaseAddress.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>IBaseAddress.formOfAddress</code> attribute **/
	public static final String FORMOFADDRESS = "formOfAddress";
	/** Qualifier of the <code>IBaseAddress.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>IBaseAddress.name2</code> attribute **/
	public static final String NAME2 = "name2";
	/** Qualifier of the <code>IBaseAddress.name3</code> attribute **/
	public static final String NAME3 = "name3";
	/** Qualifier of the <code>IBaseAddress.name4</code> attribute **/
	public static final String NAME4 = "name4";
	/** Qualifier of the <code>IBaseAddress.coName</code> attribute **/
	public static final String CONAME = "coName";
	/** Qualifier of the <code>IBaseAddress.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>IBaseAddress.cityNo</code> attribute **/
	public static final String CITYNO = "cityNo";
	/** Qualifier of the <code>IBaseAddress.postalCode1</code> attribute **/
	public static final String POSTALCODE1 = "postalCode1";
	/** Qualifier of the <code>IBaseAddress.postalCode2</code> attribute **/
	public static final String POSTALCODE2 = "postalCode2";
	/** Qualifier of the <code>IBaseAddress.postalCode3</code> attribute **/
	public static final String POSTALCODE3 = "postalCode3";
	/** Qualifier of the <code>IBaseAddress.poBoxCit</code> attribute **/
	public static final String POBOXCIT = "poBoxCit";
	/** Qualifier of the <code>IBaseAddress.deliveryDis</code> attribute **/
	public static final String DELIVERYDIS = "deliveryDis";
	/** Qualifier of the <code>IBaseAddress.street</code> attribute **/
	public static final String STREET = "street";
	/** Qualifier of the <code>IBaseAddress.strAbbr</code> attribute **/
	public static final String STRABBR = "strAbbr";
	/** Qualifier of the <code>IBaseAddress.houseNo</code> attribute **/
	public static final String HOUSENO = "houseNo";
	/** Qualifier of the <code>IBaseAddress.strSupll1</code> attribute **/
	public static final String STRSUPLL1 = "strSupll1";
	/** Qualifier of the <code>IBaseAddress.strSupll2</code> attribute **/
	public static final String STRSUPLL2 = "strSupll2";
	/** Qualifier of the <code>IBaseAddress.location</code> attribute **/
	public static final String LOCATION = "location";
	/** Qualifier of the <code>IBaseAddress.floor</code> attribute **/
	public static final String FLOOR = "floor";
	/** Qualifier of the <code>IBaseAddress.roomNo</code> attribute **/
	public static final String ROOMNO = "roomNo";
	/** Qualifier of the <code>IBaseAddress.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>IBaseAddress.sort1</code> attribute **/
	public static final String SORT1 = "sort1";
	/** Qualifier of the <code>IBaseAddress.sort2</code> attribute **/
	public static final String SORT2 = "sort2";
	/** Qualifier of the <code>IBaseAddress.timeZone</code> attribute **/
	public static final String TIMEZONE = "timeZone";
	/** Qualifier of the <code>IBaseAddress.taxJurCode</code> attribute **/
	public static final String TAXJURCODE = "taxJurCode";
	/** Qualifier of the <code>IBaseAddress.addressNotes</code> attribute **/
	public static final String ADDRESSNOTES = "addressNotes";
	/** Qualifier of the <code>IBaseAddress.commType</code> attribute **/
	public static final String COMMTYPE = "commType";
	/** Qualifier of the <code>IBaseAddress.telNumber1</code> attribute **/
	public static final String TELNUMBER1 = "telNumber1";
	/** Qualifier of the <code>IBaseAddress.telExt1</code> attribute **/
	public static final String TELEXT1 = "telExt1";
	/** Qualifier of the <code>IBaseAddress.faxNumber</code> attribute **/
	public static final String FAXNUMBER = "faxNumber";
	/** Qualifier of the <code>IBaseAddress.faxExtens</code> attribute **/
	public static final String FAXEXTENS = "faxExtens";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Address.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ADDRESSTYPE, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(FORMOFADDRESS, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(NAME2, AttributeMode.INITIAL);
		tmp.put(NAME3, AttributeMode.INITIAL);
		tmp.put(NAME4, AttributeMode.INITIAL);
		tmp.put(CONAME, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(CITYNO, AttributeMode.INITIAL);
		tmp.put(POSTALCODE1, AttributeMode.INITIAL);
		tmp.put(POSTALCODE2, AttributeMode.INITIAL);
		tmp.put(POSTALCODE3, AttributeMode.INITIAL);
		tmp.put(POBOXCIT, AttributeMode.INITIAL);
		tmp.put(DELIVERYDIS, AttributeMode.INITIAL);
		tmp.put(STREET, AttributeMode.INITIAL);
		tmp.put(STRABBR, AttributeMode.INITIAL);
		tmp.put(HOUSENO, AttributeMode.INITIAL);
		tmp.put(STRSUPLL1, AttributeMode.INITIAL);
		tmp.put(STRSUPLL2, AttributeMode.INITIAL);
		tmp.put(LOCATION, AttributeMode.INITIAL);
		tmp.put(FLOOR, AttributeMode.INITIAL);
		tmp.put(ROOMNO, AttributeMode.INITIAL);
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		tmp.put(SORT1, AttributeMode.INITIAL);
		tmp.put(SORT2, AttributeMode.INITIAL);
		tmp.put(TIMEZONE, AttributeMode.INITIAL);
		tmp.put(TAXJURCODE, AttributeMode.INITIAL);
		tmp.put(ADDRESSNOTES, AttributeMode.INITIAL);
		tmp.put(COMMTYPE, AttributeMode.INITIAL);
		tmp.put(TELNUMBER1, AttributeMode.INITIAL);
		tmp.put(TELEXT1, AttributeMode.INITIAL);
		tmp.put(FAXNUMBER, AttributeMode.INITIAL);
		tmp.put(FAXEXTENS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.addressNotes</code> attribute.
	 * @return the addressNotes
	 */
	public String getAddressNotes(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSNOTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.addressNotes</code> attribute.
	 * @return the addressNotes
	 */
	public String getAddressNotes()
	{
		return getAddressNotes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.addressNotes</code> attribute. 
	 * @param value the addressNotes
	 */
	public void setAddressNotes(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSNOTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.addressNotes</code> attribute. 
	 * @param value the addressNotes
	 */
	public void setAddressNotes(final String value)
	{
		setAddressNotes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.addressType</code> attribute.
	 * @return the addressType
	 */
	public String getAddressType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.addressType</code> attribute.
	 * @return the addressType
	 */
	public String getAddressType()
	{
		return getAddressType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.addressType</code> attribute. 
	 * @param value the addressType
	 */
	public void setAddressType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.addressType</code> attribute. 
	 * @param value the addressType
	 */
	public void setAddressType(final String value)
	{
		setAddressType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.cityNo</code> attribute.
	 * @return the cityNo
	 */
	public String getCityNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITYNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.cityNo</code> attribute.
	 * @return the cityNo
	 */
	public String getCityNo()
	{
		return getCityNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.cityNo</code> attribute. 
	 * @param value the cityNo
	 */
	public void setCityNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITYNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.cityNo</code> attribute. 
	 * @param value the cityNo
	 */
	public void setCityNo(final String value)
	{
		setCityNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.commType</code> attribute.
	 * @return the commType
	 */
	public String getCommType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.commType</code> attribute.
	 * @return the commType
	 */
	public String getCommType()
	{
		return getCommType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.commType</code> attribute. 
	 * @param value the commType
	 */
	public void setCommType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.commType</code> attribute. 
	 * @param value the commType
	 */
	public void setCommType(final String value)
	{
		setCommType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.coName</code> attribute.
	 * @return the coName
	 */
	public String getCoName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.coName</code> attribute.
	 * @return the coName
	 */
	public String getCoName()
	{
		return getCoName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.coName</code> attribute. 
	 * @param value the coName
	 */
	public void setCoName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.coName</code> attribute. 
	 * @param value the coName
	 */
	public void setCoName(final String value)
	{
		setCoName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.deliveryDis</code> attribute.
	 * @return the deliveryDis
	 */
	public String getDeliveryDis(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYDIS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.deliveryDis</code> attribute.
	 * @return the deliveryDis
	 */
	public String getDeliveryDis()
	{
		return getDeliveryDis( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.deliveryDis</code> attribute. 
	 * @param value the deliveryDis
	 */
	public void setDeliveryDis(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYDIS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.deliveryDis</code> attribute. 
	 * @param value the deliveryDis
	 */
	public void setDeliveryDis(final String value)
	{
		setDeliveryDis( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.faxExtens</code> attribute.
	 * @return the faxExtens
	 */
	public String getFaxExtens(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAXEXTENS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.faxExtens</code> attribute.
	 * @return the faxExtens
	 */
	public String getFaxExtens()
	{
		return getFaxExtens( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.faxExtens</code> attribute. 
	 * @param value the faxExtens
	 */
	public void setFaxExtens(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAXEXTENS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.faxExtens</code> attribute. 
	 * @param value the faxExtens
	 */
	public void setFaxExtens(final String value)
	{
		setFaxExtens( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.faxNumber</code> attribute.
	 * @return the faxNumber
	 */
	public String getFaxNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAXNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.faxNumber</code> attribute.
	 * @return the faxNumber
	 */
	public String getFaxNumber()
	{
		return getFaxNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.faxNumber</code> attribute. 
	 * @param value the faxNumber
	 */
	public void setFaxNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAXNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.faxNumber</code> attribute. 
	 * @param value the faxNumber
	 */
	public void setFaxNumber(final String value)
	{
		setFaxNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.floor</code> attribute.
	 * @return the floor
	 */
	public String getFloor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FLOOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.floor</code> attribute.
	 * @return the floor
	 */
	public String getFloor()
	{
		return getFloor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.floor</code> attribute. 
	 * @param value the floor
	 */
	public void setFloor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FLOOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.floor</code> attribute. 
	 * @param value the floor
	 */
	public void setFloor(final String value)
	{
		setFloor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.formOfAddress</code> attribute.
	 * @return the formOfAddress
	 */
	public String getFormOfAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FORMOFADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.formOfAddress</code> attribute.
	 * @return the formOfAddress
	 */
	public String getFormOfAddress()
	{
		return getFormOfAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.formOfAddress</code> attribute. 
	 * @param value the formOfAddress
	 */
	public void setFormOfAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FORMOFADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.formOfAddress</code> attribute. 
	 * @param value the formOfAddress
	 */
	public void setFormOfAddress(final String value)
	{
		setFormOfAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.houseNo</code> attribute.
	 * @return the houseNo
	 */
	public String getHouseNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOUSENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.houseNo</code> attribute.
	 * @return the houseNo
	 */
	public String getHouseNo()
	{
		return getHouseNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.houseNo</code> attribute. 
	 * @param value the houseNo
	 */
	public void setHouseNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOUSENO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.houseNo</code> attribute. 
	 * @param value the houseNo
	 */
	public void setHouseNo(final String value)
	{
		setHouseNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.language</code> attribute.
	 * @return the language
	 */
	public String getLanguage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.language</code> attribute.
	 * @return the language
	 */
	public String getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final String value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.location</code> attribute.
	 * @return the location
	 */
	public String getLocation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.location</code> attribute.
	 * @return the location
	 */
	public String getLocation()
	{
		return getLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.location</code> attribute. 
	 * @param value the location
	 */
	public void setLocation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.location</code> attribute. 
	 * @param value the location
	 */
	public void setLocation(final String value)
	{
		setLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.name2</code> attribute.
	 * @return the name2
	 */
	public String getName2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.name2</code> attribute.
	 * @return the name2
	 */
	public String getName2()
	{
		return getName2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.name2</code> attribute. 
	 * @param value the name2
	 */
	public void setName2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.name2</code> attribute. 
	 * @param value the name2
	 */
	public void setName2(final String value)
	{
		setName2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.name3</code> attribute.
	 * @return the name3
	 */
	public String getName3(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.name3</code> attribute.
	 * @return the name3
	 */
	public String getName3()
	{
		return getName3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.name3</code> attribute. 
	 * @param value the name3
	 */
	public void setName3(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.name3</code> attribute. 
	 * @param value the name3
	 */
	public void setName3(final String value)
	{
		setName3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.name4</code> attribute.
	 * @return the name4
	 */
	public String getName4(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME4);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.name4</code> attribute.
	 * @return the name4
	 */
	public String getName4()
	{
		return getName4( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.name4</code> attribute. 
	 * @param value the name4
	 */
	public void setName4(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME4,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.name4</code> attribute. 
	 * @param value the name4
	 */
	public void setName4(final String value)
	{
		setName4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.poBoxCit</code> attribute.
	 * @return the poBoxCit
	 */
	public String getPoBoxCit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POBOXCIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.poBoxCit</code> attribute.
	 * @return the poBoxCit
	 */
	public String getPoBoxCit()
	{
		return getPoBoxCit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.poBoxCit</code> attribute. 
	 * @param value the poBoxCit
	 */
	public void setPoBoxCit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POBOXCIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.poBoxCit</code> attribute. 
	 * @param value the poBoxCit
	 */
	public void setPoBoxCit(final String value)
	{
		setPoBoxCit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.postalCode1</code> attribute.
	 * @return the postalCode1
	 */
	public String getPostalCode1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSTALCODE1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.postalCode1</code> attribute.
	 * @return the postalCode1
	 */
	public String getPostalCode1()
	{
		return getPostalCode1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.postalCode1</code> attribute. 
	 * @param value the postalCode1
	 */
	public void setPostalCode1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSTALCODE1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.postalCode1</code> attribute. 
	 * @param value the postalCode1
	 */
	public void setPostalCode1(final String value)
	{
		setPostalCode1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.postalCode2</code> attribute.
	 * @return the postalCode2
	 */
	public String getPostalCode2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSTALCODE2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.postalCode2</code> attribute.
	 * @return the postalCode2
	 */
	public String getPostalCode2()
	{
		return getPostalCode2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.postalCode2</code> attribute. 
	 * @param value the postalCode2
	 */
	public void setPostalCode2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSTALCODE2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.postalCode2</code> attribute. 
	 * @param value the postalCode2
	 */
	public void setPostalCode2(final String value)
	{
		setPostalCode2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.postalCode3</code> attribute.
	 * @return the postalCode3
	 */
	public String getPostalCode3(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSTALCODE3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.postalCode3</code> attribute.
	 * @return the postalCode3
	 */
	public String getPostalCode3()
	{
		return getPostalCode3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.postalCode3</code> attribute. 
	 * @param value the postalCode3
	 */
	public void setPostalCode3(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSTALCODE3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.postalCode3</code> attribute. 
	 * @param value the postalCode3
	 */
	public void setPostalCode3(final String value)
	{
		setPostalCode3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.roomNo</code> attribute.
	 * @return the roomNo
	 */
	public String getRoomNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROOMNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.roomNo</code> attribute.
	 * @return the roomNo
	 */
	public String getRoomNo()
	{
		return getRoomNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.roomNo</code> attribute. 
	 * @param value the roomNo
	 */
	public void setRoomNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROOMNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.roomNo</code> attribute. 
	 * @param value the roomNo
	 */
	public void setRoomNo(final String value)
	{
		setRoomNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.sort1</code> attribute.
	 * @return the sort1
	 */
	public String getSort1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SORT1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.sort1</code> attribute.
	 * @return the sort1
	 */
	public String getSort1()
	{
		return getSort1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.sort1</code> attribute. 
	 * @param value the sort1
	 */
	public void setSort1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SORT1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.sort1</code> attribute. 
	 * @param value the sort1
	 */
	public void setSort1(final String value)
	{
		setSort1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.sort2</code> attribute.
	 * @return the sort2
	 */
	public String getSort2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SORT2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.sort2</code> attribute.
	 * @return the sort2
	 */
	public String getSort2()
	{
		return getSort2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.sort2</code> attribute. 
	 * @param value the sort2
	 */
	public void setSort2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SORT2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.sort2</code> attribute. 
	 * @param value the sort2
	 */
	public void setSort2(final String value)
	{
		setSort2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.strAbbr</code> attribute.
	 * @return the strAbbr
	 */
	public String getStrAbbr(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STRABBR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.strAbbr</code> attribute.
	 * @return the strAbbr
	 */
	public String getStrAbbr()
	{
		return getStrAbbr( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.strAbbr</code> attribute. 
	 * @param value the strAbbr
	 */
	public void setStrAbbr(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STRABBR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.strAbbr</code> attribute. 
	 * @param value the strAbbr
	 */
	public void setStrAbbr(final String value)
	{
		setStrAbbr( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.street</code> attribute.
	 * @return the street
	 */
	public String getStreet(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STREET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.street</code> attribute.
	 * @return the street
	 */
	public String getStreet()
	{
		return getStreet( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.street</code> attribute. 
	 * @param value the street
	 */
	public void setStreet(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STREET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.street</code> attribute. 
	 * @param value the street
	 */
	public void setStreet(final String value)
	{
		setStreet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.strSupll1</code> attribute.
	 * @return the strSupll1
	 */
	public String getStrSupll1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STRSUPLL1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.strSupll1</code> attribute.
	 * @return the strSupll1
	 */
	public String getStrSupll1()
	{
		return getStrSupll1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.strSupll1</code> attribute. 
	 * @param value the strSupll1
	 */
	public void setStrSupll1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STRSUPLL1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.strSupll1</code> attribute. 
	 * @param value the strSupll1
	 */
	public void setStrSupll1(final String value)
	{
		setStrSupll1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.strSupll2</code> attribute.
	 * @return the strSupll2
	 */
	public String getStrSupll2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STRSUPLL2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.strSupll2</code> attribute.
	 * @return the strSupll2
	 */
	public String getStrSupll2()
	{
		return getStrSupll2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.strSupll2</code> attribute. 
	 * @param value the strSupll2
	 */
	public void setStrSupll2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STRSUPLL2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.strSupll2</code> attribute. 
	 * @param value the strSupll2
	 */
	public void setStrSupll2(final String value)
	{
		setStrSupll2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.taxJurCode</code> attribute.
	 * @return the taxJurCode
	 */
	public String getTaxJurCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TAXJURCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.taxJurCode</code> attribute.
	 * @return the taxJurCode
	 */
	public String getTaxJurCode()
	{
		return getTaxJurCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.taxJurCode</code> attribute. 
	 * @param value the taxJurCode
	 */
	public void setTaxJurCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TAXJURCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.taxJurCode</code> attribute. 
	 * @param value the taxJurCode
	 */
	public void setTaxJurCode(final String value)
	{
		setTaxJurCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.telExt1</code> attribute.
	 * @return the telExt1
	 */
	public String getTelExt1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TELEXT1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.telExt1</code> attribute.
	 * @return the telExt1
	 */
	public String getTelExt1()
	{
		return getTelExt1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.telExt1</code> attribute. 
	 * @param value the telExt1
	 */
	public void setTelExt1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TELEXT1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.telExt1</code> attribute. 
	 * @param value the telExt1
	 */
	public void setTelExt1(final String value)
	{
		setTelExt1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.telNumber1</code> attribute.
	 * @return the telNumber1
	 */
	public String getTelNumber1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TELNUMBER1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.telNumber1</code> attribute.
	 * @return the telNumber1
	 */
	public String getTelNumber1()
	{
		return getTelNumber1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.telNumber1</code> attribute. 
	 * @param value the telNumber1
	 */
	public void setTelNumber1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TELNUMBER1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.telNumber1</code> attribute. 
	 * @param value the telNumber1
	 */
	public void setTelNumber1(final String value)
	{
		setTelNumber1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.timeZone</code> attribute.
	 * @return the timeZone
	 */
	public String getTimeZone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMEZONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.timeZone</code> attribute.
	 * @return the timeZone
	 */
	public String getTimeZone()
	{
		return getTimeZone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.timeZone</code> attribute. 
	 * @param value the timeZone
	 */
	public void setTimeZone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMEZONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.timeZone</code> attribute. 
	 * @param value the timeZone
	 */
	public void setTimeZone(final String value)
	{
		setTimeZone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.validFrom</code> attribute.
	 * @return the validFrom - Structure Valid From
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.validFrom</code> attribute.
	 * @return the validFrom - Structure Valid From
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.validFrom</code> attribute. 
	 * @param value the validFrom - Structure Valid From
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.validFrom</code> attribute. 
	 * @param value the validFrom - Structure Valid From
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.validTo</code> attribute.
	 * @return the validTo - Structure Valid To
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IBaseAddress.validTo</code> attribute.
	 * @return the validTo - Structure Valid To
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.validTo</code> attribute. 
	 * @param value the validTo - Structure Valid To
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IBaseAddress.validTo</code> attribute. 
	 * @param value the validTo - Structure Valid To
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
