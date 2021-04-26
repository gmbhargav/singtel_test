# Singtel Automation test

## Prerequisites
- ** >=JDK8 installed      **
## TechStack Used:
1. Selenium WebDriver
2. Programming : Java
3. Junit
4. BDD: Cucumber feature file
5. Build Tool- Maven
6. Logging: log4j

## Usage
- Clone the repo      :
```git clone https://github.com/gmbhargav/singtel_test.git```
- Run Below command to execute automation suite on different browsers:
    - Chrome (default): ```mvn verify -Dbrowser=chrome -Dcucumber.filter.tags=@todo_tasks```
    - Chrome Headless : ```mvn verify -Dbrowser=chrome-headless -Dcucumber.filter.tags=@todo_tasks```
    - Firefox         : ```mvn verify -Dbrowser=firefox -Dcucumber.filter.tags=@todo_tasks```

## Test Results Report
- Refer to the below path for cucumber reports:
    ``` target/cucumber-advanced-reports/cucumber-html-reports```
    - Open ```target/cucumber-advanced-reports/cucumber-html-reports/overview-features.html```  for the detailed report
    - Screen shots captured and attached to the html report after every scenario.