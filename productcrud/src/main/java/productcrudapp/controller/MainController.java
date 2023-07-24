package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.productDao;
import productcrudapp.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private productDao productdao;
	
	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products = productdao.getAllProducts();
		m.addAttribute("products", products);
		return "index";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct() {
		System.out.println("ADD");
		return "create";
	}
	
	@RequestMapping(value="/success",method=RequestMethod.POST)
	public RedirectView create(@ModelAttribute Product product, HttpServletRequest request) {
		productdao.create(product);
		RedirectView rw = new RedirectView();
		rw.setUrl(request.getContextPath()+"/");
		return rw;
	}
	

}
