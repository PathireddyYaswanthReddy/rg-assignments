package com.example.dao;

import com.example.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.util.List;

public class EmployeeDAO {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Employee> rowMapper = (rs, rowNum) ->
            new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("department"));

    public void create(Employee employee) {
        jdbcTemplate.update("INSERT INTO Employee (id, name, department) VALUES (?, ?, ?)",
                employee.getId(), employee.getName(), employee.getDepartment());
    }

    public List<Employee> getAll() {
        return jdbcTemplate.query("SELECT * FROM Employee", rowMapper);
    }

    public Employee getById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM Employee WHERE id = ?", rowMapper, id);
    }

    public void update(Employee employee) {
        jdbcTemplate.update("UPDATE Employee SET name=?, department=? WHERE id=?",
                employee.getName(), employee.getDepartment(), employee.getId());
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM Employee WHERE id=?", id);
    }
}
