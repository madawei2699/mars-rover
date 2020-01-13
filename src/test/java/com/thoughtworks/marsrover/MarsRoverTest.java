package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_direct_to_2_1_when_given_M_R_M_M_from_0_0() {
        // given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.N));
        // when
        marsRover.moveWithCommand("MRMM");
        // then
        assertEquals(new Location(2, 1, Direction.E), marsRover.getCurrent());
    }
}
