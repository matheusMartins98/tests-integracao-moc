package steps;

import io.cucumber.java.pt.Quando;
import pages.AtividadesPage;

public class AtividadesSteps {
	
	AtividadesPage atividades = new AtividadesPage();
	
	// passos para criar  ATIVIDADE
	@Quando("clico em atividades")
	public void clico_em_atividades() {
		
		atividades.menuAtividades();
	}
	
	@Quando("seleciono a opção atividade")
	public void seleciono_a_opção_atividade() throws InterruptedException {
		
		atividades.opcAtividade();
		
	}
	
	@Quando("preencho os campos nome, codigo, classe de atividade, horario de funcionamento e descrição")
	public void preencho_os_campos_nome_codigo_classe_de_atividade_horario_de_funcionamento_e_descrição() {
		
		atividades.PreencherCampos();
		atividades.selecionarOpcoes();
		
	}
	
	// passos para editar  ATIVIDADE
	@Quando("informo o nome da atividade")
	public void informo_o_nome_da_atividade() {
		
		atividades.informarNomeAtividade();
		
	}
	
	@Quando("altero o nome da atividade")
	public void altero_o_nome_da_atividade() {
		
		atividades.alterarNomeAtividade();
	}
	
	// passos para excluir ATIVIDADE
	
	@Quando("informo o nome da atividade editado")
	public void informo_o_nome_da_atividade_editado() {
		
		atividades.informarNomeAtividadeEditado();
		
	}
	
	// passos para cadastro de CLASSE DE ATIVIDADE
	
	@Quando("seleciono a opção classe de atividade")
	public void seleciono_a_opção_classe_de_atividade() throws InterruptedException {
		
		atividades.opcClasse();
		
	}
	
	@Quando("preencho os campos nome, codigo e descrição")
	public void preencho_os_campos_nome_codigo_e_descrição() {
		
		atividades.PreencherCamposClasse();
		
	}
	
	// passos para editar CLASSE DE ATIVIDADE
	
	@Quando("informo o nome da Classe atividade")
	public void informo_o_nome_da_Classe_atividade() {
		
		atividades.informarNomeClasse();
	}
	
	@Quando("altero o nome da Classe atividade")
	public void altero_o_nome_da_Classe_atividade() {
		
		atividades.alterarNomeClasse();
	}
	
	// passos para excluir CLASSE DE ATIVIDADE
	
	@Quando("informo o nome da Classe atividade editado")
	public void informo_o_nome_da_Classe_atividade_editado() {
		
		atividades.informarNomeClasseEditado();
		
	}
	
	// passos para cadastrar HRS FUNCIONAMENTO
	
	@Quando("seleciono a opção Hrs Funcionamento")
	public void seleciono_a_opção_Hrs_Funcionamento() throws InterruptedException {
		
		atividades.opcHrsFuncionamento();
		
	}
	
	@Quando("preencho os campos nome do horário de funcionamento e descrição")
	public void preencho_os_campos_nome_do_horário_de_funcionamento_e_descrição() {
		
		atividades.PreencherCamposHrs();
		
	}
	
	// passos para editar HRS FUNCIONAMENTO
	
	@Quando("informo o nome do Hrs Funcionamento")
	public void informo_o_nome_do_Hrs_Funcionamento() {
		
		atividades.informarNomeHrsFuncionamento();
	}
	
	@Quando("altero o nome do Hrs Funcionamento")
	public void altero_o_nome_do_Hrs_Funcionamento() {
		
		atividades.alterarNomeHrsFuncionamento();
		
	}
	
	// passos para excluir HRS FUNCIONAMENTO
	
	@Quando("informo o nome do Hrs Funcionamento editado")
	public void informo_o_nome_do_Hrs_Funcionamento_editado() {
		
		atividades.informarNomeHrsFuncionamentoEditado();
		
	}
}
	



