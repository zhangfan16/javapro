package 面向对象;

/**
 * Created by zf188 on 2020/2/10.
 */
public class SalariedEmployee extends ColaEmployee {
    public int salary;
    public SalariedEmployee(int salary){
        this.salary=salary;
    }
    @Override
    public int getSalary(int month) {
        return salary;
    }
}
