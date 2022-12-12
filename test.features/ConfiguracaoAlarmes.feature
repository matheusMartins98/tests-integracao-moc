#language: pt

@ConfiguracaoAlarmes
Funcionalidade: Alterar prioridade em configuração de alarmes

Cenario: Validar alteração no status da prioridade
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em eventos
	E clico em configuração de alarmes
	E clico em filtros
	E seleciono o tipo e subtipo
	E clico no botao pesquisar
	E altero a prioridade
	E valido que a troca foi realizada com sucesso
	
	
	
