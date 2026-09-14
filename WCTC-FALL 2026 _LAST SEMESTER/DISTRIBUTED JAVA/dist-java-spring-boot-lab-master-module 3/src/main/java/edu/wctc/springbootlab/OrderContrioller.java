package edu.wctc.springbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class OrderContrioller {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/")
    public String indexPost() {
        return "index";
    }

    @GetMapping("/view-cart")
    public  String viewCart(){
        return "orders/cart";
    }

    @GetMapping("/product/detail")
    public String productDetailsGet(){
        return "catalog/product-detail";
    }

    @PostMapping("/product/detail")
    public String productDetailPost(){
        return "catalog/product-detail";
    }

    @PostMapping("/place-order")
    public String placeOrder(){
        return "redirect:/";
    }

    @GetMapping("/search")
    public String searchGet(){
        return "redirect:http://www/google.com";
    }

    @PostMapping("/search")
    public String searchPost(){
        return "redirect:http://www.google.com";
    }

}
