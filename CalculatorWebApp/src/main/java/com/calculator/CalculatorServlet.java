package com.calculator;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operator = request.getParameter("operator");
        double result = 0;
        String message = "";

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    message = "Error: Cannot divide by zero.";
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                message = "Invalid operator.";
        }

        request.setAttribute("result", result);
        request.setAttribute("message", message);
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/result.jsp");
        rd.forward(request, response);
    }
}
