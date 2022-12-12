#language: pt

@GrupoFeriados
Funcionalidade: Realizar cadastro, edição e exclusão de grupo de feriados

@CadastroGrupoFeriados
Cenario: Realizar cadastro de grupo de feriados
	E clico em cadastros
	E clico em faturamento e tarifas
	E clico em grupos de feriado
	E clico no botao adicionar
	E preencho o campo nome e seleciono o grupo de feriados
	E salvo o cadastro
	E valido que o registro foi criado com sucesso
	
	
@EdiçãoGrupoFeriados
Cenario: Realizar edição de grupo de feriados
	E clico em cadastros
	E clico em faturamento e tarifas
	E clico em grupos de feriado
	E clico em filtros
	E informo o nome do grupo de feriado
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do grupo de feriados
	E salvo o cadastro
	E valido que o registro foi editado com sucesso
	
	
@ExclusãoGrupoFeriados
Cenario: Realizar exclusão de grupo de feriados
	E clico em cadastros
	E clico em faturamento e tarifas
	E clico em grupos de feriado
	E clico em filtros
	E informo o nome do grupo de feriados editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso
	
	
	
	