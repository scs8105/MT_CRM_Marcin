/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmcategoryschema.jalo;

import com.sap.hybris.crm.sapcrmcategoryschema.constants.SapcrmcategoryschemaConstants;
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CategorizationCategory}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCategorizationCategory extends GenericItem
{
	/** Qualifier of the <code>CategorizationCategory.categorizationGuid</code> attribute **/
	public static final String CATEGORIZATIONGUID = "categorizationGuid";
	/** Qualifier of the <code>CategorizationCategory.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>CategorizationCategory.name</code> attribute **/
	public static final String NAME = "name";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CATEGORIZATIONGUID, AttributeMode.INITIAL);
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorizationCategory.categorizationGuid</code> attribute.
	 * @return the categorizationGuid - Determines category guid
	 */
	public String getCategorizationGuid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CATEGORIZATIONGUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorizationCategory.categorizationGuid</code> attribute.
	 * @return the categorizationGuid - Determines category guid
	 */
	public String getCategorizationGuid()
	{
		return getCategorizationGuid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorizationCategory.categorizationGuid</code> attribute. 
	 * @param value the categorizationGuid - Determines category guid
	 */
	public void setCategorizationGuid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CATEGORIZATIONGUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorizationCategory.categorizationGuid</code> attribute. 
	 * @param value the categorizationGuid - Determines category guid
	 */
	public void setCategorizationGuid(final String value)
	{
		setCategorizationGuid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorizationCategory.code</code> attribute.
	 * @return the code - Determines category code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorizationCategory.code</code> attribute.
	 * @return the code - Determines category code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorizationCategory.code</code> attribute. 
	 * @param value the code - Determines category code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorizationCategory.code</code> attribute. 
	 * @param value the code - Determines category code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorizationCategory.name</code> attribute.
	 * @return the name - Determines category name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCategorizationCategory.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorizationCategory.name</code> attribute.
	 * @return the name - Determines category name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorizationCategory.name</code> attribute. 
	 * @return the localized name - Determines category name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorizationCategory.name</code> attribute. 
	 * @return the localized name - Determines category name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorizationCategory.name</code> attribute. 
	 * @param value the name - Determines category name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCategorizationCategory.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorizationCategory.name</code> attribute. 
	 * @param value the name - Determines category name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorizationCategory.name</code> attribute. 
	 * @param value the name - Determines category name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorizationCategory.name</code> attribute. 
	 * @param value the name - Determines category name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
}
