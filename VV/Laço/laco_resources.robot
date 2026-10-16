*** Settings ***
Library    SeleniumLibrary
Library    Collections

*** Variables ***
${BROWSER}            Firefox
${URL}                https://www.bing.com/
${CAMPO_BUSCA}        name:q
${TERMO_BUSCA}        Abacaxi
${RESULTADO_SELECTOR}    css:li.b_algo

*** Keywords ***
Abrir o navegador
    Open Browser    ${URL}    ${BROWSER}
    Maximize Browser Window

Pesquisar no Bing
    Input Text    ${CAMPO_BUSCA}    ${TERMO_BUSCA}
    Press Keys    ${CAMPO_BUSCA}    RETURN
    Wait Until Page Contains Element    ${RESULTADO_SELECTOR}    timeout=10s
    Page Should Contain    ${TERMO_BUSCA}

Verificar cada resultado
    @{resultados}=    Get WebElements    ${RESULTADO_SELECTOR}
    Should Not Be Empty    ${resultados}
    FOR    ${resultado}    IN    @{resultados}
        ${texto}=    Get Text    ${resultado}
        Should Not Be Empty    ${texto}
    END

Verificar resultados com while
    @{resultados}=    Get WebElements    ${RESULTADO_SELECTOR}
    Should Not Be Empty    ${resultados}
    ${total}=    Get Length    ${resultados}
    ${indice}=    Set Variable    0
    WHILE    ${indice} < ${total}
        ${resultado}=    Get From List    ${resultados}    ${indice}
        ${texto}=    Get Text    ${resultado}
        Should Not Be Empty    ${texto}
        ${indice}=    Evaluate    ${indice} + 1
    END

Fechar o navegador
    Capture Page Screenshot
    Close Browser
