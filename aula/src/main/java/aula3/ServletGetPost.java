package aula3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGetPost
 */
@WebServlet("/ServletGetPost")
public class ServletGetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGetPost() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// doPost(request, response); � possivel chamar um m�todo dentro de outro m�todo
    	PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY>Ol�! A data e hora atual �: ");
		saida.write("Resposta do m�todo GET");
		saida.write("</BODY></HTMLL>");
		saida.write("");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY>Ol�! A data e hora atual �: ");
		saida.write("Resposta do m�todo POST");
		saida.write("</BODY></HTMLL>");
		saida.write("");
    }
}
