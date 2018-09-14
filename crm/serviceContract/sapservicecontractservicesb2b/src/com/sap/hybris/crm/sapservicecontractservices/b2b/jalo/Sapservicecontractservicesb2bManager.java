package com.sap.hybris.crm.sapservicecontractservices.b2b.jalo;

import com.sap.hybris.crm.sapservicecontractservices.b2b.constants.Sapservicecontractservicesb2bConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Sapservicecontractservicesb2bManager extends GeneratedSapservicecontractservicesb2bManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapservicecontractservicesb2bManager.class.getName() );
	
	public static final Sapservicecontractservicesb2bManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapservicecontractservicesb2bManager) em.getExtension(Sapservicecontractservicesb2bConstants.EXTENSIONNAME);
	}
	
}
