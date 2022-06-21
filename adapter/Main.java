package com.company;

public class Main {

    public static void main(String[] args)
    {
        IPotato potatoes = new FriedPotatoes();
        Context old = new Context(potatoes);
        old.Process();
        IMashPotato mash= new Mash();
        Adapter adapeter = new Adapter(mash);
        Context old2 = new Context(adapeter);
        old2.Process();
    }
}


//interface ITarget {
    //void Request();
//}

//Класс, метод которого нужно адаптировать к другой системе.
//В данном случае адаптируется имя метода SpecificRequest() в метод Request()
//class Adaptee {
    // Некоторый специфический метод
   // void SpecificRequest() {
     //   System.out.println("Adaptee.SpecificRequest()");
    //}
//}

// Класс Adapter - реализует интерфейс ITarget и наследует класс Adaptee
//class Adapter extends Adaptee implements ITarget {
    // Реализация метода Request() интерфейса ITarget
  //  public void Request() {
        // В теле метода вызывается метод SpecificRequest() класса Adaptee()
   //  SpecificRequest();
   // }
//}

// Класс Client - получает ссылку на интерфейс ITarget
//class Client {
    // некоторый метод класса Client
  //  void ClientMethod(ITarget target) {
   //     target.Request();
   // }
//}

//public class TestAdapter {
   // public static void main(String[] args) {
        // Демонстрация паттерна Adapter для класса.
        // Задача.
        // Нужно адаптировать метод SpecificRequest() класса Adaptee к потребностям экземпляра класса Client.
        // 1. Пусть задан некоторый экземпляр класса Client
      //  Client client = new Client();

        // 2. Создать экземпляр класса Adapter, который ссылается на интерфейс ITarget
      //  ITarget target = (ITarget) new Adapter();

        // 3. Передать ссылку target клиентскому методу
       // client.ClientMethod(target);
    //}
//}