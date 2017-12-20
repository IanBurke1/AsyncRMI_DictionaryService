package ie.gmit.sw.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ie.gmit.sw.server.DictionaryService;

/**
 * Servlet implementation class DictionaryServlet
 */
@WebServlet(urlPatterns={"/DictionaryServlet"}, asyncSupported=true)
public class DictionaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String result;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DictionaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String query = request.getParameter("query");
		out.print(query);
		try {
			DictionaryService ds = (DictionaryService) Naming.lookup("rmi://127.0.0.1:1099/DictionaryService");
			result = ds.lookup(query);
		} catch (NotBoundException e) {
			
			e.printStackTrace();
		}
		
		
	
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);

	}
}
