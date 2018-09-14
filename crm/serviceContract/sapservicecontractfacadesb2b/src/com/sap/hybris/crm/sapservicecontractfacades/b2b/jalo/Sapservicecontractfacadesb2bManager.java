package com.sap.hybris.crm.sapservicecontractfacades.b2b.jalo;

import com.sap.hybris.crm.sapservicecontractfacades.b2b.constants.Sapservicecontractfacadesb2bConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Sapservicecontractfacadesb2bManager extends GeneratedSapservicecontractfacadesb2bManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapservicecontractfacadesb2bManager.class.getName() );
	
	public static final Sapservicecontractfacadesb2bManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapservicecontractfacadesb2bManager) em.getExtension(Sapservicecontractfacadesb2bConstants.EXTENSIONNAME);
	}
	
}
