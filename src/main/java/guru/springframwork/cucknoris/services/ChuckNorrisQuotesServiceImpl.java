package guru.springframwork.cucknoris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesServiceImpl implements ChuckNorrisQuotesService {
    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
