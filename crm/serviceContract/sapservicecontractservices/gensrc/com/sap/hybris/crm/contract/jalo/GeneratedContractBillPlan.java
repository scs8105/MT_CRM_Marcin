/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.contract.jalo;

import com.sap.hybris.crm.sapservicecontractservices.constants.SapservicecontractservicesConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.sap.hybris.crm.contract.jalo.ContractBillPlan ContractBillPlan}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedContractBillPlan extends GenericItem
{
	/** Qualifier of the <code>ContractBillPlan.contractSettlementPeriod</code> attribute **/
	public static final String CONTRACTSETTLEMENTPERIOD = "contractSettlementPeriod";
	/** Qualifier of the <code>ContractBillPlan.contractBillingDate</code> attribute **/
	public static final String CONTRACTBILLINGDATE = "contractBillingDate";
	/** Qualifier of the <code>ContractBillPlan.invoiceCreationDate</code> attribute **/
	public static final String INVOICECREATIONDATE = "invoiceCreationDate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CONTRACTSETTLEMENTPERIOD, AttributeMode.INITIAL);
		tmp.put(CONTRACTBILLINGDATE, AttributeMode.INITIAL);
		tmp.put(INVOICECREATIONDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContractBillPlan.contractBillingDate</code> attribute.
	 * @return the contractBillingDate - Billing Date of Contract
	 */
	public String getContractBillingDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTRACTBILLINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContractBillPlan.contractBillingDate</code> attribute.
	 * @return the contractBillingDate - Billing Date of Contract
	 */
	public String getContractBillingDate()
	{
		return getContractBillingDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContractBillPlan.contractBillingDate</code> attribute. 
	 * @param value the contractBillingDate - Billing Date of Contract
	 */
	public void setContractBillingDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTRACTBILLINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContractBillPlan.contractBillingDate</code> attribute. 
	 * @param value the contractBillingDate - Billing Date of Contract
	 */
	public void setContractBillingDate(final String value)
	{
		setContractBillingDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContractBillPlan.contractSettlementPeriod</code> attribute.
	 * @return the contractSettlementPeriod - Settlement Period  of Contract
	 */
	public String getContractSettlementPeriod(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTRACTSETTLEMENTPERIOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContractBillPlan.contractSettlementPeriod</code> attribute.
	 * @return the contractSettlementPeriod - Settlement Period  of Contract
	 */
	public String getContractSettlementPeriod()
	{
		return getContractSettlementPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContractBillPlan.contractSettlementPeriod</code> attribute. 
	 * @param value the contractSettlementPeriod - Settlement Period  of Contract
	 */
	public void setContractSettlementPeriod(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTRACTSETTLEMENTPERIOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContractBillPlan.contractSettlementPeriod</code> attribute. 
	 * @param value the contractSettlementPeriod - Settlement Period  of Contract
	 */
	public void setContractSettlementPeriod(final String value)
	{
		setContractSettlementPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContractBillPlan.invoiceCreationDate</code> attribute.
	 * @return the invoiceCreationDate - Invoice Creation Date of Contract
	 */
	public String getInvoiceCreationDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICECREATIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContractBillPlan.invoiceCreationDate</code> attribute.
	 * @return the invoiceCreationDate - Invoice Creation Date of Contract
	 */
	public String getInvoiceCreationDate()
	{
		return getInvoiceCreationDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContractBillPlan.invoiceCreationDate</code> attribute. 
	 * @param value the invoiceCreationDate - Invoice Creation Date of Contract
	 */
	public void setInvoiceCreationDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICECREATIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContractBillPlan.invoiceCreationDate</code> attribute. 
	 * @param value the invoiceCreationDate - Invoice Creation Date of Contract
	 */
	public void setInvoiceCreationDate(final String value)
	{
		setInvoiceCreationDate( getSession().getSessionContext(), value );
	}
	
}
