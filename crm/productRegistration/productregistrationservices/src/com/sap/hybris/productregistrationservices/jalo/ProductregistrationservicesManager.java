package com.sap.hybris.productregistrationservices.jalo;

import com.sap.hybris.productregistrationservices.constants.ProductregistrationservicesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class ProductregistrationservicesManager extends GeneratedProductregistrationservicesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( ProductregistrationservicesManager.class.getName() );
	
	public static final ProductregistrationservicesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ProductregistrationservicesManager) em.getExtension(ProductregistrationservicesConstants.EXTENSIONNAME);
	}
	
}
