package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.maven.basico.service.*;

@WebServlet("/hola-mundo")
public class HolaMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CalculadoraService calculadoraService = 
				CalculadoraServiceFactory
					.createCalculadoraService();
		
		response.getWriter().append("2 + 2 = " + 
				calculadoraService.sumar(2, 2));
	}

}
