/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbdd.web;

import com.google.inject.Injector;
import com.sap.xsk.models.hdbdd.web.ModelWebSetup;
import javax.servlet.annotation.WebServlet;
import org.eclipse.xtext.util.DisposableRegistry;
import org.eclipse.xtext.web.servlet.XtextServlet;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Deploy this class into a servlet container to enable DSL-specific services.
 */
@WebServlet(name = "XtextServices", urlPatterns = "/xtext-service/*")
@SuppressWarnings("all")
public class ModelServlet extends XtextServlet {
  private DisposableRegistry disposableRegistry;
  
  @Override
  public void init() {
    try {
      super.init();
      final Injector injector = new ModelWebSetup().createInjectorAndDoEMFRegistration();
      this.disposableRegistry = injector.<DisposableRegistry>getInstance(DisposableRegistry.class);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void destroy() {
    if ((this.disposableRegistry != null)) {
      this.disposableRegistry.dispose();
      this.disposableRegistry = null;
    }
    super.destroy();
  }
}