*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${BROWSER}       Firefox
${URL}            http://165.227.93.41/lojinha-web/
${LOGIN}          usuario
${SENHA}          senha
${BOTAO_ENTRAR}   entrar

*** Keywords ***
Abrir o navegador
    Open Browser    ${URL}    ${BROWSER}
    Maximize Browser Window

Realizar login
    [Arguments]    ${usuario}       ${senhatexto}
    Input Text    ${LOGIN}      ${usuario}
    Input Text    ${SENHA}      ${senhatexto}
    Click Element    ${BOTAO_ENTRAR}

Classificar resultado do login
    [Arguments]    ${usuario}
    ${login_confirmado}=    Run Keyword And Return Status    Page Should Contain    Bem-vindo
    IF    ${login_confirmado}
        Log    Login realizado para o usuário ${usuario}.
    ELSE
        Log    Login não confirmado para o usuário ${usuario}.
    END

Fechar o navegador
    Capture Page Screenshot
    Close Browser
