package com.example.diariesprac;

public class Project {

    private String Head;
    private String Name;
    private String branchandclass;
    private String desc;

    public Project(String head, String desc,String name,String branchandclass) {
        Head = head;
        this.desc = desc;
        Name = name;
        this.branchandclass = branchandclass;
    }

    public String getHead() {
        return Head;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return Name;
    }

    public String getBranchandclass() {
        return branchandclass;
    }

}
