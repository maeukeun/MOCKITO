
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestFilmManager {

    FilmManager manager = new FilmManager();

    //  Добавление фильмов
    @BeforeEach
    public void setup() {
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");
        manager.addFilm("Film 11");
        manager.addFilm("Film 12");
        manager.addFilm("Film 13");
        manager.addFilm("Film 14");
        manager.addFilm("Film 15");
        manager.addFilm("Film 16");
        manager.addFilm("Film 17");
        manager.addFilm("Film 18");


    }

    //  Показать все фильмы
    @Test
    public void findAll() {


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10", "Film 11", "Film 12", "Film 13", "Film 14", "Film 15", "Film 16", "Film 17", "Film 18"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    //  Показать последние 5 фильмов
    @Test
    public void findLast() {


        String[] expected = {"Film 18", "Film 17", "Film 16", "Film 15", "Film 14"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    //  Показать последние 10 фильмов (с параметром 10)
    @Test
    public void findLastWithParam() {
        FilmManager manager = new FilmManager(10);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");
        manager.addFilm("Film 11");
        manager.addFilm("Film 12");
        manager.addFilm("Film 13");
        manager.addFilm("Film 14");
        manager.addFilm("Film 15");
        manager.addFilm("Film 16");
        manager.addFilm("Film 17");
        manager.addFilm("Film 18");

        String[] expected = {"Film 18", "Film 17", "Film 16", "Film 15", "Film 14", "Film 13", "Film 12", "Film 11", "Film 10", "Film 9"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    //  Показать последние фильмы, если их меньше лимита (3 фильма)
    @Test
    public void findLast1() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");


        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
