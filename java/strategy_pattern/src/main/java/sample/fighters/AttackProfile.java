package sample.fighters;

public class AttackProfile {

    private long damage;
    private long exhaust;

    public AttackProfile(long damage, long exhaust) {
        this.damage = damage;
        this.exhaust = exhaust;
    }

    public long getDamage() {
        return damage;
    }

    public void setDamage(long damage) {
        this.damage = damage;
    }

    public long getExhaust() {
        return exhaust;
    }

    public void setExhaust(long exhaust) {
        this.exhaust = exhaust;
    }

}
