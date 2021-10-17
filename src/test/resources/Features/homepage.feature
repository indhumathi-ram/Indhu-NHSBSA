Feature: NHS checker tool
@only
Scenario: To verify NHS cost result for 29 year old wales patient

Given user is in landing page
When user gets title
Then page title should be "Check what help you could get to pay for NHS costs - NHSBSA"
And user click on start button
When user gets title
Then page title should be "Which country do you live in? - Check what help you could get to pay for NHS costs - NHSBSA"
And user selects country as wales
And user enters date age twenty nine
And user selects marital question
And user selects benefit or tax credit
And user selects pregnant question
And user selects injury or armed forces question
And user selects diabetes
And user selects glaucoma
And user selects care home
And user selects savings or investment question
Then user is displayed with NHS cost details



Scenario: To display error if patient is not from wales

Given user is in landing page
When user gets title
Then page title should be "Check what help you could get to pay for NHS costs - NHSBSA"
And user click on start button
When user gets title
Then page title should be "Which country do you live in? - Check what help you could get to pay for NHS costs - NHSBSA"
And user selects country as northern ireland
Then user is displayed with error message 

Scenario: To verify NHS cost result for 16 year old wales patient

Given user is in landing page
When user gets title
Then page title should be "Check what help you could get to pay for NHS costs - NHSBSA"
And user click on start button
When user gets title
Then page title should be "Which country do you live in? - Check what help you could get to pay for NHS costs - NHSBSA"
And user selects country as wales
And student enters date
And user selects his education
Then user is displayed with NHS cost details for students


Scenario: To verify NHS cost result for 63 year old wales patient who claims tax benefit

Given user is in landing page
When user gets title
Then page title should be "Check what help you could get to pay for NHS costs - NHSBSA"
And user click on start button
When user gets title
Then page title should be "Which country do you live in? - Check what help you could get to pay for NHS costs - NHSBSA"
And user selects country as wales
And senior citizen enters date
And user selects marital question
And user selects benefit or tax credit as yes
And user selects Do you or your partner get paid Universal Credit
And user selects As part of your joint Universal Credit, do you have any of these?
And user selects Did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?
Then user is displayed with NHS cost details for senior citizens


Scenario: To verify NHS cost result for 43 year old wales patient who claims tax benefit

Given user is in landing page
When user gets title
Then page title should be "Check what help you could get to pay for NHS costs - NHSBSA"
And user click on start button
When user gets title
Then page title should be "Which country do you live in? - Check what help you could get to pay for NHS costs - NHSBSA"
And user selects country as wales
And middleage enters date
And user selects marital question
And user selects benefit or tax credit
And user selects pregnant question
And user selects injury or armed forces question
And user selects diabetes
And user selects glaucoma
And user selects Do you or your partner live permanently in a care home
And user selects Do you get help to pay for your care home from your local council?
Then user is displayed with NHS cost details for who live in home care



