import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BvsTest {

    @Test
    void verifierMessage() {
        assertEquals("Hello World! DevOps", bvs.message());
    }
}
