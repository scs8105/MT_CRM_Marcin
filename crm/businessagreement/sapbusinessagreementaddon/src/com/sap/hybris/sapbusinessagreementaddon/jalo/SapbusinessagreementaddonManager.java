package com.sap.hybris.sapbusinessagreementaddon.jalo;

import com.sap.hybris.sapbusinessagreementaddon.constants.SapbusinessagreementaddonConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapbusinessagreementaddonManager extends GeneratedSapbusinessagreementaddonManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapbusinessagreementaddonManager.class.getName() );
	
	public static final SapbusinessagreementaddonManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapbusinessagreementaddonManager) em.getExtension(SapbusinessagreementaddonConstants.EXTENSIONNAME);
	}
	
}
