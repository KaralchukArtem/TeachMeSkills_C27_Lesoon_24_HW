package com.teachmeskills.lesson24.task1.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeBeijingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter respWriter = resp.getWriter();
        respWriter.write("<b><h3>Beijing time: </h3></b><br>");
        respWriter.write(String.valueOf(ZonedDateTime.now(ZoneId.of("Europe/Minsk"))));
        respWriter.close();
        resp.setContentType("text/html");
    }
}
