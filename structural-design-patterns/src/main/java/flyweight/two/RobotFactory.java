package flyweight.two;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, Robot> shapes = new HashMap<String, Robot>();

    public int totalObjectsCreated()
    {
        return shapes.size();
    }

    public Robot getRobotFromFactory(String robotType) throws Exception
    {
        Robot robotCategory = null;
        if (shapes.containsKey(robotType)) {
            robotCategory = shapes.get(robotType);
        } else {
            switch (robotType)
            {
                case "King":
                    robotCategory = new Robot("King");
                    shapes.put("King", robotCategory);
                    break;
                case "Queen":
                    robotCategory = new Robot("Queen");
                    shapes.put("Queen",robotCategory);
                break;
                default:
                    throw new Exception("Exception");
            }
        }
        return robotCategory;
    }
}
