package az.coders.spring.dao;

import az.coders.spring.domains.Category;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CategoryDao {
    void insertCategory(Category category);
//    void updateCategory(int id, Category category);
//    void deleteCategory(int id);
//    Category getCategory(int id);
//    List<Category> getAllCategories();
//    String getCategoryByName(int id);
}
