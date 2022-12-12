package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
//import pages.CadastroPage;
import pages.LoginPage;
import pages.ModuloComunicacaoPage;


    public class CadastroModuloComunicacaoSteps {

    LoginPage login = new LoginPage();
    ModuloComunicacaoPage modulocomunicacao = new ModuloComunicacaoPage();


    @Entao("seleciono a opcao modulomm")
    public void seleciono_a_opcao_modulo() throws InterruptedException {

        modulocomunicacao.opcaoModulo();

    }

    @Quando("clico no botao adicionarmm")
    public void clico_no_botao_adicionar() {

        modulocomunicacao.adicionar();

    }


    @Quando("preencho as informacoes do registromm (.*) (.*)$")
    public void preencho_as_informacoes_do_registromm(String nome, String min) throws InterruptedException {

        modulocomunicacao.incluirRegistro(nome, min);
    }

    @Quando("clico no botao salvarmm")
    public void clico_no_botao_salvar() {

        modulocomunicacao.salvar();
    }

    @Quando("valido que o registro foi criado com sucessomm")
    public void valido_que_o_registro_foi_criado_com_sucesso() throws InterruptedException {

        modulocomunicacao.validarMensagem();

    }


        @Quando("clico em filtrosmm")
        public void clico_em_filtros() {

            modulocomunicacao.clicarFiltro();

        }

        @Quando("informo o nome do modulo cadastradomm")
        public void informo_o_nome_do_controlador_cadastrado() {
            modulocomunicacao.nomeControlador();
            modulocomunicacao.pesquisar();
        }

        @Quando("clico no botão editarmm")
        public void clico_no_botão_editar() {

            modulocomunicacao.editar();

        }

        @Quando("altero o nome do modulomm")
        public void altero_o_nome_do_controlador() {

            modulocomunicacao.alterarNomeModulo();

        }

        @Quando("clico no botão salvarmm")
        public void clico_no_botão_salvar() {

            modulocomunicacao.salvar();
        }

        @Quando("valido que o nome do modulo foi editado com sucessomm")
        public void valido_que_o_nome_do_controlador_foi_editado_com_sucesso() {

            modulocomunicacao.pesquisarNovoNome();
        }

        @Quando("finalizo a ediçãomm")
        public void finalizo_a_edição() throws InterruptedException {

            modulocomunicacao.validarMensagem();

        }


        @Quando("informo o nome do modulomm")
        public void informo_o_nome_do_controlador_editado_teste() {

            modulocomunicacao.alterarNomeModulo();
        }

        @Quando("clico no botão deletarmm")
        public void clico_no_botão_deletar() {

            modulocomunicacao.deletar();
        }

        @Quando("clico no botão simmm")
        public void clico_no_botão_sim() {

        modulocomunicacao.opcaoSim();
        }

        @Entao("valido que o modulo foi excluido com sucessomm")
        public void valido_que_o_controlador_foi_excluido_com_sucesso() throws InterruptedException {

            modulocomunicacao.validarMensagem();

        }



    }



