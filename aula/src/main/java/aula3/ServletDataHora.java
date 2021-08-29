package aula3;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDataHora
 */
@WebServlet("/ServletDataHora")
public class ServletDataHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDataHora() {
        super();
    }

	@Override
    public void init() throws ServletException {
        log("ServletDataHora iniciado às " + format(new Date()));
    }

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY>Olá! A data e hora atual é: ");
		saida.write(format.format(new Date()));
		saida.write("</BODY></HTMLL>");
		saida.write("");
	
	}
	
	@Override
	public void destroy() {
        log("ServletDataHora iniciado às " + format(new Date()));
		super.destroy();
	}

	private String format(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}