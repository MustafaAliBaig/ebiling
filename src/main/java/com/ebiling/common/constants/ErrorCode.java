package com.ebiling.common.constants;

/**
 * Stable, API-safe error codes that travel across layers.
 * Keep names short, UPPER_SNAKE_CASE, and stable for consumers.
 */
public enum ErrorCode {
    NOT_FOUND,
    VALIDATION_FAILED,
    CONFLICT,
    DUPLICATE,
    BAD_REQUEST,
    INTERNAL
}
