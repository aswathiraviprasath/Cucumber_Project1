Feature: Validate the BobCat company Equipment details

@BobCat
Scenario:
Validate the list of available Equipments
Given Load the chromebrowser 
And Load the newURL "https://www.bobcat.com/in/en"
And Maximize the chromewindow
And Close the Cookies window
When Select the Equipment dropdown 
And Select the Loaders option
And Show the available Loaders
And Select the Mini Excavators
And Show the available Mini Excavators
And Select the Forklifts
And Show the available Forklifts
Then Select the Warehouse Equipment
And Show the available Warehouse Equipment 