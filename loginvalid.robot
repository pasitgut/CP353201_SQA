*** Settings ***

Resource        resource.robot 

*** Test Case ***
Open Event Registration Page:
    Open Register Page 
    Close Browser 

Register Success
    Open Register Page 
    Input First Name    Somsri
    Input Last Name    Sodsai
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input Phone Number    081-001-1234
    Click Register Button
    Go to Success Page
    Close Browser

Register Success No Organization Info
    Open Register Page 
    Input First Name    Somsri
    Input Last Name    Sodsai
    Input Email    somsri@kkumail.com
    Input Phone Number    081-001-1234
    Click Register Button
    Go to Success Page
    Close Browser