package ss04_class_vs_oop.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn() {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public Fan() {

    }

    @Override
    public String toString() {
        if (on == true) {
            return speed + " " + color + " " + radius + " fan is on.";
        } else {
            return color + " " + radius + " fan is off.";
        }
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan);
    }
}
