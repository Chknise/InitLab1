package Hitchens.Chuck.InitLab1;

import org.junit.Test;
import static org.junit.Assert.*;
public class TestSpec {



    @Test
    public void getColorTest() {
        ColorfulThing color = new ColorfulThing("blue");
        assertEquals("test color ","blue", color.getColor());


        }


    }






