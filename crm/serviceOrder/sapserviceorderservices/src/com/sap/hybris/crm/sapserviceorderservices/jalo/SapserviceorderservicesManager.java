package com.sap.hybris.crm.sapserviceorderservices.jalo;

import com.sap.hybris.crm.sapserviceorderservices.constants.SapserviceorderservicesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapserviceorderservicesManager extends GeneratedSapserviceorderservicesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapserviceorderservicesManager.class.getName() );
	
	public static final SapserviceorderservicesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapserviceorderservicesManager) em.getExtension(SapserviceorderservicesConstants.EXTENSIONNAME);
	}
	
}
