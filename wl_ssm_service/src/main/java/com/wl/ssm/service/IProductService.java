package com.wl.ssm.service;

import com.wl.ssm.domain.Product;

import java.util.List;

/**
 * @author Administrator
 */
public interface IProductService {
    /**
     * 查找所有商品
     *
     * @return List<Product> 集合
     */
    List<Product> findAll() throws Exception;

    /**
     * 保存商品
     *
     * @param product 商品
     */
    void save(Product product) throws Exception;
}
