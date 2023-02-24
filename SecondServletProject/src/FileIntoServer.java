
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@WebServlet("/FileIntoServer")
@MultipartConfig(
maxFileSize = 1024 * 2 * 1024,
maxRequestSize = 1024 * 1024 * 100)
public class FileIntoServer extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private static final String UPLOAD_DIR = "uploads";
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			String applicationPath = req.getServletContext().getRealPath("");
			String uploadPath = applicationPath + File.separator + UPLOAD_DIR;
			File fileSaveDir = new File(uploadPath);
			if(!fileSaveDir.exists()) {
			fileSaveDir.mkdir();
			}
			System.out.print("Upload file directory = " + fileSaveDir.getAbsolutePath());
			for(Part part : req.getParts()) {
			String fileName = "file";
			part.write(uploadPath + File.separator + fileName);
			}
			req.setAttribute("msg", "uploaded");
			getServletContext().getRequestDispatcher("/abcd.html").forward(req, res);
			}
			}