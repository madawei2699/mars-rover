package com.thoughtworks.marsrover;

public class MarsRover {
    private Location current;

    public MarsRover(Location start) {
        this.current = start;
    }

    public Location getCurrent() {
        return current;
    }

    public void setCurrent(Location current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "current=" + current +
                '}';
    }

    public void moveWithCommand(String commandSeq) {
        for (char c : commandSeq.toCharArray()) {
            Command command = Command.valueOf(String.valueOf(c));
            command.execute(this.current);
        }
    }
}
