package com.sap.hybris.crm.sapcrmpricingb2b.jalo;

import com.sap.hybris.crm.sapcrmpricingb2b.constants.Sapcrmpricingb2bConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Sapcrmpricingb2bManager extends GeneratedSapcrmpricingb2bManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapcrmpricingb2bManager.class.getName() );
	
	public static final Sapcrmpricingb2bManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapcrmpricingb2bManager) em.getExtension(Sapcrmpricingb2bConstants.EXTENSIONNAME);
	}
	
}
