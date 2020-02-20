package com.neuedu.pojo;

import com.neuedu.util.Column;

/**
 * Created by Neuedu on 2020/2/19.
 */
public class Dept {
    private Integer deptno;
    private String dname;
    @Column("loc")
    private String local;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}
