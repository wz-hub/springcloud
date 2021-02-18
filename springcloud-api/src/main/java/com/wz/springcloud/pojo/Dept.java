package com.wz.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)//链式写法
public class Dept implements Serializable {

    //主键
    private Long deptno;
    //部门名称
    private String dname;
    //不同信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

   /*链式写法：
        Dept dept = new Dept();
        ept.setDeptNo(11).setDeptname(’sss‘).setDb_source("12")
    */

}
