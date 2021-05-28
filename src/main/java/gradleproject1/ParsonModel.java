 
package gradleproject1;
 
public class ParsonModel {
    private  int eyesize;
    private  int nose;
    private  boolean mouth;
    private  Double height;
    
    public ParsonModel(int y , int n , boolean m , Double h){
       this.eyesize = y;
       this.nose = n;
       this.mouth = m;
       this.height = h;
              
    }

    public int getEyesize() {
        return eyesize;
    }

    public void setEyesize(int eyesize) {
        this.eyesize = eyesize;
    }

    public int getNose() {
        return nose;
    }

    public void setNose(int nose) {
        this.nose = nose;
    }

    public boolean getMouth() {
        return mouth;
    }

    public void setMouth(boolean mouth) {
        this.mouth = mouth;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
     
}
