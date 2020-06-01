package com.jiaxuch.payment.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DatasourceConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean servletRegistrationBean = new  ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String, String> initParame = new HashMap<>();
        initParame.put("loginUsername", "root");
        initParame.put("loginPassword", "jiaxu123");
        servletRegistrationBean.setInitParameters(initParame);
        return servletRegistrationBean;
    }
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String, String> initParame = new HashMap<>();
        initParame.put("exclusions","*.js,*.html,*.css,/druid/*");
        bean.setInitParameters(initParame);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;

    }

}
