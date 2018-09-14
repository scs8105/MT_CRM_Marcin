/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapbusinessagreement.jalo;

import com.sap.hybris.sapbusinessagreement.constants.SapbusinessagreementexchangeConstants;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreementHeader;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BusinessAgreement}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBusinessAgreement extends GenericItem
{
	/** Qualifier of the <code>BusinessAgreement.guid</code> attribute **/
	public static final String GUID = "guid";
	/** Qualifier of the <code>BusinessAgreement.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>BusinessAgreement.text</code> attribute **/
	public static final String TEXT = "text";
	/** Qualifier of the <code>BusinessAgreement.sapIsReplicated</code> attribute **/
	public static final String SAPISREPLICATED = "sapIsReplicated";
	/** Qualifier of the <code>BusinessAgreement.replicationNumber</code> attribute **/
	public static final String REPLICATIONNUMBER = "replicationNumber";
	/** Qualifier of the <code>BusinessAgreement.partnerid</code> attribute **/
	public static final String PARTNERID = "partnerid";
	/** Qualifier of the <code>BusinessAgreement.businessagreementheader</code> attribute **/
	public static final String BUSINESSAGREEMENTHEADER = "businessagreementheader";
	/** Qualifier of the <code>BusinessAgreement.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/**
	* {@link OneToManyHandler} for handling 1:n BUSINESSAGREEMENTHEADER's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BusinessAgreementHeader> BUSINESSAGREEMENTHEADERHANDLER = new OneToManyHandler<BusinessAgreementHeader>(
	SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENTHEADER,
	true,
	"businessagreement",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CUSTOMER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBusinessAgreement> CUSTOMERHANDLER = new BidirectionalOneToManyHandler<GeneratedBusinessAgreement>(
	SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENT,
	false,
	"customer",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(GUID, AttributeMode.INITIAL);
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(TEXT, AttributeMode.INITIAL);
		tmp.put(SAPISREPLICATED, AttributeMode.INITIAL);
		tmp.put(REPLICATIONNUMBER, AttributeMode.INITIAL);
		tmp.put(PARTNERID, AttributeMode.INITIAL);
		tmp.put(CUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.businessagreementheader</code> attribute.
	 * @return the businessagreementheader - Business Agreement Header
	 */
	public Set<BusinessAgreementHeader> getBusinessagreementheader(final SessionContext ctx)
	{
		return (Set<BusinessAgreementHeader>)BUSINESSAGREEMENTHEADERHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.businessagreementheader</code> attribute.
	 * @return the businessagreementheader - Business Agreement Header
	 */
	public Set<BusinessAgreementHeader> getBusinessagreementheader()
	{
		return getBusinessagreementheader( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.businessagreementheader</code> attribute. 
	 * @param value the businessagreementheader - Business Agreement Header
	 */
	public void setBusinessagreementheader(final SessionContext ctx, final Set<BusinessAgreementHeader> value)
	{
		BUSINESSAGREEMENTHEADERHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.businessagreementheader</code> attribute. 
	 * @param value the businessagreementheader - Business Agreement Header
	 */
	public void setBusinessagreementheader(final Set<BusinessAgreementHeader> value)
	{
		setBusinessagreementheader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessagreementheader. 
	 * @param value the item to add to businessagreementheader - Business Agreement Header
	 */
	public void addToBusinessagreementheader(final SessionContext ctx, final BusinessAgreementHeader value)
	{
		BUSINESSAGREEMENTHEADERHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessagreementheader. 
	 * @param value the item to add to businessagreementheader - Business Agreement Header
	 */
	public void addToBusinessagreementheader(final BusinessAgreementHeader value)
	{
		addToBusinessagreementheader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessagreementheader. 
	 * @param value the item to remove from businessagreementheader - Business Agreement Header
	 */
	public void removeFromBusinessagreementheader(final SessionContext ctx, final BusinessAgreementHeader value)
	{
		BUSINESSAGREEMENTHEADERHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessagreementheader. 
	 * @param value the item to remove from businessagreementheader - Business Agreement Header
	 */
	public void removeFromBusinessagreementheader(final BusinessAgreementHeader value)
	{
		removeFromBusinessagreementheader( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CUSTOMERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.customer</code> attribute.
	 * @return the customer - Business Agreement
	 */
	public Customer getCustomer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, CUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.customer</code> attribute.
	 * @return the customer - Business Agreement
	 */
	public Customer getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.customer</code> attribute. 
	 * @param value the customer - Business Agreement
	 */
	public void setCustomer(final SessionContext ctx, final Customer value)
	{
		CUSTOMERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.customer</code> attribute. 
	 * @param value the customer - Business Agreement
	 */
	public void setCustomer(final Customer value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.guid</code> attribute.
	 * @return the guid - Business Agreement GUID
	 */
	public String getGuid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.guid</code> attribute.
	 * @return the guid - Business Agreement GUID
	 */
	public String getGuid()
	{
		return getGuid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.guid</code> attribute. 
	 * @param value the guid - Business Agreement GUID
	 */
	public void setGuid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.guid</code> attribute. 
	 * @param value the guid - Business Agreement GUID
	 */
	public void setGuid(final String value)
	{
		setGuid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.id</code> attribute.
	 * @return the id - Business Agreement ID
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.id</code> attribute.
	 * @return the id - Business Agreement ID
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.id</code> attribute. 
	 * @param value the id - Business Agreement ID
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.id</code> attribute. 
	 * @param value the id - Business Agreement ID
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.partnerid</code> attribute.
	 * @return the partnerid - Business Agreement Partner ID
	 */
	public String getPartnerid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARTNERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.partnerid</code> attribute.
	 * @return the partnerid - Business Agreement Partner ID
	 */
	public String getPartnerid()
	{
		return getPartnerid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.partnerid</code> attribute. 
	 * @param value the partnerid - Business Agreement Partner ID
	 */
	public void setPartnerid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARTNERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.partnerid</code> attribute. 
	 * @param value the partnerid - Business Agreement Partner ID
	 */
	public void setPartnerid(final String value)
	{
		setPartnerid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.replicationNumber</code> attribute.
	 * @return the replicationNumber - Business Agreement replication number
	 */
	public String getReplicationNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REPLICATIONNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.replicationNumber</code> attribute.
	 * @return the replicationNumber - Business Agreement replication number
	 */
	public String getReplicationNumber()
	{
		return getReplicationNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.replicationNumber</code> attribute. 
	 * @param value the replicationNumber - Business Agreement replication number
	 */
	public void setReplicationNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REPLICATIONNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.replicationNumber</code> attribute. 
	 * @param value the replicationNumber - Business Agreement replication number
	 */
	public void setReplicationNumber(final String value)
	{
		setReplicationNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.sapIsReplicated</code> attribute.
	 * @return the sapIsReplicated - Business Agreement Text
	 */
	public Boolean isSapIsReplicated(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SAPISREPLICATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.sapIsReplicated</code> attribute.
	 * @return the sapIsReplicated - Business Agreement Text
	 */
	public Boolean isSapIsReplicated()
	{
		return isSapIsReplicated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.sapIsReplicated</code> attribute. 
	 * @return the sapIsReplicated - Business Agreement Text
	 */
	public boolean isSapIsReplicatedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSapIsReplicated( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.sapIsReplicated</code> attribute. 
	 * @return the sapIsReplicated - Business Agreement Text
	 */
	public boolean isSapIsReplicatedAsPrimitive()
	{
		return isSapIsReplicatedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Business Agreement Text
	 */
	public void setSapIsReplicated(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SAPISREPLICATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Business Agreement Text
	 */
	public void setSapIsReplicated(final Boolean value)
	{
		setSapIsReplicated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Business Agreement Text
	 */
	public void setSapIsReplicated(final SessionContext ctx, final boolean value)
	{
		setSapIsReplicated( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Business Agreement Text
	 */
	public void setSapIsReplicated(final boolean value)
	{
		setSapIsReplicated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.text</code> attribute.
	 * @return the text - Business Agreement Text
	 */
	public String getText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.text</code> attribute.
	 * @return the text - Business Agreement Text
	 */
	public String getText()
	{
		return getText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.text</code> attribute. 
	 * @param value the text - Business Agreement Text
	 */
	public void setText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.text</code> attribute. 
	 * @param value the text - Business Agreement Text
	 */
	public void setText(final String value)
	{
		setText( getSession().getSessionContext(), value );
	}
	
}
