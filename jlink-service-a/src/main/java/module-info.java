import org.jdk.sample.jlink.test.service.ServiceInterface;
import org.jdk.sample.jlink.test.service.a.AInterface;

module org.jdk.sample.jlink.test.service.a {

    requires org.jdk.sample.jlink.test.service;

    requires transitive java.desktop;

    provides ServiceInterface
            with AInterface;

}
