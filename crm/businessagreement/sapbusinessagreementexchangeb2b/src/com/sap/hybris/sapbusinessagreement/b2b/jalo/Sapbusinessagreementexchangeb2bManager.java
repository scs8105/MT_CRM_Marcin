package com.sap.hybris.sapbusinessagreement.b2b.jalo;

import com.sap.hybris.sapbusinessagreement.b2b.constants.Sapbusinessagreementexchangeb2bConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Sapbusinessagreementexchangeb2bManager extends GeneratedSapbusinessagreementexchangeb2bManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapbusinessagreementexchangeb2bManager.class.getName() );
	
	public static final Sapbusinessagreementexchangeb2bManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapbusinessagreementexchangeb2bManager) em.getExtension(Sapbusinessagreementexchangeb2bConstants.EXTENSIONNAME);
	}
	
}
