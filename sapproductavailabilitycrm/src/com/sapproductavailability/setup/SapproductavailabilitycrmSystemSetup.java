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
package com.sapproductavailability.setup;

import static com.sapproductavailability.constants.SapproductavailabilitycrmConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.sapproductavailability.constants.SapproductavailabilitycrmConstants;
import com.sapproductavailability.service.SapproductavailabilitycrmService;


@SystemSetup(extension = SapproductavailabilitycrmConstants.EXTENSIONNAME)
public class SapproductavailabilitycrmSystemSetup
{
	private final SapproductavailabilitycrmService sapproductavailabilitycrmService;

	public SapproductavailabilitycrmSystemSetup(final SapproductavailabilitycrmService sapproductavailabilitycrmService)
	{
		this.sapproductavailabilitycrmService = sapproductavailabilitycrmService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		sapproductavailabilitycrmService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return SapproductavailabilitycrmSystemSetup.class.getResourceAsStream("/sapproductavailabilitycrm/sap-hybris-platform.png");
	}
}
