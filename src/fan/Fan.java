package fan;

/**
 * Class Fan
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Fan {

    FanMode fanMode;

    public Fan(FanMode fanMode) {
        this.fanMode = fanMode;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "fanMode=" + fanMode +
                '}';
    }

    public void click(){
        fanMode.next();
    }

    public FanMode getFanMode() {
        return fanMode;
    }
}
