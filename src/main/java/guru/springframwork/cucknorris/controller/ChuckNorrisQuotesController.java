package guru.springframwork.cucknorris.controller;

import guru.springframwork.cucknorris.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisQuotesController {
    private final JokeService chuckNorrisQuotesService;

    @Autowired
    public ChuckNorrisQuotesController(JokeService chuckNorrisQuotesService) {
        this.chuckNorrisQuotesService = chuckNorrisQuotesService;
    }

    @RequestMapping("/")
    String getQuotes(Model model) {
        model.addAttribute("quote", chuckNorrisQuotesService.getRandomQuote());

        return "chuckNorris";
    }
}
