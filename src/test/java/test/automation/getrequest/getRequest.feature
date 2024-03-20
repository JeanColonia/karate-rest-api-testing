Feature: test endpoints of the app



Scenario: Test get method with JSON data
 Given url "http://localhost:9897/normal/webapi/all" 
 When method GET
 Then status 200

 
