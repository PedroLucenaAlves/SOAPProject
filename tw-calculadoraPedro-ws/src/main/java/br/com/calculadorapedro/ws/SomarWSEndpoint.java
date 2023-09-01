package br.com.calculadorapedro.ws;

/**
 * Definicoes do WebService
 */

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "SomarWSEndpoint", targetNamespace = "http://ws.calculadorapedro.com.br/")
public interface SomarWSEndpoint {

	@WebMethod(operationName = "somar", action = "urn:Somar") //servico soap que sera exposto
	@WebResult(name = "return") //retorno esperado (nome que aparecera na Response do nosso wsdl)
	int somar(@WebParam(name = "arg0") int n1, @WebParam(name = "arg1") int n2); //parametros esperados pelo nosso webmethod

}