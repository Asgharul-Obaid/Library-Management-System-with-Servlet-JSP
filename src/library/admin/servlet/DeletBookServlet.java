package library.admin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import library.admin.bean.Book;
import library.admin.dao.BookDao;

/**
 * Servlet implementation class DeletBookServlet
 */
@WebServlet("/DeletBookServlet")
public class DeletBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				int id =Integer.parseInt(request.getParameter("id"));
		 System.out.print("myfun1");
		
		BookDao book =new BookDao();
		 System.out.print("myfun2");
		book.deleteBook(id);
		 System.out.print("myfun3");
		response.sendRedirect("viewbook.jsp");
		System.out.println("after delete");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
