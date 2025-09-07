package com.ebiling.common.exceptions;

import com.ebiling.common.constants.ErrorCode;

import java.util.Map;

/**
 * Use when a resource already exists or state conflicts (409-like).
 */
public class ConflictException extends AppException {

    public ConflictException(String message) {
        super(ErrorCode.CONFLICT, message);
    }

    public ConflictException(String message, Map<String, Object> context) {
        super(ErrorCode.CONFLICT, message, context);
    }
}
