# language: pt

@ConsumoPorMemoriaDeMassa
Funcionalidade: Gerar relatório Consumo por memória de massa

  Esquema do Cenario: Gerar relatório Consumo por memória de massa
    #Dado que eu acesse o Residencial Smart
    #Quando informo o usuario e senha
    #E realizo o login com sucesso
    E clico em relatórios
    E clico em Medição
    E clico em Consumo por memória de massa
    E clico no campo Medidor Serial
    E informo o numero de serial<serial>
    E clico em pesquisar o medidor
    E seleciono o medidor serial
    E seleciono o periodo personalizado
    E seleciono Modo de sumarização de tensão e corrente AVG - Média
    E clico no botão filtrar
    E clico no botão Exportar
    E seleciono a opção Exportar .CSV
  	Então valido a emissão do Relatorio Consumo por memória de massa

    Exemplos:

      |serial  	|
      |11809200	|