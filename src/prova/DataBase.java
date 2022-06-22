package prova;

import java.util.List;
import java.util.Map;

public class DataBase {
	private static List<Doador> doadores;
	private static Map<String, Long> estoqueSanguineo;

	public static Map<String, Long> getEstoqueSanguineo(String tipoSanguineo) {
		return estoqueSanguineo;
	}

	public static void addDoador(Doador doador) {
		
	}
	
	public static void addDoacao(String tipoSanguineo, Long quantidade) {
		
	}
}
