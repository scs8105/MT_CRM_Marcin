/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.sapcrmcategoryschema.jalo;

import com.sap.hybris.crm.sapcrmcategoryschema.constants.SapcrmcategoryschemaConstants;
import com.sap.hybris.crm.sapcrmcategoryschema.jalo.CategorizationCategory;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CategorySchema}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCategorySchema extends GenericItem
{
	/** Qualifier of the <code>CategorySchema.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>CategorySchema.level</code> attribute **/
	public static final String LEVEL = "level";
	/** Qualifier of the <code>CategorySchema.sourceCategory</code> attribute **/
	public static final String SOURCECATEGORY = "sourceCategory";
	/** Qualifier of the <code>CategorySchema.parentCategory</code> attribute **/
	public static final String PARENTCATEGORY = "parentCategory";
	/** Qualifier of the <code>CategorySchema.path</code> attribute **/
	public static final String PATH = "path";
	/** Qualifier of the <code>CategorySchema.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>CategorySchema.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>CategorySchema.catalogName</code> attribute **/
	public static final String CATALOGNAME = "catalogName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(LEVEL, AttributeMode.INITIAL);
		tmp.put(SOURCECATEGORY, AttributeMode.INITIAL);
		tmp.put(PARENTCATEGORY, AttributeMode.INITIAL);
		tmp.put(PATH, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(CATALOGNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.catalogName</code> attribute.
	 * @return the catalogName
	 */
	public String getCatalogName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CATALOGNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.catalogName</code> attribute.
	 * @return the catalogName
	 */
	public String getCatalogName()
	{
		return getCatalogName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.catalogName</code> attribute. 
	 * @param value the catalogName
	 */
	public void setCatalogName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CATALOGNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.catalogName</code> attribute. 
	 * @param value the catalogName
	 */
	public void setCatalogName(final String value)
	{
		setCatalogName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.code</code> attribute.
	 * @return the code - Determines code for schema
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.code</code> attribute.
	 * @return the code - Determines code for schema
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.code</code> attribute. 
	 * @param value the code - Determines code for schema
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.code</code> attribute. 
	 * @param value the code - Determines code for schema
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.level</code> attribute.
	 * @return the level - Category Level
	 */
	public Integer getLevel(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.level</code> attribute.
	 * @return the level - Category Level
	 */
	public Integer getLevel()
	{
		return getLevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.level</code> attribute. 
	 * @return the level - Category Level
	 */
	public int getLevelAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLevel( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.level</code> attribute. 
	 * @return the level - Category Level
	 */
	public int getLevelAsPrimitive()
	{
		return getLevelAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.level</code> attribute. 
	 * @param value the level - Category Level
	 */
	public void setLevel(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.level</code> attribute. 
	 * @param value the level - Category Level
	 */
	public void setLevel(final Integer value)
	{
		setLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.level</code> attribute. 
	 * @param value the level - Category Level
	 */
	public void setLevel(final SessionContext ctx, final int value)
	{
		setLevel( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.level</code> attribute. 
	 * @param value the level - Category Level
	 */
	public void setLevel(final int value)
	{
		setLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.parentCategory</code> attribute.
	 * @return the parentCategory
	 */
	public CategorizationCategory getParentCategory(final SessionContext ctx)
	{
		return (CategorizationCategory)getProperty( ctx, PARENTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.parentCategory</code> attribute.
	 * @return the parentCategory
	 */
	public CategorizationCategory getParentCategory()
	{
		return getParentCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.parentCategory</code> attribute. 
	 * @param value the parentCategory
	 */
	public void setParentCategory(final SessionContext ctx, final CategorizationCategory value)
	{
		setProperty(ctx, PARENTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.parentCategory</code> attribute. 
	 * @param value the parentCategory
	 */
	public void setParentCategory(final CategorizationCategory value)
	{
		setParentCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.path</code> attribute.
	 * @return the path
	 */
	public String getPath(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PATH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.path</code> attribute.
	 * @return the path
	 */
	public String getPath()
	{
		return getPath( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.path</code> attribute. 
	 * @param value the path
	 */
	public void setPath(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PATH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.path</code> attribute. 
	 * @param value the path
	 */
	public void setPath(final String value)
	{
		setPath( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.sourceCategory</code> attribute.
	 * @return the sourceCategory
	 */
	public CategorizationCategory getSourceCategory(final SessionContext ctx)
	{
		return (CategorizationCategory)getProperty( ctx, SOURCECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.sourceCategory</code> attribute.
	 * @return the sourceCategory
	 */
	public CategorizationCategory getSourceCategory()
	{
		return getSourceCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.sourceCategory</code> attribute. 
	 * @param value the sourceCategory
	 */
	public void setSourceCategory(final SessionContext ctx, final CategorizationCategory value)
	{
		setProperty(ctx, SOURCECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.sourceCategory</code> attribute. 
	 * @param value the sourceCategory
	 */
	public void setSourceCategory(final CategorizationCategory value)
	{
		setSourceCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySchema.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategorySchema.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
