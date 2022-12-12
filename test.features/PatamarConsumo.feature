# language: pt

@PatamarConsumo
Funcionalidade: Realizar cadastro, editar e excluir patamar de consumo

   
@cadastroPatamar   
Esquema do Cenario: Realizar cadastro de pamatar de consumo
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em patamar de consumo
	E clico no botao adicionar
	E preencho os campos nome do patamar e limite superior <nomePatamar> <limiteSuperior>
	E clico no botao salvar
	E valido que o registro foi criado com sucesso
	
	Exemplos:
	
	| nomePatamar 			| limiteSuperior |
	| AutomatizadoAlto	| 1			 				 |
	
	
	@editarPatamar   
Cenario: Realizar edição de pamatar de consumo
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em patamar de consumo
	E clico em filtros
	E seleciono o patamar de consumo
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do patamar de consumo
	E salvo o cadastro 
	E clico no botao salvar
	E valido que o nome do subgrupo foi editado com sucesso

	
	@excluirPatamar   
Cenario: Realizar exclusão de pamatar de consumo
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em patamar de consumo
	E clico em filtros
	E seleciono o patamar de consumo editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o grupo base foi excluido com sucesso
	