# language: pt

@Medidor
Funcionalidade: Realizar cadastro, edição e exclusão do medidor

@CadastroMedidor
Cenario: Realizar cadastro do medidor
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em Negocios
	E clico em medidor
	E clico no botao adicionar
	E preencho os campos ponto de medição, nome, serial, identificação, data inical, data final, horario de verão e modelo do medidor
	E salvo o registro
	E valido que o registro foi criado com sucesso
	
	
@EditarMedidor
Cenario: Realizar edição do medidor
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em Negocios
	E clico em medidor
	E clico em filtros
	E informo o medidor Serial
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do medidor Serial
	E salvo o registro
	E valido que o registro foi editado com sucesso
	
	
	@ExcluirMedidor
Cenario: Realizar exclusão do medidor
#	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
	E clico em Negocios
	E clico em medidor
	E clico em filtros
	E informo o medidor Serial editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso
