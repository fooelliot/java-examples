package com.andy.model.order;

/**
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-13 22:52
 **/
public class OrderException extends Exception {

    public OrderException() {
        super();
    }

    public OrderException(String message) {
        super(message);
    }

    public OrderException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderException(Throwable cause) {
        super(cause);
    }
}
