package com.sap.hybris.crm.ysapreturnprocessb2b.jalo;

import com.sap.hybris.crm.ysapreturnprocessb2b.constants.Ysapreturnprocessb2bConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Ysapreturnprocessb2bManager extends GeneratedYsapreturnprocessb2bManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Ysapreturnprocessb2bManager.class.getName() );
	
	public static final Ysapreturnprocessb2bManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Ysapreturnprocessb2bManager) em.getExtension(Ysapreturnprocessb2bConstants.EXTENSIONNAME);
	}
	
}
