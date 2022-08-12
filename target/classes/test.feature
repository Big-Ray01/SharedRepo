Feature: testing takealot website

  @test
  Scenario: Navigate to TakealotWebsites page and add items to the cart
  Given User navigate to the "TakealotWebsites" page
  When the user clicks on the "login" button
    Then the scheme number is "1276"
