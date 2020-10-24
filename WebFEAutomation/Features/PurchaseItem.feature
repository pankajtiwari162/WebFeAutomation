Feature: Purchase Item

  @Regression
  Scenario: To validate end to end flow of purchasing of item from website
    Given user open the browser
    When User navigate to Laptops
    And Clicks on Sony vaio i5 laptop
    And Add the laptop into the cart
    And Accept the ok on pop up confirmation
    When User clicks on Home Page tab
    When User navigate to Laptops
    And Clicks on Dell i7 8gb laptop
    And Add the laptop into the cart
    And Accept the ok on pop up confirmation
    And User Navigate to Cart tab
    And User delete "Dell i7 8gb" from cart
    And Clicks on Place Order
    And Fill all place order web form fields with below data
      | PankajTiwari | India | Noida | 4444333322221111 | 12 | 2024 |
    And Click on Purchase
    Then Validate purchase amount is equal to amound displayed on Products page
    When User clicks on Ok
