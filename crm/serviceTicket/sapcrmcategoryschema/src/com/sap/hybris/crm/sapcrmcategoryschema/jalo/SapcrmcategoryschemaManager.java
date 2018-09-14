package com.sap.hybris.crm.sapcrmcategoryschema.jalo;

import com.sap.hybris.crm.sapcrmcategoryschema.constants.SapcrmcategoryschemaConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SapcrmcategoryschemaManager extends GeneratedSapcrmcategoryschemaManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SapcrmcategoryschemaManager.class.getName() );
	
	public static final SapcrmcategoryschemaManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapcrmcategoryschemaManager) em.getExtension(SapcrmcategoryschemaConstants.EXTENSIONNAME);
	}
	
}
