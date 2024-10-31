public abstract class Remsystem {
    // Method to apply brakes
    public abstract void rem();

    // Method to get brake system information
    public abstract String getRemInfo();
} 

class TrommelRemmen extends Remsystem {
    @Override
    public void rem() {
        System.out.println("Applying trommel brakes.");
    }

    @Override
    public String getRemInfo() {
        return "Trommel Brakes";
    }
}
class SchijfRemmen extends Remsystem {
    @Override
    public void rem() {
        System.out.println("Applying disc brakes.");
    }

    @Override
    public String getRemInfo() {
        return "Disc Brakes";
    }
}
class CarbonCompositeRemmen extends Remsystem {
    @Override
    public void rem() {
        System.out.println("Applying carbon composite brakes.");
    }

    @Override
    public String getRemInfo() {
        return "Carbon Composite Brakes";
    }
}