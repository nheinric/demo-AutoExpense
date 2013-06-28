package com.nheinric.ae

import com.nheinric.ae.exception._

class ExpenseReport {
  val entries = Seq()

  def export() {
    throw new com.nheinric.ae.exception.NoNewDataException()
  }

  def numberOfEntries(): Int = {
    entries.size
  }
}