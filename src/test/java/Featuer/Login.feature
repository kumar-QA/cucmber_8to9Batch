Feature: Verify Complete Login Functionlity


 Scenario: Verify Login function with valid credentials
    Given launch the browser and enter url
    When  I Enter valid username 
    And  I Enter  valid password 
    Then click  on login Btn and naviagate to Dashboardpage
    
Scenario: Verify login Function with Invalid Credentials
Given launch the browser and enter url
    When  I Enter Invalid username 
    And   I Enter  Invalid password 
    And   click  on login Btn
    Then  It should Throug Error Message
   
    



