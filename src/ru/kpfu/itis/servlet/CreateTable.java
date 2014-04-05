package ru.kpfu.itis.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Ilnur on 05.04.14.
 * <p/>
 * Builds a table of the parameters rows and columns.
 *
 * @version 1.0
 */
public class CreateTable extends HttpServlet {
    /*
    * Builds a table of the parameters rows and columns.
    * */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter mPrintWriter = response.getWriter();

        mPrintWriter.println("<head><title>Create Table</title><meta name=\"author\" content=\"Khairullin Ilnur \"><meta charset=\"UTF-8\"></head><body><h1>Your Table</h1>");

        int mRow = Integer.parseInt(request.getParameter("row"));
        int mColumn = Integer.parseInt(request.getParameter("column"));

        mPrintWriter.println("<table border=\"1\">");
        for (int i = 0; i < mRow; i++) {
            mPrintWriter.println("<tr>");
            for (int j = 0; j < mColumn; j++) {
                mPrintWriter.println("<td>New cell</td>");
            }
            mPrintWriter.println("</tr>");
        }
        mPrintWriter.println("</table>");

        mPrintWriter.print("</body></html>");
        mPrintWriter.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
