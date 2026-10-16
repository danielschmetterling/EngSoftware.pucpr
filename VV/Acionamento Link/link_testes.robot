*** Settings ***
Resource          link_resources.robot
Test Setup        Abrir o navegador
Test Teardown     Fechar o navegador

*** Test Cases ***
CT1 - Acionar link e validar retorno
    [Documentation]    Acionamento de link e retorno da busca.
    [Tags]             retorno_busca
    Wait Until Page Contains Element    ${CAMPO_BUSCA}    timeout=10s
    ${link}=    Pesquisar e obter primeiro link
    Should Start With    ${link}    http
