package de.vitec.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

import de.vitec.cdi.MyCDI2;

@Stateless
public class MyEJB2 {
	
	@Inject
	MyCDI2 myCdi;
	
	public void doSomethingWithCDI() {
		myCdi.doSomeCDI();
	}
}
