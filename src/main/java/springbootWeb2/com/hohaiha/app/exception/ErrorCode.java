package springbootWeb2.com.hohaiha.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import lombok.Getter;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1001, "Uncategorized error", HttpStatus.BAD_REQUEST),
    USER_EXISTED(1002, "User existed", HttpStatus.BAD_REQUEST),
    USERNAME_INVALID(1003, "user name invald", HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD(1004, "Password must be at least 6 characters", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(1005, "User not existed", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1006, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1007, "You do not have permission", HttpStatus.FORBIDDEN),
    ERROR_BEFORE_REACHING(1007, "This error occurs before reaching the method", HttpStatus.FORBIDDEN),
    CATEGORY_NOT_EXISTED(1005, "category not existed", HttpStatus.NOT_FOUND),
    PRODUCT_EXISTED(1002, "Product existed", HttpStatus.BAD_REQUEST),
    PRODUCT_NOT_EXISTED(1005, "Product not existed", HttpStatus.BAD_REQUEST),
    ITEM_NOT_EXISTED(1005, "item not existed", HttpStatus.BAD_REQUEST),
    CART_NOT_EXISTED(1005, "Cart not existed", HttpStatus.NOT_FOUND),
   	ORDERS_NOT_EXISTED(1005, "Orders not existed", HttpStatus.NOT_FOUND),
   	ERROR_UPLOAD_PRODUCTFILE(1003, "can't upload product file", HttpStatus.BAD_REQUEST),
   	;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }
    
    private final int code;
    private final String message;
    private final HttpStatusCode statusCode;
}
