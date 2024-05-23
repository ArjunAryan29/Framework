@jobsearchinvalidjoblocation
Feature: Job Search with invalid job location
  As a job seeker
  I want to search for jobs on a NHS portal with invalid job location
  So that I can find no location found message

Scenario Outline: User search for a job by passing with invalid job location
   Given I am a job seeker on NHS Jobs website using "<browserName>" for invalid location search
   When I enter incorrect location in search
   Then I should get no location found
Examples:
|browserName|
|chrome|
|firefox|
|edge|