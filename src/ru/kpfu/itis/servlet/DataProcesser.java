package ru.kpfu.itis.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Ilnur on 05.04.14.
 * <p/>
 * Processes the input data.
 *
 * @version 1.0
 */
public class DataProcesser extends HttpServlet {

    /*
    * Checks the validity of the entered data. They will be >= 1.
    * */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int mRow = Integer.parseInt(request.getParameter("fieldRow"));
            int mColumn = Integer.parseInt(request.getParameter("fieldColumn"));

            if (mColumn >= 1 && mRow >= 1) {
                request.getRequestDispatcher("/table?row=" + mRow + "&column=" + mColumn).forward(request, response);
                response.sendRedirect("/table");
            } else {
                response.sendRedirect("/index.jsp?error_msg=You cannot enter value of < 1. Enter correct values, please.");
            }
        } catch (NumberFormatException e) {
            response.sendRedirect("/index.jsp?error_msg=Enter correct fill in all fields, please.");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
