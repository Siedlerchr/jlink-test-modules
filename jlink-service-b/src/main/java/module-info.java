import org.jdk.sample.jlink.test.service.ServiceInterface;
import org.jdk.sample.jlink.test.service.numbers.BServiceInterface;

module org.jdk.sample.jlink.test.service.numbers {

    requires org.jdk.sample.jlink.test.service;
    exports org.jdk.sample.jlink.test.service.numbers;

    provides ServiceInterface
            with BServiceInterface;
}
