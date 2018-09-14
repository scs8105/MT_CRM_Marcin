package com.sap.hybris.crm.sapcrmproductregistrationbol.jalo;

import com.sap.hybris.crm.sapcrmproductregistrationbol.constants.SapcrmproductregistrationbolConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapcrmproductregistrationbolManager extends GeneratedSapcrmproductregistrationbolManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapcrmproductregistrationbolManager.class.getName() );
	
	public static final SapcrmproductregistrationbolManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapcrmproductregistrationbolManager) em.getExtension(SapcrmproductregistrationbolConstants.EXTENSIONNAME);
	}
	
}
