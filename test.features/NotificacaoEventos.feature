#language: pt

@NotificacaoEventos
Funcionalidade: Realizar cadastro, edição e exclusão de notificação de eventos

@CadastroNotificacaoEventos
Cenario: Realizar cadastro de notificação de eventos
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em eventos
	E clico em notificação de eventos
	E clico no botao adicionar
	E preencho os campos nome, controlador, tipo de alarme, subitipo de alarme e usuario
	E salvo o cadastro
	E valido que o registro foi criado com sucesso
	
	
@EdiçãoNotificacaoEventos
Cenario: Realizar edição de notificação de eventos
	E clico em cadastros
	E clico em eventos
	E clico em notificação de eventos
	E clico em filtros
	E informo o nome da notificação de eventos
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome da notificação de eventos
	E salvo o cadastro
	E valido que o registro foi editado com sucesso
	
	
@ExclusãoNotificacaoEventos
Cenario: Realizar exclusão de notificação de eventos
	E clico em cadastros
	E clico em eventos
	E clico em notificação de eventos
	E clico em filtros
	E informo o nome da notificação de eventos editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso
	