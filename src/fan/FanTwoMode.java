package fan;

import java.util.Arrays;
import java.util.List;

/**
 * Enum FanTwoMode
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class FanTwoMode extends FanMode implements FanInterface{

    public FanTwoMode(List<String> mode) {

        super(mode);
        this.init();
    }

    @Override
    public String toString() {
        return "FanTwoMode{" +
                "currentMode='" + currentMode + '\'' +
                '}';
    }
}
