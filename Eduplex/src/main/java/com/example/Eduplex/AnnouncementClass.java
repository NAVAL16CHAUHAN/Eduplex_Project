package com.example.Eduplex;

public class AnnouncementClass {
    private String announcementTitle;
    private String announcementBody;
    private String announcementDate;

    public  AnnouncementClass(){}
    public AnnouncementClass(String announcementTitle, String announcementBody,String announcementDate) {
        this.announcementTitle = announcementTitle;
        this.announcementBody = announcementBody;
        this.announcementDate = announcementDate;
    }

    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    public void setAnnouncementTitle(String announcementTitle) {
        this.announcementTitle = announcementTitle;
    }


    public String getAnnouncementDate() {
        return announcementDate;
    }

    public void setAnnouncementDate(String announcementDate) {
        this.announcementDate = announcementDate;
    }

    public String getAnnouncementBody() {
        return announcementBody;
    }

    public void setAnnouncementBody(String announcementBody) {
        this.announcementBody = announcementBody;
    }
}
