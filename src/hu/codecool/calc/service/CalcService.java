package hu.codecool.calc.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CalcService {
	
    @WebMethod
    double divide(@WebParam(name = "a") double a, @WebParam(name = "b") double b);
    
    @WebMethod
    double add(@WebParam(name = "a") double a, @WebParam(name = "b") double b);
    
    @WebMethod
    double subtrack(@WebParam(name = "a") double a, @WebParam(name = "b") double b);
    
    @WebMethod
    double multiple(@WebParam(name = "a") double a, @WebParam(name = "b") double b);
}