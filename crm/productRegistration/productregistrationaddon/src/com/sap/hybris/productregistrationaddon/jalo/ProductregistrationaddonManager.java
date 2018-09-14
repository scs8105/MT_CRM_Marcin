package com.sap.hybris.productregistrationaddon.jalo;

import com.sap.hybris.productregistrationaddon.constants.ProductregistrationaddonConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class ProductregistrationaddonManager extends GeneratedProductregistrationaddonManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( ProductregistrationaddonManager.class.getName() );
	
	public static final ProductregistrationaddonManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ProductregistrationaddonManager) em.getExtension(ProductregistrationaddonConstants.EXTENSIONNAME);
	}
	
}
