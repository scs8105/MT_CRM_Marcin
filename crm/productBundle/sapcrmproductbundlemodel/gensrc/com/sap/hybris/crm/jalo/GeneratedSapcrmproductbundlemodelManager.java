/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2018 8:55:55 AM                      ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.crm.jalo;

import com.sap.hybris.crm.constants.SapcrmproductbundlemodelConstants;
import com.sap.hybris.crm.jalo.BundleProduct;
import com.sap.hybris.crm.jalo.BundleProductGroup;
import de.hybris.platform.configurablebundleservices.jalo.BundleTemplate;
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
import de.hybris.platform.util.OneToManyHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>SapcrmproductbundlemodelManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcrmproductbundlemodelManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n BUNDLEPRODUCTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BundleProduct> BUNDLETEMPLATE2BUNDLEPRODUCTRELATIONBUNDLEPRODUCTSHANDLER = new OneToManyHandler<BundleProduct>(
	SapcrmproductbundlemodelConstants.TC.BUNDLEPRODUCT,
	false,
	"bundleTemplate",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
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
	 * <i>Generated method</i> - Getter of the <code>BundleTemplate.bundleProducts</code> attribute.
	 * @return the bundleProducts
	 */
	public List<BundleProduct> getBundleProducts(final SessionContext ctx, final BundleTemplate item)
	{
		return (List<BundleProduct>)BUNDLETEMPLATE2BUNDLEPRODUCTRELATIONBUNDLEPRODUCTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BundleTemplate.bundleProducts</code> attribute.
	 * @return the bundleProducts
	 */
	public List<BundleProduct> getBundleProducts(final BundleTemplate item)
	{
		return getBundleProducts( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleTemplate.bundleProducts</code> attribute. 
	 * @param value the bundleProducts
	 */
	public void setBundleProducts(final SessionContext ctx, final BundleTemplate item, final List<BundleProduct> value)
	{
		BUNDLETEMPLATE2BUNDLEPRODUCTRELATIONBUNDLEPRODUCTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BundleTemplate.bundleProducts</code> attribute. 
	 * @param value the bundleProducts
	 */
	public void setBundleProducts(final BundleTemplate item, final List<BundleProduct> value)
	{
		setBundleProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bundleProducts. 
	 * @param value the item to add to bundleProducts
	 */
	public void addToBundleProducts(final SessionContext ctx, final BundleTemplate item, final BundleProduct value)
	{
		BUNDLETEMPLATE2BUNDLEPRODUCTRELATIONBUNDLEPRODUCTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bundleProducts. 
	 * @param value the item to add to bundleProducts
	 */
	public void addToBundleProducts(final BundleTemplate item, final BundleProduct value)
	{
		addToBundleProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bundleProducts. 
	 * @param value the item to remove from bundleProducts
	 */
	public void removeFromBundleProducts(final SessionContext ctx, final BundleTemplate item, final BundleProduct value)
	{
		BUNDLETEMPLATE2BUNDLEPRODUCTRELATIONBUNDLEPRODUCTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bundleProducts. 
	 * @param value the item to remove from bundleProducts
	 */
	public void removeFromBundleProducts(final BundleTemplate item, final BundleProduct value)
	{
		removeFromBundleProducts( getSession().getSessionContext(), item, value );
	}
	
	public BundleProduct createBundleProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmproductbundlemodelConstants.TC.BUNDLEPRODUCT );
			return (BundleProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BundleProduct : "+e.getMessage(), 0 );
		}
	}
	
	public BundleProduct createBundleProduct(final Map attributeValues)
	{
		return createBundleProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public BundleProductGroup createBundleProductGroup(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcrmproductbundlemodelConstants.TC.BUNDLEPRODUCTGROUP );
			return (BundleProductGroup)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BundleProductGroup : "+e.getMessage(), 0 );
		}
	}
	
	public BundleProductGroup createBundleProductGroup(final Map attributeValues)
	{
		return createBundleProductGroup( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SapcrmproductbundlemodelConstants.EXTENSIONNAME;
	}
	
}
