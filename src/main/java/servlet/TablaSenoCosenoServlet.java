package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/tabla")
public class TablaSenoCosenoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
        out.println("<title>Tabla de Seno y Coseno</title>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container my-5'>");
        out.println("<h1 class='text-center mb-4'>Tabla de Seno y Coseno</h1>");
        out.println("<table class='table table-striped table-bordered'>");
        out.println("<thead class='table-dark'><tr><th>Ángulo (°)</th><th>Seno</th><th>Coseno</th></tr></thead>");
        out.println("<tbody>");

        for (int a = 0; a <= 360; a += 15) {
            double radian = Math.toRadians(a);
            double sinValue = Math.sin(radian);
            double cosValue = Math.cos(radian);

            out.printf("<tr><td>%d</td><td>%.4f</td><td>%.4f</td></tr>", a, sinValue, cosValue);
        }

        out.println("</tbody>");
        out.println("</table>");
        out.println("<div class='text-center mt-4'>");
        out.println("<a href='/' class='btn btn-secondary'>Volver</a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}

