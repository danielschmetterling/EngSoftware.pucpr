*** Settings ***
Resource          condicao_resources.robot
Test Setup        Abrir o navegador
Test Teardown     Fechar o navegador

*** Test Cases ***
CT1 - Classificar usuário ativo
    [Documentation]    Condição IF/ELSE após o login.
    [Tags]             if_else
    Realizar login      rafael        123456
    Classificar resultado do login      rafael

CT2 - Classificar usuário inativo
    [Documentation]    ELSE para credenciais inválidas.
    [Tags]             if_else
    Realizar login      paulo       111111
    Classificar resultado do login      paulo
