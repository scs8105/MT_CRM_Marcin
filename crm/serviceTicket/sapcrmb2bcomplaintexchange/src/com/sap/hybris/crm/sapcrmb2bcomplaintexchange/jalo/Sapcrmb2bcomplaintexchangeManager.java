package com.sap.hybris.crm.sapcrmb2bcomplaintexchange.jalo;

import com.sap.hybris.crm.sapcrmb2bcomplaintexchange.constants.Sapcrmb2bcomplaintexchangeConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Sapcrmb2bcomplaintexchangeManager extends GeneratedSapcrmb2bcomplaintexchangeManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapcrmb2bcomplaintexchangeManager.class.getName() );
	
	public static final Sapcrmb2bcomplaintexchangeManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapcrmb2bcomplaintexchangeManager) em.getExtension(Sapcrmb2bcomplaintexchangeConstants.EXTENSIONNAME);
	}
	
}
