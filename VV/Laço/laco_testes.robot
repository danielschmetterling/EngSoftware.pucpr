*** Settings ***
Resource          laco_resources.robot
Test Setup        Abrir o navegador
Test Teardown     Fechar o navegador

*** Test Cases ***
CT1 - Validar resultados usando FOR
    [Documentation]    Pesquisa no Bing e valida cada resultado com um laço.
    [Tags]             for
    Wait Until Page Contains Element    ${CAMPO_BUSCA}    timeout=10s
    Pesquisar no Bing
    Verificar cada resultado

CT2 - Validar resultados usando WHILE
    [Documentation]    Pesquisa no Bing e valida cada resultado com WHILE.
    [Tags]             while
    Wait Until Page Contains Element    ${CAMPO_BUSCA}    timeout=10s
    Pesquisar no Bing
    Verificar resultados com while
