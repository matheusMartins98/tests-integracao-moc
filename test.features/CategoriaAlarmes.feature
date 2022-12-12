#language: pt

@CategoriaAlarmes
Funcionalidade: Realizar cadastro, edição e exclusão de categoria de alarmes

@CadastroCategoriaAlarmes
Cenario: Realizar cadastro de categoria de alarmes
	E clico em cadastros
	E clico em eventos
	E clico em categoria de alarmes
	E clico no botao adicionar
	E preencho o campo descrição
	E salvo o cadastro
	E valido que o registro foi criado com sucesso
	
	
@EdiçãoCategoriaAlarmes
Cenario: Realizar edição de categoria de alarmes
	E clico em cadastros
	E clico em eventos
	E clico em categoria de alarmes
	E clico em filtros
	E informo o nome da categoria de alarmes
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome da categoria de alarmes
	E salvo o cadastro
	E valido que o registro foi editado com sucesso
	
	
@ExclusãoCategoriaAlarmes
Cenario: Realizar exclusão de categoria de alarmes
	E clico em cadastros
	E clico em eventos
	E clico em categoria de alarmes
	E clico em filtros
	E informo o nome da categoria de alarmes editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso