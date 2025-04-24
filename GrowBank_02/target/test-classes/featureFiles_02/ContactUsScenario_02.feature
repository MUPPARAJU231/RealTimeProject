Feature: Validate ContactUs Functionality of GrotechMinds Banking Application

  @contactus
  Scenario Outline: Validate ContactUs functionality in GrotechMinds Banking Application
    Given user open the url for banking application
    And user clicks on ContactUs button in WebPage
    And user enters the yourname as "<yourname>"
    And user enters the youre-mail as "<youre-mail>"
    And user enters the phoneNumber as "<phoneNumber>"
    And user enters the address as "<address>"
    And user enters the country as "<country>"
    And user enters the zipcode as "<zipcode>"
    When user clicks on Submit button
    Then validate that user is getting proper response from site
    And also verify that the Title of the page is showing correct value

    Examples: 
      | yourname | yourEmail          | phoneNumber | address | country | zipcode |
      | veer     | muppa123@gmail.com |  9848012345 | Darsi   | India   |  523247 |
