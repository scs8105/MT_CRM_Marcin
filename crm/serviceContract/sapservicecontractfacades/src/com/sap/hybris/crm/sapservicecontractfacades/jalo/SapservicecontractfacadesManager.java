package com.sap.hybris.crm.sapservicecontractfacades.jalo;

import com.sap.hybris.crm.sapservicecontractfacades.constants.SapservicecontractfacadesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapservicecontractfacadesManager extends GeneratedSapservicecontractfacadesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapservicecontractfacadesManager.class.getName() );
	
	public static final SapservicecontractfacadesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapservicecontractfacadesManager) em.getExtension(SapservicecontractfacadesConstants.EXTENSIONNAME);
	}
	
}
