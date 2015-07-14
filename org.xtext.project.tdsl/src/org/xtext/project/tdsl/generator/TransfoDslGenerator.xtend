/*
 * generated by Xtext
 */
package org.xtext.project.tdsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.project.tdsl.transfoDsl.Transformation

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TransfoDslGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	resource.allContents.filter(typeof(Transformation)).forEach[t |new TransformationRunner().run(t)]
	resource.allContents.filter(typeof(Transformation)).forEach[new TransformationRunner()]
	}
}
