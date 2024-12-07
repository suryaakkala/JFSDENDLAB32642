package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/SpringMVC")
public class ClientController {
	@ResponseBody
    @RequestMapping("/greet")
    public String greet(@RequestParam String username, Model model) {
        model.addAttribute("message", "Hello, " + username + "!");
        return "message: "+"Hello, " + username + "!";
    }
	@ResponseBody
    @RequestMapping("/about")
    public String about() {
        return "about";
    }
	@ResponseBody
    @RequestMapping("/demo1")
    public String demo1(@RequestParam int age, @RequestParam String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "age: "+age+"\n"+"country: "+country;
    }
	@ResponseBody
    @RequestMapping("/demo2/{value1}/{value2}")
    public String demo2(@PathVariable int value1, @PathVariable int value2, Model model) {
        model.addAttribute("subtraction", value1 - value2);
        model.addAttribute("division", value1 / value2);
        return "subtraction: "+ (value1 - value2) + "    division: "+(value1 / value2) ;
    }
	@ResponseBody
    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }
	@ResponseBody
    @RequestMapping("/multiplyNumbers")
    public String multiplyNumbers(@RequestParam int num1, @RequestParam int num2, Model model) {
        model.addAttribute("result", num1 * num2);
        return "result: "+ (num1 * num2);
    }
	@ResponseBody
    @RequestMapping("/reverse")
    public String reverseStrings(@RequestParam String str1, @RequestParam String str2, Model model) {
        model.addAttribute("reversed1", new StringBuilder(str1).reverse().toString());
        model.addAttribute("reversed2", new StringBuilder(str2).reverse().toString());
        return "reversed1: "+ new StringBuilder(str1).reverse().toString() + "       reversed2: "+ new StringBuilder(str2).reverse().toString()  ;
    }
	@ResponseBody
    @RequestMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, Model model) {
        model.addAttribute("addition", num1 + num2);
        model.addAttribute("subtraction", num1 - num2);
        return "addition: "+ (num1 + num2) + "    subtraction: "+ (num1 - num2) ;
    }
}




