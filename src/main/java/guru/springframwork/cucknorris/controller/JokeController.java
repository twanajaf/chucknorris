package guru.springframwork.cucknorris.controller;

import guru.springframwork.cucknorris.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService chuckNorrisQuotesService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.chuckNorrisQuotesService = jokeService;
    }

    @RequestMapping({"/", ""})
    String getQuotes(Model model) {
        model.addAttribute("quote", chuckNorrisQuotesService.getRandomQuote());

        return "chuckNorris";
    }
}
