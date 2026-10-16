*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${BROWSER}               Firefox
${URL}                   http://165.227.93.41/lojinha-web/
${LOGIN}                 usuario
${SENHA}                 senha
${BOTAO_ENTRAR}          entrar

*** Keywords ***
Abrir o navegador
    Open Browser    ${URL}    ${BROWSER}
    Maximize Browser Window

Acessar a pagina home no site
    Go To    ${URL}

Inserir login
    [Arguments]     ${usuario}
    Input Text      ${LOGIN}    ${usuario}

Inserir senha
    [Arguments]     ${senha_inserida}
    Input Text      ${SENHA}    ${senha_inserida}

Acionar o botão entrar
    Click Element      ${BOTAO_ENTRAR}

Fechar o navegador
    Capture Page Screenshot
    Close Browser
