package com.xinxin.designpattern.proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao teacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
         teacherDao = new TeacherDao();
    }

    @Override
    public void teach() {
        System.out.println("Begin Proxy...");
        teacherDao.teach();
        System.out.println("End Proxy.");
    }
}
