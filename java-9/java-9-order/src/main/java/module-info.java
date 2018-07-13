module com.andy.model.order {
    exports com.andy.model.order;
    requires transitive com.andy.model.user;
    requires transitive com.andy.model.product;
    provides com.andy.model.product.ProductService with com.andy.model.order.ProductServiceImpl;
}