Feature: Validate AccountDetails functionality of of GrotechMinds Banking Application

  @accountdetails
  Scenario Outline: Validate AccountDetails functionality in GrotechMinds Banking Application
    Given user open the url for banking application
    And user clicks on AccountDetail button in WebPage
    And user navigated to the AccountDetails Page
    And Select Account  from DropDown
    And click on Login button
    And click on Deposit
    And enter the amount to be deposited as "<depositAmount>"
    When click on Deposit button
    Then balance is updated
    And click on withdrawl
    And enter amount to be withdrawn as "<withdrawlAmount>"
    When click on withdraw button
    Then balance will be updated

    Examples: 
      | depositAmount | withdrawlAmount |
      |         5000 |            2000 |
