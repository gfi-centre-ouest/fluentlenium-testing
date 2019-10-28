import org.fluentlenium.core.hook.wait.Wait;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.github.database.rider.core.util.EntityManagerProvider.em;
import static org.assertj.core.api.Assertions.assertThat;

@Wait
public class MyTest extends RiderFluentTest {
    @Test
    public void titleOfDuckDuckGoShouldContainSearchQueryName() {
        var result = em().createNativeQuery("SELECT 1").getResultList();
        assertThat(result).isEqualTo(List.of(1));

        goTo("https://duckduckgo.com");
        $("#search_form_input_homepage").fill().with("FluentLenium");
        $("#search_button_homepage").submit();
        assertThat(window().title()).contains("FluentLenium");
    }
}