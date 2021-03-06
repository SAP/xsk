/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbtable.serializer;

import com.google.inject.Inject;
import com.sap.xsk.models.hdbtable.hdbTable.ColumnType;
import com.sap.xsk.models.hdbtable.hdbTable.HdbTableModel;
import com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage;
import com.sap.xsk.models.hdbtable.hdbTable.IndexType;
import com.sap.xsk.models.hdbtable.hdbTable.Table;
import com.sap.xsk.models.hdbtable.services.HdbTableGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class HdbTableSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HdbTableGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == HdbTablePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case HdbTablePackage.COLUMN_TYPE:
				sequence_ColumnType(context, (ColumnType) semanticObject); 
				return; 
			case HdbTablePackage.HDB_TABLE_MODEL:
				sequence_HdbTableModel(context, (HdbTableModel) semanticObject); 
				return; 
			case HdbTablePackage.INDEX_TYPE:
				sequence_IndexType(context, (IndexType) semanticObject); 
				return; 
			case HdbTablePackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ColumnType returns ColumnType
	 *
	 * Constraint:
	 *     (
	 *         columnName=STRING | 
	 *         columnSqlType=ID | 
	 *         columnLength=INT | 
	 *         columnComment=STRING | 
	 *         columnDefaultValue=STRING | 
	 *         columnPrecision=INT | 
	 *         columnScale=INT | 
	 *         columnNullable=BOOL
	 *     )*
	 */
	protected void sequence_ColumnType(ISerializationContext context, ColumnType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HdbTableModel returns HdbTableModel
	 *
	 * Constraint:
	 *     tableElement=Table
	 */
	protected void sequence_HdbTableModel(ISerializationContext context, HdbTableModel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HdbTablePackage.Literals.HDB_TABLE_MODEL__TABLE_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HdbTablePackage.Literals.HDB_TABLE_MODEL__TABLE_ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHdbTableModelAccess().getTableElementTableParserRuleCall_0(), semanticObject.getTableElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     IndexType returns IndexType
	 *
	 * Constraint:
	 *     (
	 *         columnName=STRING | 
	 *         columnUnique=BOOL | 
	 *         columnOrder=ID | 
	 *         (indexColumns?='indexColumns' (tableIndexColumnsValues+=STRING tableIndexColumnsValues+=STRING*)?)
	 *     )+
	 */
	protected void sequence_IndexType(ISerializationContext context, IndexType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     {Table}
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
