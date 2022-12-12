# language: pt

@RelatorioFasorial
Funcionalidade: Gerar relatório Fasorial

  Esquema do Cenario: Gerar relatório Fasorial
    Dado que eu acesse o Residencial Smart
    Quando informo o usuario e senha
    E realizo o login com sucesso
    E clico em relatórios
    E clico em Medição
    E clico em relatório fasorial
    E clico no campo Medidor Serial
    E seleciono o controlador fasorial
    E clico em pesquisar
    E clico em Selecionar
    E seleciono a grandeza
    E preencho Selecione o mês e ano personalizado
    E clico no botão filtrar
  #  E clico no botão Exportar
  #//  E seleciono a opção Exportar .XLS
  #//  Então valido os dados emitidos

    Exemplos:

      |serial 	|controlador    |
      |11809089	|contro    |