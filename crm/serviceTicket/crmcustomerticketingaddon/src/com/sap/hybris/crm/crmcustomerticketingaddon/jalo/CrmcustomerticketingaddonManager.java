package com.sap.hybris.crm.crmcustomerticketingaddon.jalo;

import com.sap.hybris.crm.crmcustomerticketingaddon.constants.CrmcustomerticketingaddonConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class CrmcustomerticketingaddonManager extends GeneratedCrmcustomerticketingaddonManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( CrmcustomerticketingaddonManager.class.getName() );
	
	public static final CrmcustomerticketingaddonManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CrmcustomerticketingaddonManager) em.getExtension(CrmcustomerticketingaddonConstants.EXTENSIONNAME);
	}
	
}
