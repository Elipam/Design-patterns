public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n\t\tSupScrawno?  \n\n");

        GasCarFactory facGas = new GasCarFactory();
        ElectricCarFactory facElic = new ElectricCarFactory();


        newTests("Abstract factory");
        Car mySedan = facGas.createSedanCar();
        Car mySUV = facGas.createSUVCar();
        Car mySport = facGas.createSportCar();

        Car newSedan = facElic.createSedanCar();
        Car newSUV = facElic.createSUVCar();
        Car newSport = facElic.createSportCar();


        exp("The sound of a gas engine sedan");
        mySedan.vroomVroom();
        exp("The sound of a gas engine suv");
        mySUV.vroomVroom();
        exp("The sound of a gas engine sport");
        mySport.vroomVroom();

        exp("The sound of an electric sedan");
        newSedan.vroomVroom();
        exp("The sound of an electric suv");
        newSUV.vroomVroom();
        exp("The sound of an electric sport");
        newSport.vroomVroom();
    }

    static void newTests(String testID) {
        System.out.println("\nNow testing\t:" + testID + "\n");

        return;
    }

    static void exp(String expecting) {
        System.out.println("\nExpecting\t:" + expecting);
        return;
    }

    static void exp(String expecting, String received) {
        System.out.println("\nExpecting\t:" + expecting + "\treceived\t:" + received);
        return;
    }
}

abstract class Car {
    private String model;
    private Motor motor;
    private float price; // +String.format("%.2f",price)

    Car() {
    }

    //methods
    public void vroomVroom() {
        System.out.println("You hear the unmistakible sound of an " + this.getClass().getSimpleName());
    }

    public void addFeature() {
    }

    public void getDescription() {
    }

    public void getPrice() {
    }

}

class Motor {
//empty
}

// decorator pattern
abstract class CarDecorator {
    protected Car car;

    //methods
    public CarDecorator() {
    }

    public void getDescription() {
    }

    public void getPrice() {
    }
}

class HeatedSeats {
    public float cost = 129.99F;

    //methods
    HeatedSeats() {
    }

    float GetCost() {
        return cost;
    }
}

// abstract factory pattern

///interfaces
interface AbstractCarFactory {
    public AbstractSUVCar createSUVCar();


    public AbstractSedanCar createSedanCar();


    public AbstractSportCar createSportCar();

}//end of CarFactory interface

abstract class AbstractSUVCar extends Car {
}

abstract class AbstractSedanCar extends Car {
}

abstract class AbstractSportCar extends Car {
}

//classes
////cars
////    SUV


class ElectricSUVCar extends AbstractSUVCar {

}

class GasSUVCar extends AbstractSUVCar {

}

////    Sedan


class ElectricSedanCar extends AbstractSedanCar {

}

class GasSedanCar extends AbstractSedanCar {

}

////    Sport


class ElectricSportCar extends AbstractSportCar {

}

class GasSportCar extends AbstractSportCar {

}


////Factories
class ElectricCarFactory implements AbstractCarFactory {

    @Override
    public AbstractSUVCar createSUVCar() {
        return new ElectricSUVCar();
    }

    @Override
    public AbstractSedanCar createSedanCar() {
        return new ElectricSedanCar();
    }

    @Override
    public AbstractSportCar createSportCar() {
        return new ElectricSportCar();
    }
}// end of ElectricFactory

class GasCarFactory implements AbstractCarFactory {

    @Override
    public AbstractSUVCar createSUVCar() {
        return new GasSUVCar();
    }

    @Override
    public AbstractSedanCar createSedanCar() {
        return new GasSedanCar();
    }

    @Override
    public AbstractSportCar createSportCar() {
        return new GasSportCar();
    }
}// end of GasFactory