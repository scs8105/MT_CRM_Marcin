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
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.sap.hybris.crm.contract.jalo.SAPContractStatus SAPStatus}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPContractStatus extends GenericItem
{
	/** Qualifier of the <code>SAPStatus.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>SAPStatus.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>SAPStatus.statusProfile</code> attribute **/
	public static final String STATUSPROFILE = "statusProfile";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(STATUSPROFILE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPStatus.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPStatus.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPStatus.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPStatus.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPStatus.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSAPContractStatus.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPStatus.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPStatus.description</code> attribute. 
	 * @return the localized description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPStatus.description</code> attribute. 
	 * @return the localized description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPStatus.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSAPContractStatus.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPStatus.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPStatus.description</code> attribute. 
	 * @param value the description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPStatus.description</code> attribute. 
	 * @param value the description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPStatus.statusProfile</code> attribute.
	 * @return the statusProfile
	 */
	public String getStatusProfile(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATUSPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPStatus.statusProfile</code> attribute.
	 * @return the statusProfile
	 */
	public String getStatusProfile()
	{
		return getStatusProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPStatus.statusProfile</code> attribute. 
	 * @param value the statusProfile
	 */
	public void setStatusProfile(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATUSPROFILE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPStatus.statusProfile</code> attribute. 
	 * @param value the statusProfile
	 */
	public void setStatusProfile(final String value)
	{
		setStatusProfile( getSession().getSessionContext(), value );
	}
	
}
