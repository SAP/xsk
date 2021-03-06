/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbdd.serializer;

import com.google.inject.Inject;
import com.sap.xsk.models.hdbdd.hdbDD.Context;
import com.sap.xsk.models.hdbdd.hdbDD.Entity;
import com.sap.xsk.models.hdbdd.hdbDD.FieldPrimitive;
import com.sap.xsk.models.hdbdd.hdbDD.FieldReference;
import com.sap.xsk.models.hdbdd.hdbDD.FieldType;
import com.sap.xsk.models.hdbdd.hdbDD.HdbDD;
import com.sap.xsk.models.hdbdd.hdbDD.HdbDDPackage;
import com.sap.xsk.models.hdbdd.hdbDD.Namespace;
import com.sap.xsk.models.hdbdd.hdbDD.Schema;
import com.sap.xsk.models.hdbdd.hdbDD.TypeDefinition;
import com.sap.xsk.models.hdbdd.services.HdbDDGrammarAccess;
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
public class HdbDDSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HdbDDGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == HdbDDPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case HdbDDPackage.CONTEXT:
				sequence_Context(context, (Context) semanticObject); 
				return; 
			case HdbDDPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case HdbDDPackage.FIELD_PRIMITIVE:
				sequence_FieldPrimitive(context, (FieldPrimitive) semanticObject); 
				return; 
			case HdbDDPackage.FIELD_REFERENCE:
				sequence_FieldReference(context, (FieldReference) semanticObject); 
				return; 
			case HdbDDPackage.FIELD_TYPE:
				sequence_FieldType(context, (FieldType) semanticObject); 
				return; 
			case HdbDDPackage.HDB_DD:
				sequence_HdbDD(context, (HdbDD) semanticObject); 
				return; 
			case HdbDDPackage.NAMESPACE:
				sequence_Namespace(context, (Namespace) semanticObject); 
				return; 
			case HdbDDPackage.SCHEMA:
				sequence_Schema(context, (Schema) semanticObject); 
				return; 
			case HdbDDPackage.TYPE_DEFINITION:
				sequence_TypeDefinition(context, (TypeDefinition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Type returns Context
	 *     Context returns Context
	 *
	 * Constraint:
	 *     (name=ID types+=TypeDefinition* entities+=Entity*)
	 */
	protected void sequence_Context(ISerializationContext context, Context semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID fields+=Field*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Field returns FieldPrimitive
	 *     FieldPrimitive returns FieldPrimitive
	 *
	 * Constraint:
	 *     (key?='key'? name=ID fieldType=ID fieldLength=INT? fieldPredefinedType=STRING?)
	 */
	protected void sequence_FieldPrimitive(ISerializationContext context, FieldPrimitive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Field returns FieldReference
	 *     FieldReference returns FieldReference
	 *
	 * Constraint:
	 *     (name=ID referenceType=ID fieldReferenceEntity=ID fieldReferenceEntityLocalId=QualifiedName fieldReferenceEntityForeignId=ID)
	 */
	protected void sequence_FieldReference(ISerializationContext context, FieldReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HdbDDPackage.Literals.FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HdbDDPackage.Literals.FIELD__NAME));
			if (transientValues.isValueTransient(semanticObject, HdbDDPackage.Literals.FIELD_REFERENCE__REFERENCE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HdbDDPackage.Literals.FIELD_REFERENCE__REFERENCE_TYPE));
			if (transientValues.isValueTransient(semanticObject, HdbDDPackage.Literals.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HdbDDPackage.Literals.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY));
			if (transientValues.isValueTransient(semanticObject, HdbDDPackage.Literals.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_LOCAL_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HdbDDPackage.Literals.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_LOCAL_ID));
			if (transientValues.isValueTransient(semanticObject, HdbDDPackage.Literals.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_FOREIGN_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HdbDDPackage.Literals.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_FOREIGN_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldReferenceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFieldReferenceAccess().getReferenceTypeIDTerminalRuleCall_2_0(), semanticObject.getReferenceType());
		feeder.accept(grammarAccess.getFieldReferenceAccess().getFieldReferenceEntityIDTerminalRuleCall_5_0(), semanticObject.getFieldReferenceEntity());
		feeder.accept(grammarAccess.getFieldReferenceAccess().getFieldReferenceEntityLocalIdQualifiedNameParserRuleCall_7_0(), semanticObject.getFieldReferenceEntityLocalId());
		feeder.accept(grammarAccess.getFieldReferenceAccess().getFieldReferenceEntityForeignIdIDTerminalRuleCall_9_0(), semanticObject.getFieldReferenceEntityForeignId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Field returns FieldType
	 *     FieldType returns FieldType
	 *
	 * Constraint:
	 *     (key?='key'? name=ID fieldPredefinedType=STRING?)
	 */
	protected void sequence_FieldType(ISerializationContext context, FieldType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HdbDD returns HdbDD
	 *
	 * Constraint:
	 *     elements+=Type+
	 */
	protected void sequence_HdbDD(ISerializationContext context, HdbDD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Namespace
	 *     Namespace returns Namespace
	 *
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_Namespace(ISerializationContext context, Namespace semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HdbDDPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HdbDDPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Schema
	 *     Schema returns Schema
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Schema(ISerializationContext context, Schema semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HdbDDPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HdbDDPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeDefinition returns TypeDefinition
	 *
	 * Constraint:
	 *     (name=ID fieldType=ID fieldLength=INT?)
	 */
	protected void sequence_TypeDefinition(ISerializationContext context, TypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
