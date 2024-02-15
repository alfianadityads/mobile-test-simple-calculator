Feature: Math Operations Numbers

  @positive @android @summation
  Scenario: User summation 2 numbers and get correct result
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    And user successfully login
    And user inputs Angka Satu as "2"
    When user clicks dropdown operation menu
    And user clicks sum operator
    And user inputs Angka Dua as "3"
    When user clicks calculate button
    Then the result of summation operation should be correct


  @positive @android @subtraction
  Scenario: User subtraction 2 numbers and get correct result
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    And user successfully login
    And user inputs Angka Satu as "10"
    When user clicks dropdown operation menu
    And user clicks subtraction operator
    And user inputs Angka Dua as "3"
    When user clicks calculate button
    Then the result of subtraction operation should be correct

  @positive @android @division
  Scenario: User division 2 numbers and get correct result
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    And user successfully login
    And user inputs Angka Satu as "20"
    When user clicks dropdown operation menu
    And user clicks division operator
    And user inputs Angka Dua as "5"
    When user clicks calculate button
    Then the result of division operation should be correct

  @positive @android @multiplication
  Scenario: User multiplication 2 numbers and get correct result
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    And user successfully login
    And user inputs Angka Satu as "7"
    When user clicks dropdown operation menu
    And user clicks multiplication operator
    And user inputs Angka Dua as "3"
    When user clicks calculate button
    Then the result of multiplication operation should be correct