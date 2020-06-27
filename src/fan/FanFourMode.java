package fan;

import java.util.List;

/**
 * Class FanFourMode
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class FanFourMode extends FanMode implements FanInterface {
    public FanFourMode(List<String> mode) {
        super(mode);
        this.init();
    }

    @Override
    public String toString() {
        return "FanFourMode{" +
                "currentMode='" + currentMode + '\'' +
                '}';
    }
}