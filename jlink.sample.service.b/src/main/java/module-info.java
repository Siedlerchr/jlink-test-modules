import jlink.sample.base.ServiceInterface;
import jlink.sample.service.b.BServiceInterface;

module jlink.sample.service.b {

    requires jlink.sample.service.base;

    exports jlink.sample.service.b to jlink.sample.service.base;

    provides ServiceInterface
            with BServiceInterface;
}
