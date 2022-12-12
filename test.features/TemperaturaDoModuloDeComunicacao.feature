# language: pt

@TemperaturaDoModuloDeComunicacao
Funcionalidade: Gerar relatório Temperatura do Módulo de Comunicação

Cenario: Gerar relatório Temperatura do Módulo de Comunicação
#	  Dado que eu acesse o Residencial Smart
#	  Quando informo o usuario e senha
#	  E realizo o login com sucesso
	  E clico em relatórios
		E clico em Comunicação
		E clico em Temperatura do Módulo de Comunicação
		E clico no campo Medidor Serial
		E preencho o campo serial
		E clico para selecionar o medidor
		E seleciono o mes e ano do Módulo de Comunicação
		E clico no botão Filtrar
		E clico no botão Exportar
		E seleciono a opção Exportar .CSV
		Então valido a emissão do Relatorio Temperatura do Módulo de Comunicação
		
