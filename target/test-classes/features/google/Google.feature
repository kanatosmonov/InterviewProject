Feature: Testing google functionalities
  Scenario: Happy path Google search functionality
    Given User navigates to google.com
    When User searches for 'morning jogging'
    Then User gets 'The Top 11 Benefits Of Running In The Morning' as the first result