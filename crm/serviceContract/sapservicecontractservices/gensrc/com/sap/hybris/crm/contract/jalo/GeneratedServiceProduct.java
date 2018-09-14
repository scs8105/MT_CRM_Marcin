/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.contract.jalo;

import com.sap.hybris.crm.contract.jalo.SAPContractStatus;
import com.sap.hybris.crm.contract.jalo.ServiceContract;
import com.sap.hybris.crm.sapservicecontractservices.constants.SapservicecontractservicesConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.order.OrderEntry;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.sap.hybris.crm.contract.jalo.ServiceProduct ServiceProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedServiceProduct extends OrderEntry
{
	/** Qualifier of the <code>ServiceProduct.itemNumber</code> attribute **/
	public static final String ITEMNUMBER = "itemNumber";
	/** Qualifier of the <code>ServiceProduct.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>ServiceProduct.releasedQuantity</code> attribute **/
	public static final String RELEASEDQUANTITY = "releasedQuantity";
	/** Qualifier of the <code>ServiceProduct.netValue</code> attribute **/
	public static final String NETVALUE = "netValue";
	/** Qualifier of the <code>ServiceProduct.expectedValue</code> attribute **/
	public static final String EXPECTEDVALUE = "expectedValue";
	/** Qualifier of the <code>ServiceProduct.targetValue</code> attribute **/
	public static final String TARGETVALUE = "targetValue";
	/** Qualifier of the <code>ServiceProduct.releasedValue</code> attribute **/
	public static final String RELEASEDVALUE = "releasedValue";
	/** Qualifier of the <code>ServiceProduct.responseProfile</code> attribute **/
	public static final String RESPONSEPROFILE = "responseProfile";
	/** Qualifier of the <code>ServiceProduct.serviceProfile</code> attribute **/
	public static final String SERVICEPROFILE = "serviceProfile";
	/** Qualifier of the <code>ServiceProduct.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>ServiceProduct.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>ServiceProduct.productUnit</code> attribute **/
	public static final String PRODUCTUNIT = "productUnit";
	/** Qualifier of the <code>ServiceProduct.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>ServiceProduct.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>ServiceProduct.contract</code> attribute **/
	public static final String CONTRACT = "contract";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CONTRACT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedServiceProduct> CONTRACTHANDLER = new BidirectionalOneToManyHandler<GeneratedServiceProduct>(
	SapservicecontractservicesConstants.TC.SERVICEPRODUCT,
	false,
	"contract",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(OrderEntry.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ITEMNUMBER, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(RELEASEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(NETVALUE, AttributeMode.INITIAL);
		tmp.put(EXPECTEDVALUE, AttributeMode.INITIAL);
		tmp.put(TARGETVALUE, AttributeMode.INITIAL);
		tmp.put(RELEASEDVALUE, AttributeMode.INITIAL);
		tmp.put(RESPONSEPROFILE, AttributeMode.INITIAL);
		tmp.put(SERVICEPROFILE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(PRODUCTUNIT, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(CONTRACT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.contract</code> attribute.
	 * @return the contract
	 */
	public ServiceContract getContract(final SessionContext ctx)
	{
		return (ServiceContract)getProperty( ctx, CONTRACT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.contract</code> attribute.
	 * @return the contract
	 */
	public ServiceContract getContract()
	{
		return getContract( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.contract</code> attribute. 
	 * @param value the contract
	 */
	public void setContract(final SessionContext ctx, final ServiceContract value)
	{
		CONTRACTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.contract</code> attribute. 
	 * @param value the contract
	 */
	public void setContract(final ServiceContract value)
	{
		setContract( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CONTRACTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.currency</code> attribute.
	 * @return the currency - currency for service product
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.currency</code> attribute.
	 * @return the currency - currency for service product
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.currency</code> attribute. 
	 * @param value the currency - currency for service product
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.currency</code> attribute. 
	 * @param value the currency - currency for service product
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.description</code> attribute.
	 * @return the description - Description for service product
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.description</code> attribute.
	 * @return the description - Description for service product
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.description</code> attribute. 
	 * @param value the description - Description for service product
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.description</code> attribute. 
	 * @param value the description - Description for service product
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.expectedValue</code> attribute.
	 * @return the expectedValue - Expected value for service product
	 */
	public Double getExpectedValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, EXPECTEDVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.expectedValue</code> attribute.
	 * @return the expectedValue - Expected value for service product
	 */
	public Double getExpectedValue()
	{
		return getExpectedValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.expectedValue</code> attribute. 
	 * @return the expectedValue - Expected value for service product
	 */
	public double getExpectedValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getExpectedValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.expectedValue</code> attribute. 
	 * @return the expectedValue - Expected value for service product
	 */
	public double getExpectedValueAsPrimitive()
	{
		return getExpectedValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.expectedValue</code> attribute. 
	 * @param value the expectedValue - Expected value for service product
	 */
	public void setExpectedValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, EXPECTEDVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.expectedValue</code> attribute. 
	 * @param value the expectedValue - Expected value for service product
	 */
	public void setExpectedValue(final Double value)
	{
		setExpectedValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.expectedValue</code> attribute. 
	 * @param value the expectedValue - Expected value for service product
	 */
	public void setExpectedValue(final SessionContext ctx, final double value)
	{
		setExpectedValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.expectedValue</code> attribute. 
	 * @param value the expectedValue - Expected value for service product
	 */
	public void setExpectedValue(final double value)
	{
		setExpectedValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.itemNumber</code> attribute.
	 * @return the itemNumber - Item number for service product
	 */
	public String getItemNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITEMNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.itemNumber</code> attribute.
	 * @return the itemNumber - Item number for service product
	 */
	public String getItemNumber()
	{
		return getItemNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.itemNumber</code> attribute. 
	 * @param value the itemNumber - Item number for service product
	 */
	public void setItemNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITEMNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.itemNumber</code> attribute. 
	 * @param value the itemNumber - Item number for service product
	 */
	public void setItemNumber(final String value)
	{
		setItemNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.netValue</code> attribute.
	 * @return the netValue - Net value for service product
	 */
	public Double getNetValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, NETVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.netValue</code> attribute.
	 * @return the netValue - Net value for service product
	 */
	public Double getNetValue()
	{
		return getNetValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.netValue</code> attribute. 
	 * @return the netValue - Net value for service product
	 */
	public double getNetValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getNetValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.netValue</code> attribute. 
	 * @return the netValue - Net value for service product
	 */
	public double getNetValueAsPrimitive()
	{
		return getNetValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.netValue</code> attribute. 
	 * @param value the netValue - Net value for service product
	 */
	public void setNetValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, NETVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.netValue</code> attribute. 
	 * @param value the netValue - Net value for service product
	 */
	public void setNetValue(final Double value)
	{
		setNetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.netValue</code> attribute. 
	 * @param value the netValue - Net value for service product
	 */
	public void setNetValue(final SessionContext ctx, final double value)
	{
		setNetValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.netValue</code> attribute. 
	 * @param value the netValue - Net value for service product
	 */
	public void setNetValue(final double value)
	{
		setNetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.productUnit</code> attribute.
	 * @return the productUnit - Unit for service product
	 */
	public String getProductUnit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.productUnit</code> attribute.
	 * @return the productUnit - Unit for service product
	 */
	public String getProductUnit()
	{
		return getProductUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.productUnit</code> attribute. 
	 * @param value the productUnit - Unit for service product
	 */
	public void setProductUnit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.productUnit</code> attribute. 
	 * @param value the productUnit - Unit for service product
	 */
	public void setProductUnit(final String value)
	{
		setProductUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.releasedQuantity</code> attribute.
	 * @return the releasedQuantity - Released quantity for service product
	 */
	public Integer getReleasedQuantity(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RELEASEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.releasedQuantity</code> attribute.
	 * @return the releasedQuantity - Released quantity for service product
	 */
	public Integer getReleasedQuantity()
	{
		return getReleasedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.releasedQuantity</code> attribute. 
	 * @return the releasedQuantity - Released quantity for service product
	 */
	public int getReleasedQuantityAsPrimitive(final SessionContext ctx)
	{
		Integer value = getReleasedQuantity( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.releasedQuantity</code> attribute. 
	 * @return the releasedQuantity - Released quantity for service product
	 */
	public int getReleasedQuantityAsPrimitive()
	{
		return getReleasedQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.releasedQuantity</code> attribute. 
	 * @param value the releasedQuantity - Released quantity for service product
	 */
	public void setReleasedQuantity(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RELEASEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.releasedQuantity</code> attribute. 
	 * @param value the releasedQuantity - Released quantity for service product
	 */
	public void setReleasedQuantity(final Integer value)
	{
		setReleasedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.releasedQuantity</code> attribute. 
	 * @param value the releasedQuantity - Released quantity for service product
	 */
	public void setReleasedQuantity(final SessionContext ctx, final int value)
	{
		setReleasedQuantity( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.releasedQuantity</code> attribute. 
	 * @param value the releasedQuantity - Released quantity for service product
	 */
	public void setReleasedQuantity(final int value)
	{
		setReleasedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.releasedValue</code> attribute.
	 * @return the releasedValue - Released value for service product
	 */
	public Double getReleasedValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, RELEASEDVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.releasedValue</code> attribute.
	 * @return the releasedValue - Released value for service product
	 */
	public Double getReleasedValue()
	{
		return getReleasedValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.releasedValue</code> attribute. 
	 * @return the releasedValue - Released value for service product
	 */
	public double getReleasedValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getReleasedValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.releasedValue</code> attribute. 
	 * @return the releasedValue - Released value for service product
	 */
	public double getReleasedValueAsPrimitive()
	{
		return getReleasedValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.releasedValue</code> attribute. 
	 * @param value the releasedValue - Released value for service product
	 */
	public void setReleasedValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, RELEASEDVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.releasedValue</code> attribute. 
	 * @param value the releasedValue - Released value for service product
	 */
	public void setReleasedValue(final Double value)
	{
		setReleasedValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.releasedValue</code> attribute. 
	 * @param value the releasedValue - Released value for service product
	 */
	public void setReleasedValue(final SessionContext ctx, final double value)
	{
		setReleasedValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.releasedValue</code> attribute. 
	 * @param value the releasedValue - Released value for service product
	 */
	public void setReleasedValue(final double value)
	{
		setReleasedValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.responseProfile</code> attribute.
	 * @return the responseProfile - Response profile for service product
	 */
	public EnumerationValue getResponseProfile(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RESPONSEPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.responseProfile</code> attribute.
	 * @return the responseProfile - Response profile for service product
	 */
	public EnumerationValue getResponseProfile()
	{
		return getResponseProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.responseProfile</code> attribute. 
	 * @param value the responseProfile - Response profile for service product
	 */
	public void setResponseProfile(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RESPONSEPROFILE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.responseProfile</code> attribute. 
	 * @param value the responseProfile - Response profile for service product
	 */
	public void setResponseProfile(final EnumerationValue value)
	{
		setResponseProfile( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.serviceProfile</code> attribute.
	 * @return the serviceProfile - Service profile for service product
	 */
	public EnumerationValue getServiceProfile(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SERVICEPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.serviceProfile</code> attribute.
	 * @return the serviceProfile - Service profile for service product
	 */
	public EnumerationValue getServiceProfile()
	{
		return getServiceProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.serviceProfile</code> attribute. 
	 * @param value the serviceProfile - Service profile for service product
	 */
	public void setServiceProfile(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SERVICEPROFILE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.serviceProfile</code> attribute. 
	 * @param value the serviceProfile - Service profile for service product
	 */
	public void setServiceProfile(final EnumerationValue value)
	{
		setServiceProfile( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.status</code> attribute.
	 * @return the status - Status for service product
	 */
	public SAPContractStatus getStatus(final SessionContext ctx)
	{
		return (SAPContractStatus)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.status</code> attribute.
	 * @return the status - Status for service product
	 */
	public SAPContractStatus getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.status</code> attribute. 
	 * @param value the status - Status for service product
	 */
	public void setStatus(final SessionContext ctx, final SAPContractStatus value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.status</code> attribute. 
	 * @param value the status - Status for service product
	 */
	public void setStatus(final SAPContractStatus value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.targetValue</code> attribute.
	 * @return the targetValue - Target value for service product
	 */
	public Double getTargetValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TARGETVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.targetValue</code> attribute.
	 * @return the targetValue - Target value for service product
	 */
	public Double getTargetValue()
	{
		return getTargetValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.targetValue</code> attribute. 
	 * @return the targetValue - Target value for service product
	 */
	public double getTargetValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getTargetValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.targetValue</code> attribute. 
	 * @return the targetValue - Target value for service product
	 */
	public double getTargetValueAsPrimitive()
	{
		return getTargetValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.targetValue</code> attribute. 
	 * @param value the targetValue - Target value for service product
	 */
	public void setTargetValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TARGETVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.targetValue</code> attribute. 
	 * @param value the targetValue - Target value for service product
	 */
	public void setTargetValue(final Double value)
	{
		setTargetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.targetValue</code> attribute. 
	 * @param value the targetValue - Target value for service product
	 */
	public void setTargetValue(final SessionContext ctx, final double value)
	{
		setTargetValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.targetValue</code> attribute. 
	 * @param value the targetValue - Target value for service product
	 */
	public void setTargetValue(final double value)
	{
		setTargetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.validFrom</code> attribute.
	 * @return the validFrom - Valid from date for service product
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.validFrom</code> attribute.
	 * @return the validFrom - Valid from date for service product
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.validFrom</code> attribute. 
	 * @param value the validFrom - Valid from date for service product
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.validFrom</code> attribute. 
	 * @param value the validFrom - Valid from date for service product
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.validTo</code> attribute.
	 * @return the validTo - Valid to date for service product
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceProduct.validTo</code> attribute.
	 * @return the validTo - Valid to date for service product
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.validTo</code> attribute. 
	 * @param value the validTo - Valid to date for service product
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceProduct.validTo</code> attribute. 
	 * @param value the validTo - Valid to date for service product
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
