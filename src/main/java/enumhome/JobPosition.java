package enumhome;

public enum JobPosition {
    MANAGER("Manager","Mg"),
    COACH("Coach","Co"),
    SCOUT("Scout","Sc"),
    FOOTBALLER("Footballer","Fb"),
    MANAGMENT("Managment", "Mt")
    ;

    private String name;
    private String code;

    JobPosition(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
