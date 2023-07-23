package hw33;

import java.io.IOException;

/**
 * WriteFile - интерфейс, для записи данных пользователя. Он содержит
 * метод writeFile(), который должен быть реализован в конкретных классах. Метод может
 * выбрасывать исключение IOException в случае ошибок ввода-вывода.
 */
public interface WriteFile {

  void writeFile(DataClass data) throws IOException;

}
