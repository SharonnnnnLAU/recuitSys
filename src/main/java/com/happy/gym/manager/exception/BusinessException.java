package com.happy.gym.manager.exception;

import com.happy.gym.manager.result.Status;

/**
 * @author Marveal
 * @date 2020/6/8 23:18
 */

public class BusinessException extends RuntimeException {

    public Status status;

    public BusinessException(String message, Status status) {
        super(message);
        this.status = status;
    }
}
