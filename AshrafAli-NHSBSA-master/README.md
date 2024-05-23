#Project Title: NHS JOB SEARCH

#Description: This cucumber framework is used to perform user search in NHS job search page.

## Table of Contents

- [Introduction]
- [Features]
- [Installation & Prerequisites]
- [Framework Setup]
- [Steps to execute the test]
- [Reports]

## Introduction

This cucumber framework is used to perform job search in NHS job search page based on the user search preference. It also covers additional negative scenarios while passing invalid inputs for location and title in search preference. 

## Features

- Feature: Job Search with valid search preference
- Feature: Job Search with invalid job title
- Feature: Job Search with invalid job location

## Installation & Prerequisites
1)Java version-"11.0.23" or Latest Version(Ensure that the Java class path is properly set under system and environment variables)
2)Apache Maven-3.9.6
3)IntelliJ -IDE
4)Selenium-4.17.0 or Latest Version

###Framework Setup 

1. Clone the repository:    
    git clone https://github.com/Ashraf711855/ASHRAFALI-NHSBSA.git

###Steps to execute the test
    
1. Navigate to the project directory:    
    ```bash
    cd /<location of the project>
    ```
    
2. Install any dependencies and run below command for test execution:
    ```bash
    mvn test or mvn clean test
    ```
Notes:"mvn clean test" ensures a clean build by deleting the target directory before executing tests

###Reports
Verify the report in the following location "<location of the project>\target\cucumber-html-report"
"# ForSom" 
