package enemy_draw.enemies;

public class Bandit implements Enemy {

    @Override
    public String getName() {
        return "Bandit";
    }

    @Override
    public String getEnemyType() {
        return "People";
    }

    @Override
    public int getLife() {
        return 100;
    }

    @Override
    public int getEnemyDMG() {
        return 20;
    }
}
