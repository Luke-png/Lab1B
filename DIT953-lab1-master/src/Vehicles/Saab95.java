package Vehicles;

import Carriers.CarTransportCarrier;
import Carriers.ICarTransportCarrier;
import Carriers.IFerryCarrier;

import java.awt.*;

/**
 * @author Nicklas, Lukas, Emil, Martin.
 * A class for car model Vehicles.Saab95
 */
public class Saab95 extends Vehicle implements ICarTransportCarrier, IFerryCarrier {
    private boolean turboOn;

    /**
     * Constructor for class.
     * Turns turbo off.
     */
    public Saab95() {
        super(125, Color.red, "Vehicles.Saab95");
        turboOn = false;
    }
    /**
     * Turns the turbo on.
     */
    void setTurboOn() {
        turboOn = true;
    }
    /**
     * Turns the turbo off.
     */
    void setTurboOff() {
        turboOn = false;
    }

    /**
     * Calculates the speedFactor.
     * Uses turbo.
     */
    @Override
    double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    /**
     * Increments the cars speed.
     * @param amount to multiply the speedFactor with.
     */
    @Override
    void incrementSpeed(double amount) {
        setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
    }

    /**
     * Decrements the speed.
     * @param amount to multiply the speedfactor with.
     */
    @Override
    void decrementSpeed(double amount) {
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }

}
