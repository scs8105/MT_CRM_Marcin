package com.sap.hybris.sapbusinessagreement.jalo;

import com.sap.hybris.sapbusinessagreement.constants.SapbusinessagreementexchangeConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapbusinessagreementexchangeManager extends GeneratedSapbusinessagreementexchangeManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapbusinessagreementexchangeManager.class.getName() );
	
	public static final SapbusinessagreementexchangeManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapbusinessagreementexchangeManager) em.getExtension(SapbusinessagreementexchangeConstants.EXTENSIONNAME);
	}
	
}
