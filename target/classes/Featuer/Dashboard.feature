Feature: Verify DashboardPage Complete Functionality

#Scenario: verify productSearch Functionality
#
   #Given launch the browser enter url
   #When enter valid username
   #And enter valid password
   #And click on login btn
   #Then it should navgate to Dashboard page
   #When user click on product
   #And Search for product name with "Adobe Photoshop CS4" 
   #Then it Should show result
   #And Close the Browser
Scenario Outline: verify CategoriesSearch Functionality

   Given launch the browser enter url
   When enter valid username
   And enter valid password
   And click on login btn
   Then it should navgate to Dashboard page
   When user click on categories link
   And Search for categorie name as<categoriename>
   Then it should display the result
   And Close the Browser
   
 Examples:
|categoriename|
|Computers |
| Electronics | 
| Books |
| Jewelry |
    