package com.sap.hybris.crm.sapservicecontractservices.jalo;

import com.sap.hybris.crm.sapservicecontractservices.constants.SapservicecontractservicesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapservicecontractservicesManager extends GeneratedSapservicecontractservicesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapservicecontractservicesManager.class.getName() );
	
	public static final SapservicecontractservicesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapservicecontractservicesManager) em.getExtension(SapservicecontractservicesConstants.EXTENSIONNAME);
	}
	
}
