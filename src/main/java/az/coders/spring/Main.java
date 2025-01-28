package az.coders.spring;

import az.coders.spring.config.DatabaseConfig;
import az.coders.spring.dao.CategoryDao;
import az.coders.spring.domains.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
        CategoryDao categoryDao = context.getBean("categoryDaoImpl", CategoryDao.class);
        categoryDao.insertCategory(new Category(43, "41 name", "41 desc"));
    }

}
