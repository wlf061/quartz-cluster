package net.aimeizi.quartz.model;

import com.dexcoder.commons.pager.Pageable;

import java.util.Date;

/**
 * author : fengjing
 * createTime : 2016-08-04
 * description : 计划任务模型
 * version : 1.0
 */
public class Test1 extends Pageable {

    private static final long serialVersionUID = 4888005949821878223L;

    private Integer id;
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
