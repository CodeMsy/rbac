package com.rbac.common.config;

import java.util.ArrayList;
import java.util.List;

import com.baomidou.mybatisplus.incrementer.H2KeyGenerator;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.plugins.parser.ISqlParser;
import com.baomidou.mybatisplus.plugins.parser.tenant.TenantHandler;
import com.baomidou.mybatisplus.plugins.parser.tenant.TenantSqlParser;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.LongValue;
import org.springframework.context.annotation.Profile;

@Configuration
@MapperScan("com.rbac.mapper*")//这个注解，作用相当于下面的@Bean MapperScannerConfigurer，2者配置1份即可
public class MybatisPlusConfig {

    /**
     * 本地开发的时候打开
     *  mybatis-plus SQL执行效率插件【生产环境可以关闭】
     * @return
     */
    @Bean
    @Profile("dev")
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setLocalPage(true);
        return paginationInterceptor;
    }
}
