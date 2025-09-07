package com.ebiling.common.exceptions;

import com.ebiling.common.constants.ErrorCode;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/**
 * Base runtime exception for the application.
 * Carries a stable ErrorCode and optional contextual data (safe to log/return).
 *
 * This class stays framework-agnostic (no Spring Web types here).
 * Web mapping to Problem JSON will be done in the web module via @ControllerAdvice.
 */
public class AppException extends RuntimeException {

    private final ErrorCode code;
    private final Map<String, Object> context;

    /**
     * Construct an AppException with a code and message.
     */
    public AppException(ErrorCode code, String message) {
        super(message);
        this.code = Objects.requireNonNull(code, "code");
        this.context = Collections.emptyMap();
    }

    /**
     * Construct an AppException with a code, message, and underlying cause.
     */
    public AppException(ErrorCode code, String message, Throwable cause) {
        super(message, cause);
        this.code = Objects.requireNonNull(code, "code");
        this.context = Collections.emptyMap();
    }

    /**
     * Construct an AppException with a code, message, and contextual key/values.
     * Context is intended for safe diagnostics (e.g., ids, sizes), not secrets.
     */
    public AppException(ErrorCode code, String message, Map<String, Object> context) {
        super(message);
        this.code = Objects.requireNonNull(code, "code");
        this.context = (context == null || context.isEmpty())
                ? Collections.emptyMap()
                : Map.copyOf(context);
    }

    public ErrorCode getCode() {
        return code;
    }

    /**
     * Additional diagnostic data (immutable, never null).
     */
    public Map<String, Object> getContext() {
        return context;
    }

    @Override
    public String toString() {
        return "AppException{" +
                "code=" + code +
                ", message=" + getMessage() +
                ", context=" + context +
                '}';
    }
}
