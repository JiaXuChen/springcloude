package com.jiaxuch.orders.mapper;

import com.jiaxuch.model.order.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersMapper {


    List<OrderInfo> getOrdersInfo(String id);

//    /**
//     *     @Insert("insert into payment(id,userId,orderId,payType,price,payStatus,fcd,lcd) values (#{payId},#{userId},#{orderId},#{payType},#{price},#{payStatus},NOW(),NOW())")
//     * @param paymentInfo
//     * @return
//     */
//    int savePaymentInfo(PaymentInfo paymentInfo);
//
//    @Delete("delete from payment where id = #{id}")
//    int deletePaymentInfoByPayId(String id);
//
//    @Update("update payment set lcd = now(),payStatus = #{payStatus}, payType = #{payType} where id = #{payId}")
//    int updatePaymentInfoByPayId(PaymentInfo paymentInfo);
}
