Feature: Booking page
Scenario: Test that there are hotels for selected dates

When I select dates
Then I see the correct hotels



Scenario: Test that rating of Top Hotel is >=9
When I select dates
Then I see the correct hotels
When I open dropdown with different options
And I select Top reviewed properties
And I click on the top hotel
Then I see that rating is >=9






