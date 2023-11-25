Feature: Hello First Feature

  Scenario Outline: Counting water bottles
    Given I have <opening balance> water bottles
    And I have drunk <processed> water bottles
    When I go to my fridge
    Then I should have <in stock> water bottles
    Examples:
      | opening balance | processed | in stock |
      | 5               |   4       |   1      |
      | 1               | 1         | 0        |
      | 500             | 100       | 400      |
      | 500             | 150       | 350      |
      | 4               | 8         | 0        |
      | 4               | -8       | 12      |

