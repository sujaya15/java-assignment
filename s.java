import java.io.*;
import javax.servlet.*;

public class sa extends GenericServlet
{
    
     public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException
     {
          
          res.setContentType("text/html");
          PrintWriter pw = res.getWriter();
          HttpSession hs=req.getSession(true);
          Date d=(Date)hs.getAttribute("date");
          if(d==NULL)
     {
         hs.setAttribute("previous_user"," ");
         hs.setAttribute("current_user"," ");
         
         
     }

    String ou=(string)hs.getAttribute("previous_user");
    String cu=(string)hs.getAttribute("current_user");
    if(d!=NULL && ou!=" ")
{
    pw.println("username:" +ou);
    pw.println("lastaccess:" +d);
}
    d=newDate();
    hs.setAttribute("date",d);
    cuname=req.getParameter("username");
    hs.setAttribute("current_user",cuname);
    ou=cuname;
    pw.println("username:" +cuname);
    pw.println("current_access:" +d);
    hs.setAttribute("previous_user",ou);
    
}
}