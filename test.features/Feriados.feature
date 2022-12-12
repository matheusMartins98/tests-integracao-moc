#language: pt

@Feriados
Funcionalidade: Realizar cadastro, edição e exclusão de feriados

@CadastroFeriado
Cenario: Realizar cadastro de feriado
Dado que eu acesse o Residencial Smart
    Quando informo o usuario e senha
    E realizo o login com sucesso
	E clico em cadastros
	E clico em faturamento e tarifas
	E clico em feriados
	E clico no botao adicionar
	E preencho o campo nome do feriado
	E salvo o cadastro
	E valido que o registro foi criado com sucesso
	
	
	@EdiçãoFeriado
	Cenario: Realizar edição de feriado
	E clico em cadastros
	E clico em faturamento e tarifas
	E clico em feriados
	E clico em filtros
	E informo o nome do feriado
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do feriado
	E salvo o cadastro
	E valido que o registro foi editado com sucesso
	
	
	@ExclusãoFeriado
	Cenario: Realizar exclusão de feriado
	E clico em cadastros
	E clico em faturamento e tarifas
	E clico em feriados
	E clico em filtros
	E informo o nome do feriado editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso