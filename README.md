# Selenium Java - Thinkmatch - Super Portal

## Tools & Dependencies
- **Java** 21
- **Maven**
- **Selenium Java** 4.x
- **TestNG**
- **ChromeDriver**
- **Cucumber JVM (cucumber-java, cucumber-testng)**

---

## Key Components Overview

### Base Classes (base)
- BaseTest — initializes and quits WebDriver; manages browser setup.
- BaseSetup — extends BaseTest; creates and provides page object instances for tests.

### Hooks (hooks)
- Contains the Hooks class implementing Cucumber lifecycle hooks:
- @Before method to launch browser and prepare test environment.
- @After method to close browser and clean resources.

### Pages (pages)
- Implements Page Object Model to abstract UI page details:
- Defines locators and interaction methods (e.g., input username, click login).
- Promotes reusability and maintainability of test actions.

### Utils (utils)
- Provides common helper methods for Selenium operations such as:
- Waiting for elements visibility.
- Clicking elements safely.
- Inputting text with clearing first. 

### Step Definitions (steps)
- Maps feature file Gherkin steps to Java methods.
- Uses page objects to perform UI actions corresponding to each step.

### Feature Files (features)
- Written in Gherkin syntax to describe user scenarios and acceptance criteria.
- Stored in test resources to keep them decoupled from source code.

### Test Runner (runners)
- Entry point for running Cucumber tests integrated with TestNG.
- Configured with feature file paths, glue code packages, reporting plugins, and tags.

___

## How To Clone (Using IntelliJ IDEA)
1. Open **IntelliJ IDEA**.
2. From the main menu, select: File → New → Project from Version Control...
3. Select **Git** from the list.
4. Paste the repository URL: https://github.com/ariansyah-riwendi/selenium-java-thinkmatch-super-portal.git
5. Click **Clone**.
6. Wait for IntelliJ to finish downloading the project and load all dependencies.

## How To Run
1. Make sure you have **Java** and **Maven** installed.
2. In IntelliJ, open this file: src/test/java/com/automation/tests/LoginTest.java
3. Look on the left side of the class name — click the green **Run ▶** icon.
4. IntelliJ will execute the test, and the browser will open automatically.

## How To Generate Report
1. Open Terminal
2. allure generate --clean --single-file target/allure-results

