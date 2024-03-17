Feature: Add to cart
  Add a product from store

  Scenario: Add one quantity of product from Store
    Given I am on the Store page
    When I add a "Blue Shoes" to the cart
    Then I should see 1 "Blue Shoes" in the cart


  Scenario Outline: Add one quantity of product from Store -example
   Given I am on the Store page
    When I add a "<product_name>" to the cart
    Then I should see 1 "<product_name>" in the cart
    Examples:
      | product_name   |
      |Anchor Bracelet |
      |Blue Tshirt     |
