package FileIo;

import java.io.Serializable;

/**
 * Created by zf188 on 2020/2/12.
 */
public class Student implements Serializable {
    private  static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private Integer age;
    private String grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
