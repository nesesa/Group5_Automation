Feature: to create events by clicking on Event tab under Active Stream

  Background:
    Given User is on Home Page


    Scenario: User should be able to add Event start
    and ending date and time, select "All day" and specify the time zone.

      Given User navigates to Event tab
      When User adds Event start date and time
      And  User adds Event end date and time
      When User clicks ” All Day” checkbox
      When User clicks "Specify time zone"

  Scenario: Today's date should be  default  as start date and end date
    When User navigates to Event tab
    Then User sees the start date  and start time as default


  Scenario: User should  choose  valid date
    When User navigates to Event tab
    When User adds  "05/15/2022" star date
    When User clicks ” All Day” checkbox
    When User clicks the send button
    Then User sees the  "07/15/2022" on Active Stream



  Scenario: User should be able to set reminder

	   Given User clicks “Set reminder” checkbox
       When User fills out  a number to the number box
	   When User chooses "minutes" from time dropdown




