import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    public Employee(int empid, String ename, List<Address> address) {
        this.empid = empid;
        this.ename = ename;
        this.address = address;
    }

    private int empid;
    private String ename;
    private List<Address> address;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname(String name) {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }


    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Address> getTemporaryAddressesByCity(String typeName) {
        return address.stream()
                .filter(address -> address.getType().equals(typeName))
                .collect(Collectors.toList());
    }

}
