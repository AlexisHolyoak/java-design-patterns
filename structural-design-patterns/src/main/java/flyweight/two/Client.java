package flyweight.two;

import java.util.Random;

public class Client {

    public static void main(String[] args) throws Exception 
    {
        RobotFactory myfactory = new RobotFactory();
        Robot robot;
        int objects = 30;
        for (int i = 0; i < objects; i++) {
            robot = (Robot) myfactory.getRobotFromFactory("King");
            robot.setColor(getRandomColor());
            robot.Print();
        }
        for (int i = 0; i < objects; i++) {
            robot = (Robot) myfactory.getRobotFromFactory("Queen");
            robot.setColor(getRandomColor());
            robot.Print();
        }
        int NumOfDistinctRobots = myfactory.totalObjectsCreated();        
        System.out.println("\n Finally no of Distinct Robots" + NumOfDistinctRobots);
    }
    
    static String getRandomColor()
    {
        Random r = new Random();
        int random = r.nextInt(20);
        if (random %2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
