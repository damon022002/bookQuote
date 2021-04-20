package temperatureCalculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TemperatureCalculator extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private Calculator calculator;

    public void init() throws ServletException {
        calculator = new Calculator();
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType = "<!DOCTYPE HTML>\n";
        String title = "Calculius to Fahrenheit";
        out.println(docType +
            "<HTML>\n" +
            "<HEAD><TITLE>" + title + "</TITLE>" +
            "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
            "</HEAD>\n" +
            "<BODY BGCOLOR=\"#FDF5E6\">\n" +
            "<H1>" + title + "</H1>\n" +
            "  Celsius value: " +
            request.getParameter("temp") + "\n" +
            "  <P> Farhenheit value: " +
            Double.toString(calculator.calculate(request.getParameter("temp"))) +
            "</BODY></HTML>");
    }


}
