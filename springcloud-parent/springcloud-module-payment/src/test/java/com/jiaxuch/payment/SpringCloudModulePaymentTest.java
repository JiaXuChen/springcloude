package com.jiaxuch.payment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudModulePaymentTest {
    @Autowired
    public DataSource dataSource;

    @Test
    public void dataTest() throws SQLException {
        System.out.println("获取数据源：" + dataSource);
        Connection connection = dataSource.getConnection();
        System.out.println(dataSource.getClass().getName());
        System.out.println(connection);
    }
}
