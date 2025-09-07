package com.ebiling.common.exceptions;

import com.ebiling.common.constants.ErrorCode;

import java.util.Map;

/**
 * Use for domain/application validation failures (400-like).
 * For Bean Validation (@Valid) errors, you can convert to this in the web layer if desired.
 */
public class ValidationException extends AppException {

    public ValidationException(String message) {
        super(ErrorCode.VALIDATION_FAILED, message);
    }

    public ValidationException(String message, Map<String, Object> context) {
        super(ErrorCode.VALIDATION_FAILED, message, context);
    }
}
