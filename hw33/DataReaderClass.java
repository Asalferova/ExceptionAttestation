package hw33;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * DataReaderClass - класс, реализующий интерфейс DataReader. Класс содержит метод readUserData(),
 * который предлагает пользователю ввести данные в определенном порядке, разделяя их пробелом. Затем
 * метод разбивает введенные данные на составляющие и выполняет их парсинг. Если формат данных
 * неверный, выбрасывается исключение ParseException. Если введено неверное количество данных,
 * выбрасывается DataException. Если все данные корректны, создается и возвращается объект
 * DataClass.
 */

public class DataReaderClass implements DataReader {
  private Scanner scanner;

  public DataReaderClass(Scanner scanner) {
    this.scanner = scanner;
  }

  @Override
  public DataClass readUserData() throws DataException {
    while (true) {
      System.out.println("Введите данные в следующем порядке, разделяя их пробелом: Фамилия Имя Отчество Дата рождения (dd.mm.yyyy) Номер телефона Пол (f или m)");

      try {
        String input = scanner.nextLine();
        String[] data = input.split(" ");

        if (data.length != 6) {
          throw new DataException("Введено неверное количество данных");
        }

        LocalDate dateOfBirth = parseDateOfBirth(data[3]);
        long phoneNumber = parsePhoneNumber(data[4]);
        String gender = parseGender(data[5]);

        return new DataClass(data[0], data[1], data[2], dateOfBirth, phoneNumber, gender);
      } catch (ParseException | NumberFormatException e) {
        System.out.println("Ошибка: " + e.getMessage());
      }
    }
  }

  private LocalDate parseDateOfBirth(String dateOfBirthString) throws ParseException {
    try {
      return LocalDate.parse(dateOfBirthString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    } catch (Exception e) {
      throw new ParseException("Неверный формат даты рождения");
    }
  }

  private long parsePhoneNumber(String phoneNumberString) throws ParseException {
    try {
      return Long.parseLong(phoneNumberString);
    } catch (NumberFormatException e) {
      throw new ParseException("Неверный формат номера телефона");
    }
  }

  private String parseGender(String gender) throws ParseException {
    if (gender.equalsIgnoreCase("m")  | gender.equalsIgnoreCase("f")) {
      return gender;
    } else {
      throw new ParseException("Неверный формат пола");
    }
  }
}