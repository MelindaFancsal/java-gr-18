package composition;

public class Camera {
    private String culoare;
    private int marire;

    public Camera() {
        this.culoare = "alb";
        this.marire = 10;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getMarire() {
        return marire;
    }

    public void setMarire(int marire) {
        this.marire = marire;
    }
}
