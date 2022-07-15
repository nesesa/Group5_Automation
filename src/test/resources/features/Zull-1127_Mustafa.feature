Feature: Functionality of adding link, insert video, mention, quote, add tag in Appreciation

  Background:
    Given User is on zulcrm home page
    When User login username
    And User login password
    Then User click Log In and login CRM main page



  @AC1
    Scenario: Adding mentions about only department employees.
      When User is on MESSAGE page
      And User click Add Mention button
      And User clicks Employee and departments button
      And User clicks one of the Department Employee mail address
      And User clicks SEND button on Message page
      Then User sees that Employee mail address on Activity Stream page

