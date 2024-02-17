package day7.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    /**
     * MAX_STAMINA максимальная выносливость.
     */
    private final int MAX_STAMINA = 100;
    /**
     * MIN_STAMINA минимальная выносливость.
     */
    private final int MIN_STAMINA = 0;
    /**
     * countPlayers счетчик количества игроков на поле.
     */
    private static int countPlayers;

    public static void setCountPlayers(int countPlayers) {
        Player.countPlayers = countPlayers;
    }

    /**
     * teamOne первая команда.
     */
    private static List<Player> teamOne = new ArrayList<>();
    /**
     * teamTwo вторая команда.
     */
    private static List<Player> teamTwo = new ArrayList<>();
    /**
     * stamina выносливость игрока
     */
    private int stamina;


    public Player(int stamina) {

        if (countPlayers < 6) {
            this.stamina = stamina;
            countPlayers++;
        } else {
            System.out.println("Количество игроков 6 вы не можете создать еще одно игрока");
        }

    }

    public static void run(Player player) {
        if (player.stamina != 0) {
            player.stamina -= 10;
            if (player.stamina < 0) {
                player.stamina = 0;
            }
        }
    }

    public static void info() {
        if (getCountPlayers() == 6) {
            System.out.printf("На поле %d игроков\n", getCountPlayers());
        } else {
            if (teamOne.size() < 3) {
                System.out.printf("Команды не полные на поле есть %d свободных мест в команде teamOne\n", 6 - getCountPlayers());
            }
            if (teamTwo.size() < 3) {
                System.out.printf("Команды не полные на поле есть %d свободных мест в команде teamTwo\n", 6 - getCountPlayers());
                // IntStream.range(0, teamTwo.size()).forEach(i -> teamTwo.get(i))
            }
        }

    }

    public static void addPlayers() {

        Random random = new Random();

        for (int i = 3; i > teamOne.size() + teamTwo.size(); i++) {
            teamOne.add(new Player(random.nextInt(90, 101)));
            teamTwo.add(new Player(random.nextInt(90, 101)));
        }
    }

    public static int getCountPlayers() {
        return Player.countPlayers;
    }

    public static List<Player> getTeamOne() {
        return Player.teamOne;
    }

    public static List<Player> getTeamTwo() {
        return Player.teamTwo;
    }

    public int getMAX_STAMINA() {
        return this.MAX_STAMINA;
    }

    public int getMIN_STAMINA() {
        return this.MIN_STAMINA;
    }

    public int getStamina() {
        return this.stamina;
    }
}
