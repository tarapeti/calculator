package hu.codecool.calc.service;

import javax.jws.WebService;

import hu.codecool.calc.Calc;

@WebService(endpointInterface = "hu.codecool.calc.service.CalcService")
public class CalcServiceImpl implements CalcService {

	@Override
	public double divide(double a, double b) {
		return Calc.divide(a, b);
	}

	@Override
	public double add(double a, double b) {
		return Calc.add(a, b);
	}

	@Override
	public double subtrack(double a, double b) {
		return Calc.subtrackt(a, b);
	}

	@Override
	public double multiple(double a, double b) {
		return Calc.multiply(a, b);
	}

}
