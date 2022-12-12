#language: pt

@Atividades
Funcionalidade: Realizar cadastro, edição e exclusão de atividades, classe de atividade e Hrs de funcionamento

@CadastroAtividade
Cenario: Realizar cadastro de atividade
 Dado que eu acesse o Residencial Smart
	Quando informo o usuario e senha
	E realizo o login com sucesso
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em atividades
	E seleciono a opção atividade
	E clico no botao adicionar
	E preencho os campos nome, codigo, classe de atividade, horario de funcionamento e descrição
	E salvo o cadastro
	E valido que o registro foi criado com sucesso
	
	
	@EdiçãoAtividade
	Cenario: Realizar edição de atividade
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em atividades
	E seleciono a opção atividade
	E clico em filtros
	E informo o nome da atividade
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome da atividade
	E salvo o cadastro
	E valido que o registro foi editado com sucesso
	
	
	@ExclusãoAtividade
	Cenario: Realizar exclusão de atividade
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em atividades
	E seleciono a opção atividade
	E clico em filtros
	E informo o nome da atividade editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso
	
@CadastroClasseAtividade
Cenario: Realizar cadastro classe de atividade
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em atividades
	E seleciono a opção classe de atividade
	E clico no botao adicionar
	E preencho os campos nome, codigo e descrição
	E salvo o cadastro
	E valido que o registro foi criado com sucesso
	
	@EdiçãoClasseAtividade
	Cenario: Realizar edição de Classe atividade
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em atividades
	E seleciono a opção classe de atividade
	E clico em filtros
	E informo o nome da Classe atividade
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome da Classe atividade
	E salvo o cadastro
	E valido que o registro foi editado com sucesso
	
	@ExclusãoClasseAtividade
	Cenario: Realizar exclusão de Classe atividade
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em atividades
	E seleciono a opção classe de atividade
	E clico em filtros
	E informo o nome da Classe atividade editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso
	
	@CadastroHrsFuncionamento
Cenario: Realizar cadastro de Hrs Funcionamento
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em atividades
	E seleciono a opção Hrs Funcionamento
	E clico no botao adicionar
	E preencho os campos nome do horário de funcionamento e descrição
	E salvo o cadastro
	E valido que o registro foi criado com sucesso
	
	@EdiçãoHrsFuncionamento
	Cenario: Realizar edição de Hrs Funcionamento
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em atividades
	E seleciono a opção Hrs Funcionamento
	E clico em filtros
	E informo o nome do Hrs Funcionamento
	E clico no botao pesquisar
	E clico no botão editar
	E altero o nome do Hrs Funcionamento
	E salvo o cadastro
	E valido que o registro foi editado com sucesso
	
	@ExclusãoHrsFuncionamento
	Cenario: Realizar exclusão de Hrs Funcionamento
	E clico em cadastros
	E clico em adicionais ao negocio
	E clico em atividades
	E seleciono a opção Hrs Funcionamento
	E clico em filtros
	E informo o nome do Hrs Funcionamento editado
	E clico no botao pesquisar
	E clico no botão deletar
	E clico no botão sim
	E valido que o registro foi excluido com sucesso
	
	
	
	