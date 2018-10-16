package com.example.demo.mapper;

import com.example.demo.pojo.OrderInfo;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;

public interface OrderInfoMapper {
    @InsertProvider(type = OrderInfoProvider.class,method = "insertOrderInfo")
    int insertOrderInfo(@Param("orderInfo")OrderInfo orderInfo);
}
