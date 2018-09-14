/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmticketsystem.jalo;

import com.sap.hybris.crm.sapcrmcategoryschema.jalo.CategorizationCategory;
import com.sap.hybris.crm.sapcrmticketsystem.constants.SapcrmticketsystemConstants;
import com.sap.hybris.crm.sapcrmticketsystem.jalo.CsTicketRelatedObject;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.core.configuration.jalo.SAPGlobalConfiguration;
import de.hybris.platform.ticket.jalo.CsTicket;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>SapcrmticketsystemManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcrmticketsystemManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n CSTICKETRELATEDOBJECT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CsTicketRelatedObject> CSTICKET2CSTICKETRELATEDOBJECTCSTICKETRELATEDOBJECTHANDLER = new OneToManyHandler<CsTicketRelatedObject>(
	SapcrmticketsystemConstants.TC.CSTICKETRELATEDOBJECT,
	false,
	"CsTicket",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("replicateserviceticket", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.sap.core.configuration.jalo.SAPGlobalConfiguration", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("isTicketReplicated", AttributeMode.INITIAL);
		tmp.put("reasonCategory", AttributeMode.INITIAL);
		tmp.put("reasonCategoryLevel", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.ticket.jalo.CsTicket", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("serviceRequestCategorySchemaId", AttributeMode.INITIAL);
		tmp.put("serviceRequestCatalogName", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration", Collections.unmodifiableMap(tmp));
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
	
	public CsTicketRelatedObject createCsTicketRelatedObject(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmticketsystemConstants.TC.CSTICKETRELATEDOBJECT );
			return (CsTicketRelatedObject)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CsTicketRelatedObject : "+e.getMessage(), 0 );
		}
	}
	
	public CsTicketRelatedObject createCsTicketRelatedObject(final Map attributeValues)
	{
		return createCsTicketRelatedObject( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.csTicketRelatedObject</code> attribute.
	 * @return the csTicketRelatedObject
	 */
	public List<CsTicketRelatedObject> getCsTicketRelatedObject(final SessionContext ctx, final CsTicket item)
	{
		return (List<CsTicketRelatedObject>)CSTICKET2CSTICKETRELATEDOBJECTCSTICKETRELATEDOBJECTHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.csTicketRelatedObject</code> attribute.
	 * @return the csTicketRelatedObject
	 */
	public List<CsTicketRelatedObject> getCsTicketRelatedObject(final CsTicket item)
	{
		return getCsTicketRelatedObject( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.csTicketRelatedObject</code> attribute. 
	 * @param value the csTicketRelatedObject
	 */
	public void setCsTicketRelatedObject(final SessionContext ctx, final CsTicket item, final List<CsTicketRelatedObject> value)
	{
		CSTICKET2CSTICKETRELATEDOBJECTCSTICKETRELATEDOBJECTHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.csTicketRelatedObject</code> attribute. 
	 * @param value the csTicketRelatedObject
	 */
	public void setCsTicketRelatedObject(final CsTicket item, final List<CsTicketRelatedObject> value)
	{
		setCsTicketRelatedObject( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to csTicketRelatedObject. 
	 * @param value the item to add to csTicketRelatedObject
	 */
	public void addToCsTicketRelatedObject(final SessionContext ctx, final CsTicket item, final CsTicketRelatedObject value)
	{
		CSTICKET2CSTICKETRELATEDOBJECTCSTICKETRELATEDOBJECTHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to csTicketRelatedObject. 
	 * @param value the item to add to csTicketRelatedObject
	 */
	public void addToCsTicketRelatedObject(final CsTicket item, final CsTicketRelatedObject value)
	{
		addToCsTicketRelatedObject( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from csTicketRelatedObject. 
	 * @param value the item to remove from csTicketRelatedObject
	 */
	public void removeFromCsTicketRelatedObject(final SessionContext ctx, final CsTicket item, final CsTicketRelatedObject value)
	{
		CSTICKET2CSTICKETRELATEDOBJECTCSTICKETRELATEDOBJECTHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from csTicketRelatedObject. 
	 * @param value the item to remove from csTicketRelatedObject
	 */
	public void removeFromCsTicketRelatedObject(final CsTicket item, final CsTicketRelatedObject value)
	{
		removeFromCsTicketRelatedObject( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return SapcrmticketsystemConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.isTicketReplicated</code> attribute.
	 * @return the isTicketReplicated - Service ticket replicated status in CRM.True if replicated
	 */
	public Boolean isIsTicketReplicated(final SessionContext ctx, final CsTicket item)
	{
		return (Boolean)item.getProperty( ctx, SapcrmticketsystemConstants.Attributes.CsTicket.ISTICKETREPLICATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.isTicketReplicated</code> attribute.
	 * @return the isTicketReplicated - Service ticket replicated status in CRM.True if replicated
	 */
	public Boolean isIsTicketReplicated(final CsTicket item)
	{
		return isIsTicketReplicated( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.isTicketReplicated</code> attribute. 
	 * @return the isTicketReplicated - Service ticket replicated status in CRM.True if replicated
	 */
	public boolean isIsTicketReplicatedAsPrimitive(final SessionContext ctx, final CsTicket item)
	{
		Boolean value = isIsTicketReplicated( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.isTicketReplicated</code> attribute. 
	 * @return the isTicketReplicated - Service ticket replicated status in CRM.True if replicated
	 */
	public boolean isIsTicketReplicatedAsPrimitive(final CsTicket item)
	{
		return isIsTicketReplicatedAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.isTicketReplicated</code> attribute. 
	 * @param value the isTicketReplicated - Service ticket replicated status in CRM.True if replicated
	 */
	public void setIsTicketReplicated(final SessionContext ctx, final CsTicket item, final Boolean value)
	{
		item.setProperty(ctx, SapcrmticketsystemConstants.Attributes.CsTicket.ISTICKETREPLICATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.isTicketReplicated</code> attribute. 
	 * @param value the isTicketReplicated - Service ticket replicated status in CRM.True if replicated
	 */
	public void setIsTicketReplicated(final CsTicket item, final Boolean value)
	{
		setIsTicketReplicated( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.isTicketReplicated</code> attribute. 
	 * @param value the isTicketReplicated - Service ticket replicated status in CRM.True if replicated
	 */
	public void setIsTicketReplicated(final SessionContext ctx, final CsTicket item, final boolean value)
	{
		setIsTicketReplicated( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.isTicketReplicated</code> attribute. 
	 * @param value the isTicketReplicated - Service ticket replicated status in CRM.True if replicated
	 */
	public void setIsTicketReplicated(final CsTicket item, final boolean value)
	{
		setIsTicketReplicated( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.reasonCategory</code> attribute.
	 * @return the reasonCategory
	 */
	public CategorizationCategory getReasonCategory(final SessionContext ctx, final CsTicket item)
	{
		return (CategorizationCategory)item.getProperty( ctx, SapcrmticketsystemConstants.Attributes.CsTicket.REASONCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.reasonCategory</code> attribute.
	 * @return the reasonCategory
	 */
	public CategorizationCategory getReasonCategory(final CsTicket item)
	{
		return getReasonCategory( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.reasonCategory</code> attribute. 
	 * @param value the reasonCategory
	 */
	public void setReasonCategory(final SessionContext ctx, final CsTicket item, final CategorizationCategory value)
	{
		item.setProperty(ctx, SapcrmticketsystemConstants.Attributes.CsTicket.REASONCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.reasonCategory</code> attribute. 
	 * @param value the reasonCategory
	 */
	public void setReasonCategory(final CsTicket item, final CategorizationCategory value)
	{
		setReasonCategory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.reasonCategoryLevel</code> attribute.
	 * @return the reasonCategoryLevel
	 */
	public Integer getReasonCategoryLevel(final SessionContext ctx, final CsTicket item)
	{
		return (Integer)item.getProperty( ctx, SapcrmticketsystemConstants.Attributes.CsTicket.REASONCATEGORYLEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.reasonCategoryLevel</code> attribute.
	 * @return the reasonCategoryLevel
	 */
	public Integer getReasonCategoryLevel(final CsTicket item)
	{
		return getReasonCategoryLevel( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.reasonCategoryLevel</code> attribute. 
	 * @return the reasonCategoryLevel
	 */
	public int getReasonCategoryLevelAsPrimitive(final SessionContext ctx, final CsTicket item)
	{
		Integer value = getReasonCategoryLevel( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.reasonCategoryLevel</code> attribute. 
	 * @return the reasonCategoryLevel
	 */
	public int getReasonCategoryLevelAsPrimitive(final CsTicket item)
	{
		return getReasonCategoryLevelAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.reasonCategoryLevel</code> attribute. 
	 * @param value the reasonCategoryLevel
	 */
	public void setReasonCategoryLevel(final SessionContext ctx, final CsTicket item, final Integer value)
	{
		item.setProperty(ctx, SapcrmticketsystemConstants.Attributes.CsTicket.REASONCATEGORYLEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.reasonCategoryLevel</code> attribute. 
	 * @param value the reasonCategoryLevel
	 */
	public void setReasonCategoryLevel(final CsTicket item, final Integer value)
	{
		setReasonCategoryLevel( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.reasonCategoryLevel</code> attribute. 
	 * @param value the reasonCategoryLevel
	 */
	public void setReasonCategoryLevel(final SessionContext ctx, final CsTicket item, final int value)
	{
		setReasonCategoryLevel( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.reasonCategoryLevel</code> attribute. 
	 * @param value the reasonCategoryLevel
	 */
	public void setReasonCategoryLevel(final CsTicket item, final int value)
	{
		setReasonCategoryLevel( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.replicateserviceticket</code> attribute.
	 * @return the replicateserviceticket - Replicate Service Ticket (CsTicket)
	 */
	public Boolean isReplicateserviceticket(final SessionContext ctx, final GenericItem item)
	{
		return (Boolean)item.getProperty( ctx, SapcrmticketsystemConstants.Attributes.SAPGlobalConfiguration.REPLICATESERVICETICKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.replicateserviceticket</code> attribute.
	 * @return the replicateserviceticket - Replicate Service Ticket (CsTicket)
	 */
	public Boolean isReplicateserviceticket(final SAPGlobalConfiguration item)
	{
		return isReplicateserviceticket( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.replicateserviceticket</code> attribute. 
	 * @return the replicateserviceticket - Replicate Service Ticket (CsTicket)
	 */
	public boolean isReplicateserviceticketAsPrimitive(final SessionContext ctx, final SAPGlobalConfiguration item)
	{
		Boolean value = isReplicateserviceticket( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.replicateserviceticket</code> attribute. 
	 * @return the replicateserviceticket - Replicate Service Ticket (CsTicket)
	 */
	public boolean isReplicateserviceticketAsPrimitive(final SAPGlobalConfiguration item)
	{
		return isReplicateserviceticketAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.replicateserviceticket</code> attribute. 
	 * @param value the replicateserviceticket - Replicate Service Ticket (CsTicket)
	 */
	public void setReplicateserviceticket(final SessionContext ctx, final GenericItem item, final Boolean value)
	{
		item.setProperty(ctx, SapcrmticketsystemConstants.Attributes.SAPGlobalConfiguration.REPLICATESERVICETICKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.replicateserviceticket</code> attribute. 
	 * @param value the replicateserviceticket - Replicate Service Ticket (CsTicket)
	 */
	public void setReplicateserviceticket(final SAPGlobalConfiguration item, final Boolean value)
	{
		setReplicateserviceticket( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.replicateserviceticket</code> attribute. 
	 * @param value the replicateserviceticket - Replicate Service Ticket (CsTicket)
	 */
	public void setReplicateserviceticket(final SessionContext ctx, final SAPGlobalConfiguration item, final boolean value)
	{
		setReplicateserviceticket( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.replicateserviceticket</code> attribute. 
	 * @param value the replicateserviceticket - Replicate Service Ticket (CsTicket)
	 */
	public void setReplicateserviceticket(final SAPGlobalConfiguration item, final boolean value)
	{
		setReplicateserviceticket( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.serviceRequestCatalogName</code> attribute.
	 * @return the serviceRequestCatalogName - Crm Catalog name for Service Request
	 */
	public String getServiceRequestCatalogName(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmticketsystemConstants.Attributes.SAPConfiguration.SERVICEREQUESTCATALOGNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.serviceRequestCatalogName</code> attribute.
	 * @return the serviceRequestCatalogName - Crm Catalog name for Service Request
	 */
	public String getServiceRequestCatalogName(final SAPConfiguration item)
	{
		return getServiceRequestCatalogName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.serviceRequestCatalogName</code> attribute. 
	 * @param value the serviceRequestCatalogName - Crm Catalog name for Service Request
	 */
	public void setServiceRequestCatalogName(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmticketsystemConstants.Attributes.SAPConfiguration.SERVICEREQUESTCATALOGNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.serviceRequestCatalogName</code> attribute. 
	 * @param value the serviceRequestCatalogName - Crm Catalog name for Service Request
	 */
	public void setServiceRequestCatalogName(final SAPConfiguration item, final String value)
	{
		setServiceRequestCatalogName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.serviceRequestCategorySchemaId</code> attribute.
	 * @return the serviceRequestCategorySchemaId - Category schema ID for Service Request
	 */
	public String getServiceRequestCategorySchemaId(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmticketsystemConstants.Attributes.SAPConfiguration.SERVICEREQUESTCATEGORYSCHEMAID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.serviceRequestCategorySchemaId</code> attribute.
	 * @return the serviceRequestCategorySchemaId - Category schema ID for Service Request
	 */
	public String getServiceRequestCategorySchemaId(final SAPConfiguration item)
	{
		return getServiceRequestCategorySchemaId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.serviceRequestCategorySchemaId</code> attribute. 
	 * @param value the serviceRequestCategorySchemaId - Category schema ID for Service Request
	 */
	public void setServiceRequestCategorySchemaId(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmticketsystemConstants.Attributes.SAPConfiguration.SERVICEREQUESTCATEGORYSCHEMAID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.serviceRequestCategorySchemaId</code> attribute. 
	 * @param value the serviceRequestCategorySchemaId - Category schema ID for Service Request
	 */
	public void setServiceRequestCategorySchemaId(final SAPConfiguration item, final String value)
	{
		setServiceRequestCategorySchemaId( getSession().getSessionContext(), item, value );
	}
	
}
