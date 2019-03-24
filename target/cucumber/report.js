$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pl/lait/Steps/loginPage.feature");
formatter.feature({
  "line": 2,
  "name": "Flight reservation",
  "description": "I want to login and reserve some flight",
  "id": "flight-reservation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 4484334200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "login to the app",
  "description": "",
  "id": "flight-reservation;login-to-the-app",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I open main page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I fill the login form with login \"adamdz\" and pass \"qwe123\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see the flight reservation form",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefs.i_open_main_page()"
});
formatter.result({
  "duration": 80306700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adamdz",
      "offset": 34
    },
    {
      "val": "qwe123",
      "offset": 52
    }
  ],
  "location": "LoginPageStepDefs.i_fill_the_login_form_with_login_and_pass(String,String)"
});
formatter.result({
  "duration": 2383178300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefs.i_should_see_the_flight_reservation_form()"
});
formatter.result({
  "duration": 11500,
  "status": "passed"
});
formatter.after({
  "duration": 67169900,
  "status": "passed"
});
formatter.before({
  "duration": 3350563100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "reserve flight",
  "description": "",
  "id": "flight-reservation;reserve-flight",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I open main page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I fill the login form with login \"pawel8732\" and pass \"asdzxc\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I choose \"2\" passengers",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I choose one way trip",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I start from \"London\" at month: \"4\"  day \"22\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I end at \"Paris\" at month: \"5\"  day \"25\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I want to fly first class using \"Pangea Airlines\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I submit first level of my flight reservation",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefs.i_open_main_page()"
});
formatter.result({
  "duration": 10195000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pawel8732",
      "offset": 34
    },
    {
      "val": "asdzxc",
      "offset": 55
    }
  ],
  "location": "LoginPageStepDefs.i_fill_the_login_form_with_login_and_pass(String,String)"
});
formatter.result({
  "duration": 2252816200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 10
    }
  ],
  "location": "LoginPageStepDefs.i_choose_passengers(String)"
});
formatter.result({
  "duration": 161433800,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefs.i_choose_one_way_trip()"
});
formatter.result({
  "duration": 57984300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 14
    },
    {
      "val": "4",
      "offset": 33
    },
    {
      "val": "22",
      "offset": 42
    }
  ],
  "location": "LoginPageStepDefs.i_start_from_at_month_day(String,String,String)"
});
formatter.result({
  "duration": 384456900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paris",
      "offset": 10
    },
    {
      "val": "5",
      "offset": 28
    },
    {
      "val": "25",
      "offset": 37
    }
  ],
  "location": "LoginPageStepDefs.i_end_at_at_month_day(String,String,String)"
});
formatter.result({
  "duration": 367863100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pangea Airlines",
      "offset": 33
    }
  ],
  "location": "LoginPageStepDefs.i_want_to_fly_first_class_using(String)"
});
formatter.result({
  "duration": 182365100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefs.i_submit_first_level_of_my_flight_reservation()"
});
formatter.result({
  "duration": 486763200,
  "status": "passed"
});
formatter.after({
  "duration": 55551400,
  "status": "passed"
});
});