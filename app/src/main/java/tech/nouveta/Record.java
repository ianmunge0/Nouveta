package tech.nouveta;

public class Record {
    public String clicked;
    public String date;
    public String diff;
    public String sync;
    public String uid;

    public Record() {

    }

    public String getClicked() {
        return clicked;
    }

    public String getDate() {
        return date;
    }

    public String getDiff() {
        return diff;
    }

    public String getSync() {
        return sync;
    }

    public String getUid() {
        return uid;
    }


    public void setClicked(String clicked) {
        this.clicked = clicked;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public void setSync(String time) {
        this.sync = sync;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Record(String sync, String clicked, String diff, String date, String uid) {
        this.clicked = clicked;
        this.date = date;
        this.diff = diff;
        this.sync = sync;
        this.uid = uid;
    }
}