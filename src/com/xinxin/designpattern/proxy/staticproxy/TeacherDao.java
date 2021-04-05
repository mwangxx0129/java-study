package com.xinxin.designpattern.proxy.staticproxy;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("Teach Dao teach");
    }
}
