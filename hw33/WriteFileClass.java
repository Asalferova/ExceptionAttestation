package hw33;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

/**
 * WriteFileClass - класс, реализующий интерфейс WriteFile. Он используется для
 * записи данных пользователя в файл. Класс содержит метод writeFile, который принимает
 * объект DataClass. Пользователю предлагается ввести имя файла, в который будут записаны данные.
 * Затем создаётся объект FileWriter для указанного файла и записываются данные в форматированном
 * виде. После записи данных файл закрывается. В случае возникновения ошибок ввода-вывода
 * выбрасывается исключение IOException. После успешной записи данных выводится сообщение об
 * успешной операции.
 */
public class WriteFileClass implements WriteFile {

  @Override
  public void writeFile(DataClass data) throws IOException {
    
    FileWriter writer = new FileWriter(data.getLastName(), true);
    String userDataString = String.join(" ",
        data.getLastName(),
        data.getFirstName(),
        data.getMiddleName(),
        data.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
        String.valueOf(data.getPhoneNumber()),
        data.getGender().toString());
    writer.write(userDataString + "\n");
    writer.close();
    System.out.println("Данные успешно записаны в файл");
  }
}
