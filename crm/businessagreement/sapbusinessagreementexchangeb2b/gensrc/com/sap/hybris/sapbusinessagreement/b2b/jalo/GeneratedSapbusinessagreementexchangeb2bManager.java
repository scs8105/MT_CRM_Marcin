/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapbusinessagreement.b2b.jalo;

import com.sap.hybris.sapbusinessagreement.b2b.constants.Sapbusinessagreementexchangeb2bConstants;
import com.sap.hybris.sapbusinessagreement.constants.SapbusinessagreementexchangeConstants;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreement;
import com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreementPartners;
import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.commerceservices.jalo.OrgUnit;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>Sapbusinessagreementexchangeb2bManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapbusinessagreementexchangeb2bManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n BUSINESSAGREEMENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BusinessAgreement> BUSINESSAGB2BUNITRELATIONBUSINESSAGREEMENTHANDLER = new OneToManyHandler<BusinessAgreement>(
	SapbusinessagreementexchangeConstants.TC.BUSINESSAGREEMENT,
	true,
	"partner",
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
		tmp.put("partnerguid2", AttributeMode.INITIAL);
		ttmp.put("com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreementPartners", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("partner", AttributeMode.INITIAL);
		ttmp.put("com.sap.hybris.sapbusinessagreement.jalo.BusinessAgreement", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.businessagreement</code> attribute.
	 * @return the businessagreement - Business Agreement Header
	 */
	public Set<BusinessAgreement> getBusinessagreement(final SessionContext ctx, final B2BUnit item)
	{
		return (Set<BusinessAgreement>)BUSINESSAGB2BUNITRELATIONBUSINESSAGREEMENTHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnit.businessagreement</code> attribute.
	 * @return the businessagreement - Business Agreement Header
	 */
	public Set<BusinessAgreement> getBusinessagreement(final B2BUnit item)
	{
		return getBusinessagreement( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.businessagreement</code> attribute. 
	 * @param value the businessagreement - Business Agreement Header
	 */
	public void setBusinessagreement(final SessionContext ctx, final B2BUnit item, final Set<BusinessAgreement> value)
	{
		BUSINESSAGB2BUNITRELATIONBUSINESSAGREEMENTHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUnit.businessagreement</code> attribute. 
	 * @param value the businessagreement - Business Agreement Header
	 */
	public void setBusinessagreement(final B2BUnit item, final Set<BusinessAgreement> value)
	{
		setBusinessagreement( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessagreement. 
	 * @param value the item to add to businessagreement - Business Agreement Header
	 */
	public void addToBusinessagreement(final SessionContext ctx, final B2BUnit item, final BusinessAgreement value)
	{
		BUSINESSAGB2BUNITRELATIONBUSINESSAGREEMENTHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessagreement. 
	 * @param value the item to add to businessagreement - Business Agreement Header
	 */
	public void addToBusinessagreement(final B2BUnit item, final BusinessAgreement value)
	{
		addToBusinessagreement( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessagreement. 
	 * @param value the item to remove from businessagreement - Business Agreement Header
	 */
	public void removeFromBusinessagreement(final SessionContext ctx, final B2BUnit item, final BusinessAgreement value)
	{
		BUSINESSAGB2BUNITRELATIONBUSINESSAGREEMENTHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessagreement. 
	 * @param value the item to remove from businessagreement - Business Agreement Header
	 */
	public void removeFromBusinessagreement(final B2BUnit item, final BusinessAgreement value)
	{
		removeFromBusinessagreement( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return Sapbusinessagreementexchangeb2bConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.partner</code> attribute.
	 * @return the partner - Business Agreement
	 */
	public B2BUnit getPartner(final SessionContext ctx, final GenericItem item)
	{
		return (B2BUnit)item.getProperty( ctx, Sapbusinessagreementexchangeb2bConstants.Attributes.BusinessAgreement.PARTNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreement.partner</code> attribute.
	 * @return the partner - Business Agreement
	 */
	public B2BUnit getPartner(final BusinessAgreement item)
	{
		return getPartner( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.partner</code> attribute. 
	 * @param value the partner - Business Agreement
	 */
	public void setPartner(final SessionContext ctx, final GenericItem item, final B2BUnit value)
	{
		item.setProperty(ctx, Sapbusinessagreementexchangeb2bConstants.Attributes.BusinessAgreement.PARTNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreement.partner</code> attribute. 
	 * @param value the partner - Business Agreement
	 */
	public void setPartner(final BusinessAgreement item, final B2BUnit value)
	{
		setPartner( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.partnerguid2</code> attribute.
	 * @return the partnerguid2 - Secondary Partner GUID
	 */
	public B2BUnit getPartnerguid2(final SessionContext ctx, final GenericItem item)
	{
		return (B2BUnit)item.getProperty( ctx, Sapbusinessagreementexchangeb2bConstants.Attributes.BusinessAgreementPartners.PARTNERGUID2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessAgreementPartners.partnerguid2</code> attribute.
	 * @return the partnerguid2 - Secondary Partner GUID
	 */
	public B2BUnit getPartnerguid2(final BusinessAgreementPartners item)
	{
		return getPartnerguid2( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.partnerguid2</code> attribute. 
	 * @param value the partnerguid2 - Secondary Partner GUID
	 */
	public void setPartnerguid2(final SessionContext ctx, final GenericItem item, final B2BUnit value)
	{
		item.setProperty(ctx, Sapbusinessagreementexchangeb2bConstants.Attributes.BusinessAgreementPartners.PARTNERGUID2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessAgreementPartners.partnerguid2</code> attribute. 
	 * @param value the partnerguid2 - Secondary Partner GUID
	 */
	public void setPartnerguid2(final BusinessAgreementPartners item, final B2BUnit value)
	{
		setPartnerguid2( getSession().getSessionContext(), item, value );
	}
	
}
