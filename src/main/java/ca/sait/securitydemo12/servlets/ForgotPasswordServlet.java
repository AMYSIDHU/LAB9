package ca.sait.securitydemo12.servlets;

import ca.sait.securitydemo12.dataaccess.UserDB;
import ca.sait.securitydemo12.services.AccountService;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 752808
 */
public class ForgotPasswordServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              getServletContext().getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
       
        
        String email = request.getParameter("email");
      

       
        
        AccountService service = new AccountService();  
        String path = getServletContext().getRealPath("/WEB-INF");
        boolean forgot = service.forgotPassword(email, path);


        if(forgot)  {
        
        request.setAttribute("message","If the address you entered is valid, you will receive an email very soon. Please check your email for your password.");

    } else {


                request.setAttribute("message", "Please refresh and try again");
            }



 
        
       
    
   getServletContext().getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);

}

}