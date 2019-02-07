

public class Branch {

    private String code;
    private String city;
    private int rate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        if(rate < 1 || rate > 3)
            return;
        this.rate = rate;
    }
}
