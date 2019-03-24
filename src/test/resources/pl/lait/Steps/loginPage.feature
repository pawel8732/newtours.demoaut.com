@tag
Feature: Flight reservation
  I want to login and reserve some flight

  Scenario: login to the app
    Given I open main page
    When I fill the login form with login "adamdz" and pass "qwe123"
    Then I should see the flight reservation form
    
    
  Scenario: reserve flight
  	Given I open main page
  	When I fill the login form with login "pawel8732" and pass "asdzxc"
  	And I choose "2" passengers
  	And I choose one way trip
	And I start from "London" at month: "4"  day "22"
	And I end at "Paris" at month: "5"  day "25"
	And I want to fly first class using "Pangea Airlines"
	Then I submit first level of my flight reservation
  	
  