/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbdd.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sap.xsk.models.hdbdd.HdbDDRuntimeModule;
import com.sap.xsk.models.hdbdd.HdbDDStandaloneSetup;
import com.sap.xsk.models.hdbdd.ide.HdbDDIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class HdbDDIdeSetup extends HdbDDStandaloneSetup {
  @Override
  public Injector createInjector() {
    HdbDDRuntimeModule _hdbDDRuntimeModule = new HdbDDRuntimeModule();
    HdbDDIdeModule _hdbDDIdeModule = new HdbDDIdeModule();
    return Guice.createInjector(Modules2.mixin(_hdbDDRuntimeModule, _hdbDDIdeModule));
  }
}
