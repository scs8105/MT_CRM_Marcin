/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapbusinessagreement.jalo;

import com.sap.hybris.crm.sapcrmmodel.models.jalo.PartnerFunction;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BusinessAgreementPartners}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBusinessAgreementPartners extends GenericItem
{
	/** Qualifier of the <code>BusinessAgreementPartners.businesspartnerfunctionguid</code> attribute **/
	public static final String BUSINESSPARTNERFUNCTIONGUID = "businesspartnerfunctionguid";
	/** Qualifier of the <code>BusinessAgreementPartners.businessagreementpartnercat</code> attribute **/
	public static final String BUSINESSAGREEMENTPARTNERCAT = "businessagreementpartnercat";
	/** Qualifier of the <code>BusinessAgreementPartners.partnerguid1</code> attribute **/
	public static final String PARTNERGUID1 = "partnerguid1";
	/** Qualifier of the <code>BusinessAgreementPartners.customerguid</code> attribute **/
	public static final String CUSTOMERGUID = "customerguid";
	/** Qualifier of the <code>BusinessAgreementPartners.bprelationshipnum</code> attribute **/
	public static final String BPRELATIONSHIPNUM = "bprelationshipnum";
	/** Qualifier of the <code>BusinessAgreementPartners.partnerfunction</code> attribute **/
	public static final String PARTNERFUNCTION = "partnerfunction";
	/** Qualifier of the <code>BusinessAgreementPartners.replicationNumberPartners</code> attribute **/
	public static final String REPLICATIONNUMBERPARTNERS = "replicationNumberPartners";
	/** Qualifier of the <code>BusinessAgreementPartners.relationTask</code> attribute **/
	public static final String RELATIONTASK = "relationTask";
	/** Qualifier of the <code>BusinessAgreementPartners.partnerid2</code> attribute **/
	public static final String PARTNERID2 = "partnerid2";
	/** Qualifier of the <code>BusinessAgreementPartners.businessagreementheader</code> attribute **/
	public static final String BUSINESSAGREEMENTHEADER = "businessagreementheader";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BUSINESSAGREEMENTHEADER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBusinessAgreementPartners> BUSINESSAGREEMENTHEADERHANDLER = new BidirectionalOneToManyHandler<GeneratedBusinessAgreementPartners>(
	SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENTPARTNERS,
	false,
	"businessagreementheader",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BUSINESSPARTNERFUNCTIONGUID, AttributeMode.INITIAL);
		tmp.put(BUSINESSAGREEMENTPARTNERCAT, AttributeMode.INITIAL);
		tmp.put(PARTNERGUID1, AttributeMode.INITIAL);
		tmp.put(CUSTOMERGUID, AttributeMode.INITIAL);
		tmp.put(BPRELATIONSHIPNUM, AttributeMode.INITIAL);
		tmp.put(PARTNERFUNCTION, AttributeMode.INITIAL);
		tmp.put(REPLICATIONNUMBERPARTNERS, AttributeMode.INITIAL);
		tmp.put(RELATIONTASK, AttributeMode.INITIAL);
		tmp.put(PARTNERID2, AttributeMode.INITIAL);
		tmp.put(BUSINESSAGREEMENTHEADER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.bprelationshipnum</code> attribute.
	 * @return the bprelationshipnum - BP relationship number
	 */
	public String getBprelationshipnum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BPRELATIONSHIPNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.bprelationshipnum</code> attribute.
	 * @return the bprelationshipnum - BP relationship number
	 */
	public String getBprelationshipnum()
	{
		return getBprelationshipnum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.bprelationshipnum</code> attribute. 
	 * @param value the bprelationshipnum - BP relationship number
	 */
	public void setBprelationshipnum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BPRELATIONSHIPNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.bprelationshipnum</code> attribute. 
	 * @param value the bprelationshipnum - BP relationship number
	 */
	public void setBprelationshipnum(final String value)
	{
		setBprelationshipnum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.businessagreementheader</code> attribute.
	 * @return the businessagreementheader - Business Agreement
	 */
	public BusinessAgreementHeader getBusinessagreementheader(final SessionContext ctx)
	{
		return (BusinessAgreementHeader)getProperty( ctx, BUSINESSAGREEMENTHEADER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.businessagreementheader</code> attribute.
	 * @return the businessagreementheader - Business Agreement
	 */
	public BusinessAgreementHeader getBusinessagreementheader()
	{
		return getBusinessagreementheader( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.businessagreementheader</code> attribute. 
	 * @param value the businessagreementheader - Business Agreement
	 */
	public void setBusinessagreementheader(final SessionContext ctx, final BusinessAgreementHeader value)
	{
		BUSINESSAGREEMENTHEADERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.businessagreementheader</code> attribute. 
	 * @param value the businessagreementheader - Business Agreement
	 */
	public void setBusinessagreementheader(final BusinessAgreementHeader value)
	{
		setBusinessagreementheader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.businessagreementpartnercat</code> attribute.
	 * @return the businessagreementpartnercat - Business Agreement Partner Function Category
	 */
	public String getBusinessagreementpartnercat(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSAGREEMENTPARTNERCAT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.businessagreementpartnercat</code> attribute.
	 * @return the businessagreementpartnercat - Business Agreement Partner Function Category
	 */
	public String getBusinessagreementpartnercat()
	{
		return getBusinessagreementpartnercat( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.businessagreementpartnercat</code> attribute. 
	 * @param value the businessagreementpartnercat - Business Agreement Partner Function Category
	 */
	public void setBusinessagreementpartnercat(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSAGREEMENTPARTNERCAT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.businessagreementpartnercat</code> attribute. 
	 * @param value the businessagreementpartnercat - Business Agreement Partner Function Category
	 */
	public void setBusinessagreementpartnercat(final String value)
	{
		setBusinessagreementpartnercat( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.businesspartnerfunctionguid</code> attribute.
	 * @return the businesspartnerfunctionguid - Business Partner Function GUID
	 */
	public String getBusinesspartnerfunctionguid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUSINESSPARTNERFUNCTIONGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.businesspartnerfunctionguid</code> attribute.
	 * @return the businesspartnerfunctionguid - Business Partner Function GUID
	 */
	public String getBusinesspartnerfunctionguid()
	{
		return getBusinesspartnerfunctionguid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.businesspartnerfunctionguid</code> attribute. 
	 * @param value the businesspartnerfunctionguid - Business Partner Function GUID
	 */
	public void setBusinesspartnerfunctionguid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUSINESSPARTNERFUNCTIONGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.businesspartnerfunctionguid</code> attribute. 
	 * @param value the businesspartnerfunctionguid - Business Partner Function GUID
	 */
	public void setBusinesspartnerfunctionguid(final String value)
	{
		setBusinesspartnerfunctionguid( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BUSINESSAGREEMENTHEADERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.customerguid</code> attribute.
	 * @return the customerguid - Customer GUID
	 */
	public Customer getCustomerguid(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, CUSTOMERGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.customerguid</code> attribute.
	 * @return the customerguid - Customer GUID
	 */
	public Customer getCustomerguid()
	{
		return getCustomerguid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.customerguid</code> attribute. 
	 * @param value the customerguid - Customer GUID
	 */
	public void setCustomerguid(final SessionContext ctx, final Customer value)
	{
		setProperty(ctx, CUSTOMERGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.customerguid</code> attribute. 
	 * @param value the customerguid - Customer GUID
	 */
	public void setCustomerguid(final Customer value)
	{
		setCustomerguid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.partnerfunction</code> attribute.
	 * @return the partnerfunction - Partner Function
	 */
	public PartnerFunction getPartnerfunction(final SessionContext ctx)
	{
		return (PartnerFunction)getProperty( ctx, PARTNERFUNCTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.partnerfunction</code> attribute.
	 * @return the partnerfunction - Partner Function
	 */
	public PartnerFunction getPartnerfunction()
	{
		return getPartnerfunction( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.partnerfunction</code> attribute. 
	 * @param value the partnerfunction - Partner Function
	 */
	public void setPartnerfunction(final SessionContext ctx, final PartnerFunction value)
	{
		setProperty(ctx, PARTNERFUNCTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.partnerfunction</code> attribute. 
	 * @param value the partnerfunction - Partner Function
	 */
	public void setPartnerfunction(final PartnerFunction value)
	{
		setPartnerfunction( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.partnerguid1</code> attribute.
	 * @return the partnerguid1 - Primary Partner GUID
	 */
	public String getPartnerguid1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARTNERGUID1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.partnerguid1</code> attribute.
	 * @return the partnerguid1 - Primary Partner GUID
	 */
	public String getPartnerguid1()
	{
		return getPartnerguid1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.partnerguid1</code> attribute. 
	 * @param value the partnerguid1 - Primary Partner GUID
	 */
	public void setPartnerguid1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARTNERGUID1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.partnerguid1</code> attribute. 
	 * @param value the partnerguid1 - Primary Partner GUID
	 */
	public void setPartnerguid1(final String value)
	{
		setPartnerguid1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.partnerid2</code> attribute.
	 * @return the partnerid2 - Business Agreement Secondary Partner ID
	 */
	public String getPartnerid2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARTNERID2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.partnerid2</code> attribute.
	 * @return the partnerid2 - Business Agreement Secondary Partner ID
	 */
	public String getPartnerid2()
	{
		return getPartnerid2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.partnerid2</code> attribute. 
	 * @param value the partnerid2 - Business Agreement Secondary Partner ID
	 */
	public void setPartnerid2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARTNERID2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.partnerid2</code> attribute. 
	 * @param value the partnerid2 - Business Agreement Secondary Partner ID
	 */
	public void setPartnerid2(final String value)
	{
		setPartnerid2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.relationTask</code> attribute.
	 * @return the relationTask - Business Agreement relation task status
	 */
	public String getRelationTask(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RELATIONTASK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.relationTask</code> attribute.
	 * @return the relationTask - Business Agreement relation task status
	 */
	public String getRelationTask()
	{
		return getRelationTask( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.relationTask</code> attribute. 
	 * @param value the relationTask - Business Agreement relation task status
	 */
	public void setRelationTask(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RELATIONTASK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.relationTask</code> attribute. 
	 * @param value the relationTask - Business Agreement relation task status
	 */
	public void setRelationTask(final String value)
	{
		setRelationTask( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.replicationNumberPartners</code> attribute.
	 * @return the replicationNumberPartners - Business Agreement replication number
	 */
	public String getReplicationNumberPartners(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REPLICATIONNUMBERPARTNERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.replicationNumberPartners</code> attribute.
	 * @return the replicationNumberPartners - Business Agreement replication number
	 */
	public String getReplicationNumberPartners()
	{
		return getReplicationNumberPartners( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.replicationNumberPartners</code> attribute. 
	 * @param value the replicationNumberPartners - Business Agreement replication number
	 */
	public void setReplicationNumberPartners(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REPLICATIONNUMBERPARTNERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.replicationNumberPartners</code> attribute. 
	 * @param value the replicationNumberPartners - Business Agreement replication number
	 */
	public void setReplicationNumberPartners(final String value)
	{
		setReplicationNumberPartners( getSession().getSessionContext(), value );
	}
	
}
