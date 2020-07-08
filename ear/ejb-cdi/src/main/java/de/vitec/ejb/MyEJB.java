package de.vitec.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

import de.vitec.cdi.MyCDI;

@Stateless
public class MyEJB {
	
	@Inject
	MyCDI myCdi;
	
	public void doSomethingWithCDI() {
		myCdi.doSomeCDI();
	}
}
