# Agile Software Testing Project - ParaSoft/Parabank

**One Week Sprint**
**URL:** [Parasoft Project](https://parabank.parasoft.com/)

**Alternative URL:** [Parasoft Project](https://para.testar.org/)

## Table of Contents
- [Project Description](#project-description)
- [User Story Summary](#user-story-summary)
- [Technologies and Tools Used](#technologies-and-tools-used)
- [Prerequisites](#prerequisites)
- [Project Requirements](#project-requirements)
- [User Stories & Contributors](#user-stories-&-contributors)
- [License](#license)

## Project Description:

Parabank is a virtual banking application that represents a simulated environment for testing and simulating financial
transactions. It is not a real financial institution but is used in place of a real banking application during software
testing.

The test environments provided above are designed for performing various operations that users can execute in a
web-based banking application. They are valuable tools for simulating financial transactions such as account creation,
money transfers, credit application submissions, and bill payments. They are utilized for implementing various test
scenarios.

The environment we will use for this sprint: [https://parabank.parasoft.com/](https://parabank.parasoft.com/)

## User Story Summary

- US601 | User Registration: Create registration records for new users in ParaBank.
- US602 | User Login: Verify the login process for registered users.
- US603 | Bill Payment Functionality: Test payment processes for various bill types such as electricity, water, and gas
  bills.
- US604 | Account Creation: Test the creation of both checking and savings accounts.
- US605 | Inter-Account Money Transfer: Testing user’s ability to transfer money between their own accounts.
- US606 | Contact Information Update: Test updating of user contact information.
- US607 | Loan Application: Test the loan application process and its outcomes.

## Technologies and Tools Used

- **Java** - Programming language
- **Selenium** - Web browser automation
- **TestNG** - Testing framework.
- **Cucumber** - Behavior Driven Development (BDD) framework.
- **ExtentReports** - Reporting library.
- **Apache POI** - Library for reading and writing Excel files
- **Java Faker** - Library for generating fake data.
- **Maven** - Dependency management and Build
- **slf4j** - Simple logging facade for java 
- **Git & GitHub** - Version control Systems 
- **JIRA & Zephyr-Squad** - Test management Tools
- **Page Object Model (POM)** - Test Automation Pattern
- **Grasshopper** -	HTML & PDF Report tool.

## Prerequisites

- **Java Development Kit (JDK):** Installed on your system for writing and compiling Java code.

- **IDE (Integrated Development Environment):** Choose IntelliJ IDEA for Java development.

- **Git:** Installed for version control, it is essential for managing your project's source code on GitHub.

- **Selenium WebDriver:** Become familiar with its usage and basic automation techniques.

- **TestNG:** Understand its annotations and how to write test cases using this framework.

- **Page Object Model (POM):** Understand and implement this pattern in your test automation framework.

- **JIRA & ZEPHYR Test Management Tool:** If using the system, ensure access to and understanding of test case creation, management, and defect reporting.
  

## Project Requirements

**1. Page Object Model (POM):** Utilize the POM design pattern for structuring the test cases.

**2. Parallel Testing:** Execute tests in parallel on multiple browsers (Chrome and Firefox).

**3. XML Configuration:** Run test cases from an XML file.

**4. Smoke and Regression Testing:** Separate XML files for smoke and regression test cases.


## User Stories & Contributors

| Contributor                                               |               Role                    |   User Stories     |
|-----------------------------------------------------------|---------------------------------------|------------------- |
| [Ümmühan Teke](https://github.com/UmmuhanTeke)            | Project Lead & QA Automation Engineer |  [US604 - US606]   |
| [Sefa Kahraman](https://github.com/SefaKahramann)         | QA Automation Engineer                |  [US601 - US602]   |
| [Merve Kaya](https://github.com/kayyamervee)              | QA Automation Engineer                |  [US603 - US607]   |
| [Songül Çam](https://github.com/songulcam)                | QA Automation Engineer                |  [US605]           |

## License  

This project is open-sourced software licensed under the [MIT license](https://opensource.org/licenses/MIT).
