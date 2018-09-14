package com.sap.jalo;

import com.sap.constants.SapgenilConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapgenilManager extends GeneratedSapgenilManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapgenilManager.class.getName() );
	
	public static final SapgenilManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapgenilManager) em.getExtension(SapgenilConstants.EXTENSIONNAME);
	}
	
}
