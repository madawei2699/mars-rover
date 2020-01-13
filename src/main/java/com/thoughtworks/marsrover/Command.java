package com.thoughtworks.marsrover;

public enum Command {
    L("L"),
    R("R"),
    M("M");

    Command(String value) {
    }

    public Location execute(Location current) {
        return new Location(0, 0, Direction.N);
    }
}
