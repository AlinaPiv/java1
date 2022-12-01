package lesson5;

public class HomeWork5 {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван", "Инженер", "ivivan@mailbox.com", "123456789", 30000, 30);
        persArray[1] = new Person("Петров Сергей", "Монтажник", "spetrov@mailbox.com", "7777777777", 39000, 51);
        persArray[2] = new Person("Сидоров Анатолий", "Специалист поддержки", "tolyasidorov@mailbox.com", "123456789", 20000, 25);
        persArray[3] = new Person("Грачев Александр", "Руководитель проекта", "grachevalexander@mailbox.com", "123456789", 45000, 55);
        persArray[4] = new Person("Попов Алексей", "Специалист по закупкам", "alexpop@mailbox.com", "76538086421", 35000, 42);


        persArray[0].printInfo();
        System.out.println();


        System.out.println("Сотрудники, старше 40 лет:\n ");
         for (int i=0; i < persArray.length; i++)
               if (persArray[i].getAge() > 40) {
           persArray[i].printInfo();
                   System.out.println();
            }




        }
    }


