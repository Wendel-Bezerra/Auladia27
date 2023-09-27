import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numero1 = Integer.parseInt(request.getParameter("numero1"));
        int numero2 = Integer.parseInt(request.getParameter("numero2"));
        
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        
        double divisao = (double) numero1 / numero2;
        int resto = numero1 % numero2;
        
        request.setAttribute("numero1", numero1);
        request.setAttribute("numero2", numero2);
        request.setAttribute("soma", soma);
        request.setAttribute("subtracao", subtracao);
        request.setAttribute("multiplicacao", multiplicacao);
        request.setAttribute("divisao", divisao);
        request.setAttribute("resto", resto);
        
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
