package com.sap.hybris.sapcrmcustomerb2b.jalo;

import com.sap.hybris.sapcrmcustomerb2b.constants.Sapcrmcustomerb2bConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Sapcrmcustomerb2bManager extends GeneratedSapcrmcustomerb2bManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapcrmcustomerb2bManager.class.getName() );
	
	public static final Sapcrmcustomerb2bManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapcrmcustomerb2bManager) em.getExtension(Sapcrmcustomerb2bConstants.EXTENSIONNAME);
	}
	
}
