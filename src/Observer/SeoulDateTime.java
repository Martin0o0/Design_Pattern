package Observer;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SeoulDateTime extends NowDateTime{
    private ZonedDateTime seoulDateTime;

    public String getDateTime(){
        return this.seoulDateTime.toString();
    }
    public void setDateTime(){
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        for(int i = 0;  i < 20; i++) {
            this.seoulDateTime = ZonedDateTime.now(zoneId);
            super.notifyObservers();
        }
    }

}
