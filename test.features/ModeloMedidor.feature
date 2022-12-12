# language: pt

@ModeloMedidor
Funcionalidade: Realizar cadastro, edição e exclusão do modelo do medidor

@CadastroModeloMedidor
Cenario: Realizar cadastro do modelo do medidor
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em modelo do medidor
	E clico no botao adicionar
	E preencho os campos nome, protocolo e fabricante
	E clico no botao salvar
	E valido que o registro foi criado com sucesso
	
	
@EditarModeloMedidor
Cenario: Realizar edição do modelo do medidor
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em modelo do medidor
	E clico em filtros
	E informo o nome do medidor
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do modelo do medidor
	E clico no botao salvar
	E valido que o nome do subgrupo foi editado com sucesso
	
	
	@ExcluirModeloMedidor
Cenario: Realizar exclusão do modelo do medidor
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em modelo do medidor
	E clico em filtros
	E informo o nome do medidor
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o nome do subgrupo foi editado com sucesso
