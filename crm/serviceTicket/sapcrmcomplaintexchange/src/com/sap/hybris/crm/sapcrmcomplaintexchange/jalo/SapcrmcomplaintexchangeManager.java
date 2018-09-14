package com.sap.hybris.crm.sapcrmcomplaintexchange.jalo;

import com.sap.hybris.crm.sapcrmcomplaintexchange.constants.SapcrmcomplaintexchangeConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapcrmcomplaintexchangeManager extends GeneratedSapcrmcomplaintexchangeManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapcrmcomplaintexchangeManager.class.getName() );
	
	public static final SapcrmcomplaintexchangeManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapcrmcomplaintexchangeManager) em.getExtension(SapcrmcomplaintexchangeConstants.EXTENSIONNAME);
	}
	
}
