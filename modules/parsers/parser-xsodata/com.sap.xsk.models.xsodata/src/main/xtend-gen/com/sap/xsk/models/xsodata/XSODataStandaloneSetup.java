/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.xsodata;

import com.sap.xsk.models.xsodata.XSODataStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class XSODataStandaloneSetup extends XSODataStandaloneSetupGenerated {
  public static void doSetup() {
    new XSODataStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
