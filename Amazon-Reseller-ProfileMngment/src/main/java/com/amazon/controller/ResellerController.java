package com.amazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ResellerController {

	int currStock;
	
	@GetMapping("createStock")
	public String createStock() {
		return "createStock";
	}
	
	@PostMapping("addStock")
	public String addStock(@RequestParam("stock") String stock) {
		this.currStock = Integer.parseInt(stock);
		System.out.println("your current stock is: " + this.currStock);
		return "finalPage";
	}
	
	@GetMapping("home")
	public String homePage() {
		return "finalPage";
	}
	
	@RequestMapping("updateStock")
	public String showUpdateStock(Model model) {
		model.addAttribute("currStock", currStock);
		return "updateStockPage";
	}
	
	@PostMapping("updateNewStock")
	public String updateStock(@RequestParam("stock") String stock) {
		int newStock = Integer.parseInt(stock);
		currStock = newStock;
		System.out.println("updated stock is: "+ newStock);
		return "finalPage";
	}
	
	@RequestMapping("deleteStock")
	public String displayDeletePage(Model model) {
		model.addAttribute("currStock", currStock);
		return "deleteStockPage";
	}
	
	@RequestMapping("deleteNewStock")
	public String deleteStock() {
		currStock = 0;
		return "finalPage";
	}
	
	@RequestMapping("viewStock")
	public String showStock(Model model) {
		model.addAttribute("currStock", currStock);
		return "viewStockPage";
	}
}
