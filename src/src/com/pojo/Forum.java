package src.com.pojo;

public class Forum {
    private int id;
    private int uid;
    private String message;
    private String title;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
//    public void setUser(User user) {
//        this.user = user;
//    }

    private int browse;
    private String ctime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBrowse() {
        return browse;
    }

    public void setBrowse(int browse) {
        this.browse = browse;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public Forum(){

    }

    public Forum(int id, int uid, String message, String title, int browse, String ctime) {
        this.id = id;
        //this.user = user;
        this.uid = uid;
        this.message = message;
        this.title = title;
        this.browse = browse;
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", uid=" + uid +
                ", message='" + message + '\'' +
                ", title='" + title + '\'' +
                ", browse=" + browse +
                ", ctime='" + ctime + '\'' +

                '}';
    }
}

