package cvic1;

public class Zlomek {

    private int citatel;
    private int jmenovatel;

    public Zlomek(int citatel, int jmenovatel) {
        if (jmenovatel == 0) {
            throw new IllegalArgumentException("Jmenovatel nesmí být nula.");
        }
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }

    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    public void setJmenovatel(int jmenovatel) {
        if (jmenovatel == 0) {
            throw new IllegalArgumentException("Jmenovatel nesmí být nula.");
        }
        this.jmenovatel = jmenovatel;
    }

    public Zlomek krat(Zlomek druhy) {
        return new Zlomek(citatel * druhy.citatel, jmenovatel * druhy.jmenovatel);
    }

    public Zlomek del(Zlomek druhy) {
        return new Zlomek(citatel / druhy.jmenovatel, citatel % druhy.citatel );
    }

    public Zlomek sum(Zlomek druhy) {
        return new Zlomek(citatel + druhy.citatel, jmenovatel + druhy.jmenovatel);

    }

    public Zlomek minus(Zlomek druhy) {
        return new Zlomek(citatel - druhy.citatel, citatel % druhy.citatel);
    }

    @Override
    public String toString() {
        return String.format("%d / %d", citatel, jmenovatel);
    }
}

