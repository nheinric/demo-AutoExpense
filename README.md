Description
================
A testbed Scala app for \*TDD testing with Cucumber/JUnit/ScalaTest/etc.

Installation in Eclipse (Juno, with Scala IDE)
================
 1. Import to Eclipse (as a Maven project)
 1. Right-click Project -> Configure -> Add Scala Nature

Run Cucumber tests in Eclipse
================
 1. Right-click a src/test/resources/\*.feature file -> Run As -> Run Configurations
 1. Make new 'Java Application' config
    1. Main -> Main class: cucumber.api.cli.Main
    1. Arguments -> Program arguments:
        ${selected_resource_loc}
        --glue com.nheinric.ae
        --format pretty
        --monochrome
    1. Arguments -> VM Arguments
        -ea
    * You may not have to perform the next step. On my Eclipse install, even though 'Maven Dependencies' was listed here, cucumber-core and cucumber-scala were not loaded. I had to add them by hand:
    1. Classpath -> User Entries -> Add External Jars
        1. ~/.m2/repository/info/cukes/cucumber-core/1.1.1/cucumber-core-1.1.1.jar
        1. ~/.m2/repository/info/cukes/cucumber-scala/1.1.1/cucumber-scala-1.1.1.jar
