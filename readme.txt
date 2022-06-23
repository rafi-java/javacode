#mvn archetype:generate
#mvn archetype:generate -Dfilter=org.apache.maven.archetypes:
#mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 
mvn archetype:generate -DgroupId=com.myworld.javacode -DartifactId=snippet -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

#git project init steps
echo "# javacode" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/rafi-java/javacode.git
git push -u origin main