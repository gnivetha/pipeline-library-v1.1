#!/usr/bin/env groovy

def call(def buildTool) {
		def mvnHome = "${buildTool}";
	 echo "${buildTool}"
         sh "${mvnHome}/bin/mvn -B verify"
}


