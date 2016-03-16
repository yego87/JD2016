package by.it.telushko.jd01_15;

/**
 * Created by Владимир on 16.03.2016.
 */
public class Comment {
    int start,end;
    public Comment(int start,int end){
        this.start=start;
        this.end=end;
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }
}
