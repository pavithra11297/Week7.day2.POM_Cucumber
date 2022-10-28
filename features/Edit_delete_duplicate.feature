Feature: View Lead

Background: Go to View Lead
Given Click on FindLead link 
And Click phone tab

Scenario Outline: Edit Lead
And Enter phone number <phoneNumber>
And Click FindLead Button
When Choose first value for lead id 
And click on Edit Button
And update the company name <editCompName>
And click on Update button 

Examples:
|editCompName|phoneNumber|
|Harness Pvt Ltd|9|

Scenario Outline: Delete Lead
And Enter phone number <phoneNumber>
And Click FindLead Button
When Choose first value for lead id 
And click on Delete Button
Examples:
|phoneNumber|
|9|

Scenario Outline: Duplicate Lead
And Enter phone number <phoneNumber>
And Click FindLead Button
When Choose first value for lead id
When click on Duplicate Button
And Enter duplicate company name <duplicateCmpName>
And Enter duplicate First name <duplicateFirstName>
And Enter duplicate last name <duplicateLastName>
And Click on create lead button in duplicate screen

Examples:
|phoneNumber|duplicateCmpName|duplicateFirstName|duplicateLastName|
|9|Harness|yathav|L|