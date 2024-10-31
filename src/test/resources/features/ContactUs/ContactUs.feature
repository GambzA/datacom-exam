@pr_test
Feature: Check Page Title

Scenario: Verify that the page has loaded
    Given I visit contact us page of Datacom Website
    Then I check if header with text "Our locations" is visible

Scenario: Verify Location Tabs are working
    Given I visit contact us page of Datacom Website
    When I click "New Zealand" in Our locations section
    Then I verify that the following sub-locations are present
    | Auckland     |
    | Christchurch |
    When I click "Australia" in Our locations section
    Then I verify that the following sub-locations are present
    | Melbourne                     |
    | Sydney — Denison Street       |
    When I click "Asia" in Our locations section
    Then I verify that the following sub-locations are present
    | Malaysia    |
    | Philippines |
    | Singapore   |

Scenario: Verify Contact Us Form is submitting
    Given I visit contact us page of Datacom Website
    When I click Contact Us button
    Then I verify that Contact Us form is visible
    When I input "Roi" on "FirstName" field
    And I input "Gamba" on "LastName" field
    And I input "gambaroimark+datacomtest@gmail.com" on "Email" field
    And I input "091234567" on "Phone" field
    And I input "TESTER" on "Title" field
    And I input "TESTERS COMPANY" on "Company" field
    And I select "Philippines" in "Country" dropdown
    And I select "Consult with an expert" in "custom2" dropdown
    And I select "General" in "Enquiry__c" dropdown
    And I input "This is test only please ignore" on "How_can_we_help__c" field
    And I click Submit button in Contact Us Form
    Then Thank you modal should be display

