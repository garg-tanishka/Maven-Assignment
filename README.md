# Maven-Assignment

It's a multi module project. 
We have a module "Assign" whose modules are "string_api" and "string_impl".
We have three pom files each for all modules.
In Assign pom.xml file we have created the modules and added the assembly plugin. And the packaging here should be "pom".
In string_api pom.xml file we have mentioned the parent module specifications with packaging as "jar".
In string_impl pom.xml file we have mentioned the parent module specifications with packaging as "jar". We have mentioned the dependency as string-api because we want to call the string_api java class inside the string_impl. And we have added the plugins too i.e checkstyle and spotbugs. 
There are two java files StringFunctions.java in string_api module and Application.java in string_impl.
Basically, in StringFunctions we have created two methods i.e stringReverse and stringLength.
Then, we have created the object of StringFunctions in Application class and called them.


For building the Target folder run this command - mvn clean compile assembly:single
Then from the string_impl/target run this command - java -jar string_impl-1.0-SNAPSHOT-jar-with-dependencies.jar

