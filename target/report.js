$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddTariffPlan.feature");
formatter.feature({
  "name": "Add Tariff plan details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Tariff plan validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddTariff"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user select Add Tariff Plan Details",
  "keyword": "And "
});
formatter.step({
  "name": "user need to fill the tariff details \"\u003cMR\u003e\",\"\u003cFLM\u003e\",\"\u003cFIM\u003e\",\"\u003cFSP\u003e\",\"\u003cLPMC\u003e\",\"\u003cIPMC\u003e\",\"\u003cSPC\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click the submit button",
  "keyword": "And "
});
formatter.step({
  "name": "user verify congratulation message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MR",
        "FLM",
        "FIM",
        "FSP",
        "LPMC",
        "IPMC",
        "SPC"
      ]
    },
    {
      "cells": [
        "100",
        "200",
        "300",
        "400",
        "500",
        "600",
        "700"
      ]
    },
    {
      "cells": [
        "110",
        "220",
        "330",
        "440",
        "550",
        "660",
        "770"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Tariff plan validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddTariff"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user select Add Tariff Plan Details",
  "keyword": "And "
});
formatter.match({
  "location": "TariffPlan.user_select_Add_Tariff_Plan_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to fill the tariff details \"100\",\"200\",\"300\",\"400\",\"500\",\"600\",\"700\"",
  "keyword": "When "
});
formatter.match({
  "location": "TariffPlan.user_need_to_fill_the_tariff_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "TariffPlan.user_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify congratulation message",
  "keyword": "Then "
});
formatter.match({
  "location": "TariffPlan.user_verify_congratulation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Tariff plan validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddTariff"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user select Add Tariff Plan Details",
  "keyword": "And "
});
formatter.match({
  "location": "TariffPlan.user_select_Add_Tariff_Plan_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to fill the tariff details \"110\",\"220\",\"330\",\"440\",\"550\",\"660\",\"770\"",
  "keyword": "When "
});
formatter.match({
  "location": "TariffPlan.user_need_to_fill_the_tariff_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "TariffPlan.user_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify congratulation message",
  "keyword": "Then "
});
formatter.match({
  "location": "TariffPlan.user_verify_congratulation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
});