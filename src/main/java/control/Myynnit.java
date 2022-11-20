package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.Myynti;
import model.dao.Dao;

@WebServlet("/myynnit/*")
public class Myynnit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Myynnit() {
       System.out.println("Myynnit.Myynnit()");
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Myynnit.doGet()");
		Dao dao = new Dao();
		ArrayList<Myynti> asiakkaat = dao.getAllItems();
		String strJSON = new Gson().toJson(asiakkaat);
		System.out.println(asiakkaat);
		System.out.println(strJSON);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		System.out.println("Myynnit.doPost()");
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Myynnit.doPut()");
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Myynnit.doDelete()");
	}

}
