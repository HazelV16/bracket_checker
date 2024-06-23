public class Wombat implements Comparable<Wombat> {
    private String name;
    private int severity;
    private double time;

    public Wombat() {

    }

    public Wombat(String name, int severity, double time) throws SeverityOutOfBoundsException {
        this.name = name;
        this.severity = severity;
        this.time = time;
        if (severity < 1 || severity > 10) {
            throw new SeverityOutOfBoundsException("Severity is not within 1-10");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return name + ", " + severity + ", " + time;
    }

    @Override
    public int compareTo(Wombat o) {
        int sever_lv = Integer.compare(o.severity, this.severity);
        if (sever_lv != 0) {
            return sever_lv;
        } else {
            return Double.compare(this.time, o.time);
        }
    }
}
