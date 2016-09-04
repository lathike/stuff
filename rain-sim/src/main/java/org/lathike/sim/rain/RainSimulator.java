package org.lathike.sim.rain;

public interface RainSimulator {

    boolean startRaining();

    boolean stopRaining();

    double totalRainfall(MeasurementUnit measurement);
}
