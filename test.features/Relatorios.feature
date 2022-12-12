# language: pt

@QualidadeEnergia
Funcionalidade: Emissao dos relatorios de qualidade de energia

  
 @DRPeDRC 
Esquema do Cenario: Realizar emissão do relatório Indicadores de DRP e DRC parciais
#Dado que eu acesse o Residencial Smart
#E informo o usuario e senha
#E realizo o login com sucesso
E clico em relatórios
E clico em Qualidade de Energia
E clico na opção indicadores de DRP e DRC parciais
E seleciono o periodo
E escolho os campos do filtro <Serial>
E clico no botão filtrar
E visualizo a exibição do relatório gerado
E realizo o download do relatorio
Entao realizo a validação dos dados do excel

Exemplos:

|Serial  	|
|14753530	|


@IndicadoresConsolidados
Esquema do Cenario: Realizar emissão do relatório Indicadores consolidados
 E clico em relatóriosC
E clico em Qualidade de EnergiaC
E clico na opção Indicadores consolidadosC
E seleciono o periodoC
Quando escolho os campos do filtroC <Serial>
E clico no botão filtrarC
E visualizo a exibição do relatório geradoC

 Exemplos:

 |Serial 	|
 |11808474	|

#
@InterrupcaoEnergia
 Esquema do Cenario: Realizar emissão do relatório Interrupção de energia
  E clico em relatóriosE
  E clico em Qualidade de EnergiaE
  E clico na opção Indicadores consolidadosE
  E seleciono o periodoE
  Quando escolho os campos do filtroE <Serial>
  E clico no botão filtrarE
  E visualizo a exibição do relatório geradoE

  Exemplos:

   |Serial 	|
   |11808474	|
   
   
@AnaliseTensao
 Esquema do Cenario: Realizar emissão do relatório Análise de tensão
 #	Dado que eu acesse o Residencial Smart
#	Quando informo o usuario e senha
#	E realizo o login com sucesso
	E clico em relatórios
 	E clico em Qualidade de Energia
	E clico em Análise de tensão
	E clico em Medidor Serial
	E preencho o campo Medidor Serial <serial>
	E clico em Pesquisar
	E seleciono o medidor
	E clico em Selecionar
	E preencho Selecione o mês e ano
	E clico no botão Filtrar
	E clico no botão Exportar
	E seleciono a opção Exportar .CSV
	Então valido os dados emitidos
	
	
	
	Exemplos:

   | Serial 	|
   | 11809089	|
 
