package de.vitec;

import java.io.IOException;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.vitec.cdi.MyLocalCDI;
import de.vitec.ejb.MyEJB;
import de.vitec.ejb.MyEJB2;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

	@Inject
	MyLocalCDI cdi;

	@EJB(lookup = "java:global/myear/wfly20-myejb-0.0.1/MyEJB!de.vitec.ejb.MyEJB")
	public MyEJB ejb;

	@EJB(lookup = "java:global/myear/wfly20-myejb-0.0.1/MyEJB2!de.vitec.ejb.MyEJB2")
	public MyEJB2 ejb2;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		cdi.doSomeCDI();
		ejb.doSomethingWithCDI();
		ejb2.doSomethingWithCDI();
		resp.getWriter().write("MyServlet executed");
	}
}
