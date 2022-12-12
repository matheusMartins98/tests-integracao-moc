#language: pt

@InibiçãoDeEventos
Funcionalidade: Realizar cadastro, edição e exclusão de inibição de eventos

@CadastroInibiçãoDeEventos
Cenario: Realizar cadastro de inibição de eventos
	E clico em cadastros
	E clico em eventos
	E clico em inibição de eventos
	E clico no botao adicionar
	E seleciono os campos Controlador, Tipo de alarme, Subtipo de alarme e data
	E salvo o cadastro
	E valido que o registro foi criado com sucesso
	
	
@EdiçãoInibiçãoDeEventos
Cenario: Realizar edição de inibição de eventos
	E clico em cadastros
	E clico em eventos
	E clico em inibição de eventos
	E clico em filtros
	E seleciono o alvo e o controlador
	E clico no botao pesquisar
	E clico no botão editar
	E altero o subtipo de alarme
	E salvo o cadastro
	E valido que o registro foi editado com sucesso
	
	
@ExclusãoInibiçãoDeEventos
Cenario: Realizar exclusão de inibição de eventos
	E clico em cadastros
	E clico em eventos
	E clico em inibição de eventos
	E clico em filtros
	E seleciono o controlador editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso