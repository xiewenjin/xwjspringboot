package net.xwjclass.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.crypto.Data;
import java.util.Date;

public class TestsTable {

    @JsonProperty("account")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String username;


    private int id;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh",timezone = "GMT+8")
    private Date add_time;

    @JsonIgnore
    private String passwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public TestsTable(String username,Date add_time,String passwd,int id) {
        this.username = username;
        this.add_time = add_time;
        this.passwd = passwd;
//        this.id = id;
    }
}
