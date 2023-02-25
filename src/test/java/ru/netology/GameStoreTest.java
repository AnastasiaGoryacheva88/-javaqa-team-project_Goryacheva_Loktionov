package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class GameStoreTest {

    @Test
    public void shouldAddGame() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        Assertions.assertTrue(store.containsGame(game));
    }

    @Test
    public void shouldAddPlayTime() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        store.addPlayTime("Игрок 1", 7);
        store.addPlayTime("Игрок 1", 5);
        store.addPlayTime("Игрок 2", 5);

        String expected = "Игрок 1";
        String actual = store.getMostPlayer();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSumPlayedTime() {

        GameStore store = new GameStore();
        Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        store.addPlayTime("Игрок 1", 8);
        store.addPlayTime("Игрок 2", 9);

        int expected = 17;
        int actual = store.getSumPlayedTime();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void AddPlayerIfPlayOnlyOneHour() {
        GameStore store = new GameStore();
        store.addPlayTime("Кузя", 1);
        String expected = "Кузя";
        String actual = store.getMostPlayer();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void SumPlayTime() {
        GameStore store = new GameStore();
        store.addPlayTime("Кузя", 5);
        store.addPlayTime("Вася", 10);


    }
}
