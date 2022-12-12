#language: pt

@HorarioVerao
Funcionalidade: Realizar cadastro, edição e exclusão de horario de verão

@CadastroHorarioVerao
Cenario: Realizar cadastro de horario de verão
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em faturamento e tarifas
	E clico em horario de verão
	E clico no botao adicionar
	E preencho o campo nome do horario
	E salvo o cadastro
	E valido que o registro foi criado com sucesso
	
	
@EdiçãoHorarioVerao
Cenario: Realizar edição de horario de verão
	E clico em cadastros
	E clico em faturamento e tarifas
	E clico em horario de verão
	E clico em filtros
	E informo o nome do horario de verão
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do horario de verão
	E salvo o cadastro
	E valido que o registro foi editado com sucesso
	
	
@ExclusãoHorarioVerao
Cenario: Realizar exclusão de horario de verão
	E clico em cadastros
	E clico em faturamento e tarifas
	E clico em horario de verão
	E clico em filtros
	E informo o nome do horario de verão editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso
	
	
	
	