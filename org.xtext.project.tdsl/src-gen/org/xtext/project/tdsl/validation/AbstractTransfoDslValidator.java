/*
 * generated by Xtext
 */
package org.xtext.project.tdsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractTransfoDslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.project.tdsl.transfoDsl.TransfoDslPackage.eINSTANCE);
		return result;
	}
}
