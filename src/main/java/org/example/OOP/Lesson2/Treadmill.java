package org.example.OOP.Lesson2;

public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean pass(Participant participant) {
        participant.run(length);
        return participant.getMaxRunDistance() >= length;
    }
}
