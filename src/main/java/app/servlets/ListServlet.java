package app.servlets;

import app.model.CartridgeDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CartridgeDAO cartridgeDAO = CartridgeDAO.getInstance();
        //List<Cartridge> cartridges = cartridgeDAO.list();
        req.setAttribute("cartridges", cartridgeDAO.list());
        req.getRequestDispatcher("/views/list.jsp").forward(req, resp);


    }
}
