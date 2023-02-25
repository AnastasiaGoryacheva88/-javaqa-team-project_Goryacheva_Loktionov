package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class GameStoreTest {

    @Test
    public void shouldAddGame() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }

    // другие ваши тесты
    @Test
    public void shouldSumPlayedTime(){
        GameStore store = new GameStore();
        Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        store.addPlayTime("Игрок 1",7);
        int expected =7;
        int actual = store.getSumPlayedTime();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void SumPlayTime(){
        GameStore store = new GameStore();
        store.addPlayTime("Кузя",1);
        String expected = "Кузя";
        String actual = store.getMostPlayer() ;
        Assertions.assertEquals(expected,actual);
    }
}
