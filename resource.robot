*** Settings ***
Documentation     A resource file with reusable keywords and variables.
...
...               The system specific keywords created here form our own
...               domain specific language. They utilize keywords provided
...               by the imported SeleniumLibrary.
Library           SeleniumLibrary

*** Variables ***
${SERVER}         localhost:7272
${BROWSER}        Firefox
${DELAY}          0
${REGISTER PAGE}    file:///C:/lab10/Registration.html
${SUCCESS PAGE}        file:///C:/lab10/Success.html

*** Keywords ***
Open Register Page 
    Open Browser    ${REGISTER PAGE}    ${BROWSER} 

Input First Name
    [Arguments]    ${firstname}
    Input Text    id:firstname    ${firstname}

Input Last Name
    [Arguments]    ${lastname}
    Input Text    id:lastname    ${lastname}

Input Organization
    [Arguments]    ${organization}
    Input Text    id:organization    ${organization}

Input Email
    [Arguments]    ${email}
    Input Text    id:email    ${email}

Input Phone Number
    [Arguments]    ${phone}
    Input Text    id:phone    ${phone}

Click Register Button
    Click Button    id:registerButton

Go to Success Page
    Location Should Contain    ${SUCCESS PAGE}
