
public class Company {

    private static final Company SINGLE_INSTANCE = new Company();
    private static final String name = "JavaCup.co";

    private Company()
    {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        return;
    }

    public static Company getInstance() {
        return SINGLE_INSTANCE;
    }
}
