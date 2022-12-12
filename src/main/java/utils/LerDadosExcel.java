package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class LerDadosExcel {

	public static void main(String[] args) throws InterruptedException, IOException {

		String nome = LerDadosExcel.listarArquivos(ConstantesPath.DIRETORIOBASE);
//		org.junit.Assert.assertTrue(leituraExcel(nome, nome).contains("grupos de clientes"));
//		System.out.println(leituraExcel(ConstantesPath.DIRETORIOBASE, nome).contains("Relatório"));

		deleteFile(ConstantesPath.DIRETORIOBASE, nome);

	}

	public static String leituraExcel(String diretorio, String nomeArquivo) throws InterruptedException, IOException {

//		System.out.println(nomeArquivo);
		File arquivo = new File(diretorio + nomeArquivo);
		FileReader leitura = new FileReader(arquivo);
		BufferedReader buffer = new BufferedReader(leitura);

		byte[] conteudo;
		String linha = "";
		try {

		while((linha = buffer.readLine()) != null) {
				System.out.println(linha);
				break;
			}

			linha = buffer.readLine();
		} catch (IOException e) {

			e.printStackTrace();

		}
		buffer.close();

		return linha;
		
	}

	public static String listarArquivos(String diretoriobase) {
		File arquivos = new File(diretoriobase);
		File[] minhaLista = arquivos.listFiles();
		for (File meuArquivo : minhaLista) {
			String nome = meuArquivo.getName();
			if (nome.contains(".csv")) {

				return nome;
			}

		}
		return "NOK";
	}

	// deleta arquivo baixado

	public static void deleteFile(String diretorio, String nomeArquivo) throws NoSuchFileException {
		if (nomeArquivo.equals("NOK")) {
			return;
		}
		File file = new File(diretorio + nomeArquivo);
		file.delete();
	}
}