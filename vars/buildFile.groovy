#!/usr/bin/env groovy

/*def call(def buildtype) {
	
	if( ${buildtype}==snap )
	{
		echo "snapsnot_build"
//		def mvnHome = tool "${buildTool}";
	sh "${datas.buildTool}/bin/mvn "+"${datas.mavenGoals}"+" -Dbuild.number=${BUILD_NUMBER}"
	}
	else
	{
		echo "release_build"
//		def mvnHome = tool "${buildTool}";
	sh "${datas.buildTool}/bin/mvn "+"${datas.mavenGoals}"+" -Dbuild.number=${BUILD_NUMBER}"
	}
}
		
}
*/
#!/usr/bin/env groovy

def call(def datas) {
		def mvnHome = tool "${datas.buildTool}";
	sh "${mvnHome}/bin/mvn "+"${datas.mavenGoals}"+" -Dbuild.number=${BUILD_NUMBER}"
}



