import car.Distance;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class DistanceTest {

    @Test
    void create(){
        assertThatThrownBy(()->new Distance(-1))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void equals(){
        assertThat(new Distance(3))
                .isEqualTo(new Distance(3));
    }

    @Test
    void add(){
        Distance distance = new Distance(2);
        distance.add();
        assertThat(new Distance(3)).isEqualTo(distance);
    }

    @Test
    void compare(){
        Distance distance = new Distance(3);
        assertThat(distance.compare(2)).isEqualTo(1);
    }

}
