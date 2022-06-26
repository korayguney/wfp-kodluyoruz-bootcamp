package dev.patika.o4isp.antipattern;

import dev.patika.o4isp.pitfall.Car;

public interface PaidParkingLot extends ParkingLot {
    double calculateFee(Car car); // Returns the price based on number of hours
    void doPayment(Car car) throws Exception;
}
