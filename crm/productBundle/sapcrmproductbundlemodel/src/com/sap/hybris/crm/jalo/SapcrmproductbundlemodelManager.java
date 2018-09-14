package com.sap.hybris.crm.jalo;

import com.sap.hybris.crm.constants.SapcrmproductbundlemodelConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapcrmproductbundlemodelManager extends GeneratedSapcrmproductbundlemodelManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapcrmproductbundlemodelManager.class.getName() );
	
	public static final SapcrmproductbundlemodelManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapcrmproductbundlemodelManager) em.getExtension(SapcrmproductbundlemodelConstants.EXTENSIONNAME);
	}
	
}
