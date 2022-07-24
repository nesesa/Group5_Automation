
@wip
Feature: AzulCRM verifying sending message functionality by clicking on Message tab under Active Stream.


  Background:
    Given User is on homepage
    Given User navigates to messages tab

   @AC1
  Scenario: User should be able to send message by filling mandatory fields
     And User clicks on send message button
     And User sees "The message title is not specified"
     And User removes  All Employees button
     And User clicks on send message button
     Then User sees error "Please specify at least one person."

 @AC2
  Scenario: User should be able to see message delivery should be to 'All employees' option by default and should be changeable
    And User sees message delivery is to "All employees" by default
    And User clicks on add more button
    And User clicks Employees and Departments button
    And User clicks on email
    Then User sees "helpdesk1@cybertekschool.com" on the screen
@AC3
Scenario: User should be able to cancel sending messages at any time before sending
  And User writes "cancelling my message"
  And User clicks on add more button
  And User clicks cat animal
  Then User clicks on cancel button

@AC4
Scenario: User should be able to delete messages after sending
  When User writes "cancelling my message"
  And User clicks on send message button
  And User clicks on add more button from the sent message section
  And User clicks on delete button
  Then User sees that message is deleted


