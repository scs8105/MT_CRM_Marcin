package com.sap.hybris.crm.sapcrmibaseservices.jalo;

import com.sap.hybris.crm.sapcrmibaseservices.constants.SapcrmibaseservicesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapcrmibaseservicesManager extends GeneratedSapcrmibaseservicesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapcrmibaseservicesManager.class.getName() );
	
	public static final SapcrmibaseservicesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapcrmibaseservicesManager) em.getExtension(SapcrmibaseservicesConstants.EXTENSIONNAME);
	}
	
}
