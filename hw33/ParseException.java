package hw33;

/**
 * ParseException - пользовательское исключение, которое наследуется от класса Exception. Оно
 * используется для обработки ошибок, связанных с парсингом данных пользователя. Конструктор класса
 * принимает сообщение об ошибке и передает его в конструктор базового класса Exception с помощью
 * ключевого слова super.
 */

public class ParseException extends DataException {

    public ParseException(String message) {
      super(message);
    }
  
  }
