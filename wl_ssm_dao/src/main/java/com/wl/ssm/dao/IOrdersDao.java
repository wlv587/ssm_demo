package com.wl.ssm.dao;


import com.wl.ssm.domain.Orders;
import com.wl.ssm.domain.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Administrator
 */
public interface IOrdersDao {

    @Select("select * from orders")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum", column = "order_num"),
            @Result(property = "orderTime", column = "order_time"),
            @Result(property = "orderStatus", column = "order_status"),
            @Result(property = "peopleCount", column = "people_count"),
            @Result(property = "peopleCount", column = "people_count"),
            @Result(property = "payType", column = "pay_type"),
            @Result(property = "orderDesc", column = "order_desc"),
            @Result(property = "product", column = "product_id", javaType = Product.class, one = @One(select = "com.wl.ssm.dao.IProductDao.findById")),
    })
    List<Orders> findAll() throws Exception;
}
