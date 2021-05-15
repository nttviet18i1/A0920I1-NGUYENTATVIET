package contronllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class currency {
    @GetMapping("/home")
    public ModelAndView Home() {
        return new ModelAndView("/home");
    }


    @PostMapping("/convert")
    public ModelAndView getCurrency(@RequestParam(value = "usd", required = true) long usd) {
        return new ModelAndView("home", "vnd", usd * 23000);
    }
}