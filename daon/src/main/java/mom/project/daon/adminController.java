package mom.project.daon;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class adminController {
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {

		
		return "admin/admin";
	}
}
