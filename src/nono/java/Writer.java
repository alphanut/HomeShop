package nono.java;

public interface Writer {

    /**
     * start writing process
     */
    void start();

    /**
     * stop writing process
     */
    void stop();

    /**
     * write on line
     * @param line
     */
    void writeLine(String line);
}
