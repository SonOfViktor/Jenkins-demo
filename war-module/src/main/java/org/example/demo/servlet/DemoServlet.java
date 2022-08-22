package org.example.demo.servlet;

import org.example.demo.service.DemoService;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
    private final DemoService demoService = DemoService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());

        String numberString = req.getParameter("number");
        int number = !numberString.isBlank() ? Integer.parseInt(numberString) : 0;

        try (PrintWriter writer = resp.getWriter()) {
            writer.write("<h1>" + demoService.createHelloWorld() + "</h1>");
            System.out.println("This line must be code smell!");
        }
    }
}
