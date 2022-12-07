package library.admin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.admin.bean.Book;
import library.user.dao.UserDao;

/**
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet("/UpdateAdminServlet")
public class UpdateAdminServlet {
	
		private static final long serialVersionUID = 1L;

		/**
		 * @see HttpServlet#HttpServlet()
		 */
		public UpdateAdminServlet() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.setContentType("text./html");
			PrintWriter out = response.getWriter();

			out.println("done");
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println("ho gaya" + id);
			String bookName = request.getParameter("bookname");

			String authorName = request.getParameter("authorname");
			String price = request.getParameter("price");

			Book b = new Book();
			b.setId(id);
			b.setName(bookName);
			b.setAuthor(authorName);
			b.setPrice(Integer.parseInt(price));
			System.out.println("asad update book details######################" + b);
			UserDao ud = new UserDao();
			ud.updateAdmin(b);
			//response.sendRedirect("viewuser.jsp");

		}

	}
