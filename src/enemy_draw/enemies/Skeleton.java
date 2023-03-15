package enemy_draw.enemies;

public class Skeleton implements Enemy {
    @Override
    public String getName() {
        return "Skeleton";
    }

    @Override
    public String getEnemyType() {
        return "The Undead";
    }

    @Override
    public int getLife() {
        return 40;
    }

    @Override
    public int getEnemyDMG() {
        return 30;
    }
}
