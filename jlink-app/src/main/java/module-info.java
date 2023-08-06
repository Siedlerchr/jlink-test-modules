import org.jdk.sample.jlink.test.service.ServiceInterface;

module org.jdk.sample.jlink.test.app {

    requires org.jdk.sample.jlink.test.service;

    uses ServiceInterface;
}
