@skryabin
Feature: Get a quote successful submission
  As a quote requestor
  I want to generate a successful quote

Scenario Outline: Quote request by giving all necessary inputs
   Given I am quote generator using "<browserName>" for valid details
   When I enter valid Text box details
   And I enter Country details
   And I look for Related Documents
   And Provided the additional info and accepted the privacy policy
   Then I could see my quote was submitted successfully
Examples:
|browserName|
|edge     |