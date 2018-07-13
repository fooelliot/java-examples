package com.andy.model.product;

/**
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-13 22:52
 **/
public class ProductException extends Exception {

    public ProductException() {
        super();
    }

    public ProductException(String message) {
        super(message);
    }

    public ProductException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductException(Throwable cause) {
        super(cause);
    }
}
