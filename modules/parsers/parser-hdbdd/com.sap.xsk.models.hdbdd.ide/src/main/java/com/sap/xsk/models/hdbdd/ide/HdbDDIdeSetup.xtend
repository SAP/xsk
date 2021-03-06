/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbdd.ide

import com.google.inject.Guice
import com.sap.xsk.models.hdbdd.HdbDDRuntimeModule
import com.sap.xsk.models.hdbdd.HdbDDStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class HdbDDIdeSetup extends HdbDDStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new HdbDDRuntimeModule, new HdbDDIdeModule))
	}
	
}
