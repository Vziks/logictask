package fan;

/**
 * Class Fan
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Fan {

    FanInterface fanMode;

    public Fan(FanInterface fanMode) {
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
}
