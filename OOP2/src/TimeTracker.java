import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class TimeTracker {
    private long startTime;
    private long finishTime;
    private ArrayList<String> updates;

    public TimeTracker(){
        this.startTime = 0;
        this.finishTime = 0;
        updates = new ArrayList<>();
    }
    public long getStartTime() {
        return startTime;
    }
    public void start(String operation) {
        this.startTime = System.currentTimeMillis();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        Date date = new Date();
        updates.add(dateFormat.format(date) + " start");
    }
    public long getFinishTime() {
        return finishTime;
    }
    public void finish(String operation) {
        this.finishTime = System.currentTimeMillis() - this.getStartTime();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        Date date = new Date();
        updates.add(dateFormat.format(date) + " finish");
    }
    
    public void update(String operation){
        this.finishTime = System.currentTimeMillis() - this.getStartTime();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        Date date = new Date();
        updates.add(dateFormat.format(date) + " update");
    }
    
    public void report(){
        System.out.println(finishTime);
        for(int i=0; i<updates.size(); i++){
            System.out.println(updates.get(i));
        }
    }

    
}
