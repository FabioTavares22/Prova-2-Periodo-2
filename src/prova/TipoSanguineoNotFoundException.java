package prova;

public class TipoSanguineoNotFoundException extends RuntimeException {
	public static String message() {
		return "Tipo sanguineo inexistente";
	}
}
