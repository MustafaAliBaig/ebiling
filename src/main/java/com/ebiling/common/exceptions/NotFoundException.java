package com.ebiling.common.exceptions;

import com.ebiling.common.constants.ErrorCode;

import java.util.Map;

/**
 * Convenience type for 404-like errors.
 */
public class NotFoundException extends AppException {

    public NotFoundException(String message) {
        super(ErrorCode.NOT_FOUND, message);
    }

    public NotFoundException(String message, Map<String, Object> context) {
        super(ErrorCode.NOT_FOUND, message, context);
    }
}
