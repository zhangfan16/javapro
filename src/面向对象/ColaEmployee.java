package 面向对象;

/**
 * Created by zf188 on 2020/2/10.
 */
public abstract class ColaEmployee {
    public String name;
    public int month;
    public ColaEmployee(){}
    public ColaEmployee(int month){
        this.month=month;
    }
    public abstract int getSalary(int month);

}

