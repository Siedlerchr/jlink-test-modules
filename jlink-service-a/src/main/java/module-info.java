import org.jdk.sample.jlink.test.service.ServiceInterface;
import org.jdk.sample.jlink.test.service.a.AInterface;

module org.jdk.sample.jlink.test.service.a {

    requires org.jdk.sample.jlink.test.service;

    exports org.jdk.sample.jlink.test.service.a to org.jdk.sample.jlink.test.app;

    provides ServiceInterface
            with AInterface;

}
