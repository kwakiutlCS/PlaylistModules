package pt.uc.dei.aor.paj;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * @author papo
 *
 */
@WebServlet(value="/sample", name="hello-sample")
public class SampleServlet extends GenericServlet{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5381773888206571844L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
	    res.getWriter().println("Hello Sample!");		
	}

}