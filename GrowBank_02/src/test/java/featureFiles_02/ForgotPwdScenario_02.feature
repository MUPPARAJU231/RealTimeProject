Feature: Validate ForgotPassword functionality of of GrotechMinds Banking Application

@forgotPwd
  Scenario Outline: Validate ForgotPassword functionality in GrotechMinds Banking Application
    Given user open the url for banking application
    And user clicks on ForgotPassword button in WebPage
    And user enters the e-mail as "<email>"
    And user enters the mobilenumber as "<mobileNo>"
    When user clicks on Submit button
    Then validate that user is getting proper response from site
    And also verify that the Title of the page is showing correct value

    Examples: 
      | email             | mobileNo   |
      | teat123@gmail.com | 9848012345 |
