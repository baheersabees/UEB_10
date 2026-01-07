package p2;

public class String2 implements Editable {
    String mainString;

    public String2(String s) {
        this.mainString = s;
    }
    
    public void addPrefix(String s) {
        this.mainString = s + this.mainString;
    }

    public void addPostfix(String s) {
        this.mainString = this.mainString + s;
    }

    public String toString() {
        return this.mainString;
    }
}
