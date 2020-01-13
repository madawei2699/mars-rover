package com.thoughtworks.marsrover;

public enum Command {
    L("L"),
    R("R"),
    M("M");

    Command(String value) {
    }

    public Location execute(Location current) {
        switch (this) {
            case L:
                switch (current.direction) {
                    case N:
                        current.direction = Direction.W;
                        break;
                    case E:
                        current.direction = Direction.N;
                        break;
                    case S:
                        current.direction = Direction.E;
                        break;
                    case W:
                        current.direction = Direction.S;
                        break;
                }
                break;
            case R:
                switch (current.direction) {
                    case N:
                        current.direction = Direction.E;
                        break;
                    case E:
                        current.direction = Direction.S;
                        break;
                    case S:
                        current.direction = Direction.W;
                        break;
                    case W:
                        current.direction = Direction.N;
                        break;
                }
                break;
            case M:
                switch (current.direction) {
                    case N:
                        current.y += 1;
                        break;
                    case E:
                        current.x += 1;
                        break;
                    case S:
                        current.y -= 1;
                        break;
                    case W:
                        current.x -= 1;
                        break;
                }
                break;
        }
        return current;
    }
}
