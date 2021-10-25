@navigate
Feature: Navigation Menu

  Scenario: Navigating -- Laptop

    Given the customer on the Home page
    When the customer click on Laptops
    When the customer click on Sony vaio i5
    When the customer click on Add to cart
    When the customer Accept pop up confirmation
    Then the price should be visible

    When click the Home button
    And click on Laptops
    And click on Dell i7 8gb
    And click on Add to cart on Dell
    And Accept pop up confirmation
    And click on Add to Chart button
    And delete Dell i7 8gb from Cart.
    Then verify the price decreased as expected
    And click on Place Order button
    And fill in all web form fields.
    And Click on Purchase
    And Capture and log purchase Id and Amount
    Then assert purchase amount equals expected
    And click on Ok button



