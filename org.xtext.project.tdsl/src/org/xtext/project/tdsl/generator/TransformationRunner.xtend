package org.xtext.project.tdsl.generator

import org.xtext.project.tdsl.transfoDsl.Transformation

class TransformationRunner {
	def run(Transformation t){
		//1// Load Model
		//2// Run Model
		//3// Derive Layer
		//4// Execute Layer
		println("My simple run function.")
		println(t.class.package.class.typeName)
	}
}