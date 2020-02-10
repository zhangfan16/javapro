package 面向对象;

/**
 * Created by zf188 on 2020/2/10.
 */
public class SalesEmployee extends ColaEmployee{
    public int salary;
    public float rate;
    public SalesEmployee(int salary, float rate){
        this.salary=salary;
        this.rate=rate;
    }
    @Override
    public int getSalary(int month) {
        return (int) (salary*rate);
    }
}
