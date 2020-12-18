package ir.ac.aut;

public class Starter {
    FileHelper file;

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
