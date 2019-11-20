package com.rushop.controller;

import com.rushop.model.Cat;
import com.rushop.model.CatService;
import com.rushop.model.Dog;
import com.rushop.model.Turtle;
import com.rushop.model.impl.CatServiceBarsikImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@Component
//@Service
//@Repository
//@Configuration
@ImportResource(value = "classpath:ioc.xml")
public class AppController {
    private Cat cat;
    private Dog dog;
    private Turtle turtle;
    private CatService catM;

    // since spring 5
    public AppController(Cat cat, Turtle turtle) {
        this.cat = cat;
        this.turtle = turtle;
    }

    // http://localhost:8080/
    @RequestMapping("/")
    public String getHelloPage(Model model) {
        model.addAttribute("name", cat.getName());
        model.addAttribute("dog", dog.getName());
        model.addAttribute("turtle", turtle.getName());
        model.addAttribute("cat", catM.getName());
        return "hello";
    }

    @Autowired
    @Value("Sharik")
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Autowired
//    @Qualifier("catServiceMurzikImpl")
    public void setCatService(CatService catM) {
        this.catM = catM;
    }


//    @Autowired
//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }
}
