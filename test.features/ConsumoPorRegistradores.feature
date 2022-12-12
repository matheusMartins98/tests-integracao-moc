# language: pt

@ConsumoPorRegistradores
Funcionalidade: Gerar relatório Consumo por Registradores

  Esquema do Cenario: Gerar relatório Consumo por Registradores
    #Dado que eu acesse o Residencial Smart
    #Quando informo o usuario e senha
    #E realizo o login com sucesso
    E clico em relatórios
    E clico em Medição
    E clico em Consumo por Registradores
    E seleciono o periodoConsumo
    E seleciono o serial<serial>
    E clico no botão filtrar
    E clico no botão Exportar
   	E seleciono a opção Exportar .CSV
  	Então valido a emissão do Relatorio Consumo por Registradores

    Exemplos:

      |serial 	|
      |11809089	|