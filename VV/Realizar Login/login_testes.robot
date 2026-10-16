*** Settings ***
Resource          login_resources.robot

Test Setup        Abrir o navegador
Test Teardown     Fechar o navegador

*** Test Cases ***

CT1 - Realizar login como usuário ativo
    [Documentation]    Realizar login na lojinha
    [Tags]             login
    Inserir login    rafael
    Inserir senha    123456
    Acionar o botão entrar

CT2 - Realizar login como usuário inativo
    [Documentation]    Realizar login na lojinha como usuário inativo
    [Tags]             login
    Inserir login    paulo
    Inserir senha    111111
    Acionar o botão entrar
