package fan;

import java.util.List;

/**
 * Enum FanThreeMode
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class FanThreeMode extends FanMode implements FanInterface {

    public FanThreeMode(List<String> mode) {
        super(mode);
        this.init();
    }

    @Override
    public String toString() {
        return "FanThreeMode{" +
                "currentMode='" + currentMode + '\'' +
                '}';
    }
}
