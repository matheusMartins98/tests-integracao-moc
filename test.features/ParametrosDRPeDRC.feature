#language: pt

@ParametrosDRPeDRC
Funcionalidade: Realizar cadastro, edição e exclusão de inibição de eventos

@CadastroParametrosDRPeDRC
Cenario: Realizar cadastro de parâmetros dos indicadores de DRP e DRC
	E clico em cadastros
	E clico em qualidade de energia
	E clico em parâmetros dos indicadores
	E clico no botao adicionar
	E seleciono os campos Controlador, tensão nominal, limite DRC e limite DRP
	E salvo o cadastro
	E valido que o registro foi criado com sucesso
	
	
@EdiçãoParametrosDRPeDRC
Cenario: Realizar edição de parâmetros dos indicadores de DRP e DRC
	E clico em cadastros
	E clico em qualidade de energia
	E clico em parâmetros dos indicadores
	E clico em filtros
	E seleciono o controlador
	E clico no botao pesquisar
	E clico no botão editar
	E altero o valor da tensão nominal
	E salvo o cadastro
	E valido que o registro foi editado com sucesso
	
	
@ExclusãoParametrosDRPeDRC
Cenario: Realizar exclusão de parâmetros dos indicadores de DRP e DRC
	E clico em cadastros
	E clico em qualidade de energia
	E clico em parâmetros dos indicadores
	E clico em filtros
	E seleciono o controlador
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso