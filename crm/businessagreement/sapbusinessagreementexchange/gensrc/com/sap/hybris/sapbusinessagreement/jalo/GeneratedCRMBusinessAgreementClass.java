/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapbusinessagreement.jalo;

import com.sap.hybris.sapbusinessagreement.constants.SapbusinessagreementexchangeConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CRMBusinessAgreementClass}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCRMBusinessAgreementClass extends GenericItem
{
	/** Qualifier of the <code>CRMBusinessAgreementClass.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>CRMBusinessAgreementClass.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>CRMBusinessAgreementClass.numberrange</code> attribute **/
	public static final String NUMBERRANGE = "numberrange";
	/** Qualifier of the <code>CRMBusinessAgreementClass.extnumberrange</code> attribute **/
	public static final String EXTNUMBERRANGE = "extnumberrange";
	/** Qualifier of the <code>CRMBusinessAgreementClass.collectivebill</code> attribute **/
	public static final String COLLECTIVEBILL = "collectivebill";
	/** Qualifier of the <code>CRMBusinessAgreementClass.replicationtoecc</code> attribute **/
	public static final String REPLICATIONTOECC = "replicationtoecc";
	/** Qualifier of the <code>CRMBusinessAgreementClass.text</code> attribute **/
	public static final String TEXT = "text";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(NUMBERRANGE, AttributeMode.INITIAL);
		tmp.put(EXTNUMBERRANGE, AttributeMode.INITIAL);
		tmp.put(COLLECTIVEBILL, AttributeMode.INITIAL);
		tmp.put(REPLICATIONTOECC, AttributeMode.INITIAL);
		tmp.put(TEXT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.code</code> attribute.
	 * @return the code - businessagreementclass
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.code</code> attribute.
	 * @return the code - businessagreementclass
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.code</code> attribute. 
	 * @param value the code - businessagreementclass
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.code</code> attribute. 
	 * @param value the code - businessagreementclass
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.collectivebill</code> attribute.
	 * @return the collectivebill - Indicator: Business Agreement is usable for Collective Bills
	 */
	public Boolean isCollectivebill(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COLLECTIVEBILL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.collectivebill</code> attribute.
	 * @return the collectivebill - Indicator: Business Agreement is usable for Collective Bills
	 */
	public Boolean isCollectivebill()
	{
		return isCollectivebill( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.collectivebill</code> attribute. 
	 * @return the collectivebill - Indicator: Business Agreement is usable for Collective Bills
	 */
	public boolean isCollectivebillAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCollectivebill( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.collectivebill</code> attribute. 
	 * @return the collectivebill - Indicator: Business Agreement is usable for Collective Bills
	 */
	public boolean isCollectivebillAsPrimitive()
	{
		return isCollectivebillAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.collectivebill</code> attribute. 
	 * @param value the collectivebill - Indicator: Business Agreement is usable for Collective Bills
	 */
	public void setCollectivebill(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COLLECTIVEBILL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.collectivebill</code> attribute. 
	 * @param value the collectivebill - Indicator: Business Agreement is usable for Collective Bills
	 */
	public void setCollectivebill(final Boolean value)
	{
		setCollectivebill( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.collectivebill</code> attribute. 
	 * @param value the collectivebill - Indicator: Business Agreement is usable for Collective Bills
	 */
	public void setCollectivebill(final SessionContext ctx, final boolean value)
	{
		setCollectivebill( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.collectivebill</code> attribute. 
	 * @param value the collectivebill - Indicator: Business Agreement is usable for Collective Bills
	 */
	public void setCollectivebill(final boolean value)
	{
		setCollectivebill( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.country</code> attribute.
	 * @return the country - Country of Company
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.country</code> attribute.
	 * @return the country - Country of Company
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.country</code> attribute. 
	 * @param value the country - Country of Company
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.country</code> attribute. 
	 * @param value the country - Country of Company
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.extnumberrange</code> attribute.
	 * @return the extnumberrange - External Number Range for Business Agreement
	 */
	public String getExtnumberrange(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXTNUMBERRANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.extnumberrange</code> attribute.
	 * @return the extnumberrange - External Number Range for Business Agreement
	 */
	public String getExtnumberrange()
	{
		return getExtnumberrange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.extnumberrange</code> attribute. 
	 * @param value the extnumberrange - External Number Range for Business Agreement
	 */
	public void setExtnumberrange(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXTNUMBERRANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.extnumberrange</code> attribute. 
	 * @param value the extnumberrange - External Number Range for Business Agreement
	 */
	public void setExtnumberrange(final String value)
	{
		setExtnumberrange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.numberrange</code> attribute.
	 * @return the numberrange - Number Range for Internal Number Assignment
	 */
	public String getNumberrange(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBERRANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.numberrange</code> attribute.
	 * @return the numberrange - Number Range for Internal Number Assignment
	 */
	public String getNumberrange()
	{
		return getNumberrange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.numberrange</code> attribute. 
	 * @param value the numberrange - Number Range for Internal Number Assignment
	 */
	public void setNumberrange(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBERRANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.numberrange</code> attribute. 
	 * @param value the numberrange - Number Range for Internal Number Assignment
	 */
	public void setNumberrange(final String value)
	{
		setNumberrange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.replicationtoecc</code> attribute.
	 * @return the replicationtoecc - No Replication to SAP ECC (ERP Central Component)
	 */
	public Boolean isReplicationtoecc(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REPLICATIONTOECC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.replicationtoecc</code> attribute.
	 * @return the replicationtoecc - No Replication to SAP ECC (ERP Central Component)
	 */
	public Boolean isReplicationtoecc()
	{
		return isReplicationtoecc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.replicationtoecc</code> attribute. 
	 * @return the replicationtoecc - No Replication to SAP ECC (ERP Central Component)
	 */
	public boolean isReplicationtoeccAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReplicationtoecc( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.replicationtoecc</code> attribute. 
	 * @return the replicationtoecc - No Replication to SAP ECC (ERP Central Component)
	 */
	public boolean isReplicationtoeccAsPrimitive()
	{
		return isReplicationtoeccAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.replicationtoecc</code> attribute. 
	 * @param value the replicationtoecc - No Replication to SAP ECC (ERP Central Component)
	 */
	public void setReplicationtoecc(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REPLICATIONTOECC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.replicationtoecc</code> attribute. 
	 * @param value the replicationtoecc - No Replication to SAP ECC (ERP Central Component)
	 */
	public void setReplicationtoecc(final Boolean value)
	{
		setReplicationtoecc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.replicationtoecc</code> attribute. 
	 * @param value the replicationtoecc - No Replication to SAP ECC (ERP Central Component)
	 */
	public void setReplicationtoecc(final SessionContext ctx, final boolean value)
	{
		setReplicationtoecc( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.replicationtoecc</code> attribute. 
	 * @param value the replicationtoecc - No Replication to SAP ECC (ERP Central Component)
	 */
	public void setReplicationtoecc(final boolean value)
	{
		setReplicationtoecc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.text</code> attribute.
	 * @return the text - Text for Business Agreement Class
	 */
	public String getText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CRMBusinessAgreementClass.text</code> attribute.
	 * @return the text - Text for Business Agreement Class
	 */
	public String getText()
	{
		return getText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.text</code> attribute. 
	 * @param value the text - Text for Business Agreement Class
	 */
	public void setText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CRMBusinessAgreementClass.text</code> attribute. 
	 * @param value the text - Text for Business Agreement Class
	 */
	public void setText(final String value)
	{
		setText( getSession().getSessionContext(), value );
	}
	
}
