Feature: Corporate Ola Cabs Login screen

  Background: User Navigates to the Corporate Ola Cabs URL
    Given User Navigates to the Corporate Ola Cabs URL

  Scenario Outline: Verfiy if the Name field allows only 100 characters
    When User Enters "<name>" in the Name field
    Then Verify if Name field allows only 100 characters by comparing with "<name>"

    Examples: 
      | name                                                                                                   | value | status  |
      | A a B b C c D d E e F f G g H h I i J j K k L l M m N n O o P p Q q R r S s T t U u V v W w X x Y t123 |     5 | success |
      | name2                                                                                                  |     7 | Fail    |
