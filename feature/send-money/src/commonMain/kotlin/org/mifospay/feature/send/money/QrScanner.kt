/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
package org.mifospay.feature.send.money

import kotlinx.coroutines.flow.Flow
import org.koin.core.module.Module

interface QrScanner {
    fun startScanning(): Flow<String?>
}

expect val ScannerModule: Module
