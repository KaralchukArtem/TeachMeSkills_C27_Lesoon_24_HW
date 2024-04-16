package com.teachmeskills.lesson24.task1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/minsk")
public class TimeMinskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter respWriter = resp.getWriter();
        respWriter.write("<b><h3>Minsk time: </h3></b><br>");
        respWriter.write(String.valueOf(ZonedDateTime.now(ZoneId.of("Europe/Minsk"))));
        respWriter.close();
        resp.setContentType("text/html");
    }
}
