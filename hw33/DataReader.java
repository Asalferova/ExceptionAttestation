package hw33;

/**
 * DataReader - интерфейс. Метод readUserData() - для считывания пользовательских данных. Метод может выбрасывать исключение
 * DataException, которое представляет ошибку, связанную с данными пользователя.
 */

public interface DataReader {

    DataClass readUserData() throws DataException;
  }
