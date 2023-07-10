package org.example.OOP.Lesson2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мотя", 10, 5);
        Human human = new Human("Василий", 50, 25);
        Robot robot = new Robot("r2d2", 3, 1);

        Treadmill treadmill1 = new Treadmill(1);
        Treadmill treadmill2 = new Treadmill(10);
        Treadmill treadmill3 = new Treadmill(20);
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(1);
        Wall wall3 = new Wall(1);

        Participant[] participants = {cat, human, robot};
        Obstacle[] obstacles = {treadmill1, treadmill2, treadmill3, wall1, wall2, wall3};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.pass(participant)) {
                    break;
                }
            }
        }
    }
}

