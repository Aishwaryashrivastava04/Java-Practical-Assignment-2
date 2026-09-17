abstract class Loan {
    double principal;
    double rate;
    double time;

    Loan(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    abstract double calculateInterest();
}

class HomeLoan extends Loan {

    HomeLoan(double principal, double time) {
        super(principal, 8, time);
    }

    @Override
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

class CarLoan extends Loan {

    CarLoan(double principal, double time) {
        super(principal, 10, time);
    }

    @Override
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class Q8_Loan {
    public static void main(String[] args) {

        Loan home = new HomeLoan(500000, 3);
        Loan car = new CarLoan(300000, 5);

        System.out.println(
            "Home Loan Interest: " + home.calculateInterest()
        );

        System.out.println(
            "Car Loan Interest: " + car.calculateInterest()
        );
    }
}