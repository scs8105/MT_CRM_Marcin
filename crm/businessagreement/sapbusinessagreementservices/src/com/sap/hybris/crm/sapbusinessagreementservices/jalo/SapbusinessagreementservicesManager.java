package com.sap.hybris.crm.sapbusinessagreementservices.jalo;

import com.sap.hybris.crm.sapbusinessagreementservices.constants.SapbusinessagreementservicesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapbusinessagreementservicesManager extends GeneratedSapbusinessagreementservicesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapbusinessagreementservicesManager.class.getName() );
	
	public static final SapbusinessagreementservicesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapbusinessagreementservicesManager) em.getExtension(SapbusinessagreementservicesConstants.EXTENSIONNAME);
	}
	
}
