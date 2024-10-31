## Roi Mark Gamba 
The following are the instructions on how to run
the automated test cases.

### Pre-requisites
1. Java version coretto-21
2. Maven should also be installed in your system
3. If possible run this on Windows, chromedriver is for win64

### Clone the Github repository
``https://github.com/GambzA/datacom-exam.git``

### Run initial configuration before running test
Please compile mvn pom first before proceeding
Please run the following command in terminal:
``mvn clean compile``

### Two ways to run tests
1. Maven based run can be executed with typing the command in terminal
``mvn test``

2. If using intelliJ, I have created a tag called @pr_test, this will run a specific scenario where tag is places, please see the illustration below;
![datacom-sample.gif](..%2F..%2FUsers%2FRoi%20Mark%20Gamba%2FDownloads%2Fdatacom-sample.gif)

If `@pr_test` is placed abode `Feature` it will run all test scenarios.


Thank you.