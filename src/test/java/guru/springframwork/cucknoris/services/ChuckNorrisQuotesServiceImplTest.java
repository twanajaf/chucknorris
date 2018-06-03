package guru.springframwork.cucknoris.services;

import org.junit.Test;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class ChuckNorrisQuotesServiceImplTest {
    private ChuckNorrisQuotesService classUnderTest= new ChuckNorrisQuotesServiceImpl();


    @Test
    public void getRandomQuote() {
        String randomQuote = classUnderTest.getRandomQuote();

        assertThat(randomQuote, notNullValue());
    }
}