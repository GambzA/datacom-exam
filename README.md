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

![datacom-sample](https://github.com/user-attachments/assets/3094449f-8335-4947-9558-577e532a27de)


If `@pr_test` is placed above `Feature` it will run all test scenarios.


Thank you.
