public abstract class RemSysteem {
    // Method to apply brakes
    public abstract void rem();

    // Method to get brake system information
    public abstract String getRemInfo();
} 

class TrommelRemmen extends RemSysteem {
    @Override
    public void rem() {
        System.out.println("Applying trommel brakes.");
    }

    @Override
    public String getRemInfo() {
        return "Trommel Brakes";
    }
}
class SchijfABSRemmen extends RemSysteem {
    @Override
    public void rem() {
        System.out.println("Applying disc brakes.");
    }

    @Override
    public String getRemInfo() {
        return "Disc Brakes";
    }
}
class CarbonCompositeRemmen extends RemSysteem {
    @Override
    public void rem() {
        System.out.println("Applying carbon composite brakes.");
    }

    @Override
    public String getRemInfo() {
        return "Carbon Composite Brakes";
    }
}