package com.example.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController //extends HttpServlet 
{

	/*
	 * @Override protected void doGet(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException{ String user =
	 * req.getParameter("userName"); String password = req.getParameter("password");
	 * 
	 * 
	 * //link xml datas with Xpath and JSTL..... }
	 * 
	 * 
	 * @Override protected void doPost(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { super.doPost(req, resp); }
	 */
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
