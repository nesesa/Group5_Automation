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


      Scenario: User should be able to set reminder

	   Given User clicks “Set reminder” checkbox
       When User fills out  a number to the number box
	   When User chooses "minutes" from time dropdown




