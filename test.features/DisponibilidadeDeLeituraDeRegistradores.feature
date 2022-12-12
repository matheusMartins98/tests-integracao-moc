# language: pt

@DisponibilidadeDeLeituraDeRegistradores
Funcionalidade: Gerar relatório Disponibilidade de leitura de registradores

Esquema do Cenario: Gerar relatório Disponibilidade de leitura de registradores
#	  Dado que eu acesse o Residencial Smart
#	  Quando informo o usuario e senha
#	  E realizo o login com sucesso
	  E clico em relatórios
		E clico em Medição
		E clico em Disponibilidade de leitura de registradores
		E clico no campo serial<serial>
		E preencho Selecione mês e ano
		E clico no botão Filtrar
		E clico no botão Exportar
		E seleciono a opção Exportar .CSV
		Então valido a emissão do Relatorio Disponibilidade de leitura de registradores
		
Exemplos:

|serial  	|
|11809200	|