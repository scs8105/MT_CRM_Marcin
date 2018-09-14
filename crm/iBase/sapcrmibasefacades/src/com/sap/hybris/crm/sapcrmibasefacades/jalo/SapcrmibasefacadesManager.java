package com.sap.hybris.crm.sapcrmibasefacades.jalo;

import com.sap.hybris.crm.sapcrmibasefacades.constants.SapcrmibasefacadesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapcrmibasefacadesManager extends GeneratedSapcrmibasefacadesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapcrmibasefacadesManager.class.getName() );
	
	public static final SapcrmibasefacadesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapcrmibasefacadesManager) em.getExtension(SapcrmibasefacadesConstants.EXTENSIONNAME);
	}
	
}
