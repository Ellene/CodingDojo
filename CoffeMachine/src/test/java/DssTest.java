import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DssTest {

        @Test
    public void should_return_coffee(){
            //Given
            Dss dss = new Dss();
            DssInput dssInput = new DssInput(DssInput.Drink.COFFEE, 0,60, false);
            //When
            String result = dss.treat(dssInput);

            //Then
            assertEquals("C::",result);

        }

    @Test
    public void should_return_coffee_with_sugar_when_sugar_asked(){
        //Given
        Dss dss = new Dss();
        DssInput dssInput = new DssInput(DssInput.Drink.COFFEE, 1, 100, false);
        //When
        String result = dss.treat(dssInput);

        //Then
        assertEquals("C:1:0",result);
    }

    @Test
    public void should_return_TEA(){
        //Given
        Dss dss = new Dss();
        DssInput dssInput = new DssInput(DssInput.Drink.TEA, 0, 100, false);
        //When
        String result = dss.treat(dssInput);

        //Then
        assertEquals("T::",result);

    }

    @Test
    public void should_return_CHOCOLATE(){
        //Given
        Dss dss = new Dss();
        DssInput dssInput = new DssInput(DssInput.Drink.CHOCOLATE, 0, 100, false);
        //When
        String result = dss.treat(dssInput);

        //Then
        assertEquals("H::",result);

    }

    @Test
    public void should_refuse_CHOCOLATE_for_40_cents(){
        //Given
        Dss dss = new Dss();
        DssInput dssInput = new DssInput(DssInput.Drink.CHOCOLATE, 0, 40, false);
        //When
        String result = dss.treat(dssInput);

        //Then
        assertEquals("M:10",result);
    }

    @Test
    public void should_refuse_ORANGE_JUICE_for_30_cents(){
        //Given
        Dss dss = new Dss();
        DssInput dssInput = new DssInput(DssInput.Drink.ORANGE_JUICE, 0, 30, false);
        //When
        String result = dss.treat(dssInput);

        //Then
        assertEquals("M:30",result);
    }

    @Test
    public void should_accept_ORANGE_JUICE(){
        //Given
        Dss dss = new Dss();
        DssInput dssInput = new DssInput(DssInput.Drink.ORANGE_JUICE, 0, 60, false);
        //When
        String result = dss.treat(dssInput);

        //Then
        assertEquals("O::",result);
    }

    @Test
    public void should_accept_hot_ORANGE_JUICE_with_touillette_when_sugar(){
        //Given
        Dss dss = new Dss();
        DssInput dssInput = new DssInput(DssInput.Drink.ORANGE_JUICE, 1, 60, true);
        //When
        String result = dss.treat(dssInput);

        //Then
        assertEquals("Oh:1:0",result);
    }

    @Test
    public void should_refuse_TEA_for_30_cents(){
        //Given
        Dss dss = new Dss();
        DssInput dssInput = new DssInput(DssInput.Drink.TEA, 0, 30, false);
        //When
        String result = dss.treat(dssInput);

        //Then
        assertEquals("M:10",result);
    }

    @Test
    public void should_return_CHOCOLATE_with_two_sugar_when_sugar_asked(){
        //Given
        Dss dss = new Dss();
        DssInput dssInput = new DssInput(DssInput.Drink.CHOCOLATE, 2, 100, false);
        //When
        String result = dss.treat(dssInput);

        //Then
        assertEquals("H:2:0",result);

    }
}
