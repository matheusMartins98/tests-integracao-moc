# language: pt

@ModuloComunicacao
Funcionalidade: Realizar cadastro, editar e excluir modulo comunicacao


	@cadastroModuloComunicacao
	Esquema do Cenario: Realizar cadastro do modulo de comunicacao

#	  	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em cadastros
		E clico em Negocios
		E seleciono a opcao modulomm
		E clico no botao adicionarmm
		E preencho as informacoes do registromm <nome> <min>
		E clico no botao salvarmm
		E valido que o registro foi criado com sucesso

		Exemplos:
			| nome 		| ssn |  min |
			| Willianteste | 435353		| 645264 |



	@editarModuloComunicacao
	Cenario: editar nome do modulo de comunicacao
		E clico em cadastros
		E clico em Negocios
		E seleciono a opcao modulomm
		E clico em filtrosmm
		E informo o nome do modulo cadastradomm
		E clico no botão editarmm
		E altero o nome do modulomm
		E clico no botão salvarmm




	@excluirModuloComunicacao
	Cenario: excluir modulo comunicacao
		E clico em cadastros
		E clico em Negocios
		E seleciono a opcao modulomm
		E clico em filtrosmm
#		E informo o nome do modulomm
#		E clico no botão deletarmm
#		E clico no botão simmm
#		E valido que o modulo foi excluido com sucesso






