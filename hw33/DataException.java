package hw33;

/**
 * DataException - пользовательское исключение, которое наследуется от класса Exception. Оно используется для обработки ошибок, связанных с данными пользователя. Параметр message, который
 * является сообщением об ошибке. С помощью ключевого слова `super` вызывается конструктор базового
 * класса Exception для инициализации сообщения об ошибке.
 */
public class DataException extends Exception {

    public DataException(String message) {
      super(message);
    }
  }
