package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadConfigData {
	
	public String LerDadosConfig() throws IOException {
		String linha ="";
		String nome="src\\main\\resources\\config.cfg";
		String dados="";
		
		BufferedReader br = new BufferedReader(new FileReader(nome));
		while(br.ready()){
			dados= br.readLine();
			linha = linha + dados;
			
		}
		br.close();
		return linha;
	}

}
