/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.jalo;

import com.sap.hybris.crm.constants.YsapreturnprocessConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.sap.hybris.crm.jalo.SAPReturnOrderReason SAPReturnOrderReason}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPReturnOrderReason extends GenericItem
{
	/** Qualifier of the <code>SAPReturnOrderReason.sapConfiguration</code> attribute **/
	public static final String SAPCONFIGURATION = "sapConfiguration";
	/** Qualifier of the <code>SAPReturnOrderReason.refundReason</code> attribute **/
	public static final String REFUNDREASON = "refundReason";
	/** Qualifier of the <code>SAPReturnOrderReason.sapReturnReasonCode</code> attribute **/
	public static final String SAPRETURNREASONCODE = "sapReturnReasonCode";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SAPCONFIGURATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSAPReturnOrderReason> SAPCONFIGURATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedSAPReturnOrderReason>(
	YsapreturnprocessConstants.TC.SAPRETURNORDERREASON,
	false,
	"sapConfiguration",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SAPCONFIGURATION, AttributeMode.INITIAL);
		tmp.put(REFUNDREASON, AttributeMode.INITIAL);
		tmp.put(SAPRETURNREASONCODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SAPCONFIGURATIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPReturnOrderReason.refundReason</code> attribute.
	 * @return the refundReason
	 */
	public EnumerationValue getRefundReason(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, REFUNDREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPReturnOrderReason.refundReason</code> attribute.
	 * @return the refundReason
	 */
	public EnumerationValue getRefundReason()
	{
		return getRefundReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPReturnOrderReason.refundReason</code> attribute. 
	 * @param value the refundReason
	 */
	public void setRefundReason(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, REFUNDREASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPReturnOrderReason.refundReason</code> attribute. 
	 * @param value the refundReason
	 */
	public void setRefundReason(final EnumerationValue value)
	{
		setRefundReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPReturnOrderReason.sapConfiguration</code> attribute.
	 * @return the sapConfiguration
	 */
	public SAPConfiguration getSapConfiguration(final SessionContext ctx)
	{
		return (SAPConfiguration)getProperty( ctx, SAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPReturnOrderReason.sapConfiguration</code> attribute.
	 * @return the sapConfiguration
	 */
	public SAPConfiguration getSapConfiguration()
	{
		return getSapConfiguration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPReturnOrderReason.sapConfiguration</code> attribute. 
	 * @param value the sapConfiguration
	 */
	protected void setSapConfiguration(final SessionContext ctx, final SAPConfiguration value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+SAPCONFIGURATION+"' is not changeable", 0 );
		}
		SAPCONFIGURATIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPReturnOrderReason.sapConfiguration</code> attribute. 
	 * @param value the sapConfiguration
	 */
	protected void setSapConfiguration(final SAPConfiguration value)
	{
		setSapConfiguration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPReturnOrderReason.sapReturnReasonCode</code> attribute.
	 * @return the sapReturnReasonCode
	 */
	public String getSapReturnReasonCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPRETURNREASONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPReturnOrderReason.sapReturnReasonCode</code> attribute.
	 * @return the sapReturnReasonCode
	 */
	public String getSapReturnReasonCode()
	{
		return getSapReturnReasonCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPReturnOrderReason.sapReturnReasonCode</code> attribute. 
	 * @param value the sapReturnReasonCode
	 */
	public void setSapReturnReasonCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPRETURNREASONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPReturnOrderReason.sapReturnReasonCode</code> attribute. 
	 * @param value the sapReturnReasonCode
	 */
	public void setSapReturnReasonCode(final String value)
	{
		setSapReturnReasonCode( getSession().getSessionContext(), value );
	}
	
}
