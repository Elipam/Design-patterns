public abstract class RemSysteem {
    public String naam;

    abstract public void rem();

    abstract public void getRemInfo();

}

class TrommelRemmen extends RemSysteem {
    String naam = "TrommelRemmen";

    TrommelRemmen() {
    }

    public void rem() {
    }

    public void getRemInfo() {
    }

}

class SchijfABSRemmen extends RemSysteem {
    String naam = "SchijfABSRemmen";

    public void rem() {
    }

    public void getRemInfo() {
    }

}

class CarbonComposietRemmen extends RemSysteem {
    String naam = "CarbonComposietRemmen";

    public void rem() {
    }

    public void getRemInfo() {
    }

}