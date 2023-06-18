Feature: Validate digitalpulse Website

	@Sanity
    Scenario Outline: Column verification of Homepage
    Given I navigate to the PwC Digital Pulse website
    When I am viewing the "<Page-name>" page
    Then I am presented with "<ColNum>" columns of articles
    And The "left" column is displaying "<LeftColumnArticles>" articles
    And The "middle" column is displaying "<MiddleColumnArticles>" articles
    And The "right" column is displaying "<RightColumnArticles>" articles
    
    Examples:
    | Page-name |ColNum   |LeftColumnArticles| MiddleColumnArticles | RightColumnArticles |
    | Home      |  3      | 2     					| 1       							| 4                   |
    
    

    @Regression
    Scenario Outline: Subscription fields validations
    Given I navigate to the PwC Digital Pulse website
    When I am viewing the "<Page-name>" page
    When I click on the Subscribe navigation link
    Then I am taken to the Subscribe page
    And I am presented with the below fields
        | Field | Required | Type |
        | First Name  |true |text  |
        | Last Name   |true | text |
        |Organisation |true | text |
        |Business Email Address| true | text |
        |Job Title    |true | dropdown |
        |State                 | true  | dropdown |
        |Countries or regions  |true   | dropdown |
    And I will need to complete Google reCAPTCHA before I can complete my request
        
    Examples:
        | Page-name |
        | Home      |
        
        
        
    
    @Regression
    Scenario Outline: Search Result verification
      Given I navigate to the PwC Digital Pulse website
      When I click on the Magnifying glass icon to perform a search
      And I enter the text "<TextToEnter>"
      And I submit the search
      Then I am taken to the search results page
      And I am presented with at least "<MinNoResults>" search result
      Examples:
        | TextToEnter | MinNoResults |
        | Single page applications      | 1 |
    
		
		
    
		
    