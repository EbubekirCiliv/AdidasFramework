@navigate
  Feature: Navigation Menu
    Scenario: Navigating -- Laptop

    Given the customer on the Home page
    When the customer click on Laptops
    When the customer click on Sony vaio i5
    When the customer click on Add to cart
    When the customer Accept pop up confirmation
    Then the title should be Sony vaio i5