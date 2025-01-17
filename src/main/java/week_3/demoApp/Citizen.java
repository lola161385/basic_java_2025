package week_3.demoApp;

public class Citizen {
    private String name;
    private String nationality;
    private boolean hasPassport;
    private boolean hasCriminalRecord;

    public Citizen(String name, String nationality, boolean hasPassport, boolean hasCriminalRecord) {
        this.name = name;
        this.nationality = nationality;
        this.hasPassport = hasPassport;
        this.hasCriminalRecord = hasCriminalRecord;
    }

    public void travel(Nation destination) {
        if (hasPassport && !hasCriminalRecord) {
            System.out.println(name + " is traveling to " + destination);
        } else {
            System.out.println(name + " cannot travel due to invalid conditions.");
        }
    }

    public void emigrate(Nation destination) {
        if (!hasCriminalRecord) {
            System.out.println(name + " is emigrating to " + destination);
        } else {
            System.out.println(name + " cannot emigrate due to criminal record.");
        }
    }

    @Override
    public String toString() {
        return name + " (" + nationality + ")";
    }
}