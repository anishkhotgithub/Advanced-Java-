package demo;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class DateTag extends SimpleTagSupport
{
	@Override
	public void doTag() throws JspException, IOException 
	{
		Date d=new Date(); 
		JspWriter out=getJspContext().getOut();
		out.print(d);
	}
}
