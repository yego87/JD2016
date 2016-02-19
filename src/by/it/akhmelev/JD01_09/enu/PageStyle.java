package by.it.akhmelev.JD01_09.enu;

/**
 * Created by Alex on 18.02.2016.
 */
public enum PageStyle {
    Roman, Novell, Issue, Code;

    public int getMinPages() {
    // минимальное число страниц
        switch (this) {
            case Roman: return 100;
            case Novell: return 20;
            case Issue: return 5;
            case Code: return 1;
            default: return 0;
        } //switch
    } //getMinPages

} //enum
