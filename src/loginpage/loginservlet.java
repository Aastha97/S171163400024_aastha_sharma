package loginpage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.user;


/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	List<user> list = new ArrayList();
	
    public loginservlet() {
    	
           
        	list.add(new user("ajay", "1234"));
        	list.add(new user("shuti", "1234"));
        	list.add(new user("raghav", "1234"));
        	list.add(new user("aastha", "1234"));
        	
        }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String username = request.getParameter("name");
		String password = request.getParameter("pass");
		
		RequestDispatcher log;
		
	    int flag=0;
		 
		for(user i : list){
			if(username.equals(i.getUsername()) && password.equals(i.getPassword()))
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
		{
			request.setAttribute("username", username);
			log = request.getRequestDispatcher("welcome.jsp");
			log.forward(request, response);
		}
		else
		{
			request.setAttribute("error", "Please fill the correct info!");
			log= request.getRequestDispatcher("login.jsp");
			log.forward(request, response);
		}
	}

}
