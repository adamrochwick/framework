Feature: API requests for all Webpages shall return 200

  Scenario: Test API status code Landing Page
    Given A user goes to Greenlight Health Landing Page
    Then The Landing Page request shall return Ok

  Scenario: Test API status code About Us Page
    Given A user goes to Greenlight Health About Us Page
    Then The About Us request shall return Ok

  Scenario: Test API status code Contact Us Page
    Given A user goes to Greenlight Health Contact Us Page
    Then The Contact Us request shall return Ok

  Scenario: Test API status code Products Page
    Given A user goes to Greenlight Health Products Page
    Then The Products request shall return Ok

  Scenario: Test API status code Careers Page
    Given A user goes to Greenlight Health Careers Page
    Then The Careers request shall return Ok

  Scenario: Test API status code News Page
    Given A user goes to Greenlight Health News Page
    Then The News Page request shall return Ok