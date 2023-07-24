package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home view");
		return "home";
	}
	
	@RequestMapping("/searchHandler")
	public RedirectView search(@RequestParam("searchbar") String search) {
		
		RedirectView rw = new RedirectView();
		String url = "https://www.google.com/search?q="+search;
		rw.setUrl(url);
	    return rw;
	}

}
