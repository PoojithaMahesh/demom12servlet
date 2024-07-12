package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Addition extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String number1=req.getParameter("number1");
//		hoiw to convert from String to integer
//		parseinggggggg
		int num1=Integer.parseInt(number1);
		int num2=Integer.parseInt(req.getParameter("number2"));
		int result=num1+num2;
		PrintWriter printWriter=res.getWriter();
		printWriter.print("ADDITION OF YOUR NUMBERS IS:::"+result);
	}

}
