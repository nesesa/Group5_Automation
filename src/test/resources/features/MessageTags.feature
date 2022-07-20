Feature: As a user, I should be able to add link, insert video, mention, quote, add tag in message

  Background: For the scenarios in the feature file, user is expected to be on homepage
    Given User is on homepage
    Given User navigates to messages tab


  Scenario: User should be able to add mentions about only department employees
    When User clicks Add Mention button
    And User clicks Employee and departments tab
    When User clicks on first Department Employee username
      | helpdesk22@cybertekschool.com |
    When User clicks Send button at Messages Tab
    Then User sees mentioned Employee username on Activity Stream
      | helpdesk22@cybertekschool.com |



  Scenario Outline: User should be able to attach link to specified text
    When User clicks Link button
    When User fills out the text box with "<Text>" and link ribbon with "<Link>"
    And User clicks Save button
    When User clicks Send button at Messages Tab
    Then User sees the "<Link>" attached to a specific "<Text>"

    Examples: Users enter the following text and links

      | Text                                           | Link                                                                                       |
      | The Last Human – A Glimpse Into The Far Future | https://www.youtube.com/watch?v=LEENEFaVUzU&ab_channel=Kurzgesagt%E2%80%93InaNutshell      |
      | You Are Not Where You Think You Are            | https://www.youtube.com/watch?v=Pj-h6MEgE7I&t=4s&ab_channel=Kurzgesagt%E2%80%93InaNutshell |
      | Death From Space — Gamma-Ray Bursts Explained  | https://www.youtube.com/watch?v=RLykC1VN7NY&ab_channel=Kurzgesagt%E2%80%93InaNutshell      |


  Scenario Outline: User should be able to insert YouTube and Vimeo video
    When User clicks Insert Video button
    When User enters "<URL>" of the Video from "<Type>"
    And User clicks Save button at Video popup
    When User clicks Send button at Messages Tab
    Then User sees the video URL at Activity Stream

    Examples: User uses the following links
      | URL                                         | Type    |
      | https://www.youtube.com/watch?v=ZLl6jo_HUwc | YouTube |
      | https://vimeo.com/301619060                 | Vimeo   |


  Scenario Outline: User should be able to add quotes
    When User clicks Quote Text button
    When User enters a "<Quote>" in yellow quote ribbon
    When User clicks Send button at Messages Tab
    Then User sees the "<Quote>" in Activity Stream

    Examples: The quotes are as following
      | Quote                                                                       |
      | As you know, madness is like gravity...all it takes is a little push.'      |
      | Education is the most powerful weapon which you can use to change the world |


  Scenario Outline: User should be able to add tags in message
    When User clicks add tag button
    When User enter a message input in message box
    When User enters "<Tags>" in input box
    And User clicks add button
    And User clicks Send button at Messages Tab
    Then User sees "<Tags>" in Activity Stream

    Examples: The tags used in the test are as following
      | Tags     |
      | Cydeo    |
      | Java     |
      | Selenium |


  Scenario Outline: User should be able to remove tags before sending the message
    When User clicks add tag button
    When User enter a message input in message box
    When User enters "<Tags>" in input box
    And User clicks add button
    When User clicks delete sign next to the tag
    And User clicks Send button at Messages Tab
    Then User removes the "<Tags>"

    Examples: The tags used in the test are as following
      | Tags     |
      | Cydeo    |
      | Java     |
      | Selenium |
