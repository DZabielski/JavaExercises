package enemy_draw;

import enemy_draw.enemies.Bandit;
import enemy_draw.enemies.Enemy;
import enemy_draw.enemies.Rat;
import enemy_draw.enemies.Skeleton;

public class MainEnemyDraw {

    public static void main(String[] args) {
        Opponent(new Rat());
        Opponent(new Skeleton());
        Opponent(new Bandit());
    }

    public static void Opponent(Enemy enemy) {
        System.out.println("Name: " + enemy.getName());
        System.out.println("Enemy type: " + enemy.getEnemyType());
        System.out.println("HP: " + enemy.getLife());
        System.out.println("DMG: " + enemy.getEnemyDMG());
        System.out.println("");
    }
}
