/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapservicecontractservices.jalo;

import com.sap.hybris.crm.contract.jalo.ContractBillPlan;
import com.sap.hybris.crm.contract.jalo.SAPContractStatus;
import com.sap.hybris.crm.contract.jalo.ServiceContract;
import com.sap.hybris.crm.contract.jalo.ServiceProduct;
import com.sap.hybris.crm.sapservicecontractservices.constants.SapservicecontractservicesConstants;
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
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.core.configuration.jalo.SAPRFCDestination;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>SapservicecontractservicesManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapservicecontractservicesManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n CONTRACT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ServiceContract> SERVICECONTRACT2CUSTOMERRELCONTRACTHANDLER = new OneToManyHandler<ServiceContract>(
	SapservicecontractservicesConstants.TC.SERVICECONTRACT,
	false,
	"customer",
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
		tmp.put("sapServiceContract_RFCDestination", AttributeMode.INITIAL);
		tmp.put("sapServiceContractProcessType", AttributeMode.INITIAL);
		tmp.put("sapServiceContractNoteType", AttributeMode.INITIAL);
		tmp.put("maxHits", AttributeMode.INITIAL);
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contract</code> attribute.
	 * @return the contract
	 */
	public List<ServiceContract> getContract(final SessionContext ctx, final Customer item)
	{
		return (List<ServiceContract>)SERVICECONTRACT2CUSTOMERRELCONTRACTHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contract</code> attribute.
	 * @return the contract
	 */
	public List<ServiceContract> getContract(final Customer item)
	{
		return getContract( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.contract</code> attribute. 
	 * @param value the contract
	 */
	public void setContract(final SessionContext ctx, final Customer item, final List<ServiceContract> value)
	{
		SERVICECONTRACT2CUSTOMERRELCONTRACTHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.contract</code> attribute. 
	 * @param value the contract
	 */
	public void setContract(final Customer item, final List<ServiceContract> value)
	{
		setContract( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contract. 
	 * @param value the item to add to contract
	 */
	public void addToContract(final SessionContext ctx, final Customer item, final ServiceContract value)
	{
		SERVICECONTRACT2CUSTOMERRELCONTRACTHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contract. 
	 * @param value the item to add to contract
	 */
	public void addToContract(final Customer item, final ServiceContract value)
	{
		addToContract( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contract. 
	 * @param value the item to remove from contract
	 */
	public void removeFromContract(final SessionContext ctx, final Customer item, final ServiceContract value)
	{
		SERVICECONTRACT2CUSTOMERRELCONTRACTHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contract. 
	 * @param value the item to remove from contract
	 */
	public void removeFromContract(final Customer item, final ServiceContract value)
	{
		removeFromContract( getSession().getSessionContext(), item, value );
	}
	
	public ContractBillPlan createContractBillPlan(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapservicecontractservicesConstants.TC.CONTRACTBILLPLAN );
			return (ContractBillPlan)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ContractBillPlan : "+e.getMessage(), 0 );
		}
	}
	
	public ContractBillPlan createContractBillPlan(final Map attributeValues)
	{
		return createContractBillPlan( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPContractStatus createSAPStatus(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapservicecontractservicesConstants.TC.SAPSTATUS );
			return (SAPContractStatus)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPStatus : "+e.getMessage(), 0 );
		}
	}
	
	public SAPContractStatus createSAPStatus(final Map attributeValues)
	{
		return createSAPStatus( getSession().getSessionContext(), attributeValues );
	}
	
	public ServiceContract createServiceContract(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapservicecontractservicesConstants.TC.SERVICECONTRACT );
			return (ServiceContract)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ServiceContract : "+e.getMessage(), 0 );
		}
	}
	
	public ServiceContract createServiceContract(final Map attributeValues)
	{
		return createServiceContract( getSession().getSessionContext(), attributeValues );
	}
	
	public ServiceProduct createServiceProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapservicecontractservicesConstants.TC.SERVICEPRODUCT );
			return (ServiceProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ServiceProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ServiceProduct createServiceProduct(final Map attributeValues)
	{
		return createServiceProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SapservicecontractservicesConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.maxHits</code> attribute.
	 * @return the maxHits - Max number of contracts to be retrieved
	 */
	public Integer getMaxHits(final SessionContext ctx, final GenericItem item)
	{
		return (Integer)item.getProperty( ctx, SapservicecontractservicesConstants.Attributes.SAPConfiguration.MAXHITS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.maxHits</code> attribute.
	 * @return the maxHits - Max number of contracts to be retrieved
	 */
	public Integer getMaxHits(final SAPConfiguration item)
	{
		return getMaxHits( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.maxHits</code> attribute. 
	 * @return the maxHits - Max number of contracts to be retrieved
	 */
	public int getMaxHitsAsPrimitive(final SessionContext ctx, final SAPConfiguration item)
	{
		Integer value = getMaxHits( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.maxHits</code> attribute. 
	 * @return the maxHits - Max number of contracts to be retrieved
	 */
	public int getMaxHitsAsPrimitive(final SAPConfiguration item)
	{
		return getMaxHitsAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.maxHits</code> attribute. 
	 * @param value the maxHits - Max number of contracts to be retrieved
	 */
	public void setMaxHits(final SessionContext ctx, final GenericItem item, final Integer value)
	{
		item.setProperty(ctx, SapservicecontractservicesConstants.Attributes.SAPConfiguration.MAXHITS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.maxHits</code> attribute. 
	 * @param value the maxHits - Max number of contracts to be retrieved
	 */
	public void setMaxHits(final SAPConfiguration item, final Integer value)
	{
		setMaxHits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.maxHits</code> attribute. 
	 * @param value the maxHits - Max number of contracts to be retrieved
	 */
	public void setMaxHits(final SessionContext ctx, final SAPConfiguration item, final int value)
	{
		setMaxHits( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.maxHits</code> attribute. 
	 * @param value the maxHits - Max number of contracts to be retrieved
	 */
	public void setMaxHits(final SAPConfiguration item, final int value)
	{
		setMaxHits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapServiceContract_RFCDestination</code> attribute.
	 * @return the sapServiceContract_RFCDestination - RFC Destination for Synchronous Service Contract
	 */
	public SAPRFCDestination getSapServiceContract_RFCDestination(final SessionContext ctx, final GenericItem item)
	{
		return (SAPRFCDestination)item.getProperty( ctx, SapservicecontractservicesConstants.Attributes.SAPConfiguration.SAPSERVICECONTRACT_RFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapServiceContract_RFCDestination</code> attribute.
	 * @return the sapServiceContract_RFCDestination - RFC Destination for Synchronous Service Contract
	 */
	public SAPRFCDestination getSapServiceContract_RFCDestination(final SAPConfiguration item)
	{
		return getSapServiceContract_RFCDestination( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapServiceContract_RFCDestination</code> attribute. 
	 * @param value the sapServiceContract_RFCDestination - RFC Destination for Synchronous Service Contract
	 */
	public void setSapServiceContract_RFCDestination(final SessionContext ctx, final GenericItem item, final SAPRFCDestination value)
	{
		item.setProperty(ctx, SapservicecontractservicesConstants.Attributes.SAPConfiguration.SAPSERVICECONTRACT_RFCDESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapServiceContract_RFCDestination</code> attribute. 
	 * @param value the sapServiceContract_RFCDestination - RFC Destination for Synchronous Service Contract
	 */
	public void setSapServiceContract_RFCDestination(final SAPConfiguration item, final SAPRFCDestination value)
	{
		setSapServiceContract_RFCDestination( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapServiceContractNoteType</code> attribute.
	 * @return the sapServiceContractNoteType - Process Type of Note to be display on UI
	 */
	public String getSapServiceContractNoteType(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapservicecontractservicesConstants.Attributes.SAPConfiguration.SAPSERVICECONTRACTNOTETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapServiceContractNoteType</code> attribute.
	 * @return the sapServiceContractNoteType - Process Type of Note to be display on UI
	 */
	public String getSapServiceContractNoteType(final SAPConfiguration item)
	{
		return getSapServiceContractNoteType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapServiceContractNoteType</code> attribute. 
	 * @param value the sapServiceContractNoteType - Process Type of Note to be display on UI
	 */
	public void setSapServiceContractNoteType(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapservicecontractservicesConstants.Attributes.SAPConfiguration.SAPSERVICECONTRACTNOTETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapServiceContractNoteType</code> attribute. 
	 * @param value the sapServiceContractNoteType - Process Type of Note to be display on UI
	 */
	public void setSapServiceContractNoteType(final SAPConfiguration item, final String value)
	{
		setSapServiceContractNoteType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapServiceContractProcessType</code> attribute.
	 * @return the sapServiceContractProcessType - Process Type for Service Contract
	 */
	public String getSapServiceContractProcessType(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapservicecontractservicesConstants.Attributes.SAPConfiguration.SAPSERVICECONTRACTPROCESSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapServiceContractProcessType</code> attribute.
	 * @return the sapServiceContractProcessType - Process Type for Service Contract
	 */
	public String getSapServiceContractProcessType(final SAPConfiguration item)
	{
		return getSapServiceContractProcessType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapServiceContractProcessType</code> attribute. 
	 * @param value the sapServiceContractProcessType - Process Type for Service Contract
	 */
	public void setSapServiceContractProcessType(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapservicecontractservicesConstants.Attributes.SAPConfiguration.SAPSERVICECONTRACTPROCESSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapServiceContractProcessType</code> attribute. 
	 * @param value the sapServiceContractProcessType - Process Type for Service Contract
	 */
	public void setSapServiceContractProcessType(final SAPConfiguration item, final String value)
	{
		setSapServiceContractProcessType( getSession().getSessionContext(), item, value );
	}
	
}
