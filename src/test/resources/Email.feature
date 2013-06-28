# Maybe Email+<something else> in the future

Feature: Email
  In order to save myself time
  As manager of Department X
  I want to allow my employee to submit expenses via email

  # todo Not realistic...
  Scenario Outline: Process multiple expenses in mail body
    Given a line with value <line_1>
    And a line with value <line_2>
    And something else with value "123, 456, hello"
    When I process both lines
    Then I get <result>
   
    Examples:
      | line_1 | line_2 | result |
      | "bob,mcdonalds,200,jpy"  | "jane,first kitchen,500,jpy"  | "some result"    |
      | "bob,mcdonalds,200,jpy"  | "jane,first kitchen,500,jpy"  | "some result"    |
      | "jim,mcdonalds,200,jpy"  | "jane,first kitchen,500,jpy"  | "some result"    |