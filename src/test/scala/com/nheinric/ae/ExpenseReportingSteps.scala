package com.nheinric.ae

import cucumber.api.scala.{ ScalaDsl, EN }
import cucumber.runtime.PendingException
import org.scalatest.matchers.ShouldMatchers
import com.nheinric.ae.exception.NoNewDataException

/**
 * Cucumber steps for testing the ExpenseReport class
 * 
 * See test/resources/ExpenseReporting.feature
 * 
 * Test results appear in the Console view
 */
class ExpenseReportingSteps extends ScalaDsl with EN with ShouldMatchers {
  var report:ExpenseReport = null;

  Given("""^that no new expenses exist$""") { () =>
    report = new ExpenseReport()
    report.entries should be('empty)
  }
  When("""^I export the report$""") { () =>
    // todo Not really anything to do here... Good form?
  }
  Then("""^I see a 'No new data' warning$""") { () =>
    val thrownException = evaluating {
      report.export()
    } should produce[NoNewDataException]
  }
}