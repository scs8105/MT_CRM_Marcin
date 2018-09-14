package com.sap.hybris.crm.sapcrmb2bticketsystem.jalo;

import com.sap.hybris.crm.sapcrmb2bticketsystem.constants.Sapcrmb2bticketsystemConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Sapcrmb2bticketsystemManager extends GeneratedSapcrmb2bticketsystemManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapcrmb2bticketsystemManager.class.getName() );
	
	public static final Sapcrmb2bticketsystemManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapcrmb2bticketsystemManager) em.getExtension(Sapcrmb2bticketsystemConstants.EXTENSIONNAME);
	}
	
}
