package fan;

import java.util.List;

/**
 * Class FanMode
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public abstract class FanMode {

    List<String> mode;

    public FanMode(List<String> mode) {
        this.mode = mode;
    }

    public int currentIndex = 0;
    public String currentMode;

    public void next() {
        this.currentIndex++;
        try {
            this.currentMode = this.mode.get(this.currentIndex);
        } catch (Exception e) {
            this.currentIndex = 0;
            this.currentMode = this.mode.get(this.currentIndex);
        }
    }

    public void init() {
        this.currentMode = this.mode.get(this.currentIndex);
    }
}
