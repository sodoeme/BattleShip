import java.sql.Array;
import java.util.ArrayList;

public class BattleShip {
    String name;
    ArrayList<String> yAxis = new ArrayList<>();
    ArrayList<Integer> xAxis = new ArrayList<>();
    public BattleShip(String name, ArrayList<Integer> x,  ArrayList<String> y) {
        this.name = name;
        yAxis =y;
        xAxis = x;
    }

    public boolean isHit(String y, Integer x){
       if(yAxis.contains(y) && xAxis.contains(x)){
            return true;
       }
        return false;
    }
}
