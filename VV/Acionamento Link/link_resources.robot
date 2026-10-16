*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${BROWSER}       Firefox
${URL}           https://www.bing.com/
${CAMPO_BUSCA}   name:q
${TERMO_BUSCA}   Abacaxi
${LINK_RESULTADO}    css:li.b_algo h2 a

*** Keywords ***
Abrir o navegador
    Open Browser    ${URL}    ${BROWSER}
    Maximize Browser Window

Pesquisar e obter primeiro link
    Input Text    ${CAMPO_BUSCA}    ${TERMO_BUSCA}
    Press Keys    ${CAMPO_BUSCA}    RETURN
    Wait Until Page Contains Element    ${LINK_RESULTADO}    timeout=10s
    Run Keyword And Return Status    Click Element    css:#bnp_btn_accept
    @{links}=    Get WebElements    ${LINK_RESULTADO}
    Should Not Be Empty    ${links}
    ${href}=    Get Element Attribute    ${links}[0]    href
    Scroll Element Into View    ${links}[0]
    Click Element    ${links}[0]
    Wait Until Page Contains Element    tag:body    timeout=10s
    RETURN    ${href}

Fechar o navegador
    Capture Page Screenshot
    Close Browser
