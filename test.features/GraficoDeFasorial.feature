# language: pt

@GraficoDeFasorial
Funcionalidade: Gerar relatório Gráfico de Fasorial

Esquema do Cenario: Gerar relatório Gráfico de Fasorial
#Dado que eu acesse o Residencial Smart
#Quando informo o usuario e senha
#E realizo o login com sucesso
E clico em relatórios
E clico em Medição
E clico em Gráfico de Fasorial
E clico no campo Medidor Serial
E informo o numero de serial<serial>
E escolho o cliente
E preencho a data personalizada
E clico no botão Filtrar
E clico no botão Exportar
E seleciono a opção Exportar .CSV
Então valido a emissão do Relatorio Gráfico de Fasorial

Exemplos:

|serial  	|
|09118082	|