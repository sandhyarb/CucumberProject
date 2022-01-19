  
  Feature: Test the Put/Delete request in Lms API
  Background: Authorization is set to "Basic auth" 
 
@Put_request
Scenario: Check when Program Description is number or alphanumeric
Given User creates a PUT request for LMS API endpoint
When User sends request for program description as number or Alphanumeric
Then User receives 200 status code - sees the updated record.

Scenario: Check when Program Name is given as Special Characters
Given User creates a PUT request for LMS API endpoint
When User sends request for program name as special characters.
Then User receives 200 status code - sees the updated record.

Scenario: Check when 'Online' field is entered with numbers.
Given User creates a PUT request for LMS API endpoint
When User sends request with online field as numbers
Then User receive 200 status code - online field is displayed true by default.

Scenario: Check when the Program Name is Decimal
Given User creates a PUT request for LMS API endpoint
When User sends request with program name is Decimal
Then User receives status code 200 - user sees the updated record.



@Delete_request
Scenario: Check if we can delete an existing Program ID
Given User creates DELETE request for LMS API endpoint
When User sends request for existing Program ID
Then User receives Status code 200 OK - blank Response body
  
Scenario: Check if the Program is deleted
Given User creates GET request for LMS  API endpoint
When User sends request for deleted Program ID
Then User receives Status code 200 OK - null in the Response body     

Scenario: Check if we can delete a non existing Program ID
Given User creates DELETE request for LMS API endpoint
When  User sends request for non-existing Program ID 
Then  User receives Status 500 - Internal Server Error

Scenario: Check if we can delete with Program ID as blank
Given User creates DELETE request for LMS API endpoint
When User sends request for blank Program ID
Then User receives Status 405 - Method Not Allowed

Scenario: Check if we can delete with Program ID as alphanumeric
Given User creates DELETE request for LMS API endpoint
When User sends request for alphanumeric Program ID
Then User receives Status 400 - Bad Request
  