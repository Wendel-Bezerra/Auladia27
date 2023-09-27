import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ConcatenaDadosServlet")
public class ConcatenaDadosServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nome = request.getParameter("nome");
        String estadoCivil = request.getParameter("estadoCivil");
        String faixaEtaria = request.getParameter("faixaEtaria");

        String resultado = "Nome: " + nome + ", Estado Civil: " + estadoCivil + ", Faixa Etária: " + faixaEtaria;

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write(resultado);
    }
}
