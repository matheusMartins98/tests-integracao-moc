# language: pt

@SinalDoModuloDeComunicacao
Funcionalidade: Gerar relatório Sinal do Módulo de Comunicação

Cenario: Gerar relatório Sinal do Módulo de Comunicação
	  Dado que eu acesse o Residencial Smart
	  Quando informo o usuario e senha
	  E realizo o login com sucesso
	  E clico em relatórios
		E clico em Comunicação
		E clico em Sinal do Módulo de Comunicação
		E clico no campo Medidor Serial
		E preencho o campo serial
		E clico para selecionar o medidor
		E seleciono o mes e ano do Módulo de Comunicação Sinal
		E clico no botão Filtrar
		E clico no botão Exportar
		E seleciono a opção Exportar .CSV
		Então valido a emissão do Relatorio Sinal do Módulo de Comunicação
		
