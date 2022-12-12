# language: pt

@ViolacaoDosIndicadoresDRPeDRC
Funcionalidade: Gerar relatório Violação dos Indicadores DRP e DRC

  Esquema do Cenario: Gerar relatório Violação dos Indicadores DRP e DRC
    #Dado que eu acesse o Residencial Smart
    #Quando informo o usuario e senha
    #E realizo o login com sucesso
    E clico em relatórios
    E clico em Qualidade de Energia
    E clico em Violação dos Indicadores de DRP e DRC
    E seleciono o periodo
    E seleciono o serial<serial>
    E clico no botão filtrar
    E clico no botão Exportar
    E seleciono a opção Exportar .XLS
    Então valido os dados emitidos

    Exemplos:

      |serial  	|
      |11809200	|