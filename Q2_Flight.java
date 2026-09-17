abstract class Flight {
    private String flightNumber, airline;
    private double fare;

    Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    public double getFare() {
        return fare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    abstract double calculateFare();

    public String toString() {
        return "Flight No: " + flightNumber +
               " Airline: " + airline +
               " Fare: " + calculateFare();
    }
}

class DomesticFlight extends Flight {

    DomesticFlight(String no, String airline, double fare) {
        super(no, airline, fare);
    }

    double calculateFare() {
        return getFare() + getFare() * 0.10;
    }
}

class InternationalFlight extends Flight {

    InternationalFlight(String no, String airline, double fare) {
        super(no, airline, fare);
    }

    double calculateFare() {
        return getFare() + getFare() * 0.25;
    }
}

public class Q2_Flight {
    public static void main(String[] args) {

        Flight f1 =
            new DomesticFlight("AI202", "Air India", 5000);

        Flight f2 =
            new InternationalFlight("QF101", "Qantas", 20000);

        System.out.println(f1);
        System.out.println(f2);
    }
}