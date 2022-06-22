package prova;

import java.util.Scanner;

public class DoadorController {
	public static void cadastrarDoador(Long cpf, String tipoSanguineo) throws TipoSanguineoNotFoundException {
		try 
		{
			String ANEGATIVO = null;
			String APOSITIVO = null;
			String BPOSITIVO = null;
			String BNEGATIVO = null;
			String ABPOSITIVO = null;
			String ABNEGATIVO = null;
			String ONEGATIVO = null;
			String OPOSITIVO = null;
			if(tipoSanguineo == ANEGATIVO) {
				
			} else if(tipoSanguineo == APOSITIVO) {
				
			}else if(tipoSanguineo == BPOSITIVO) {
				
			}else if(tipoSanguineo == BNEGATIVO) {
				
			}else if(tipoSanguineo == ABPOSITIVO) {
				
			}else if(tipoSanguineo == ABNEGATIVO) {
				
			}else if(tipoSanguineo == ONEGATIVO) {
				
			}else if(tipoSanguineo == OPOSITIVO) {
				
			}
		}
		catch(TipoSanguineoNotFoundException e)
		{
			System.out.println(e);
		}
	}
	
	public static void cadastrarDoacao(String tipoSanguineo, Long quantidade) {
		try 
		{
			String ANEGATIVO = null;
			String APOSITIVO = null;
			String BPOSITIVO = null;
			String BNEGATIVO = null;
			String ABPOSITIVO = null;
			String ABNEGATIVO = null;
			String ONEGATIVO = null;
			String OPOSITIVO = null;
			if(tipoSanguineo == ANEGATIVO) {
				
			} else if(tipoSanguineo == APOSITIVO) {
				
			}else if(tipoSanguineo == BPOSITIVO) {
				
			}else if(tipoSanguineo == BNEGATIVO) {
				
			}else if(tipoSanguineo == ABPOSITIVO) {
				
			}else if(tipoSanguineo == ABNEGATIVO) {
				
			}else if(tipoSanguineo == ONEGATIVO) {
				
			}else if(tipoSanguineo == OPOSITIVO) {
				
			}else if(quantidade > 0) {
				
			}
		}
		catch(TipoSanguineoNotFoundException e)
		{
			System.out.println(e);
		}
	}
}
