import spock.lang.Specification;

public class ExceptionInAssertionSpec extends Specification {

    void "exception in assertion"() {
        expect:
        error()
    }

    void error() {
        throw new RuntimeException("Test error")
    }

}
