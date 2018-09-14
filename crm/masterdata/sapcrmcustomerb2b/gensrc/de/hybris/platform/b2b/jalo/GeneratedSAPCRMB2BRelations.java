/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.b2b.jalo;

import com.sap.hybris.sapcrmcustomerb2b.constants.Sapcrmcustomerb2bConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.b2b.jalo.SAPCRMB2BRelations SAPCRMB2BRelations}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPCRMB2BRelations extends GenericItem
{
	/** Qualifier of the <code>SAPCRMB2BRelations.source</code> attribute **/
	public static final String SOURCE = "source";
	/** Qualifier of the <code>SAPCRMB2BRelations.target</code> attribute **/
	public static final String TARGET = "target";
	/** Qualifier of the <code>SAPCRMB2BRelations.addressUsage</code> attribute **/
	public static final String ADDRESSUSAGE = "addressUsage";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SOURCE, AttributeMode.INITIAL);
		tmp.put(TARGET, AttributeMode.INITIAL);
		tmp.put(ADDRESSUSAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCRMB2BRelations.addressUsage</code> attribute.
	 * @return the addressUsage - Usage Of Source Address in Target
	 */
	public String getAddressUsage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESSUSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCRMB2BRelations.addressUsage</code> attribute.
	 * @return the addressUsage - Usage Of Source Address in Target
	 */
	public String getAddressUsage()
	{
		return getAddressUsage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCRMB2BRelations.addressUsage</code> attribute. 
	 * @param value the addressUsage - Usage Of Source Address in Target
	 */
	public void setAddressUsage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESSUSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCRMB2BRelations.addressUsage</code> attribute. 
	 * @param value the addressUsage - Usage Of Source Address in Target
	 */
	public void setAddressUsage(final String value)
	{
		setAddressUsage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCRMB2BRelations.source</code> attribute.
	 * @return the source - Source B2BUnit
	 */
	public String getSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCRMB2BRelations.source</code> attribute.
	 * @return the source - Source B2BUnit
	 */
	public String getSource()
	{
		return getSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCRMB2BRelations.source</code> attribute. 
	 * @param value the source - Source B2BUnit
	 */
	public void setSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCRMB2BRelations.source</code> attribute. 
	 * @param value the source - Source B2BUnit
	 */
	public void setSource(final String value)
	{
		setSource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCRMB2BRelations.target</code> attribute.
	 * @return the target - Target B2BUnit
	 */
	public String getTarget(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TARGET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCRMB2BRelations.target</code> attribute.
	 * @return the target - Target B2BUnit
	 */
	public String getTarget()
	{
		return getTarget( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCRMB2BRelations.target</code> attribute. 
	 * @param value the target - Target B2BUnit
	 */
	public void setTarget(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TARGET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPCRMB2BRelations.target</code> attribute. 
	 * @param value the target - Target B2BUnit
	 */
	public void setTarget(final String value)
	{
		setTarget( getSession().getSessionContext(), value );
	}
	
}
