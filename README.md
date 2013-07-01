Description
================
A testbed Scala app for \*TDD testing with Cucumber/JUnit/ScalaTest/etc.

Install the Scala IDE packages
================
 1. http://scala-ide.org/docs/user/gettingstarted.html

Install the m2eclipse-scala packages
================
 1. Help -> Install New Software -> Add button
 1. Enter any name you want for the repo
 1. URL: http://alchim31.free.fr/m2e-scala/update-site
 1. Install all available plugins
 1. Restart Eclipse

Install this demo (Juno)
================
 1. In your Eclipse workspace directory: `git clone https://github.com/nheinric/demo-AutoExpense.git`
 1. File -> New -> Scala Project
 1. Set 'Name' to 'demo-AutoExpense'
 1. Click 'Finish'
 1. Right-click Project -> Configure -> Convert to Maven Project
 * Eclipse should now create a 'Maven Dependencies' library in the project for you

Run Cucumber tests in Eclipse
================
 1. Right-click a src/test/resources/\*.feature file -> Run As -> Run Configurations
 1. Make new 'Java Application' config
    1. Name: AE Cuke Test
    1. Main -> Project: demo-AutoExpense
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
