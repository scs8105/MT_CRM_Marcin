/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmticketsystem.jalo;

import com.sap.hybris.crm.sapcrmticketsystem.constants.SapcrmticketsystemConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.ticket.jalo.CsTicket;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CsTicketRelatedObject}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCsTicketRelatedObject extends GenericItem
{
	/** Qualifier of the <code>CsTicketRelatedObject.objectId</code> attribute **/
	public static final String OBJECTID = "objectId";
	/** Qualifier of the <code>CsTicketRelatedObject.ObjectGuid</code> attribute **/
	public static final String OBJECTGUID = "ObjectGuid";
	/** Qualifier of the <code>CsTicketRelatedObject.ObjectType</code> attribute **/
	public static final String OBJECTTYPE = "ObjectType";
	/** Qualifier of the <code>CsTicketRelatedObject.CsTicket</code> attribute **/
	public static final String CSTICKET = "CsTicket";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CSTICKET's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCsTicketRelatedObject> CSTICKETHANDLER = new BidirectionalOneToManyHandler<GeneratedCsTicketRelatedObject>(
	SapcrmticketsystemConstants.TC.CSTICKETRELATEDOBJECT,
	false,
	"CsTicket",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(OBJECTID, AttributeMode.INITIAL);
		tmp.put(OBJECTGUID, AttributeMode.INITIAL);
		tmp.put(OBJECTTYPE, AttributeMode.INITIAL);
		tmp.put(CSTICKET, AttributeMode.INITIAL);
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
		CSTICKETHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketRelatedObject.CsTicket</code> attribute.
	 * @return the CsTicket
	 */
	public CsTicket getCsTicket(final SessionContext ctx)
	{
		return (CsTicket)getProperty( ctx, CSTICKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketRelatedObject.CsTicket</code> attribute.
	 * @return the CsTicket
	 */
	public CsTicket getCsTicket()
	{
		return getCsTicket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicketRelatedObject.CsTicket</code> attribute. 
	 * @param value the CsTicket
	 */
	public void setCsTicket(final SessionContext ctx, final CsTicket value)
	{
		CSTICKETHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicketRelatedObject.CsTicket</code> attribute. 
	 * @param value the CsTicket
	 */
	public void setCsTicket(final CsTicket value)
	{
		setCsTicket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketRelatedObject.ObjectGuid</code> attribute.
	 * @return the ObjectGuid
	 */
	public String getObjectGuid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OBJECTGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketRelatedObject.ObjectGuid</code> attribute.
	 * @return the ObjectGuid
	 */
	public String getObjectGuid()
	{
		return getObjectGuid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicketRelatedObject.ObjectGuid</code> attribute. 
	 * @param value the ObjectGuid
	 */
	public void setObjectGuid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OBJECTGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicketRelatedObject.ObjectGuid</code> attribute. 
	 * @param value the ObjectGuid
	 */
	public void setObjectGuid(final String value)
	{
		setObjectGuid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketRelatedObject.objectId</code> attribute.
	 * @return the objectId - My Example Initial String Value
	 */
	public String getObjectId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OBJECTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketRelatedObject.objectId</code> attribute.
	 * @return the objectId - My Example Initial String Value
	 */
	public String getObjectId()
	{
		return getObjectId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicketRelatedObject.objectId</code> attribute. 
	 * @param value the objectId - My Example Initial String Value
	 */
	public void setObjectId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OBJECTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicketRelatedObject.objectId</code> attribute. 
	 * @param value the objectId - My Example Initial String Value
	 */
	public void setObjectId(final String value)
	{
		setObjectId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketRelatedObject.ObjectType</code> attribute.
	 * @return the ObjectType
	 */
	public String getObjectType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OBJECTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketRelatedObject.ObjectType</code> attribute.
	 * @return the ObjectType
	 */
	public String getObjectType()
	{
		return getObjectType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicketRelatedObject.ObjectType</code> attribute. 
	 * @param value the ObjectType
	 */
	public void setObjectType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OBJECTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicketRelatedObject.ObjectType</code> attribute. 
	 * @param value the ObjectType
	 */
	public void setObjectType(final String value)
	{
		setObjectType( getSession().getSessionContext(), value );
	}
	
}
