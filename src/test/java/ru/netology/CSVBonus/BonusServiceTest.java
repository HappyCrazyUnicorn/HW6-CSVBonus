package ru.netology.CSVBonus;

import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.ParameterizedTest;
import ru.netology.CSVBonus.BonusService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
        //какая классная штука, спасибо за задание и возможность с ней познакомиться)))
    void shouldTestBonus(String text, long amount, boolean registered, long expected) { //описываем переменные, которые получает функция. Все лежит в csv
        BonusService service = new BonusService();
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }
}