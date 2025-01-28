package az.coders.spring.dao.impl;

import az.coders.spring.dao.CategoryDao;
import az.coders.spring.domains.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@Component
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public void insertCategory(Category category) {
        String sql = "insert into categories(category_id, description, category_name) values(:categoryId,:description, :categoryName)";
        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(category);
        jdbcTemplate.update(sql, params);
        System.out.println("insert olundu..." + category);
    }
//
//    @Override
//    public void updateCategory(int id, Category category) {
//        Category findCategory = getCategory(id);
//        if(category.getCategoryName() != null && !category.getCategoryName().isEmpty())
//            findCategory.setCategoryName(category.getCategoryName());
//        if(category.getDescription() != null && !category.getDescription().isEmpty())
//            findCategory.setDescription(category.getDescription());
//        String sql = "update categories set category_name=?, description=? where category_id=?";
//        jdbcTemplate.update(sql,findCategory.getCategoryName(),findCategory.getDescription(),id);
//        System.out.println("update olundu..." + id);
//    }
//
//    @Override
//    public void deleteCategory(int id) {
//        String sql = "delete from categories where category_id = ?";
//        jdbcTemplate.update(sql,id);
//        System.out.println("delete olundu..." + id);
//    }
//
//    @Override
//    public Category getCategory(int id) {
//        String sql = "select * from categories where category_id = ?";
//        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Category.class), id);
//    }
//
//    @Override
//    public List<Category> getAllCategories() {
//        String sql = "select * from categories";
//        return null; //jdbcTemplate.queryForObject(sql, new CategoryRowMapper());
//    }
//
//    @Override
//    public String getCategoryByName(int id) {
//        String sql = "select category_name from categories where category_id = ?";
//        return jdbcTemplate.queryForObject(sql, String.class, id);
//    }

//    private class CategoryRowMapper implements RowMapper<Category> {
//
//        @Override
//        public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Category category = new Category();
//                category.setId(rs.getInt("category_id"));
//                category.setName(rs.getString("category_name"));
//                category.setDescription(rs.getString("description"));
//                return category;
//        }
//    }
}
