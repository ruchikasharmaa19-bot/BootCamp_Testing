package com.inheritanceTest;



public class Vehicle {

    protected String vehicleNumber;
    protected String model;
    protected double rentalRatePerDay;
    protected boolean isAvailable;

    // Constructor
    public Vehicle(String vehicleNumber, String model, double rentalRatePerDay, boolean isAvailable) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
        this.isAvailable = isAvailable;
    }

    // Method
    public void displayVehicle() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Model          : " + model);
        System.out.println("Rental Rate    : ₹" + rentalRatePerDay);
        System.out.println("Available      : " + isAvailable);
    }





    public class Car extends Vehicle {

        private int seatingCapacity;

        // Constructor
        public Car(String vehicleNumber, String model,
                   double rentalRatePerDay,
                   boolean isAvailable,
                   int seatingCapacity) {

            super(vehicleNumber, model, rentalRatePerDay, isAvailable);

            this.seatingCapacity = seatingCapacity;
        }

        public void displayCar() {
            displayVehicle();
            System.out.println("Seating Capacity : " + seatingCapacity);
        }
    }}