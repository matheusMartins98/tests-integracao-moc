# language: pt

@LeituraDeRegistradoresUmMedidor
Funcionalidade: Gerar relatório Leitura de Registradores para um medidor

Esquema do Cenario:  Gerar relatório Leitura de Registradores para um medidor
#Dado que eu acesse o Residencial Smart
#Quando informo o usuario e senha
#E realizo o login com sucesso
E clico em relatórios
E clico em Medição
E clico em Leitura de Registradores para um medidor
E clico no campo Medidor Serial
E informo o numero de serial<serial>
E clico em pesquisar
E clico em Selecionar
E seleciono o mes e ano
E Seleciono a primeira Leitura Disponível
E clico no botão Filtrar
E clico no botão Exportar
E seleciono a opção Exportar .CSV
Então valido a emissão do Relatorio Leitura de Registradores para um medidor

Exemplos:

|serial  	|
|11809200	|