import java.util.ArrayList;
import java.util.List;

public class cool {
    public static void main(String args[]) {
        List<robot> allRobots = new ArrayList<robot>();
        
        for(int i=0;i<3;i++)
        {
            allRobots.add(makeRobot());
            System.out.println("Robot number "+i+" has personality: "+allRobots.get(i));
        }
        System.out.println("\n0 speaking to 1");
        allRobots.get(0).speakTo(allRobots.get(1));
        System.out.println("\n0 speaking to 2");
        allRobots.get(0).speakTo(allRobots.get(2));
        System.out.println("\n1 speaking to 2");
        allRobots.get(1).speakTo(allRobots.get(2));
        
    }
    public static robot makeRobot(){
        robot x = new robot();
        return x;
    }
    
}
