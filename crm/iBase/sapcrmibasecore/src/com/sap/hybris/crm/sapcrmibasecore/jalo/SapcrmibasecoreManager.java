package com.sap.hybris.crm.sapcrmibasecore.jalo;

import com.sap.hybris.crm.sapcrmibasecore.constants.SapcrmibasecoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapcrmibasecoreManager extends GeneratedSapcrmibasecoreManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapcrmibasecoreManager.class.getName() );
	
	public static final SapcrmibasecoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapcrmibasecoreManager) em.getExtension(SapcrmibasecoreConstants.EXTENSIONNAME);
	}
	
}
