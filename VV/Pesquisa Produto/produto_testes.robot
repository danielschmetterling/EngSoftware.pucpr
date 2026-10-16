*** Settings ***
Resource          produto_resources.robot
Test Setup        Abrir o navegador
Test Teardown     Fechar o navegador

*** Test Cases ***

CT1 - Realizar busca no Bing
    [Documentation]    Esse teste realiza uma busca no site Google.com
    [Tags]             busca_google
    Acessar a pagina home no site
    Realizar pesquisa no site
    Verificar resultado da busca
