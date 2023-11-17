Feature: Hello First Feature

  Scenario Outline: Counting water bottles
    Given I have <opening balance> water bottles
    And I have drunk <processed> water bottles
    When I go to my fridge
    Then I should have <in stock> water bottles
    Examples:
      | opening balance | processed | in stock |
      | 10              | 1         | 5        |
      | 1               | 1         | 0        |
      | 0               | 4         | 2        |
      | 500              | 150         | 2        |
      | 0               | 4         | -2        |

