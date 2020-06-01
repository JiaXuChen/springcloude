package com.jiaxuch.payment.mapper;

import com.jiaxuch.model.pay.PaymentInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PaymentMapper {

    /**
     *     @Select("select * from payment where id = #{id}")
     * @param id
     * @return
     */
    List<PaymentInfo> getPaymentInfo(String id);

    /**
     *     @Insert("insert into payment(id,userId,orderId,payType,price,payStatus,fcd,lcd) values (#{payId},#{userId},#{orderId},#{payType},#{price},#{payStatus},NOW(),NOW())")
     * @param paymentInfo
     * @return
     */
    int savePaymentInfo(PaymentInfo paymentInfo);

    @Delete("delete from payment where id = #{id}")
    int deletePaymentInfoByPayId(String id);

    @Update("update payment set lcd = now(),payStatus = #{payStatus}, payType = #{payType} where id = #{payId}")
    int updatePaymentInfoByPayId(PaymentInfo paymentInfo);
}
