class Product {
      private int productId;
      private String productName;
      private Category category;
      private int quantity;
      private boolean isActive;
  
      public Product(int productId, String productName, Category category, int quantity, boolean isActive) {
          this.productId = productId;
          this.productName = productName;
          this.category = category;
          this.quantity = quantity;
          this.isActive = isActive;
      }
  
      // Getters and setters
      public int getProductId() { return productId; }
      public void setProductId(int productId) { this.productId = productId; }
      public String getProductName() { return productName; }
      public void setProductName(String productName) { this.productName = productName; }
      public Category getCategory() { return category; }
      public void setCategory(Category category) { this.category = category; }
      public int getQuantity() { return quantity; }
      public void setQuantity(int quantity) { this.quantity = quantity; }
      public boolean isActive() { return isActive; }
      public void setActive(boolean active) { isActive = active; }
  }