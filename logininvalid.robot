*** Settings ***

Resource        resource.robot 

*** Test Case ***
Empty First Name
    Open Register Page
    Input Last Name    Sodsai
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input Phone Number    081-001-1234
    Click Register Button
    Element Text Should Be    id:errors    *Please enter your first name!!
    Close Browser

Empty Last Name 
    Open Register Page 
    Input First Name    Somsri
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input Phone Number    081-001-1234
    Click Register Button
    Element Text Should Be    id:errors    *Please enter your last name!!
    Close Browser

Empty First Name and Last Name 
    Open Register Page 
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input Phone Number    081-001-1234
    Click Register Button
    Element Text Should Be    id:errors    *Please enter your name!!
    Close Browser

Empty Email
    Open Register Page 
    Input First Name    Somsri
    Input Last Name    Sodsai
    Input Organization    CS KKU
    Input Phone Number    081-001-1234
    Click Register Button
    Element Text Should Be    id:errors    *Please enter your email!!
    Close Browser

Empty Phone Number
    Open Register Page 
    Input First Name    Somsri
    Input Last Name    Sodsai
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Click Register Button
    Element Text Should Be    id:errors    *Please enter your phone number!!
    Close Browser

Invalid Phone Number
    Open Register Page 
    Input First Name    Somsri
    Input Last Name    Sodsai
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input Phone Number    1234
    Click Register Button
    Element Text Should Be    id:errors    Please enter a valid phone number, e.g., 081-234-5678, 081 234 5678, or 081.234.5678
    Close Browser


    