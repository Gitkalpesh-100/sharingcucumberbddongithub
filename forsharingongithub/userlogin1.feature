@tag
Feature: Sample feature

  Scenario Outline: Test
    Given I want to write a step with precondition
    When I complete action "execution"
    Then I validate the outcomes "<status>"

    Examples: 
      | status |
      | pass   |
      | fail   |

      
    