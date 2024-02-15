@list @android
Feature: List menu

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu

  @list @positive @long-press
  Scenario: Verify user successfully long press in list menu in 5 seconds
    And user do long press in five seconds in List ke-lima


  @list @positive @multiple-tap
  Scenario: verify user successfully multiple tap in List ke-10 three times
    And user do scroll until to List ke-sepuluh
    Then user do multiple taps three time in List ke-sepuluh