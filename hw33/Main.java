package hw33;

import java.io.IOException;
import java.util.Scanner;

/**
 * Класс Main является точкой входа в программу, где создаются экземпляры классов для чтения
 * пользовательского ввода и записи данных, а затем вызываются соответствующие методы для обработки
 * пользовательских данных и записи их в файл.
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    DataReader dataReader = new DataReaderClass(scanner);
    WriteFile writeFile = new WriteFileClass();

    try {
      DataClass data = dataReader.readUserData();
      writeFile.writeFile(data);
    } catch (DataException | IOException e) {
      System.out.println("Ошибка: " + e.getMessage());
    }
  }
}
