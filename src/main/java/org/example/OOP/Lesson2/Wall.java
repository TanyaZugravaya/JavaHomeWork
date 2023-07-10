package org.example.OOP.Lesson2;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean pass(Participant participant) {
        participant.run(height);
        return participant.getMaxRunDistance() >= height;
    }
}
