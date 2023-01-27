#Author:
#Date
@SmokeTest
Feature: Feature to test the flow Home Page of Amazon Web Application,

  #description about scenario
  Scenario: Check for Amazon on Home Page
    Given User launch the browser
    When user open the amazon application
    Then Home Page of amazon should be displayed

  Scenario: selecting the Hamburger on the home page
    Given check hamburger menu is displayed
    When User click on hamburger menu
    Then the menu should open and contents should be displayed

  Scenario: selecting Kindle under Digital Content and Devices
    Given check kindle in Digital Content and Devices is displayed
    When User click on kindle
    Then User should redirect to the Kinder E Reader menu

  Scenario: selecting the all new kindle
    Given check all new kindle is displayed
    When User click on all new kindle
    Then the Kindle details page should be displayed



