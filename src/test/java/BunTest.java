import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {

    @Test
    public void getNameTest() {
        String expectedName = "Маковый";
        float bunPrice = 9;
        Bun bun = new Bun(expectedName, bunPrice);
        Assert.assertEquals("Вернулось значение, которое не равно ожидаемой expectedName", expectedName, bun.getName());
    }

    @Test
    public void getPriceTest() {
        String bunName = "Маковый";
        float expectedPrice = 9;
        Bun bun = new Bun(bunName, expectedPrice);
        Assert.assertEquals("Вернулось значение, которое не равно ожидаемой expectedPrice", expectedPrice, bun.getPrice(), 0);
    }
}
