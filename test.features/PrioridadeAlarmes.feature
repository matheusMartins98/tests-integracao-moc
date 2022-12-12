#language: pt

@PrioridadeAlarmes
Funcionalidade: Realizar cadastro, edição e exclusão de prioridade de alarmes

@CadastroPrioridadeAlarmes
Cenario: Realizar cadastro de prioridade de alarmes
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em eventos
	E clico em prioridade de alarmes
	E clico no botao adicionar
	E preencho os campos nivel e nome da prioridade
	E salvo o cadastro
	E valido que o registro foi criado com sucesso
	
	
@EdiçãoPrioridadeAlarmes
Cenario: Realizar edição de prioridade de alarmes
	E clico em cadastros
	E clico em eventos
	E clico em prioridade de alarmes
	E clico em filtros
	E informo o nome da prioridade de alarmes
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome da prioridade de alarmes
	E salvo o cadastro
	E valido que o registro foi editado com sucesso
	
	
@ExclusãoPrioridadeAlarmes
Cenario: Realizar exclusão de prioridade de alarmes
	E clico em cadastros
	E clico em eventos
	E clico em prioridade de alarmes
	E clico em filtros
	E informo o nome da prioridade de alarmes editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso
	
	
	
	