#Author: Nagarajan.email@your.domain.com
Feature: Add Tariff plan details
@AddTariff @Smoke

  Scenario Outline: Tariff plan validation
    And user select Add Tariff Plan Details
    When user need to fill the tariff details "<MR>","<FLM>","<FIM>","<FSP>","<LPMC>","<IPMC>","<SPC>"
    And User click the submit button
    Then user verify congratulation message

    Examples: 
      | MR  | FLM | FIM | FSP | LPMC | IPMC | SPC |
      | 100 | 200 | 300 | 400 |  500 |  600 | 700 |
      | 110 | 220 | 330 | 440 |  550 |  660 | 770 |
    
