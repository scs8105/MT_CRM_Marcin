package com.sap.hybris.productregistrationfacades.jalo;

import com.sap.hybris.productregistrationfacades.constants.ProductregistrationfacadesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class ProductregistrationfacadesManager extends GeneratedProductregistrationfacadesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( ProductregistrationfacadesManager.class.getName() );
	
	public static final ProductregistrationfacadesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ProductregistrationfacadesManager) em.getExtension(ProductregistrationfacadesConstants.EXTENSIONNAME);
	}
	
}
