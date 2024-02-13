package day7.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    /*2. Дворовый футбол.
    Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player) содержит следующие поля:
   -Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
   -Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость”
    (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.
   -Статическое поле countPlayers, которое считает количество игроков на футбольном поле (изначально их 0,
    выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
   -Геттеры для полей “выносливость” и “количество игроков”.
    и следующие методы:
    run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном вызове.
    Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
    info() -  выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6, то выводит сообщение:
     “Команды неполные. На поле еще есть ... свободных мест”, иначе: “На поле нет свободных мест”.
      Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
   Задание: Создать класс Player по вышеописанному шаблону. В методе main() создать объект класса Random,
   который будет генерировать случайные числа. Создать 6 игроков, передавая им в качестве аргумента в конструктор
    случайно сгенерированные числа от 90 до 100. Вызвать метод info(). При попытке создать 7,8 … n игрока,
    количество игроков на поле меняться не должно, проверить это.
*/
    public static void main(String[] args) {
        Player.addPlayers();
        Player.info();
        Random random = new Random();
        int index = random.nextInt(0, 3);
        int teamChoose = random.nextInt(0, 2);
        for (int i = 0; i < 10; i++) {
            if (teamChoose == 0) {
                Player.run(Player.getTeamTwo().get(index));
            } else {
                Player.run(Player.getTeamOne().get(index));
            }
        }

        if (Player.getTeamTwo().get(index).getStamina() == 0) {
            System.out.println(Player.getTeamTwo().get(index).getStamina());
            Player.getTeamTwo().remove(index);
            Player.setCountPlayers(Player.getCountPlayers() - 1);
        }
        if (Player.getTeamOne().get(index).getStamina() == 0) {
            System.out.println(Player.getTeamOne().get(index).getStamina());
            Player.getTeamOne().remove(index);
            Player.setCountPlayers(Player.getCountPlayers() - 1);
        }
        Player.info();

    }
}
