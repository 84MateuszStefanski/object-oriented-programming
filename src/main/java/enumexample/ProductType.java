package enumexample;

public enum ProductType {
    OWOCE("owoce",23),
    WARZYWA("warzywa", 24),
    NAPOJE("napoje",25),
    CHIPSY("chipsy",26)
    ;

    private String name;
    private int code;

    ProductType(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
