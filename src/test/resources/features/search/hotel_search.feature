Feature: Hotel search

  Travellers can find their ideal hotel and compare prices from different website

  Scenario: Search for hotels in a given city
    Given Tracy is looking for a great hotel deal
    When she searches for a hotel in Paris
    Then she should be presented with hotels in Paris

  Scenario: View hotel photos
    Given Tracy is looking for a great hotel deal
    And Tracy searched for a hotel in Hamburg
    When she views the deal for hotel number 2
    Then the photos of this hotel should be displayed

