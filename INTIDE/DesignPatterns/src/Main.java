public class Main {

    public static void main(String[] args) {


        System.out.println("\n\n\t\tSupScrawno?  \n\n");
    }
}

abstract class Car {
    private String model;
    private Motor motor;
    private float price; // +String.format("%.2f",price)

    Car() {
    }

    //methods
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
    public SUVCar createSUVCar();


    public SedanCar createSedanCar();


    public SportCar createSportCar();

}//end of CarFactory interface

interface AbstractSUVCar {
}

interface AbstractSedanCar {
}

interface AbstractSportCar {
}

//classes
////cars
////    SUV

class SUVCar implements AbstractSUVCar {

}
class ElectricSUVCar implements AbstractSUVCar {

}

class GasSUVCar implements AbstractSUVCar {

}

////    Sedan

class SedanCar implements AbstractSedanCar {

}
class ElectricSedanCar implements AbstractSedanCar {

}

class GasSedanCar implements AbstractSedanCar {

}

////    Sport

class SportCar implements AbstractSportCar {

}
class ElectricSportCar implements AbstractSportCar {

}

class GasSportCar implements AbstractSportCar {

}


////Factories
class ElectricCarFactory implements AbstractCarFactory {

    @Override
    public SUVCar createSUVCar() {
        return null;
    }

    @Override
    public SedanCar createSedanCar() {
        return null;
    }

    @Override
    public SportCar createSportCar() {
        return null;
    }
}

class GasCarFactory implements AbstractCarFactory {

    @Override
    public SUVCar createSUVCar() {
        return null;
    }

    @Override
    public SedanCar createSedanCar() {
        return null;
    }

    @Override
    public SportCar createSportCar() {
        return null;
    }
}