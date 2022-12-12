# language: pt

@Lotes
Funcionalidade: Realizar cadastro, edição e exclusão de Lotes

@CadastroLotes
Cenario: Realizar cadastro de Lotes
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em faturamento e tarifas
	E clico em lotes
	E clico no botao adicionar
	E preencho os campos nome e descrição
	E clico no botao salvar
	E valido que o registro foi criado com sucesso
	
	
@EditarLotes
Cenario: Realizar edição de Lotes
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em faturamento e tarifas
	E clico em lotes
	E clico em filtros
	E informo o nome do lote
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do lote
	E clico no botao salvar
	E valido que o registro foi editado com sucesso
	
	
	@ExcluirLotes
Cenario: Realizar exclusão de Lotes
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em faturamento e tarifas
	E clico em lotes
	E clico em filtros
	E informo o nome do lote editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso
