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
- [User Stories & Contributors](#user-stories-contributors)
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

### User Story (US601):

>>> As a user, I want to benefit from bank services by opening an account on the Para Bank website. When I complete the account opening process, I must verify that I have successfully registered. So I can access my private bank services.

(![US_601_Reg](https://github.com/user-attachments/assets/1ad438b1-abb5-4839-bd34-e681587bfcb0))

### User Story (US602):

>>>   As a user, I want to access my account by logging into the Para Bank website and perform my bank transactions. I need to confirm whether logging into the site is successful or unsuccessful by testing my login process with valid and invalid user information. So I can be sure that I have accessed the site safely.

![US_602_Login](https://github.com/user-attachments/assets/2f48a366-5eb4-44d9-90ff-1a65fb5499db)
![US_602_Login_Neg](https://github.com/user-attachments/assets/fd8f2a5c-0f0d-4514-b4b9-281f7214fbc4)

### User Story (US603):

>>>   As a user, I want to pay my invoices through the Para Bank website. I need to verify the invoice payment process of the system by paying different types of invoices (electricity, water, natural gas). So I can spend the time I spend on invoice transactions.

![US_603_BillPayment](https://github.com/user-attachments/assets/b303394a-d567-4e83-91dc-dca37f923f92)

### User Story (US604):

>>>   As a user, I want to be able to create futures and demand accounts. Thus, I can better organize my financial transactions and manage efficiently.

![US_604_NewAccount](https://github.com/user-attachments/assets/4e14cb7d-ab9d-4672-8c7f-89a3dcedea5a)
![US_604_NewAccount2](https://github.com/user-attachments/assets/63992173-ac52-4837-bc4f-5f4fef28eda2)

### User Story (US605):

>>>   As a user, I would like to transfer money from one of my current accounts to another. In this way, I can quickly meet my different financial needs.

![US_605_TransferFunds](https://github.com/user-attachments/assets/6719bc3f-cebe-45c1-afae-b2a28d2d78f9)

### User Story (US606):

>>>   As a user, I want to update the contact information in my profile. In this way, my address, my phone number and other contact information will be up-to-date and correct, so that I can communicate with the bank in a smooth way when communicating and transactions.

![US_606_UpdateContact](https://github.com/user-attachments/assets/3c0c59ba-c8b5-445c-88af-7cc2bba97398)

### User Story (US607):

>>>   As a customer, I would like to apply for a loan through the Parabank website. This way, I can get the financing I need and follow the status of my application.

![US_607_Loan_Credit](https://github.com/user-attachments/assets/ab688fc6-65b5-406f-972c-843cd8cae29e)

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

**3. Smoke and Regression Testing:** Separate classes were created for smoke and regression test cases within the runners package.

## User Stories & Contributors

| Contributor                                               |               Role                    |   User Stories     |
|-----------------------------------------------------------|---------------------------------------|------------------- |
| [Ümmühan Teke](https://github.com/UmmuhanTeke)            | Project Lead & QA Automation Engineer |  [US604 - US606]   |
| [Sefa Kahraman](https://github.com/SefaKahramann)         | QA Automation Engineer                |  [US601 - US602]   |
| [Merve Kaya](https://github.com/kayyamervee)              | QA Automation Engineer                |  [US603 - US607]   |
| [Songül Çam](https://github.com/songulcam)                | QA Automation Engineer                |  [US605]           |

## License  

This project is open-sourced software licensed under the [MIT license](https://opensource.org/licenses/MIT).
