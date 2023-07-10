package org.example.OOP.Lesson2;

public abstract class Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Participant(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void run(int distance) {
        System.out.println(getName() + " бежит.");
        if (distance <= maxRunDistance) {
            System.out.println(getName() + " успешно пробежал " + distance + " метр-ов/-а");
        } else {
            System.out.println(getName() + " не смог пробежал " + distance + " метр-ов/-а");
        }
    }

    public void jump(int height) {
        System.out.println(getName() + "бежит.");
        if (height <= maxJumpHeight) {
            System.out.println(getName() + " успешно прыгнул " + height + " метр-ов/-а");
        } else {
            System.out.println(getName() + " не смог прыгнуть " + height + " метр-ов/-а");
        }
    }
}
