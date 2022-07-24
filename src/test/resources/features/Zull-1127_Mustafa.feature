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

  @AC2
  Scenario Outline: Attaching a link to the specified text.
    When User is on MESSAGE page
    And User click Link button
    And User write a description into the "<Text>" label
    And User write the link about the description into the "<Link>" label
    And User clicks Save button
    And User clicks SEND button on Message page
    Then User sees the "<Text>" is written as a link in the Message box

    Examples: Users enters texts and links written below

    |Text           |Link                           |
    |ITU Mech. Eng. |https://mkn.itu.edu.tr/en/home |
    |Google         |https://www.google.com/        |
    |Yandex         |https://ceviri.yandex.com.tr/  |


  @AC3
  Scenario Outline:Inserting YouTube and Vimeo videos.
    When User is on MESSAGE page
    And User click Insert Video button
    And User enter "<URL>" address of a YouTube video and a Vimeo video
    And User clicks Save button on the opened popup
    And User clicks SEND button on Message page
    Then User sees the video on Activity Stream

    Examples: Users enters links written below

    |URL                                          |
    |https://vimeo.com/249226357                  |
    |https://www.youtube.com/watch?v=CYYtLXfquy0  |


  @AC4
  Scenario Outline:Adding quotes.
    When User is on MESSAGE page
    And User clicks Quote Text button
    And User writes a "<Quotes>" into the highlighted row
    And User clicks SEND button on Message page
    Then User sees the "<Quotes>" in Activity Stream

    Examples: Users enters Quotes written below

      | Quotes          |
      | Mustafa Ornek   |
      | Salih Ornek     |
      | Seyfullah Ornek |


  @AC5
  Scenario Outline:Adding tags to messages.
    When User is on MESSAGE page
    And User writes something into the message box
    And User click Add Tag button
    And User writes "<Tags>" into the highlighted row
    And User click Add button
    And User clicks SEND button on Message page
    Then User sees each "<Tags>" in Activity Stream

    Examples: Users enters Quotes written below

      | Tags      |
      | Isparta   |
      | Antalya   |
      | Istanbul  |
      | Ankara    |



  @AC6 @wip
  Scenario Outline:Removing tags before sending the message.
    When User is on MESSAGE page
    And User writes something into the message box
    And User click Add Tag button
    And User writes "<Tags>" into the highlighted row
    And User click Add button
    And User click X sign of the tag text into the Tags row
    And User clicks SEND button on Message page
    Then User cant see the "<Tags>" in the Tags row


    Examples: Users enters Quotes written below

      | Tags      |
      | Isparta   |
      | Antalya   |
      | Istanbul  |
      | Ankara    |
