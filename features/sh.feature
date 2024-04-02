Feature: Shop Module of asianpaints website

#Scenario: Login to the application
  #Given I want to login to asianpaints
  #When I enter mobile number as "9014726736"
  #And click on submit
  #And I enter otp
  #And click submit
  #Then the login is successful
  #

Scenario: Viewing Details
   Given I am on shop module
   When I select the Peel & Sticker Wallpapers category
   And I sort the stickers by price from low to high
   Then it display stickers from low to high

Scenario: Filtering by price
   Given I am on shop module
   When I select Wall Stickers category
   And I select price option
   Then it displays price filter option
  
Scenario: Filtering by colours
    Given I am on shop module
    When I select WallPapers category
    And I select colour
    Then it display stickers based on the colour


Scenario: Viewing product details
     Given I am on shop module
     When I select DIY Tools
     And I select product
     Then it displays the product details
     
#Scenario: Reviews of a product
     #Given I am on shop module
     #When I select Magnificence of a Peacock sticker
     #And I click on reveiws
     #Then it displays reviews of a sticker
     
Scenario Outline: Getting latest trending news
     Given I am on shop module
     When I enter email as <Email>
     And I click on subscribe button
     Then I subscribed successfully
     
     Examples:
     
     |Email           |
     |"hima@gmail.com"|
     |"thanusha"      |
     
     
     


