package com.thoughtworks.marsrover;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LocationTest {
    @Test
    public void should_direct_to_N_when_turn_left_from_E() {
        // given
        Location currentLocation = new Location(0, 0, Direction.E);
        // when
        Location newLocation = Command.L.execute(currentLocation);
        // then
        assertEquals(Direction.N, newLocation.direction);
    }

    @Test
    public void should_direct_to_W_when_turn_left_from_N() {
        // given
        Location currentLocation = new Location(0, 0, Direction.N);
        // when
        Location newLocation = Command.L.execute(currentLocation);
        // then
        assertEquals(Direction.W, newLocation.direction);
    }

    @Test
    public void should_direct_to_S_when_turn_left_from_W() {
        // given
        Location currentLocation = new Location(0, 0, Direction.W);
        // when
        Location newLocation = Command.L.execute(currentLocation);
        // then
        assertEquals(Direction.S, newLocation.direction);
    }

    @Test
    public void should_direct_to_E_when_turn_left_from_S() {
        // given
        Location currentLocation = new Location(0, 0, Direction.S);
        // when
        Location newLocation = Command.L.execute(currentLocation);
        // then
        assertEquals(Direction.E, newLocation.direction);
    }

    @Test
    public void should_direct_to_S_when_turn_right_from_E() {
        // given
        Location currentLocation = new Location(0, 0, Direction.E);
        // when
        Location newLocation = Command.R.execute(currentLocation);
        // then
        assertEquals(Direction.S, newLocation.direction);
    }

    @Test
    public void should_direct_to_E_when_turn_right_from_N() {
        // given
        Location currentLocation = new Location(0, 0, Direction.N);
        // when
        Location newLocation = Command.R.execute(currentLocation);
        // then
        assertEquals(Direction.E, newLocation.direction);
    }

    @Test
    public void should_direct_to_N_when_turn_right_from_W() {
        // given
        Location currentLocation = new Location(0, 0, Direction.W);
        // when
        Location newLocation = Command.R.execute(currentLocation);
        // then
        assertEquals(Direction.N, newLocation.direction);
    }

    @Test
    public void should_direct_to_W_when_turn_right_from_S() {
        // given
        Location currentLocation = new Location(0, 0, Direction.S);
        // when
        Location newLocation = Command.R.execute(currentLocation);
        // then
        assertEquals(Direction.W, newLocation.direction);
    }

    @Test
    public void should_increse_x_when_move_from_E() {
        // given
        Location currentLocation = new Location(0, 0, Direction.E);
        // when
        Location newLocation = Command.M.execute(currentLocation);
        // then
        assertEquals(1, newLocation.x);
    }

    @Test
    public void should_decrease_x_when_move_from_W() {
        // given
        Location currentLocation = new Location(0, 0, Direction.W);
        // when
        Location newLocation = Command.M.execute(currentLocation);
        // then
        assertEquals(-1, newLocation.x);
    }

    @Test
    public void should_increse_y_when_move_from_N() {
        // given
        Location currentLocation = new Location(0, 0, Direction.N);
        // when
        Location newLocation = Command.M.execute(currentLocation);
        // then
        assertEquals(1, newLocation.y);
    }

    @Test
    public void should_decrease_y_when_move_from_S() {
        // given
        Location currentLocation = new Location(0, 0, Direction.S);
        // when
        Location newLocation = Command.M.execute(currentLocation);
        // then
        assertEquals(-1, newLocation.y);
    }
}
