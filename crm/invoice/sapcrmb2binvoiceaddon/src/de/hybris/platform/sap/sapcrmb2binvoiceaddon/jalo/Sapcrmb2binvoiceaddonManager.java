/*
 *  
 * [y] hybris Platform
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapcrmb2binvoiceaddon.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.sap.sapcrmb2binvoiceaddon.constants.Sapcrmb2binvoiceaddonConstants;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Sapcrmb2binvoiceaddonManager extends GeneratedSapcrmb2binvoiceaddonManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapcrmb2binvoiceaddonManager.class.getName() );
	
	public static final Sapcrmb2binvoiceaddonManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapcrmb2binvoiceaddonManager) em.getExtension(Sapcrmb2binvoiceaddonConstants.EXTENSIONNAME);
	}
	
}
