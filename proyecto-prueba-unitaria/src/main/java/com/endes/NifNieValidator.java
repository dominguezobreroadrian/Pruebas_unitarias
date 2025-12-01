package com.endes;

public class NifNieValidator {

	 public static boolean validarNif(String nif) {
		 	boolean resultado = true;
	        if (nif.length() != 9) {
	        	resultado = false;
	            return resultado;
	        }

	        String numero = nif.substring(0, 8);
	        if (!numero.matches("\\d{8}")) {
	            resultado = false;
	        	return resultado;
	        }

	        char letra = nif.charAt(8);
	        if (!Character.isLetter(letra)) {
	            resultado = false;
	        	return resultado;
	        }

	        return resultado;
	    }

	    public static boolean validarNie(String nie) {
	    	boolean resultado = true;
	        if (nie.length() != 9) {
	            resultado = false;
	        	return resultado;
	        }

	        char letraInicial = nie.charAt(0);
	        if (letraInicial != 'X' && letraInicial != 'Y' && letraInicial != 'Z') {
	        	resultado = false;
	        	return resultado;
	        }

	        String numero = nie.substring(1, 8);
	        if (!numero.matches("\\d{7}")) {
	        	resultado = false;
	        	return resultado;
	        }

	        char letraFinal = nie.charAt(8);
	        if (!Character.isLetter(letraFinal)) {
	        	resultado = false;
	        	return resultado;
	        }

	        if (letraInicial == 'X') {
	            numero = "0" + numero;
	        } else if (letraInicial == 'Y') {
	            numero = "1" + numero;
	        } else if (letraInicial == 'Z') {
	            numero = "2" + numero;
	        }
	        return resultado;
	        
	    }

	    public static boolean validarNifNie(String numero) {

	        if (numero.length() == 9) {
	            if (Character.isDigit(numero.charAt(0))) {
	                return validarNif(numero);
	            } else {
	                return validarNie(numero);
	            }
	        }
	        return false;
	    }
}