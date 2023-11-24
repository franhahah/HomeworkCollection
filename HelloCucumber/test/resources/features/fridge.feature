Feature: Fridge
  As a user,
  I want to be able to keep my water bottles in my fridge

  Scenario Outline: Counting water bottles
    Given I have <opening balance> water bottles
    And I have drunk <processed> water bottles
    When I go to my fridge
    Then I should have <in stock> water bottles
    Examples:
      | opening balance | processed | in stock |
      | 10              | 1         | 9        |
      | 10              | 6         | 4        |
      | 0               | 1         | 0        |