/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.xsodata.tests;

import com.google.inject.Inject;
import com.sap.xsk.models.xsodata.tests.XSODataInjectorProvider;
import com.sap.xsk.models.xsodata.xsOData.XSOData;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(XSODataInjectorProvider.class)
@SuppressWarnings("all")
public class XSODataParsingTest {
  @Inject
  private ParseHelper<XSOData> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("service namespace product_project.odata  {");
      _builder.newLine();
      _builder.newLine();
      _builder.append("  ");
      _builder.append("product_project.db::Products.Orders as Orders");
      _builder.newLine();
      _builder.append("  \t\t");
      _builder.append("navigates(Items4Orders as Items)");
      _builder.newLine();
      _builder.append("\t\t\t ");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("create events(before product_project.xsjs:ProductsLib.xsjslib::beforeCreateOrder)");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("delete using product_project.xsjs:ProductsLib.xsjslib::deleteOrder;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("  ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("product_project.db::Products.Item as Items");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("create events(before product_project.xsjs:ProductsLib.xsjslib::beforeCreateItem) ");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("update forbidden;");
      _builder.newLine();
      _builder.append("\t\t\t ");
      _builder.newLine();
      _builder.append("\t\t\t ");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("association Items4Orders principal Orders(Id)");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("multiplicity 1 dependent Items(OrderId) multiplicity *;");
      _builder.newLine();
      _builder.append("      ");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final XSOData result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
