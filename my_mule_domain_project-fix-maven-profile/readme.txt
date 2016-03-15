in order to use maven profile add :
<resourcesDirectory>${project.basedir}/target/classes</resourcesDirectory>

mvn cmd :
mvn clean install -Penv1