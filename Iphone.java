public class Iphone {
    double weight;
    String color;
    String name;
    double diagonal;
    double worktime;

    protected Iphone(String name,double weight, String color, double diagonal, double worktime) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.diagonal = diagonal;
        this.worktime = worktime;
    }

    protected void info() {
        System.out.println("Назва моделі: "+name+"; Вага моделі: "+weight+"г"+"; Колір моделі: "+color+"; Діагональ екрану: "+diagonal+" дюймів"+"; Час використання: "+worktime+" годин" + ";");
    }

    protected void worktimeinfo() {
        if (worktime > 10) {
            System.out.println("Цей телефон вживаний.");
        } else {
            System.out.println("Цей телефон не був у використані.");
        }
    }
}
