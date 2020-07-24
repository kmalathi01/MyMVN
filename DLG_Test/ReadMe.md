# Cucumber BDD Test Automation Framework

This BDD test automation framework built using Java , Junit and Cucumber to support automation testing of
websites on various browsers. This project has been prepared using Maven and 
Selenium Page object factory


## Prerequisites
install Maven (apache-maven-3.5.4 or higher)


## Dependencies
* Java (1.8 )
* Selenium (.141.59 or higher)
* IO Cucumber JVM  (6.2.2 or higher)
* IO Cucumber JUnit (6.2.2 or higher)
* Junit (4.1.3 or higher)


## Running the tests
```
mvn clean test

or

mvn test -Dcucumber.options="--tags @smoke"


or

run the "RuncucumberTest.java" (../src/test/java/QA_Experience_Login/RunCucumberTest.java) from any IDE
```