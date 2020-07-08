package de.vitec.cdi;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyCDI {
	
	public void doSomeCDI() {
		System.out.println("Some CDI");
	}

}
