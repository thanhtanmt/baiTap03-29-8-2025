package webstar.model;

import java.io.Serializable;

public class Category implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String categoryId;
    private String name;
    private String description;
    private String userId;

    // Constructor rỗng
    public Category() {}

    // Constructor đầy đủ
    public Category(String categoryId, String name, String description, String userId) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.userId = userId;
    }

    // Getter và Setter
    public String getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
