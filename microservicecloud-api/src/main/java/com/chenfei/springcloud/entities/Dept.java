package com.chenfei.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    //实体类
    private Long deptNo ;
    private String dname ;
    private String db_source ; //来自哪个数据库，因为一个微服务架构可以一个服务对应一个数据库，同一个信息被储存到不同数据库

    public Dept (String dName){
        super();
        this.dname = dname ;
    }
}
