Feature: Search a movie in a Movie Database

  Scenario: Navigating the movie database themovie
    Given I am on the homepage
    Given Cursor is in search field and type Barbie
    When I click search button
    Then result showing Barbie

