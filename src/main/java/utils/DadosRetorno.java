package utils;

public class DadosRetorno {
	
	public String ReadDados(String dados) throws Exception {
		//Variaveis para massa de dados
		String sql = "SELECT * FROM DadosTestes where NameTeste='"+dados+"';";
		String dadosmassa="";
				
		
		//Dados Massa de teste
		ConectionSQLite mass =  new ConectionSQLite();
		mass.Conectar();
		dadosmassa = mass.exec(sql);
		mass.desconectar();
		return dadosmassa;	
	}

}
