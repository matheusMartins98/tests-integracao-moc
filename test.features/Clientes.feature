# language: pt

@Cliente
Funcionalidade: Realizar cadastro, editar e excluir clientes

@cadastroCliente   
Esquema do Cenario: Realizar cadastro de cliente
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em Negocios
	E seleciono a opcao cliente
	E clico no botao adicionar
	E preencho os campos nome contrato registro e chaveExternal1 <nome> <contrato> <registro> <chaveExterna1>
	E salvo o cadastro
	E valido que o registro foi criado com sucesso
	
	Exemplos:
	| nome 								| contrato | registro	  | chaveExterna1 |
	| ClienteAutomatizado | 14253647 | 131052021	| 131052021			|
	
	
	@edicaoCliente
	Cenario: Realizar edição de cliente
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em Negocios
	E seleciono a opcao cliente
	E clico em filtros
	E informo o nome do cliente
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do cliente
	E salvo o cadastro 
	E valido que o nome do subgrupo foi editado com sucesso
	
	@exclusaoCliente
	Cenario: Realizar exclusao de cliente
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em Negocios
	E seleciono a opcao cliente
	E clico em filtros
	E informo o nome do cliente editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o grupo base foi excluido com sucesso