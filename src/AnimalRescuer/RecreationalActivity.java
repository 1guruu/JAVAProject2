package AnimalRescuer;

public class RecreationalActivity {

    private String activity ;
    private int activitySpeed ;
    private int activityTimeHour;

    public void setActivity(String activity){
        this.activity=activity;
    }
    public String getActivity(){
        return activity;
    }
    public void setActivitySpeed(int activitySpeed){
        this.activitySpeed=activitySpeed;
    }

    public int getActivitySpeed() {
        return activitySpeed;
    }
    public void setActivityTimeHour(int activityTimeHour){
        this.activityTimeHour=activityTimeHour;
    }
    public int getActivityTimeHour(){
        return activityTimeHour;
    }
}
