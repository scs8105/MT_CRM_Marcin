package com.sap.hybris.crm.sapbusinessagreementservices.b2b.jalo;

import com.sap.hybris.crm.sapbusinessagreementservices.b2b.constants.Sapbusinessagreementservicesb2bConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Sapbusinessagreementservicesb2bManager extends GeneratedSapbusinessagreementservicesb2bManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapbusinessagreementservicesb2bManager.class.getName() );
	
	public static final Sapbusinessagreementservicesb2bManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapbusinessagreementservicesb2bManager) em.getExtension(Sapbusinessagreementservicesb2bConstants.EXTENSIONNAME);
	}
	
}
