@jobsearch
Feature: Job Search with valid search preference and filter by recent date
  As a job seeker
  I want to search for jobs on a NHS portal and filter results by recent date
  So that I can find relevant job opportunities

Scenario Outline: User search for a job by passing search preference and filter result by recent date
  Given I am a job seeker on NHS Jobs website using "<browserName>" for job search
  When I put search preference into the Search functionality
  Then I should get a list of jobs which matches my preferences
  And sort my search results with the newest Date Posted
Examples:
|browserName|
|chrome|
|firefox|
|edge|