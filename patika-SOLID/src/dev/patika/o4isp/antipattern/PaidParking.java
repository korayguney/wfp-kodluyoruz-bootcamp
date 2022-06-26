package dev.patika.o4isp.antipattern;

import dev.patika.o4isp.pitfall.Car;

import java.util.function.Consumer;

public class PaidParking implements PaidParkingLot {
    @Override
    public double calculateFee(Car car) {
        return 0;
    }

    @Override
    public void doPayment(Car car) throws Exception {

    }

    @Override
    public void parkCar() {

    }

    @Override
    public void unparkCar() {

    }

    @Override
    public void getCapacity() {

    }
}
