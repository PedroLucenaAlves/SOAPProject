package br.com.calculadorapedro.ws.ui;

import java.net.MalformedURLException;
import java.net.URL;

import br.com.calculadorapedro.ws.client.SomarWSService;

public class Main {

	public static void main(String[] args) throws MalformedURLException {

		SomarWSService srv = new SomarWSService(new URL("http://localhost:8080/tw-calculadoraPedro-ws/services/SomarWSPort")); //objeto do tipo url 
		System.out.println(srv.getSomarWSPort().somar(2, 3)); //invocacao do webservice soap atraves do cliente
		
	}

}
