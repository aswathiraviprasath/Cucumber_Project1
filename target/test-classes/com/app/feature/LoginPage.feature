Feature: Validate the Login Page Module

	  Scenario: Validate the correct username and password
	    Given Load the browser 
	    And Load the URL "https://adactinhotelapp.com/"
	    And Maximize the window
	    When Enter the username "aswathi3"
	    And Enter the password "26RQ2E"
	    And Click the login button
	    And Select the location "London"  
	    And Select the hotels "Hotel Sunshine" 
	    And Select the roomtype "Standard" 
	    And Select the roomno "2 - Two"
	    And Enter the Check In Date "21/11/2025" 
	    And Enter the Check Out Date "22/11/2025" 
	    And Select the adults "1 - One" 
	    And Select the children "0 - None" 
	    And Click the Search button
	    And Click the Select radiobutton
	    And Click the Continue button
	    And Enter the firstname "Arjun"
	    And Enter the lastname "R"
	    And Enter the Billing address "Shols, Chennai, TamilNadu, India"
	    And Enter the Credit card number "9876543210111222"
	    And Select the Credit card type "MAST"
	    And Select the Expiry month "5"
	    And Select the Expiry year "2026"
	    And Enter the CVV number "321"
	    And Click the BookNow button
	    And Wait on the page for sometime 
	    Then Print the OrderId
