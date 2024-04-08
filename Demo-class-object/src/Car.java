public class Car {

    //Attributes
    private String color;//"RED","YELLOW"....

    private double speed;

    private int capacity;

    private boolean isOverSpeed;//defalut value is false (useless since we should use speed to derive isOverSpeed())

    //...

    //Behavior or instance methods
    //Setter
    public void setColor(String color){
        this.color = color;
    }

    public void setSpeed(double speed){
        this.speed=speed;
        if (speed>=90) {
            this.isOverSpeed=true;
        }
    }

    public void setCapacity(int capacity){
        this.capacity=capacity;
    }

    //Getter
    public String getColor(){
        return this.color;
    }

    public double getSpeed(){
        return this.speed;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public boolean isOverSpeed(){
        return this.isOverSpeed;
    }

    public String toString(){
        return "Car("//
        +"color="+this.color//
        +", speed="+this.speed//
        +", capacity"+this.capacity//
        +", over speed is "+this.isOverSpeed//
        +")";
    }

}