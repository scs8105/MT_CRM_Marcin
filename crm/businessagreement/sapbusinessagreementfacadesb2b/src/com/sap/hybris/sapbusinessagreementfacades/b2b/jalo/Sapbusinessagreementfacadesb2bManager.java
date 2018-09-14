package com.sap.hybris.sapbusinessagreementfacades.b2b.jalo;

import com.sap.hybris.sapbusinessagreementfacades.b2b.constants.Sapbusinessagreementfacadesb2bConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Sapbusinessagreementfacadesb2bManager extends GeneratedSapbusinessagreementfacadesb2bManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapbusinessagreementfacadesb2bManager.class.getName() );
	
	public static final Sapbusinessagreementfacadesb2bManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapbusinessagreementfacadesb2bManager) em.getExtension(Sapbusinessagreementfacadesb2bConstants.EXTENSIONNAME);
	}
	
}
