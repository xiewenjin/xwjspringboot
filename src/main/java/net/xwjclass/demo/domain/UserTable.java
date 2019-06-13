package net.xwjclass.demo.domain;

import java.util.Date;

public class UserTable {

    private int id;
    private String name;
    private String phone;
    private Date createTime;
    private int age;

/*public UserTable(int id, String name, String phone, Date create_time, int age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.create_time = create_time;
        this.age = age;
    }*/



    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
