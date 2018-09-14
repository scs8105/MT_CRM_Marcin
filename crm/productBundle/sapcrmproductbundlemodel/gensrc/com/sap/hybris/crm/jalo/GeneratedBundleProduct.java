/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.jalo;

import com.sap.hybris.crm.constants.SapcrmproductbundlemodelConstants;
import com.sap.hybris.crm.jalo.BundleProductGroup;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.configurablebundleservices.jalo.BundleTemplate;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BundleProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBundleProduct extends GenericItem
{
	/** Qualifier of the <code>BundleProduct.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>BundleProduct.bundleTemplate</code> attribute **/
	public static final String BUNDLETEMPLATE = "bundleTemplate";
	/** Qualifier of the <code>BundleProduct.bundleGroup</code> attribute **/
	public static final String BUNDLEGROUP = "bundleGroup";
	/** Qualifier of the <code>BundleProduct.catalogVersion</code> attribute **/
	public static final String CATALOGVERSION = "catalogVersion";
	/** Qualifier of the <code>BundleProduct.default</code> attribute **/
	public static final String DEFAULT = "default";
	/** Qualifier of the <code>BundleProduct.optional</code> attribute **/
	public static final String OPTIONAL = "optional";
	/** Qualifier of the <code>BundleProduct.precProduct</code> attribute **/
	public static final String PRECPRODUCT = "precProduct";
	/** Qualifier of the <code>BundleProduct.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>BundleProduct.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BUNDLETEMPLATE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBundleProduct> BUNDLETEMPLATEHANDLER = new BidirectionalOneToManyHandler<GeneratedBundleProduct>(
	SapcrmproductbundlemodelConstants.TC.BUNDLEPRODUCT,
	false,
	"bundleTemplate",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(BUNDLETEMPLATE, AttributeMode.INITIAL);
		tmp.put(BUNDLEGROUP, AttributeMode.INITIAL);
		tmp.put(CATALOGVERSION, AttributeMode.INITIAL);
		tmp.put(DEFAULT, AttributeMode.INITIAL);
		tmp.put(OPTIONAL, AttributeMode.INITIAL);
		tmp.put(PRECPRODUCT, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.bundleGroup</code> attribute.
	 * @return the bundleGroup - Bundled Product Group
	 */
	public BundleProductGroup getBundleGroup(final SessionContext ctx)
	{
		return (BundleProductGroup)getProperty( ctx, BUNDLEGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.bundleGroup</code> attribute.
	 * @return the bundleGroup - Bundled Product Group
	 */
	public BundleProductGroup getBundleGroup()
	{
		return getBundleGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.bundleGroup</code> attribute. 
	 * @param value the bundleGroup - Bundled Product Group
	 */
	public void setBundleGroup(final SessionContext ctx, final BundleProductGroup value)
	{
		setProperty(ctx, BUNDLEGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.bundleGroup</code> attribute. 
	 * @param value the bundleGroup - Bundled Product Group
	 */
	public void setBundleGroup(final BundleProductGroup value)
	{
		setBundleGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.bundleTemplate</code> attribute.
	 * @return the bundleTemplate - Bundle Template
	 */
	public BundleTemplate getBundleTemplate(final SessionContext ctx)
	{
		return (BundleTemplate)getProperty( ctx, BUNDLETEMPLATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.bundleTemplate</code> attribute.
	 * @return the bundleTemplate - Bundle Template
	 */
	public BundleTemplate getBundleTemplate()
	{
		return getBundleTemplate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.bundleTemplate</code> attribute. 
	 * @param value the bundleTemplate - Bundle Template
	 */
	public void setBundleTemplate(final SessionContext ctx, final BundleTemplate value)
	{
		BUNDLETEMPLATEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.bundleTemplate</code> attribute. 
	 * @param value the bundleTemplate - Bundle Template
	 */
	public void setBundleTemplate(final BundleTemplate value)
	{
		setBundleTemplate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.catalogVersion</code> attribute.
	 * @return the catalogVersion - Catalog Version
	 */
	public CatalogVersion getCatalogVersion(final SessionContext ctx)
	{
		return (CatalogVersion)getProperty( ctx, CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.catalogVersion</code> attribute.
	 * @return the catalogVersion - Catalog Version
	 */
	public CatalogVersion getCatalogVersion()
	{
		return getCatalogVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.catalogVersion</code> attribute. 
	 * @param value the catalogVersion - Catalog Version
	 */
	public void setCatalogVersion(final SessionContext ctx, final CatalogVersion value)
	{
		setProperty(ctx, CATALOGVERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.catalogVersion</code> attribute. 
	 * @param value the catalogVersion - Catalog Version
	 */
	public void setCatalogVersion(final CatalogVersion value)
	{
		setCatalogVersion( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BUNDLETEMPLATEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.default</code> attribute.
	 * @return the default - Is Default Product
	 */
	public Boolean isDefault(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DEFAULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.default</code> attribute.
	 * @return the default - Is Default Product
	 */
	public Boolean isDefault()
	{
		return isDefault( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.default</code> attribute. 
	 * @return the default - Is Default Product
	 */
	public boolean isDefaultAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDefault( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.default</code> attribute. 
	 * @return the default - Is Default Product
	 */
	public boolean isDefaultAsPrimitive()
	{
		return isDefaultAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.default</code> attribute. 
	 * @param value the default - Is Default Product
	 */
	public void setDefault(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DEFAULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.default</code> attribute. 
	 * @param value the default - Is Default Product
	 */
	public void setDefault(final Boolean value)
	{
		setDefault( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.default</code> attribute. 
	 * @param value the default - Is Default Product
	 */
	public void setDefault(final SessionContext ctx, final boolean value)
	{
		setDefault( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.default</code> attribute. 
	 * @param value the default - Is Default Product
	 */
	public void setDefault(final boolean value)
	{
		setDefault( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.optional</code> attribute.
	 * @return the optional - Is Optional Product
	 */
	public Boolean isOptional(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OPTIONAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.optional</code> attribute.
	 * @return the optional - Is Optional Product
	 */
	public Boolean isOptional()
	{
		return isOptional( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.optional</code> attribute. 
	 * @return the optional - Is Optional Product
	 */
	public boolean isOptionalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOptional( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.optional</code> attribute. 
	 * @return the optional - Is Optional Product
	 */
	public boolean isOptionalAsPrimitive()
	{
		return isOptionalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.optional</code> attribute. 
	 * @param value the optional - Is Optional Product
	 */
	public void setOptional(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OPTIONAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.optional</code> attribute. 
	 * @param value the optional - Is Optional Product
	 */
	public void setOptional(final Boolean value)
	{
		setOptional( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.optional</code> attribute. 
	 * @param value the optional - Is Optional Product
	 */
	public void setOptional(final SessionContext ctx, final boolean value)
	{
		setOptional( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.optional</code> attribute. 
	 * @param value the optional - Is Optional Product
	 */
	public void setOptional(final boolean value)
	{
		setOptional( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.precProduct</code> attribute.
	 * @return the precProduct - Preceding Product
	 */
	public Product getPrecProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRECPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.precProduct</code> attribute.
	 * @return the precProduct - Preceding Product
	 */
	public Product getPrecProduct()
	{
		return getPrecProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.precProduct</code> attribute. 
	 * @param value the precProduct - Preceding Product
	 */
	public void setPrecProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRECPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.precProduct</code> attribute. 
	 * @param value the precProduct - Preceding Product
	 */
	public void setPrecProduct(final Product value)
	{
		setPrecProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.product</code> attribute.
	 * @return the product - Product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.product</code> attribute.
	 * @return the product - Product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.product</code> attribute. 
	 * @param value the product - Product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.product</code> attribute. 
	 * @param value the product - Product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.validFrom</code> attribute.
	 * @return the validFrom - Bundle Product Validity Start Date
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.validFrom</code> attribute.
	 * @return the validFrom - Bundle Product Validity Start Date
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.validFrom</code> attribute. 
	 * @param value the validFrom - Bundle Product Validity Start Date
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.validFrom</code> attribute. 
	 * @param value the validFrom - Bundle Product Validity Start Date
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.validTo</code> attribute.
	 * @return the validTo - Bundle Product Validity End Date
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleProduct.validTo</code> attribute.
	 * @return the validTo - Bundle Product Validity End Date
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.validTo</code> attribute. 
	 * @param value the validTo - Bundle Product Validity End Date
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleProduct.validTo</code> attribute. 
	 * @param value the validTo - Bundle Product Validity End Date
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
