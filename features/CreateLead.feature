Feature: Create Lead

Scenario Outline: Create Lead  positive flow
When Click on Create Lead 
Given Enter Company name <companyName>
And Enter First Name <firstName>
And Enter Last Name <lastname>
And Click on Create Lead button
#Then verify lead is created

Examples:
|companyName|firstName|lastName|
|Harness|yathav|L|
