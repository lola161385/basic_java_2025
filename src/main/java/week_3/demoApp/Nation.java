package week_3.demoApp;


public abstract class Nation {
    protected String name;
    protected boolean isAtWar;
    protected double creditRating;

    public Nation(String name, boolean isAtWar, double creditRating) {
        this.name = name;
        this.isAtWar = isAtWar;
        this.creditRating = creditRating;
    }

    public abstract void registerNation();

    @Override
    public String toString() {
        return name + " (War: " + isAtWar + ", Credit: " + creditRating + ")";
    }

    public boolean isAtWar() {
        return isAtWar;
    }
}

class RepublicNation extends Nation {
    public RepublicNation(String name, boolean isAtWar, double creditRating) {
        super(name, isAtWar, creditRating);
    }

    @Override
    public void registerNation() {
        System.out.println("Democratic Republic nation registered: " + name);
    }
}

class NotRepublicNation extends Nation {
    private String politicalSystem;

    public NotRepublicNation(String name, String politicalSystem, boolean isAtWar, double creditRating) {
        super(name, isAtWar, creditRating);
        this.politicalSystem = politicalSystem;
    }

    @Override
    public void registerNation() {
        System.out.println("Non-Democratic nation registered: " + name + " (" + politicalSystem + ")");
    }
}