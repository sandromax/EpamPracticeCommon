import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class TestTempConvertWithParams {

    public double celsius;
    public double fahrenheit;
    public double kelvin;
    public double delta = 0.1;

    public TestTempConvertWithParams(double celsius, double fahrenheit, double kelvin){
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {32, 89.6, 305,1},
                {64, 147.2, 337.1},
                {108, 226.4, 381.1},
                {1000, 1832, 1273.1}
        });
    }

    TemperatureConverter tc;

    @Before
    public void init(){
        tc = new TemperatureConverter();
    }
    @Test
    public void testConvertFtoC(){
        assertEquals(celsius, tc.convertFtoC(fahrenheit), delta);
    }

    @Test
    public void testConvertCtoF(){
        assertEquals(fahrenheit, tc.convertCtoF(celsius), delta);
    }

    @Test
    public void testConvertCtoK(){
        assertEquals(kelvin, tc.convertCtoK(celsius), delta);
    }

    @Test
    public void testConvertKtoC(){
        assertEquals(celsius, tc.convertKtoC(kelvin), delta);
    }

    @Test
    public void testConvertFtoK(){
        assertEquals(kelvin, tc.convertFtoK(fahrenheit), delta);
    }

    @Test
    public void testConvertKtoF(){
        assertEquals(fahrenheit, tc.convertKtoF(kelvin), delta);
    }


}
