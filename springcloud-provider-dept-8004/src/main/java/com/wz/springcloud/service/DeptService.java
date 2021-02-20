package com.wz.springcloud.service;

import com.wz.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    public  boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
