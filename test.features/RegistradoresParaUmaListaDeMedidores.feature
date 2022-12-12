# language: pt

@LeituraRegistradoresParaUmaListaDeMedidores
Funcionalidade: Gerar relatório Leitura de Registradores para uma Lista de medidores

Cenario: Gerar relatório Leitura de Registradores para uma Lista de medidores
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em relatórios
	E clico em Medição
	E clico em Leitura de Registradores para uma Lista de medidores
	E preencho a data
	E preencho o serial
	E clico no botão filtrar
	E clico no botão Exportar
	E seleciono a opção Exportar .CSV
	Então valido a emissão do Relatorio Leitura de Registradores para uma Lista de medidores