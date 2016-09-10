package Hewitt.Jalisa.InitializationLab1;
import static org.junit.Assert.*;

import org.ietf.jgss.GSSContext;
import org.junit.Test;

/**
 * Created by jalisahewitt on 9/10/16.
 */
public class ColorfulThingTest {

    @Test
    public void getColorTest(){
        ColorfulThing color = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing.Color expectedValue = ColorfulThing.Color.GREEN;
        ColorfulThing.Color actualValue = color.getColor();
        assertEquals("The value should be GREEN",expectedValue,actualValue);

    }

}
