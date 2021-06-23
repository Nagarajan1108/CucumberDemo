#Author: Nagarajan.email@your.domain.com
Feature: validating customer flow
@AddCustomer @Smoke

Background:
And user Select Add Customer Field



  Scenario: Add Customer Validation
    
    When user need to fill up the customer details
    And User Click the Submit button
    Then User fetch the Customer id when it is Generated

  Scenario: Add Customer Validation by one dimensional list concepts
  
   
    When user need to fill up the customer details by onedim list
      | NaGa | P | surya@gmail.com | ambalpuram | 8526825456 |
    And User Click the Submit button
    Then User fetch the Customer id when it is Generated


@sanity
  Scenario: Add Customer Validation by one dimensional Map concepts
  

    When user need to fill up the customer details by onedim Map
      | Fname   | NaGa            |
      | Lname   | P               |
      | mail    | surya@gmail.com |
      | Address | ambalpuram      |
      | Mobile  |      8526825456 |
    And User Click the Submit button
    Then User fetch the Customer id when it is Generated


@sanity
  Scenario: Add Customer Validation by two dimensional list concepts
  
   
    When user need to fill up the customer details by Twodim list
      | NaGa  | P  | surya@gmail.com | ambalpuram | 8526825456 |
      | surya | P  | sur@gmail.com   | madurai    | 8526826213 |
      | gayu  | sr | gayu@gmail.com  | madurai    | 3523545621 |
      | nivi  | n  | nivi@gmail.com  | chennai    | 7544545126 |
    And User Click the Submit button
    Then User fetch the Customer id when it is Generated


@sanity
  Scenario: Add Customer Validation by two dimensional Map concepts


    When user need to fill up the customer details by Twodim Map
      | Fname | Lname | mail            | Address    | Mobile     |
      | NaGa  | P     | surya@gmail.com | ambalpuram | 8526825456 |
      | surya | P     | sur@gmail.com   | madurai    | 8526826213 |
      | gayu  | sr    | gayu@gmail.com  | madurai    | 3523545621 |
    And User Click the Submit button
    Then User fetch the Customer id when it is Generated
