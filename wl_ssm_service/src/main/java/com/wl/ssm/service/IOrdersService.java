package com.wl.ssm.service;

import com.wl.ssm.domain.Orders;

import java.util.List;

/**
 * @author Administrator
 */
public interface IOrdersService {

    /**
     *
     * @return
     * @throws Exception
     */
    List<Orders> findAll() throws Exception;
}
