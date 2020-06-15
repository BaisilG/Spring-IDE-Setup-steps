package org.baisil;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.baisil.model.Person;






@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    //http://localhost:8081/Simple_Dynamic_Web_Project/   this controller is getting by the running the server
	
	
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<Person> staff = new ArrayList<>();
		staff.add(new Person("Baisil", 25));
		staff.add(new Person("Paul", 26));
 
		request.setAttribute("staff", staff);
		
		request.getRequestDispatcher("view.jsp").forward(request, response);
		
		
		
		request.getRequestDispatcher("View.jsp").forward(request, response);
	}

	
}


// response.getwriter is giving the final result that you saw.
// as of now what we learn is controller controll the stuff, view displys the stuff