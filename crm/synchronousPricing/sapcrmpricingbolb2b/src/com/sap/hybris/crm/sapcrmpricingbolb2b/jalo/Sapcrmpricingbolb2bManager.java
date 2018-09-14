package com.sap.hybris.crm.sapcrmpricingbolb2b.jalo;

import com.sap.hybris.crm.sapcrmpricingbolb2b.constants.Sapcrmpricingbolb2bConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Sapcrmpricingbolb2bManager extends GeneratedSapcrmpricingbolb2bManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapcrmpricingbolb2bManager.class.getName() );
	
	public static final Sapcrmpricingbolb2bManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapcrmpricingbolb2bManager) em.getExtension(Sapcrmpricingbolb2bConstants.EXTENSIONNAME);
	}
	
}
