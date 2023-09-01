package br.com.calculadorapedro.ws;

import javax.jws.WebService;
                                                                                                                                      //nome na url              //nome do servico               
@WebService(targetNamespace = "http://ws.calculadorapedro.com.br/", endpointInterface = "br.com.calculadorapedro.ws.SomarWSEndpoint", portName = "SomarWSPort", serviceName = "SomarWSService")
public class SomarWS implements SomarWSEndpoint {
	
	public int somar (int n1, int n2) {
		return n1 + n2;
	}

}
