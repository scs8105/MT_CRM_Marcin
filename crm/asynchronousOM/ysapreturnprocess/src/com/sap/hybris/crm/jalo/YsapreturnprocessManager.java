package com.sap.hybris.crm.jalo;

import com.sap.hybris.crm.constants.YsapreturnprocessConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class YsapreturnprocessManager extends GeneratedYsapreturnprocessManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( YsapreturnprocessManager.class.getName() );
	
	public static final YsapreturnprocessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (YsapreturnprocessManager) em.getExtension(YsapreturnprocessConstants.EXTENSIONNAME);
	}
	
}
