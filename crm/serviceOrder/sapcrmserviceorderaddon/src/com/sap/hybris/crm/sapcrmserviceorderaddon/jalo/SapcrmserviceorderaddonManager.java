package com.sap.hybris.crm.sapcrmserviceorderaddon.jalo;

import com.sap.hybris.crm.sapcrmserviceorderaddon.constants.SapcrmserviceorderaddonConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapcrmserviceorderaddonManager extends GeneratedSapcrmserviceorderaddonManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapcrmserviceorderaddonManager.class.getName() );
	
	public static final SapcrmserviceorderaddonManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapcrmserviceorderaddonManager) em.getExtension(SapcrmserviceorderaddonConstants.EXTENSIONNAME);
	}
	
}
