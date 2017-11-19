//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.Collection;
//
//import static org.junit.Assert.*;
//
//@RunWith(value = Parameterized.class)
//public class TestTemperatureConverter {
//
//    @Parameterized.Parameter
//    private double expected;
//    @Parameterized.Parameter(1)
//    private double value;
//    @Parameterized.Parameter(2)
//    private double delta;
//
//    public TestTemperatureConverter(double expected, double value, double delta){
//        this.expected = expected;
//        this.value = value;
//        this.delta = delta;
//    }
//
//    TemperatureConverter tc;
//
//    @Before
//    public void init(){
//        tc = new TemperatureConverter();
//    }
//    @Test
//    public void testConvertFtoC(){
//        assertEquals(0, tc.convertFtoC(32.0), 0.001);
//    }
//
//    @Test
//    public void testConvertCtoF(){
//        assertEquals(89.6, tc.convertCtoF(32.0), 0.001);
//    }
//
//    @Test
//    public void testConvertCtoK(){
//        assertEquals(305.2, tc.convertCtoK(32.0), 0.001);
//    }
//
//    @Test
//    public void testConvertKtoC(){
//        assertEquals(-241.2, tc.convertKtoC(32.0), 0.001);
//    }
//
//    @Test
//    public void testConvertFtoK(){
//        assertEquals(273.166, tc.convertFtoK(32.0), 0.001);
//    }
//
//    @Test
//    public void testConvertKtoF(){
//        assertEquals(-402.1, tc.convertKtoF(32.0), 0.001);
//    }
//
//    @Parametrized.Parameters
//    public static Collection data(){
//        return Arrays.asList(new Object()[][]{
//            {0,0,0},
//            {1,1,1},
//            {2,2,2}
//        });
//    }
//}
