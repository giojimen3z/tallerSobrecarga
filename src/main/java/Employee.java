import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Employee {

    private String Id;
    private String Name;
    private String LastName;
    protected Double Salary;
    private String Mail;
    private Long Number;

    public Employee(String Id, String Name, String LastName, Double Salary, String Mail, Long Number) {
        this.Id = Id;
        this.Name = Name;
        this.LastName = LastName;
        this.Salary = Salary;
        this.Mail = Mail;
        this.Number = Number;

    }


}
