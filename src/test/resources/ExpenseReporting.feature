Feature: Expense Reporting
  In order to save myself time
  As manager of Department X
  I want to export a report of expense report data

  Scenario: No expenses to report
    Given that no new expenses exist
    When I export the report
    Then I see a 'No new data' warning