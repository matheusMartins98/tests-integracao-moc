# language: pt

@Faturamento
Funcionalidade: Gerar relatório Faturamento

Esquema do Cenario: Gerar relatório Faturamento
#	  Dado que eu acesse o Residencial Smart
#	  Quando informo o usuario e senha
#	  E realizo o login com sucesso
	  E clico em relatórios
		E clico em Medição
		E clico em Faturamento
		E preencho serial<serial>
		E preencho Selecione mês e ano
		E clico no botão Filtrar
		E clico no botão Exportar
		E seleciono a opção Exportar .CSV
		Então valido a emissão do Relatorio de Faturamento
		
Exemplos:

|serial  	|
|11809200	|