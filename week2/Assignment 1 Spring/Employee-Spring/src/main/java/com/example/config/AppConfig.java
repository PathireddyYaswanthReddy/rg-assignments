package com.example.config;

import com.example.dao.EmployeeDAO;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
@ComponentScan("com.example")
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/testdb?useSSL=false");
        ds.setUsername("root");         // Change if needed
        ds.setPassword("");     // Change if needed
        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource ds) {
        return new JdbcTemplate(ds);
    }

    @Bean
    public EmployeeDAO employeeDAO(JdbcTemplate jdbcTemplate) {
        return new EmployeeDAO(jdbcTemplate);
    }
}
