/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.b2bsapproductavailabilitycrm.setup;

import static com.b2bsapproductavailabilitycrm.constants.B2bsapproductavailabilitycrmConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.b2bsapproductavailabilitycrm.constants.B2bsapproductavailabilitycrmConstants;
import com.b2bsapproductavailabilitycrm.service.B2bsapproductavailabilitycrmService;


@SystemSetup(extension = B2bsapproductavailabilitycrmConstants.EXTENSIONNAME)
public class B2bsapproductavailabilitycrmSystemSetup
{
	private final B2bsapproductavailabilitycrmService b2bsapproductavailabilitycrmService;

	public B2bsapproductavailabilitycrmSystemSetup(final B2bsapproductavailabilitycrmService b2bsapproductavailabilitycrmService)
	{
		this.b2bsapproductavailabilitycrmService = b2bsapproductavailabilitycrmService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		b2bsapproductavailabilitycrmService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return B2bsapproductavailabilitycrmSystemSetup.class.getResourceAsStream("/b2bsapproductavailabilitycrm/sap-hybris-platform.png");
	}
}
