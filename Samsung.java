import java.sql.Time;
import java.util.Random;

public class Samsung {
    int weight;
    String color;
    String name;
    int diagonal;
    int time;

    public Samsung(String name,int weight, String color, int diagonal, int worktime){
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.diagonal = diagonal;
        this.time = time;
        Time time1 = new Time(System.currentTimeMillis());
    }
    public void info(){System.out.println("Назва моделі: "+name+"; Вага моделі: "+weight+"г"+"; Колір моделі: "+color+"; Діагональ екрану: "+diagonal+" дюймів"+"; Час використання: "+time+" годин" + ";");}

    public void timeinfo(){
        System.out.println("Час використання смартфону: "+time);
    }
    public void worktimeinfo() {
        if (time > 10) {
            System.out.println("Цей телефон вживаний.");
        } else {
            System.out.println("Цей телефон не був у використані.");
        }
    }


    }
