package demo;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyCube extends SimpleTagSupport  
{
	float number;
	
	@Override
	public void doTag() throws JspException, IOException 
	{
		JspWriter out=getJspContext().getOut();
		out.println(number*number*number);
	}

	public void setNumber(float number) {
		this.number = number;
	}
}
