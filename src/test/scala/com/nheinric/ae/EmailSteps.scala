package com.nheinric.ae

import cucumber.api.scala.{ ScalaDsl, EN }
import cucumber.runtime.PendingException
import org.scalatest.matchers.ShouldMatchers

class EmailSteps extends ScalaDsl with EN with ShouldMatchers {
  //Given("""^a line with value "([^"]*)"$"""){ (arg0:String) =>

  Given("""^a line with value "([^"]*)"$""") { (lineVal: String) =>
    println("JUST GOT LINE OF VALUE '" + lineVal + "'")
    "hello".size should be (5)
  }
  Given("""^something else with value "([^"]*)"$""") { (arg0: String) =>
    println("Just got something else: '" + arg0 + "'")
  }
  When("""^I process both lines$""") { () =>
    //// Express the Regexp above with the code you wish you had
    val ex = new PendingException()
  }
  Then("""^I get ReportObjectWithTwo$""") { () =>
    //// Express the Regexp above with the code you wish you had
    throw new PendingException()
  }

}