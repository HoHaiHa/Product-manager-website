package springbootWeb2.com.hohaiha.app.controller.viewController.viewAdminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class SetCategoryController {
	@GetMapping("/categories")
	public String getUsers() {
		return "/admin/pages/categories";
	}
}
