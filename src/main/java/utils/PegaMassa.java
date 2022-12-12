package utils;

public class PegaMassa {
	
	//Retorna massa de dados
		public static String getMassa(String stMassa, int intPosi) throws Exception {
			//Busca Massa de dados
			DadosRetorno banco = new DadosRetorno();	
			String massa = banco.ReadDados(stMassa);
			String massa2[] = massa.split(";");
			return massa2[intPosi];
		}

}
