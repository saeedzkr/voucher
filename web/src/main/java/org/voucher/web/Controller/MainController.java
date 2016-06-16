package org.voucher.web.Controller;

import org.jboss.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by s.zakipour on 1/10/16.
 */
public class MainController extends HttpServlet
{
    static final Logger logger = Logger.getLogger(MainController.class);

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.log(Logger.Level.INFO , req.getRemoteUser());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        resp.sendRedirect("pages/QueueMonitor.xhtml");
        //resp.sendRedirect("pages/main.xhtml");

    }
}
