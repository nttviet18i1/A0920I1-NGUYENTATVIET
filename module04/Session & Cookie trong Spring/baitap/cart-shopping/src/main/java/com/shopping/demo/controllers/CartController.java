package com.shopping.demo.controllers;

import com.shopping.demo.model.Cart;
import com.shopping.demo.model.Product;
import com.shopping.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping ("/cart")
public class CartController {

    @Autowired
    private ProductService productService;

    @GetMapping ("/buy")
    public String showCart(@SessionAttribute ("carts") HashMap<Long, Cart> cartHashMap , Model model){
        model.addAttribute("carts",cartHashMap);
        model.addAttribute("cartNum",cartHashMap.size());
        model.addAttribute("cartMoney", totalPrice(cartHashMap));
        model.asMap().clear();
        return "cart";
    }

    @GetMapping ("/buy/{id}")
    public String addCart(@PathVariable Long id, @SessionAttribute ("carts") HashMap<Long,Cart> cartHashMap , Model model){
        if (cartHashMap == null){
            cartHashMap = new HashMap<>();
        }
        Product product = productService.getById(id);
        if (product != null){
            if (cartHashMap.containsKey(id)){
                Cart item = cartHashMap.get(id);
                item.setProduct(product);
                item.setQuantity(item.getQuantity()+1);
                cartHashMap.put(id,item);
            } else {
                Cart item = new Cart();
                item.setProduct(product);
                item.setQuantity(1);
                cartHashMap.put(id,item);
            }
        }
        model.addAttribute("carts",cartHashMap);
        model.addAttribute("cartNum",cartHashMap.size());
        model.addAttribute("cartMoney", totalPrice(cartHashMap));
        return "redirect:/cart/buy";
    }

    @GetMapping ("/delete/{id}")
    public String deleteCart(@PathVariable Long id, @SessionAttribute ("carts") HashMap<Long,Cart> cartHashMap , Model model){
        if (cartHashMap == null){
            cartHashMap = new HashMap<>();
        }
        cartHashMap.remove(id);
        model.addAttribute("carts",cartHashMap);
        model.addAttribute("cartNum",cartHashMap.size());
        model.addAttribute("cartMoney", totalPrice(cartHashMap));
        return "redirect:/cart/buy";
    }

    public double totalPrice(HashMap<Long, Cart> cartHashMap) {
        int count = 0;
        for (HashMap.Entry<Long, Cart> list : cartHashMap.entrySet()) {
            count += Double.parseDouble(list.getValue().getProduct().getNewPrice()) * list.getValue().getQuantity();
        }
        return count;
    }
}
