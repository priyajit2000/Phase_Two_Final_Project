
Feature: Star Health Buy Now Flow

  Scenario Outline: Validate the Star Health Buy Now flow
    Given User launches the Star Health application with "<URL>"
    And User waits for the Welcome to Star Health pop-up and closes it
    When User validates the Star Health home page title using a JUnit assertion
    And User clicks on the Buy Now button
    And User types Name as "<FullName>"
    And User types Phone as "<PhNo>"
    And User types the PIN as "<PIN>"
    And User clicks on I need health insurance from the drop-down menu
    And User selects the option "<OptionPlan>"
    And User sees the Plan for My Family page
    And User validates that the mobile number is the same as the previously entered number using a JUnit assertion
    And User clicks on the Star Health logo
    And The Application should redirect to the home page
    And User closes the child tab
    And User navigates back to the parent tab
    

    Examples:
      | URL                            | FullName      | PhNo         | PIN   | OptionPlan        |
      | https://www.starhealth.in/     | John Doe      | 1234567890   | 1234  | FamilyPlan        |
      | https://www.starhealth.in/     | Jane Smith    | 9876543210   | 5678  | IndividualPlan    |
      | https://www.starhealth.in/     | Bob Johnson   | 9998887777   | 4321  | SeniorCitizenPlan |
