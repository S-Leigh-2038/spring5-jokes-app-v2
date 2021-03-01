package guru.springframework.chucknorris2.controller;

import guru.springframework.chucknorris2.service.ChuckNorrisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ChuckNorrisController {

    private final ChuckNorrisService chuckNorrisService;

    public ChuckNorrisController(ChuckNorrisService chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String showJoke(Model model){
        model.addAttribute("joke", chuckNorrisService.getJoke());
        return "index";
    }


//    @GetMapping("/")
//    public String showJoke(Model model) {
//        return (String) model.getAttribute("joke");
//        // return "index";
//    }

}
