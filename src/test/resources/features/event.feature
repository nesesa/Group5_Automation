
Feature: to create events by clicking on Event tab under Active Stream

  Background:
    Given User is on Home Page


    Scenario: User should be able to add Event start
    and ending date and time, select "All day" and specify the time zone.

      Given User navigates to Event tab
      When  User adds Event start date and time
      And   User adds Event end date and time
      When  User clicks "Specify time zone"
      When  User clicks "All Day" checkbox

  Scenario: User should  choose  valid date
    When User navigates to Event tab
    When User adds  "05/15/2022" star date
    When User clicks "All Day" checkbox
    When User clicks the send button
    Then User sees the  "07/15/2022" on Active Stream


  Scenario: User should be able to set reminder
    Given User clicks “Set reminder” checkbox
    When User fills out  "number" to the number box
    When User chooses "days" from time dropdown

  Scenario: User should be able to select the event location from the dropdown
    When User clicks "select meeting room" button
    When User chooses "room" from dropdown
    Then User sees the chosen room on "Event location" box

  Scenario: User should be able to add members by selecting contacts individually  adding groups and departments
    When User click Members box
    When User add attendees by"selecting contacts individually"
    And User clicks the "pop up "button
    Then User sees selected person on the member box

  Scenario: User should be able to add members by adding groups and departments
    When User click Members box
    Then user adds attendees by "adding groups and departments"
    And User clicks the "pop up "button
    Then User sees selected groups and department on the member box

  Scenario: User should be able to send messages by filling the mandatory fields
    When User fills out Message Box with "CPD"
    When User clicks the send button
    Then User sees  event name on the Active Stream

  Scenario: User should be able to cancel sending event at any time before sending.
    When User adds Event star  date and time
    And  User adds Event end day date and time
    When User clicks "Specify time zone" box
    When User clicks "All Day" checkbox
    When User clicks the cancel button

  Scenario: User should be able to see event details parameters as "Availability, Repeat, Calendar, Importance".
    Given User navigates to Event tab
    When  user clicks More
    Then  the following event details parameters should be displayed
      | Availability |
      | Repeat       |
      | Calendar     |
      | Importance   |





