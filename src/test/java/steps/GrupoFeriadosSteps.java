package steps;

import io.cucumber.java.pt.Quando;
import pages.GrupoFeriadosPage;

public class GrupoFeriadosSteps {
	
	GrupoFeriadosPage grupoFeriado = new GrupoFeriadosPage();

	@Quando("clico em grupos de feriado")
	public void clico_em_grupos_de_feriado() throws InterruptedException {
		
		grupoFeriado.clicarGrupoFeriado();
	}

	@Quando("preencho o campo nome e seleciono o grupo de feriados")
	public void preencho_o_campo_nome_e_seleciono_o_grupo_de_feriados() {
		
		grupoFeriado.preencherNome();

	}

	@Quando("informo o nome do grupo de feriado")
	public void informo_o_nome_do_grupo_de_feriado() {

		grupoFeriado.informarNomeGrupo();
	}

	@Quando("altero o nome do grupo de feriados")
	public void altero_o_nome_do_grupo_de_feriados() {
		
		grupoFeriado.alterarNomeGrupo();

	}
	
	@Quando("informo o nome do grupo de feriados editado")
	public void informo_o_nome_do_grupo_de_feriados_editado() {
		
		grupoFeriado.informarNomeGrupoEditado();

	}

}
