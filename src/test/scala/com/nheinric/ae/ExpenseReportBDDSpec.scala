package com.nheinric.ae

import org.scalatest.BeforeAndAfterAll
import org.scalatest.BeforeAndAfterEach
import org.scalatest.FlatSpec
import org.scalatest.ShouldMatchers
import com.nheinric.ae.exception.NoNewDataException

/**
 * A BDD-style 'spec' for the ExpenseReport class
 * 
 * Test results appear in the Console and ScalaTest views
 * 
 */
class ExpenseReportBDDSpec extends FlatSpec with ShouldMatchers with BeforeAndAfterEach with BeforeAndAfterAll {

  "A new ExpenseReport" should "have 0 entries" in {
    new ExpenseReport().numberOfEntries should equal(0)
  }
  
  it should "throw a NoNewData exception when `export` is run" in {
    evaluating { new ExpenseReport().export() } should produce [NoNewDataException]
  }
}