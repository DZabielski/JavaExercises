package enemy_draw.enemies;

public class Rat implements Enemy {

    @Override
    public String getName() {
        return "Rat";
    }

    @Override
    public String getEnemyType() {
        return "Animal";
    }

    @Override
    public int getLife() {
        return 20;
    }

    @Override
    public int getEnemyDMG() {
        return 5;
    }
}
