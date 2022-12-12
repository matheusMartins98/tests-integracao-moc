# language: pt

@PontoMedicao
Funcionalidade: Realizar cadastro, edição e exclusão do ponto de medição

@CadastroPontoMedicao
Cenario: Realizar cadastro do ponto de medição

#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em Negocios
	E seleciono a opcao ponto de medição
	E clico no botao adicionar
	E seleciono o cliente
	E preencho os campos nome, codigo ANEEL, Latitude, Longitude e Chave Externa1 
	E salvo o registro
	E valido que o registro foi criado com sucesso 
	
	
	@EdicaoPontoMedicao
Cenario: Realizar edição do ponto de medição
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em Negocios
	E seleciono a opcao ponto de medição
	E clico em filtros
	E informo o nome do ponto de medição
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do ponto de medição
	E salvo o cadastro 
	E valido que o nome do subgrupo foi editado com sucesso
	
	@ExclusaoPontoMedicao
Cenario: Realizar exclusão do ponto de medição
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em Negocios
	E seleciono a opcao ponto de medição
	E clico em filtros
	E informo o nome do ponto de medição editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o sub grupo foi excluido com sucesso