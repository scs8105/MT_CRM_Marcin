/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.jalo;

import com.sap.hybris.crm.constants.YsapreturnprocessConstants;
import com.sap.hybris.crm.jalo.SAPReturnOrderReason;
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
import de.hybris.platform.returns.jalo.ReturnRequest;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>YsapreturnprocessManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedYsapreturnprocessManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n SAPRETURNREASONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SAPReturnOrderReason> SAPCONFIGRETURNREASONRELATIONSAPRETURNREASONSHANDLER = new OneToManyHandler<SAPReturnOrderReason>(
	YsapreturnprocessConstants.TC.SAPRETURNORDERREASON,
	false,
	"sapConfiguration",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("deliveryDocNumber", AttributeMode.INITIAL);
		tmp.put("creditMemoNumber", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.returns.jalo.ReturnRequest", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("returnOrderProcesstype", AttributeMode.INITIAL);
		tmp.put("creditMemoProcesstype", AttributeMode.INITIAL);
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
	
	public SAPReturnOrderReason createSAPReturnOrderReason(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YsapreturnprocessConstants.TC.SAPRETURNORDERREASON );
			return (SAPReturnOrderReason)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPReturnOrderReason : "+e.getMessage(), 0 );
		}
	}
	
	public SAPReturnOrderReason createSAPReturnOrderReason(final Map attributeValues)
	{
		return createSAPReturnOrderReason( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnRequest.creditMemoNumber</code> attribute.
	 * @return the creditMemoNumber - holds credit memo number from CRM system
	 */
	public String getCreditMemoNumber(final SessionContext ctx, final ReturnRequest item)
	{
		return (String)item.getProperty( ctx, YsapreturnprocessConstants.Attributes.ReturnRequest.CREDITMEMONUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnRequest.creditMemoNumber</code> attribute.
	 * @return the creditMemoNumber - holds credit memo number from CRM system
	 */
	public String getCreditMemoNumber(final ReturnRequest item)
	{
		return getCreditMemoNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnRequest.creditMemoNumber</code> attribute. 
	 * @param value the creditMemoNumber - holds credit memo number from CRM system
	 */
	public void setCreditMemoNumber(final SessionContext ctx, final ReturnRequest item, final String value)
	{
		item.setProperty(ctx, YsapreturnprocessConstants.Attributes.ReturnRequest.CREDITMEMONUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnRequest.creditMemoNumber</code> attribute. 
	 * @param value the creditMemoNumber - holds credit memo number from CRM system
	 */
	public void setCreditMemoNumber(final ReturnRequest item, final String value)
	{
		setCreditMemoNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.creditMemoProcesstype</code> attribute.
	 * @return the creditMemoProcesstype - crm return order process type
	 */
	public String getCreditMemoProcesstype(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, YsapreturnprocessConstants.Attributes.SAPConfiguration.CREDITMEMOPROCESSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.creditMemoProcesstype</code> attribute.
	 * @return the creditMemoProcesstype - crm return order process type
	 */
	public String getCreditMemoProcesstype(final SAPConfiguration item)
	{
		return getCreditMemoProcesstype( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.creditMemoProcesstype</code> attribute. 
	 * @param value the creditMemoProcesstype - crm return order process type
	 */
	public void setCreditMemoProcesstype(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, YsapreturnprocessConstants.Attributes.SAPConfiguration.CREDITMEMOPROCESSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.creditMemoProcesstype</code> attribute. 
	 * @param value the creditMemoProcesstype - crm return order process type
	 */
	public void setCreditMemoProcesstype(final SAPConfiguration item, final String value)
	{
		setCreditMemoProcesstype( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnRequest.deliveryDocNumber</code> attribute.
	 * @return the deliveryDocNumber - holds delivery document number from CRM system
	 */
	public String getDeliveryDocNumber(final SessionContext ctx, final ReturnRequest item)
	{
		return (String)item.getProperty( ctx, YsapreturnprocessConstants.Attributes.ReturnRequest.DELIVERYDOCNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnRequest.deliveryDocNumber</code> attribute.
	 * @return the deliveryDocNumber - holds delivery document number from CRM system
	 */
	public String getDeliveryDocNumber(final ReturnRequest item)
	{
		return getDeliveryDocNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnRequest.deliveryDocNumber</code> attribute. 
	 * @param value the deliveryDocNumber - holds delivery document number from CRM system
	 */
	public void setDeliveryDocNumber(final SessionContext ctx, final ReturnRequest item, final String value)
	{
		item.setProperty(ctx, YsapreturnprocessConstants.Attributes.ReturnRequest.DELIVERYDOCNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnRequest.deliveryDocNumber</code> attribute. 
	 * @param value the deliveryDocNumber - holds delivery document number from CRM system
	 */
	public void setDeliveryDocNumber(final ReturnRequest item, final String value)
	{
		setDeliveryDocNumber( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return YsapreturnprocessConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.returnOrderProcesstype</code> attribute.
	 * @return the returnOrderProcesstype - crm return order process type
	 */
	public String getReturnOrderProcesstype(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, YsapreturnprocessConstants.Attributes.SAPConfiguration.RETURNORDERPROCESSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.returnOrderProcesstype</code> attribute.
	 * @return the returnOrderProcesstype - crm return order process type
	 */
	public String getReturnOrderProcesstype(final SAPConfiguration item)
	{
		return getReturnOrderProcesstype( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.returnOrderProcesstype</code> attribute. 
	 * @param value the returnOrderProcesstype - crm return order process type
	 */
	public void setReturnOrderProcesstype(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, YsapreturnprocessConstants.Attributes.SAPConfiguration.RETURNORDERPROCESSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.returnOrderProcesstype</code> attribute. 
	 * @param value the returnOrderProcesstype - crm return order process type
	 */
	public void setReturnOrderProcesstype(final SAPConfiguration item, final String value)
	{
		setReturnOrderProcesstype( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapReturnReasons</code> attribute.
	 * @return the sapReturnReasons
	 */
	public Set<SAPReturnOrderReason> getSapReturnReasons(final SessionContext ctx, final GenericItem item)
	{
		return (Set<SAPReturnOrderReason>)SAPCONFIGRETURNREASONRELATIONSAPRETURNREASONSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapReturnReasons</code> attribute.
	 * @return the sapReturnReasons
	 */
	public Set<SAPReturnOrderReason> getSapReturnReasons(final SAPConfiguration item)
	{
		return getSapReturnReasons( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapReturnReasons</code> attribute. 
	 * @param value the sapReturnReasons
	 */
	public void setSapReturnReasons(final SessionContext ctx, final GenericItem item, final Set<SAPReturnOrderReason> value)
	{
		SAPCONFIGRETURNREASONRELATIONSAPRETURNREASONSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapReturnReasons</code> attribute. 
	 * @param value the sapReturnReasons
	 */
	public void setSapReturnReasons(final SAPConfiguration item, final Set<SAPReturnOrderReason> value)
	{
		setSapReturnReasons( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapReturnReasons. 
	 * @param value the item to add to sapReturnReasons
	 */
	public void addToSapReturnReasons(final SessionContext ctx, final GenericItem item, final SAPReturnOrderReason value)
	{
		SAPCONFIGRETURNREASONRELATIONSAPRETURNREASONSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapReturnReasons. 
	 * @param value the item to add to sapReturnReasons
	 */
	public void addToSapReturnReasons(final SAPConfiguration item, final SAPReturnOrderReason value)
	{
		addToSapReturnReasons( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapReturnReasons. 
	 * @param value the item to remove from sapReturnReasons
	 */
	public void removeFromSapReturnReasons(final SessionContext ctx, final GenericItem item, final SAPReturnOrderReason value)
	{
		SAPCONFIGRETURNREASONRELATIONSAPRETURNREASONSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapReturnReasons. 
	 * @param value the item to remove from sapReturnReasons
	 */
	public void removeFromSapReturnReasons(final SAPConfiguration item, final SAPReturnOrderReason value)
	{
		removeFromSapReturnReasons( getSession().getSessionContext(), item, value );
	}
	
}
