package com.sap.hybris.crm.crmcustomerticketingfacades.jalo;

import com.sap.hybris.crm.crmcustomerticketingfacades.constants.CrmcustomerticketingfacadesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class CrmcustomerticketingfacadesManager extends GeneratedCrmcustomerticketingfacadesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( CrmcustomerticketingfacadesManager.class.getName() );
	
	public static final CrmcustomerticketingfacadesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CrmcustomerticketingfacadesManager) em.getExtension(CrmcustomerticketingfacadesConstants.EXTENSIONNAME);
	}
	
}
