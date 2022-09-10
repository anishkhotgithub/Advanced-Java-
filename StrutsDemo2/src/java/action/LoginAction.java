
package action;

import bean.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class LoginAction extends org.apache.struts.action.Action 
{
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception 
    {
        User u=(User)form;
        if(u.getUsername().equals("admin") && u.getPassword().equals("pass@123"))
        {
            return mapping.findForward("success");    
        }
        else
        {
            u.setErrmsg("Incorrect username or password!!!");
            return mapping.findForward("error");    
        }       
    }
}
