import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void  accelerate_NormalSpeedChange_SpeedIncreased() {


        // Arrange
        Car jacobCar = new Car("Nissan", "Altima");
        int speedChange = 15;
        int expectedSpeed = 15;

        // Act
        jacobCar.acceleration(speedChange);

        // Assert
        int actualSpeed = jacobCar.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void brake_NormalSpeedChange_SpeedDecreased() {

        // Arrange
        Car jadenCar = new Car("Dodge", "Hellcat");
        int speedUpBy = 15;
        int slowDownBy = 10;
        int expectedSpeed = 5;
        jadenCar.acceleration(speedUpBy);

        // Act
        jadenCar.brake(slowDownBy);

        // Assert
        int actualSpeed = jadenCar.getSpeed();
        assertEquals(actualSpeed, expectedSpeed);


    }

    @Test
    public void brake_SpeedChangeGreaterThanActualSpeed_SpeedIsZero() {
        // Arrange
        Car duranteCar = new Car("Corvette", "ZO6");
        int speed
        // Act

        // Assert
    }

}