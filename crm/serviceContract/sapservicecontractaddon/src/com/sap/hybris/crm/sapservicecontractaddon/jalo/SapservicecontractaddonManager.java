package com.sap.hybris.crm.sapservicecontractaddon.jalo;

import com.sap.hybris.crm.sapservicecontractaddon.constants.SapservicecontractaddonConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapservicecontractaddonManager extends GeneratedSapservicecontractaddonManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapservicecontractaddonManager.class.getName() );
	
	public static final SapservicecontractaddonManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapservicecontractaddonManager) em.getExtension(SapservicecontractaddonConstants.EXTENSIONNAME);
	}
	
}
