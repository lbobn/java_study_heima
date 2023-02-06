package com.a04objectdemo;

import java.util.Arrays;
import java.util.StringJoiner;

//Cloneable接口没有抽象方法
//此类接口若被实现，则当前对象可被克隆
//如果没有实现，则该类不能被克隆
public class User implements Cloneable {
    private int id;
    private String username;
    private String password;
    private String path;//游戏图片
    private int[] data = new int[16];

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", path='" + path + '\'' +
                ", data=" + arrToString() +
                '}';
    }

    public String arrToString() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

/*    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        int[] data0=this.data;

        int[] newData=new int[data.length];

        for (int i = 0; i < data.length; i++) {
            newData[i]=data[i];
        }

        User u=(User) super.clone();
        u.data=newData;
        return u;
    }*/
}
