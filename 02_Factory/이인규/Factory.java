// Enum class
enum NotFoundReason {
    FILE_NOT_FOUND("파일이 없습니다."),
    FOLDER_NOT_FOUND("폴더가 없습니다.");

    private final String message;

    NotFoundReason(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

enum BadRequestReason {
    REASON_1("권한이 만료되었습니다."),
    REASON_2("접속이 거부되었습니다.");

    private final String message;

    BadRequestReason(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
// End Enum class

// Product
abstract class BaseException extends Exception {
    private final int errorCode;

    public BaseException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
// End Product

// Concrete Product
class NotFoundException extends BaseException{
    public NotFoundException(String message) {
        super(404, message);
    }
}

class BadRequestException extends BaseException{
    public BadRequestException(String message) {
        super(400, message);
    }
}
// End Concrete Product

// Factory
class ExceptionFactory {
    public static NotFoundException notFound(NotFoundReason reason) {
        return new NotFoundException(reason.getMessage());
    }

    public static BadRequestException badRequest(BadRequestReason reason) {
        return new BadRequestException(reason.getMessage());
    }
}
// End Factory

// Example Main
public class Factory {
    public static void main(String args[]){
        try {
            throw ExceptionFactory.notFound(NotFoundReason.FOLDER_NOT_FOUND);
        } catch (BaseException e) {
            System.out.println("에러 코드: " + e.getErrorCode());
            System.out.println("에러 메시지: " + e.getMessage());
        }

        try {
            throw ExceptionFactory.badRequest(BadRequestReason.REASON_1);
        } catch (BaseException e) {
            System.out.println("에러 코드: " + e.getErrorCode());
            System.out.println("에러 메시지: " + e.getMessage());
        }
    }
}

/* [OUTPUT]
[Running] cd "/이인규/" && javac Factory.java && java Factory
에러 코드: 404
에러 메시지: 폴더가 없습니다.
에러 코드: 400
에러 메시지: 권한이 만료되었습니다.

[Done] exited with code=0 in 0.479 seconds
 */
