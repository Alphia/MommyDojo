import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MommyDojoTest {
    private MommyDojo mommyDojo;

    @Before
    public void setUp() throws Exception {
        mommyDojo = new MommyDojo();
    }

    @Test
    public void shouldReturnItselfWhenInputEmptyString() {
        String emptyString = "";

        String mommified = mommyDojo.mommify(emptyString);

        assertThat(mommified, is(emptyString));
    }

    @Test
    public void shouldReturnItselfWhenInputWordsWithoutVowel()  {
        String noneVowel = "xyz";

        String mommifiedString = mommyDojo.mommify(noneVowel);

        assertThat(mommifiedString, is(noneVowel));
    }

    @Test
    public void shouldReplaceVowelWithMommy() {
        String inputWithoutVowel = "his";
        String expectedMommified = "hmommys";

        String mommified = mommyDojo.mommify(inputWithoutVowel);

        assertThat(mommified, is(expectedMommified));
    }

    @Test
    public void shouldReplace2VowelWithMommy()  {
        String input = "hear";
        String expectedMommified = "hmommyr";

        String mommified = mommyDojo.mommify(input);

        assertThat(mommified, is(expectedMommified));
    }
}
