@usps
Feature: Zip code correctly populates when partial address number, street, city, and state are entered
  As a post office customer
  I want to ensure I have the correct zip code for my mail

        #Scenario outline (needs Example = for syntax) is for execution of same test case more than once
  Scenario: Validate zip code for a given address on the Look Up a ZIP Code page

    Given I look up a zip code using <"edge">
    When I enter a street address
    And I enter the city
    And I select the state
    And I click the Find button
    Then I can see that the correct zip code displays in the result