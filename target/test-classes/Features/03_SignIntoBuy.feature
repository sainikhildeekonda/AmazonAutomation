
@SmokeTest
Feature: Feature to test the flow of SignInPage for Username or mobilenumber validation after buynow in Amazon Web Application,

Scenario: Verifying if User is asked for email or mobile number
    Given check sign-in page is displayed
    When check if User is asked for email or mobile number
    Then user stays in same page