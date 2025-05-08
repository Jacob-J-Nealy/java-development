public class Car {

    private String name;
    private String model;
    private int speed;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
        this.speed = 0;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Action Methods
    public void acceleration (int changeInSpeed) {
        this.speed += changeInSpeed;
    }

    public void brake (int changeInSpeed) {
        if (changeInSpeed > this.speed) {
            this.speed = 0;
        } else {
            this.speed -= changeInSpeed;
        }
    }

}
