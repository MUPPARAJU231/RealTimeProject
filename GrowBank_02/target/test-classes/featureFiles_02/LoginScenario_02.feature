Feature: Validate Login functionality of of GrotechMinds Banking Application

 @login
  Scenario Outline: Validate login functionality in GrotechMinds Banking Application
    Given user open the url for banking application
    And user clicks on Login button in WebPage
    And user enters the username as "<uid>"
    And user enters the pwd as "<pwd>"
    When user clicks on Submit button
    Then validate that user is getting proper response from site
    And also verify that the Title of the page is showing correct value

    Examples: 
      | uid  | pwd       |
      | 1234 | Test@1234 |
