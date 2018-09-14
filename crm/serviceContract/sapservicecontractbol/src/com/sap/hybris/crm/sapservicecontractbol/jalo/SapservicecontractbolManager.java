package com.sap.hybris.crm.sapservicecontractbol.jalo;

import com.sap.hybris.crm.sapservicecontractbol.constants.SapservicecontractbolConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapservicecontractbolManager extends GeneratedSapservicecontractbolManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapservicecontractbolManager.class.getName() );
	
	public static final SapservicecontractbolManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapservicecontractbolManager) em.getExtension(SapservicecontractbolConstants.EXTENSIONNAME);
	}
	
}
