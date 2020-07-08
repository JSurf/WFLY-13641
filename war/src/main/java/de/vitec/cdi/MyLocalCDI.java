package de.vitec.cdi;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyLocalCDI {
	
	public void doSomeCDI() {
		System.out.println("Some Local CDI");
	}

}
