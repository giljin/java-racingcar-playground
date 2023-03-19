import car.PlayCount;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class PlayCountTest {

    @Test
    void playCount(){
        assertThatThrownBy(()->new PlayCount(0)).isInstanceOf(IllegalArgumentException.class);
    }
}
