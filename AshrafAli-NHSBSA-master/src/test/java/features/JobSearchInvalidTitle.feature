@jobsearchinvalidjobtitle
Feature: Job Search with invalid job title
  As a job seeker
  I want to search for jobs on a NHS portal with invalid job title
  So that I can find no result found message

Scenario Outline: User search for a job by passing with invalid job title
  Given I am a job seeker on NHS Jobs website using "<browserName>" for invalid title search
  When I enter incorrect job title in search
  Then I should get no results found
Examples:
|browserName|
|chrome|
|firefox|
|edge|