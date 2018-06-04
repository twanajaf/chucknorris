package guru.springframwork.cucknorris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.Test;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class JokeServiceImplTest {
    private final JokeService classUnderTest;

    public JokeServiceImplTest() {
        this.classUnderTest = new JokeServiceImpl(new ChuckNorrisQuotes());
    }

    @Test
    public void getRandomQuote() {
        String randomQuote = classUnderTest.getRandomQuote();

        assertThat(randomQuote, notNullValue());
    }
}