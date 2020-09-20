import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Scholar extends Employee {

    private long Age;
    public Scholar(String Id, String Name, String LastName, Double Salary, String Mail, Long Number, long Age) {
        super(Id, Name, LastName, Salary, Mail, Number);
        this.Age = Age;
    }

    public Scholar(String Id, String Name, String LastName, Double Salary, String Mail, Long Number) {
        super(Id, Name, LastName, Salary, Mail, Number);
    }


    public Long BirthDay(long age){

        Long Birth;
        if (age == 0){
            Birth  = getAge();
            Birth ++;
            setAge(Birth);
        }else {

            setAge(age);
        }


        return getAge();
    }

    @Override
    public Double getSalary() {
        Double ScholarSalary;
        ScholarSalary = super.getSalary() * 0.75;
        super.setSalary(ScholarSalary);
        return super.getSalary();
    }
}
