package ir.ac.aut;

public class Starter {
    MyFile file;

    public Starter() {
        this.file = new FileHelper();
    }

    public void start() {
        initialize();
        finish();
    }

    public void initialize() {
        file.read();
    }

    public void finish() {
        file.write();
    }

}
