import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    //Employee object ; address: permanent and temporary,city,country;  is a list<address>
    //temporary type whose value of "Devesh"
    //pincode  :759150
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        Address a = new Address("Temporary",759150);
        List<Address> addLs = new ArrayList<>();
        addLs.add(a);
        Employee e = new Employee(1,"Devesh",addLs);
        emp.add(e);
        List<Address> res= new ArrayList<>();
        res=e.getTemporaryAddressesByCity("Temporary");
        for(Address address : res){
            address.getType();
            System.out.println(address);
        }

    }
}
