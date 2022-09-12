package uz.ithelp.chizmachilikproyeksionchizmachilik2022.ui.dashboard;

import java.io.Serializable;

public class ModelRcycler implements Serializable {

    private int imgID;
    private String lessonName;

    private String loadUrl;

    public ModelRcycler(int imgID, String lessonName, String loadUrl) {
        this.imgID = imgID;
        this.lessonName = lessonName;
        this.loadUrl = loadUrl;
    }


    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLoadUrl() {
        return loadUrl;
    }

    public void setLoadUrl(String loadUrl) {
        this.loadUrl = loadUrl;
    }
}
