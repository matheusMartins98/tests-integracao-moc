package utils;

import java.io.IOException;

public class StartSettings {
	
private String stDados;
	
	public StartSettings() throws IOException {
		ReadConfigData rd = new ReadConfigData();
		this.stDados = rd.LerDadosConfig();
	}
	
	//retorna login
	public String getLogin() {
		String stLoginrc[] = this.stDados.split("#");
		String stLoginaux[] = stLoginrc[1].split(":");
		String stLoginRet = stLoginaux[1];
		
		return stLoginRet;
	}
	
	//retorna password
	public String getPass() {
		String stPassrc[] = this.stDados.split("#");
		String stPassaux[] = stPassrc[2].split(":");
		String stpassRet = stPassaux[1];
		
		return stpassRet;
	}
	
	
	//retorna password
	public String getLink() {
		String stPassrc[] = this.stDados.split("#");
		String stPassaux[] = stPassrc[3].split(":");
		String stpassRet = stPassaux[2]+":"+stPassaux[3];
		
		return stpassRet;
	}
	
	//Retorna drivar de execução
	public String getDriver() {
		String stDriverrc[] = this.stDados.split("#");
		String stDriveraux[] = stDriverrc[4].split(":");
		String stDriverRet = stDriveraux[1];
		
		return stDriverRet;
	}
	
	//Retornar Caminho do driver windows
	public String getPathWindows() {
		String stPathrc[] = this.stDados.split("#");
		String stPathaux[] = stPathrc[5].split(":");
		String stPathRet = stPathaux[1]+":"+stPathaux[2];
		
		return stPathRet;
	}
	
	//Retornar Caminho do driver linux
	public String getPathLinux() {
		String stPathrc[] = this.stDados.split("#");
		String stPathaux[] = stPathrc[6].split(":");
		String stPathRet = stPathaux[1];
		
		return stPathRet;
	}

	//Retornar Ip do iris
	public String getIrisIp() {
		String stIrisIprc[] = this.stDados.split("#");
		String stIrisIpaux[] = stIrisIprc[7].split(":");
		String stIrisIpRet = stIrisIpaux[1];
		
		return stIrisIpRet;
	}
	
	//Retorna a porta de comunicação do Iris
	public String getPortIris() {
		String stIrisPortrc[] = this.stDados.split("#");
		String stIrisPortaux[] = stIrisPortrc[8].split(":");
		String stIrisPortRet = stIrisPortaux[1];
		
		return stIrisPortRet;
	}
	
	//caminho onde ficarão arquivos para manipulação
	public String getFileXLS() {
		String stFileXLS[] = this.stDados.split("#");
		String stFileXLSaux[] = stFileXLS[9].split(":");
		String ststFileXLSRet = stFileXLSaux[1]+':'+stFileXLSaux[2];		
		return ststFileXLSRet;
	}
	
	//caminho onde ficarão arquivos para manipulação
		public String getBasePath() throws IOException {
			String stBase[] = this.stDados.split("#");
			String stBaseaux[] = stBase[1].split(":");
			String stBaseRet = stBaseaux[1]+':'+stBaseaux[2];		
			return stBaseRet;
		}

}
