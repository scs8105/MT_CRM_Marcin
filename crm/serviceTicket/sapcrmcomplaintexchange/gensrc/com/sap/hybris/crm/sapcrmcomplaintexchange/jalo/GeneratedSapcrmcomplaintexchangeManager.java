/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmcomplaintexchange.jalo;

import com.sap.hybris.crm.sapcrmcomplaintexchange.constants.SapcrmcomplaintexchangeConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.ticket.jalo.CsTicket;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>SapcrmcomplaintexchangeManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcrmcomplaintexchangeManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("associatedOrderEntries", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.ticket.jalo.CsTicket", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("comp_serviceOrg", AttributeMode.INITIAL);
		tmp.put("comp_serviceOrgResp", AttributeMode.INITIAL);
		tmp.put("comp_processType", AttributeMode.INITIAL);
		tmp.put("comp_servOrgShort", AttributeMode.INITIAL);
		tmp.put("complaintCatagoryCatalogType", AttributeMode.INITIAL);
		tmp.put("complaintCatagoryCodeGroup", AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>CsTicket.associatedOrderEntries</code> attribute.
	 * @return the associatedOrderEntries
	 */
	public List<AbstractOrderEntry> getAssociatedOrderEntries(final SessionContext ctx, final CsTicket item)
	{
		List<AbstractOrderEntry> coll = (List<AbstractOrderEntry>)item.getProperty( ctx, SapcrmcomplaintexchangeConstants.Attributes.CsTicket.ASSOCIATEDORDERENTRIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicket.associatedOrderEntries</code> attribute.
	 * @return the associatedOrderEntries
	 */
	public List<AbstractOrderEntry> getAssociatedOrderEntries(final CsTicket item)
	{
		return getAssociatedOrderEntries( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.associatedOrderEntries</code> attribute. 
	 * @param value the associatedOrderEntries
	 */
	public void setAssociatedOrderEntries(final SessionContext ctx, final CsTicket item, final List<AbstractOrderEntry> value)
	{
		item.setProperty(ctx, SapcrmcomplaintexchangeConstants.Attributes.CsTicket.ASSOCIATEDORDERENTRIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CsTicket.associatedOrderEntries</code> attribute. 
	 * @param value the associatedOrderEntries
	 */
	public void setAssociatedOrderEntries(final CsTicket item, final List<AbstractOrderEntry> value)
	{
		setAssociatedOrderEntries( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.comp_processType</code> attribute.
	 * @return the comp_processType - Service Transaction Type
	 */
	public String getComp_processType(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmcomplaintexchangeConstants.Attributes.SAPConfiguration.COMP_PROCESSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.comp_processType</code> attribute.
	 * @return the comp_processType - Service Transaction Type
	 */
	public String getComp_processType(final SAPConfiguration item)
	{
		return getComp_processType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.comp_processType</code> attribute. 
	 * @param value the comp_processType - Service Transaction Type
	 */
	public void setComp_processType(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmcomplaintexchangeConstants.Attributes.SAPConfiguration.COMP_PROCESSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.comp_processType</code> attribute. 
	 * @param value the comp_processType - Service Transaction Type
	 */
	public void setComp_processType(final SAPConfiguration item, final String value)
	{
		setComp_processType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.comp_serviceOrg</code> attribute.
	 * @return the comp_serviceOrg - Service org
	 */
	public String getComp_serviceOrg(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmcomplaintexchangeConstants.Attributes.SAPConfiguration.COMP_SERVICEORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.comp_serviceOrg</code> attribute.
	 * @return the comp_serviceOrg - Service org
	 */
	public String getComp_serviceOrg(final SAPConfiguration item)
	{
		return getComp_serviceOrg( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.comp_serviceOrg</code> attribute. 
	 * @param value the comp_serviceOrg - Service org
	 */
	public void setComp_serviceOrg(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmcomplaintexchangeConstants.Attributes.SAPConfiguration.COMP_SERVICEORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.comp_serviceOrg</code> attribute. 
	 * @param value the comp_serviceOrg - Service org
	 */
	public void setComp_serviceOrg(final SAPConfiguration item, final String value)
	{
		setComp_serviceOrg( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.comp_serviceOrgResp</code> attribute.
	 * @return the comp_serviceOrgResp - Service org Responsible
	 */
	public String getComp_serviceOrgResp(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmcomplaintexchangeConstants.Attributes.SAPConfiguration.COMP_SERVICEORGRESP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.comp_serviceOrgResp</code> attribute.
	 * @return the comp_serviceOrgResp - Service org Responsible
	 */
	public String getComp_serviceOrgResp(final SAPConfiguration item)
	{
		return getComp_serviceOrgResp( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.comp_serviceOrgResp</code> attribute. 
	 * @param value the comp_serviceOrgResp - Service org Responsible
	 */
	public void setComp_serviceOrgResp(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmcomplaintexchangeConstants.Attributes.SAPConfiguration.COMP_SERVICEORGRESP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.comp_serviceOrgResp</code> attribute. 
	 * @param value the comp_serviceOrgResp - Service org Responsible
	 */
	public void setComp_serviceOrgResp(final SAPConfiguration item, final String value)
	{
		setComp_serviceOrgResp( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.comp_servOrgShort</code> attribute.
	 * @return the comp_servOrgShort - Service Org Short
	 */
	public String getComp_servOrgShort(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmcomplaintexchangeConstants.Attributes.SAPConfiguration.COMP_SERVORGSHORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.comp_servOrgShort</code> attribute.
	 * @return the comp_servOrgShort - Service Org Short
	 */
	public String getComp_servOrgShort(final SAPConfiguration item)
	{
		return getComp_servOrgShort( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.comp_servOrgShort</code> attribute. 
	 * @param value the comp_servOrgShort - Service Org Short
	 */
	public void setComp_servOrgShort(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmcomplaintexchangeConstants.Attributes.SAPConfiguration.COMP_SERVORGSHORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.comp_servOrgShort</code> attribute. 
	 * @param value the comp_servOrgShort - Service Org Short
	 */
	public void setComp_servOrgShort(final SAPConfiguration item, final String value)
	{
		setComp_servOrgShort( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.complaintCatagoryCatalogType</code> attribute.
	 * @return the complaintCatagoryCatalogType - Category Catalog name for Complaint
	 */
	public String getComplaintCatagoryCatalogType(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmcomplaintexchangeConstants.Attributes.SAPConfiguration.COMPLAINTCATAGORYCATALOGTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.complaintCatagoryCatalogType</code> attribute.
	 * @return the complaintCatagoryCatalogType - Category Catalog name for Complaint
	 */
	public String getComplaintCatagoryCatalogType(final SAPConfiguration item)
	{
		return getComplaintCatagoryCatalogType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.complaintCatagoryCatalogType</code> attribute. 
	 * @param value the complaintCatagoryCatalogType - Category Catalog name for Complaint
	 */
	public void setComplaintCatagoryCatalogType(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmcomplaintexchangeConstants.Attributes.SAPConfiguration.COMPLAINTCATAGORYCATALOGTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.complaintCatagoryCatalogType</code> attribute. 
	 * @param value the complaintCatagoryCatalogType - Category Catalog name for Complaint
	 */
	public void setComplaintCatagoryCatalogType(final SAPConfiguration item, final String value)
	{
		setComplaintCatagoryCatalogType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.complaintCatagoryCodeGroup</code> attribute.
	 * @return the complaintCatagoryCodeGroup - Crm schema id for Complaint
	 */
	public String getComplaintCatagoryCodeGroup(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapcrmcomplaintexchangeConstants.Attributes.SAPConfiguration.COMPLAINTCATAGORYCODEGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.complaintCatagoryCodeGroup</code> attribute.
	 * @return the complaintCatagoryCodeGroup - Crm schema id for Complaint
	 */
	public String getComplaintCatagoryCodeGroup(final SAPConfiguration item)
	{
		return getComplaintCatagoryCodeGroup( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.complaintCatagoryCodeGroup</code> attribute. 
	 * @param value the complaintCatagoryCodeGroup - Crm schema id for Complaint
	 */
	public void setComplaintCatagoryCodeGroup(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapcrmcomplaintexchangeConstants.Attributes.SAPConfiguration.COMPLAINTCATAGORYCODEGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.complaintCatagoryCodeGroup</code> attribute. 
	 * @param value the complaintCatagoryCodeGroup - Crm schema id for Complaint
	 */
	public void setComplaintCatagoryCodeGroup(final SAPConfiguration item, final String value)
	{
		setComplaintCatagoryCodeGroup( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return SapcrmcomplaintexchangeConstants.EXTENSIONNAME;
	}
	
}
