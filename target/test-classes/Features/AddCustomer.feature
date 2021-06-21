#Author: Nagarajan.email@your.domain.com


Feature: validating customer flow

 
  Scenario: Add Customer Validation
   Given user launch Telecom Application
   And user Select Add Customer Field
   When user need to fill up the customer details
   And User Click the Submit button
   Then User fetch the Customer id when it is Generated 

  