# CucumberTestng_AllureReport

# Request
1. Java 8 or higher
2. Maven
3. IntelliJ/Eclipse

# Add Allure Maven Dependencies
<!-- https://mvnrepository.com/artifact/io.qameta.allure/allure-cucumber7-jvm -->
        <dependency>
            <groupId>io.qameta.allure</groupId>
            <artifactId>allure-cucumber7-jvm</artifactId>
            <version>2.17.2</version>
        </dependency>

# Add Allure in Test Runner
@CucumberOptions(
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}

# Install Allure Commandline
npm install -g allure-commandline --save-dev

# Generate Allure Report in Commandline
allure generate --clean && allure open


# Allure Report
![](https://i.imgur.com/gYTzfmK.png)

![](https://i.imgur.com/F3DpVWD.png)



