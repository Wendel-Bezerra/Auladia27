import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalculaIdadeServlet")
public class CalculaIdadeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
        String fezAniversario = request.getParameter("fezAniversario");
        
        int anoAtual = java.time.LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;
        
        if (fezAniversario.equals("nao")) {
            idade--;
        }
        
        request.setAttribute("idade", idade);
        request.getRequestDispatcher("idade.jsp").forward(request, response);
    }
}
