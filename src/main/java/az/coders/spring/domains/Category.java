package az.coders.spring.domains;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private int categoryId;
    private String categoryName;
    private String description;
}
