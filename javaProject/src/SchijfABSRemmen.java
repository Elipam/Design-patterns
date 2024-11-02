public class SchijfABSRemmen extends RemSysteem {
    SchijfABSRemmen(){}
    @Override
    public void rem() {
        System.out.println("Applying disc brakes.");
    }

    @Override
    public String getRemInfo() {
        return "Disc Brakes";
    }
}
