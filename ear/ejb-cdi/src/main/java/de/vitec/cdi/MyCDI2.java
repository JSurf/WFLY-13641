package de.vitec.cdi;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import de.vitec.ejb.MyEJB;

@Dependent
public class MyCDI2 {
	MyEJB ejb;
	
	@Inject	
	public MyCDI2(MyEJB ejb) {
		this.ejb = ejb;
	}
	
	public void doSomeCDI() {
		System.out.println("Do MyCDI2");
		ejb.doSomethingWithCDI();
	}

}
