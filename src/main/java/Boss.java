import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Boss extends Employee {

    private  String Area;
    public Boss(String Id, String Name, String LastName, Double Salary, String Mail, Long Number,String Area) {
        super(Id, Name, LastName, Salary, Mail, Number);
        this.Area = Area;
    }
    public Boss(String Id, String Name, String LastName, Double Salary, String Mail, Long Number) {
        super(Id, Name, LastName, Salary, Mail, Number);
    }

    @Override
    public Double getSalary() {
        Double BossSalaryIncrement;
        Double BossSalary;
        BossSalaryIncrement = super.getSalary() * 0.50;
        BossSalary = BossSalaryIncrement + super.getSalary();
        super.setSalary(BossSalary);
        return super.getSalary();
    }
}
