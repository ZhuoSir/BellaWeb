package com.creheart.bella.exception;

/**
 *
 * Created by sunny-chen on 2017/7/23.
 */
public class ServiceException  extends Exception {

    public ServiceException() {
    }

    public ServiceException(String message) {
        super("业务异常：" + message);
    }
}
