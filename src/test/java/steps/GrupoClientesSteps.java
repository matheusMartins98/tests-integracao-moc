package steps;

import io.cucumber.java.pt.Quando;
import pages.GrupoClientesPage;

public class GrupoClientesSteps {

	GrupoClientesPage grupoClientes = new GrupoClientesPage();

	// cadastro do grupo base

	@Quando("seleciono a opcao grupo de clientes")
	public void seleciono_a_opcao_grupo_de_clientes() {

		grupoClientes.clicarGrupoClientes();

	}

	@Quando("preencho os campos nome e descricao (.*) (.*)$")
	public void preencho_os_campos_nome_e_descricao(String nome, String descricao) {

		grupoClientes.preencherCampos(nome, descricao);

	}
	
	@Quando("salvo o cadastro")
	public void salvo_o_cadastro() {

		grupoClientes.salvar();

	}
	
	

	// cadastro do subGrupo

	@Quando("preencho os campos nomesub e descricaosub (.*) (.*)$")
	public void preencho_os_campos_nomesub_e_descricaosub(String nomeSub, String descricaoSub) {

		grupoClientes.preencherCamposSub(nomeSub, descricaoSub);

	}

	@Quando("seleciono o grupo associado")
	public void seleciono_o_grupo_associado() {

		grupoClientes.grupoAssociado();

	}

	// editar sub grupo
	@Quando("informo o nome do subgrupo")
	public void informo_o_nome_do_subgrupo() {

		grupoClientes.preencherNomeFiltro();

	}

	@Quando("clico no botao pesquisar")
	public void clico_no_botao_pesquisar() {

		grupoClientes.clicarBtnPesquisar();

	}

	@Quando("altero o nome do subgrupo")
	public void altero_o_nome_do_subgrupo() {

		grupoClientes.novoNomeSubGrupo();

	}
	
	@Quando("valido que o nome do subgrupo foi editado com sucesso")
	public void valido_que_o_nome_do_subgrupo_foi_editado_com_sucesso() {

		grupoClientes.validarMensagem();

	}
	
	// editar grupo base
	
	@Quando("informo o nome do grupo")
	public void informo_o_nome_do_grupo() {

		grupoClientes.preencherNomeGrupo();

	}
	
	@Quando("altero o nome do grupo")
	public void altero_o_nome_do_grupo() {

		grupoClientes.novoNomeGrupoBase();

	}
	
	@Quando("valido que o nome do grupo foi editado com sucesso")
	public void valido_que_o_nome_do_grupo_foi_editado_com_sucesso() {

		grupoClientes.validarMensagem();

	}
	
	
	//excluir sub grupo
	@Quando("informo o nome do sub grupo editado")
	public void informo_o_nome_do_sub_grupo_editado() {

		grupoClientes.subGrupoEditado();

	}
	

	@Quando("valido que o sub grupo foi excluido com sucesso")
	public void valido_que_o_sub_grupo_foi_excluido_com_sucesso() {

		grupoClientes.validarMensagem();

	}
	
	// excluir grupo base
	
	@Quando("informo o nome do grupo base editado")
	public void informo_o_nome_do_grupo_base_editado() {

		grupoClientes.grupoBaseEditado();

	}
	
	@Quando("valido que o grupo base foi excluido com sucesso")
	public void valido_que_o_grupo_base_foi_excluido_com_sucesso() {

		grupoClientes.validarMensagem();

	}
	
	
	
	
	
	
	

}
