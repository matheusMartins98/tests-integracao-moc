# language: pt

@StatusInstalacao
Funcionalidade: Realizar cadastro, edição e exclusão do status de instalação

@CadastroStatusInstalacao
Cenario: Realizar cadastro do status de instalação
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em status de instalacao
	E clico no botao adicionar
	E preencho os campos descricao e codigo
	E clico no botao salvar
	E valido que o registro foi criado com sucesso

@EditarStatusInstalacao
Cenario: Realizar edicao do status de instalação
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em status de instalacao
	E clico em filtros
	E informo o nome do status de instalacao
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do status de instalacao
	E clico no botao salvar
	E valido que o registro foi editado com sucesso
	
	@ExcluirStatusInstalacao
Cenario: Realizar exclusao do status de instalação
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em status de instalacao
	E clico em filtros
	E informo o nome do status de instalacao editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso