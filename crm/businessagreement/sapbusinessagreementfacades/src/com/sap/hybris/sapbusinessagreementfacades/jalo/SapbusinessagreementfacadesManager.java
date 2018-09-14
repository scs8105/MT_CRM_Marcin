package com.sap.hybris.sapbusinessagreementfacades.jalo;

import com.sap.hybris.sapbusinessagreementfacades.constants.SapbusinessagreementfacadesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapbusinessagreementfacadesManager extends GeneratedSapbusinessagreementfacadesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapbusinessagreementfacadesManager.class.getName() );
	
	public static final SapbusinessagreementfacadesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapbusinessagreementfacadesManager) em.getExtension(SapbusinessagreementfacadesConstants.EXTENSIONNAME);
	}
	
}
