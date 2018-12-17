Feature: product count?
  Validate product count for Input Cert #

  Scenario: Add a new product
    Given current product count is 0
    When I add product with type "Electronics", subtype "Mobile", price "1000" 
    Then the new product count is 1

  