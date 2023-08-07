import jlink.sample.base.ServiceInterface;
import jlink.sample.service.a.AInterface;

module jlink.sample.service.a {

    exports jlink.sample.service.a;

    requires transitive java.desktop;
    requires jlink.sample.service.base;

    provides ServiceInterface
            with AInterface;

}
