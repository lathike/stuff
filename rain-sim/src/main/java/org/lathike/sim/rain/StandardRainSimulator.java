package org.lathike.sim.rain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class StandardRainSimulator implements RainSimulator {

    private final Logger logger = LoggerFactory.getLogger(StandardRainSimulator.class);

    private static final int LENGTH = 100;
    private static final int WIDTH = 100;

    private short[][] area;

    private Random rowSeed;
    private Random columnSeed;

    public StandardRainSimulator() {
        area = new short[LENGTH][WIDTH];
        rowSeed = new Random();
        columnSeed = new Random();
    }

    public boolean startRaining() {
        long t1 = System.currentTimeMillis();
        final int target = LENGTH * WIDTH;
        int currentWetArea = 0;
        while (currentWetArea < target) {
            int x = rowSeed.nextInt(WIDTH);
            int y = columnSeed.nextInt(LENGTH);
            if (area[x][y] == 0) {
                area[x][y] = 1;
                currentWetArea++;
            }
        }
        logger.info("took {}ms to cover {} square cm area", (System.currentTimeMillis() - t1), currentWetArea);
        return false;
    }

    public boolean stopRaining() {
        return false;
    }

    public double totalRainfall(MeasurementUnit measurement) {
        return 0;
    }
}
