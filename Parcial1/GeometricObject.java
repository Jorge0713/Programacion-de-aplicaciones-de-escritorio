package Parcial1;

import java.util.Date;

public class GeometricObject {
    private String color ;
    private boolean filled;
    private Date dateCreated ;
    public GeometricObject(){
        this.color= "White";
        this.filled = false;   
    };
    public GeometricObject(String color, boolean filled){
        this.color= color;
        this.filled = filled;     
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return true;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
