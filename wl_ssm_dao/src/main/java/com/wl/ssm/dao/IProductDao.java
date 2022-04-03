package com.wl.ssm.dao;

import com.wl.ssm.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Administrator
 */
public interface IProductDao {

    //根据id查询产品
    @Select("select * from product where id=#{id}")
    Product findById(String id) throws Exception;

    //查询所有的产品信息
    @Select("select * from product")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "productNum",column = "product_num"),
            @Result(property = "productName",column = "product_name"),
            @Result(property = "cityName",column = "city_name"),
            @Result(property = "departureTime",column = "departure_time"),
            @Result(property = "productPrice",column = "product_price"),
            @Result(property = "productDesc",column = "product_desc"),
            @Result(property = "productStatus",column = "product_status"),
    })
    List<Product> findAll() throws Exception;

    @Insert("insert into product(product_num,product_name,city_name,departure_time,product_price,product_desc," +
            "productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
}
