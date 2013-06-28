package com.nheinric.ae

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit
import com.nheinric.ae.exception.NoNewDataException

/**
 * See: http://www.scalatest.org/getting_started_with_junit_4_in_scala
 * 
 * Test results appear in the JUnit view
 */
class ExpenseReportJUnitTest extends JUnitSuite with ShouldMatchersForJUnit {

  @Before def setUp() { }

  @After def tearDown() { }
  
  @Test def newExpenseReportHasZeroEntries () {
    assertEquals( 0, new ExpenseReport().entries.size )
  }

//  @Rule val ee:ExpectedException = ExpectedException.none()
  @Test def newExpenseReportThrowsNoNewDataExceptionOnExport() {
    evaluating { new ExpenseReport().export } should produce [NoNewDataException]
  }
}