import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void should_return_1_when_I() {
        Converter converter = new Converter();
        Assert.assertEquals(1, converter.convert("I"));
    }

    @Test
    public void should_return_2_when_II() {
        Converter converter = new Converter();
        Assert.assertEquals(2, converter.convert("II"));
    }

    @Test
    public void should_return_3_when_III() {
        Converter converter = new Converter();
        Assert.assertEquals(3, converter.convert("III"));
    }

    @Test
    public void should_return_4_when_IV() {
        Converter converter = new Converter();
        Assert.assertEquals(4, converter.convert("IV"));
    }

    @Test
    public void should_return_5_when_V() {
        Converter converter = new Converter();
        Assert.assertEquals(5, converter.convert("V"));
    }

    @Test
    public void should_return_6_when_VI() {
        Converter converter = new Converter();
        Assert.assertEquals(6, converter.convert("VI"));
    }

    @Test
    public void should_return_9_when_IX() {
        Converter converter = new Converter();
        Assert.assertEquals(9, converter.convert("IX"));
    }

    @Test
    public void should_return_10_when_X() {
        Converter converter = new Converter();
        Assert.assertEquals(10, converter.convert("X"));
    }
    @Test
    public void should_return_11_when_XI() {
        Converter converter = new Converter();
        Assert.assertEquals(11, converter.convert("XI"));
    }

    @Test
    public void should_return_101_when_CI() {
        Converter converter = new Converter();
        Assert.assertEquals(101, converter.convert("CI"));
    }

    @Test
    public void should_return_15_when_XV() {
        Converter converter = new Converter();
        Assert.assertEquals(15, converter.convert("XV"));
    }

    @Test
    public void should_return_42_when_XLII() {
        Converter converter = new Converter();
        Assert.assertEquals(42, converter.convert("XLII"));
    }

    @Test
    public void should_return_95_when_XCV() {
        Converter converter = new Converter();
        Assert.assertEquals(95, converter.convert("XCV"));
    }

    @Test
    public void should_return_388_when_CCCLXXXVIII() {
        Converter converter = new Converter();
        Assert.assertEquals(388, converter.convert("CCCLXXXVIII"));
    }

    @Test(expected = NullPointerException.class)
    public void should_NPE_when_null() {
        Converter converter = new Converter();
       converter.convert(null);
    }



}
