import org.jdk.sample.jlink.test.service.ServiceInterface;
import org.jdk.sample.jlink.test.service.b.BServiceInterface;

module org.jdk.sample.jlink.test.service.b {

    requires org.jdk.sample.jlink.test.service;
    exports org.jdk.sample.jlink.test.service.b to org.jdk.sample.jlink.test.service;

    provides ServiceInterface
            with BServiceInterface;
}
