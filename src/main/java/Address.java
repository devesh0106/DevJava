import java.util.List;
import java.util.stream.Collectors;

public class Address {
    private String Type;
    private int pincode;

    public Address(String type, int pincode) {
        Type = type;
        this.pincode = pincode;
    }
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }



}
