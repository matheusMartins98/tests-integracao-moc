# language: pt

@GrupoClientes
Funcionalidade: Realizar cadastro, editar e excluir grupo de clientes

   
@cadastroGrupo   
Esquema do Cenario: Realizar cadastro de grupo
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em Negocios
	E seleciono a opcao grupo de clientes
	E clico no botao adicionar
	E preencho os campos nome e descricao <nome> <descricao>
	E salvo o cadastro 
	E valido que o registro foi criado com sucesso

	
	Exemplos:
	
	|    nome 				|      descricao					 |
	|AutomatizadoBase |	AutomatizadoBaseDescricao|

	
	
	@cadastroSubGrupo
	Esquema do Cenario: Realizar cadastro de Sub grupo
	E clico em cadastros
	E clico em Negocios
	E seleciono a opcao grupo de clientes
	E clico no botao adicionar
	E preencho os campos nomesub e descricaosub <nomeSub> <descricaoSub>
	E seleciono o grupo associado
	E salvo o cadastro 
	E valido que o registro foi criado com sucesso
	
	Exemplos:
	
	|    nomeSub 				 |      descricaoSub				    |
	|AutomatizadoBaseSub |	AutomatizadoBaseDescricaoSub|
	
	
	@editarSubGrupo  
 Cenario: Realizar edição de sub grupo
	E clico em cadastros
	E clico em Negocios
	E seleciono a opcao grupo de clientes
	E clico em filtros
	E informo o nome do subgrupo
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do subgrupo
	E salvo o cadastro 
	E valido que o nome do subgrupo foi editado com sucesso
	
	@editarGrupoBase
 Cenario: Realizar edição de grupo base
	E clico em cadastros
	E clico em Negocios
	E seleciono a opcao grupo de clientes
	E clico em filtros
	E informo o nome do grupo
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do grupo
	E salvo o cadastro 
	E valido que o nome do grupo foi editado com sucesso
	
	@ExcluirSubGrupo
 Cenario: Realizar exclusão do sub grupo
	E clico em cadastros
	E clico em Negocios
	E seleciono a opcao grupo de clientes
	E clico em filtros
	E informo o nome do sub grupo editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o sub grupo foi excluido com sucesso
	
	
	@ExcluirGrupoBase
 Cenario: Realizar exclusão do grupo base
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em Negocios
	E seleciono a opcao grupo de clientes
	E clico em filtros
	E informo o nome do grupo base editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o grupo base foi excluido com sucesso


	@cadastroModuloComunicacao
	Esquema do Cenario: Realizar cadastro de Modulo Comunicacao
	Dado que eu acesse o Residencial Smart
	Quando informo o usuario e senha
	E realizo o login com sucesso
		E clico em cadastros
		E clico em Negocios
		E seleciono a opcao grupo de clientes
		E clico no botao adicionar
		E preencho os campos nome e descrição <nome> <descricao>
		E salvo o cadastro
		E valido que o registro foi criado com sucesso


		Exemplos:

			|    nome 				|      descricao					 |
			|AutomatizadoBase |	AutomatizadoBaseDescricao|



	
	
	
	