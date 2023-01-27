#Author:
#Date
@SmokeTest
Feature: Feature to test the flow of Kindle Product Details Amazon Web Application,

  #description about scenario
  Scenario: Buying the new kindle
    Given check Buy now is displayed
    When User click on buy now
    Then the User should be directed to login page