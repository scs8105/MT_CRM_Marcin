/*
 *  
 * [y] hybris Platform
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapcrmorderexchangeb2b.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.sap.sapcrmorderexchangeb2b.constants.Sapcrmorderexchangeb2bConstants;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class Sapcrmorderexchangeb2bManager extends GeneratedSapcrmorderexchangeb2bManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapcrmorderexchangeb2bManager.class.getName() );
	
	public static final Sapcrmorderexchangeb2bManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapcrmorderexchangeb2bManager) em.getExtension(Sapcrmorderexchangeb2bConstants.EXTENSIONNAME);
	}
	
}
