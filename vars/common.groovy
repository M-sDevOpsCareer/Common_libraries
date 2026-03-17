def call(String stageName)
{
  if("${stageName}" == "build")
  {
    sh "mvn clean package"
  }
else if("${stageName}" == "sonarqube")
  {
    sh "mvn sonar:sonar"
  }
 else if("${stageName}" == "nexus")
  {
    sh "mvn sonar:sonar deploy"
  }
}
