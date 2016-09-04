package org.lathike;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lathike.sim.rain.RainSimulator;
import org.lathike.sim.rain.StandardRainSimulator;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {

    @Test
    public void test() {
        RainSimulator sim = new StandardRainSimulator();
        sim.startRaining();
    }

}
