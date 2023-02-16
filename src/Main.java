public class Main {
    public static void main(String[] args) {
        task12();
        task3();
        task4();
        task5();
    }

    public static void task12() {
        int clientOS = 0;
        int clientDeviceYear = 2014;
        boolean clientOsOld = clientOS <= 0 && clientDeviceYear <= 2015;
        boolean clientOsOld1 = clientOS >= 1 && clientDeviceYear <= 2015;
        boolean clientOsgood = clientOS <= 0 && clientDeviceYear > 2015;
        boolean clientOsgood1 = clientOS <= 1 && clientDeviceYear > 2015;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        if (clientOsOld)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        if (clientOsOld1)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        if (clientOsgood)
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        else if (clientOsgood1)
            System.out.println("Установите обычную версию приложения для Android по ссылке");

    }

    public static void task3() {
        int year = 2022;
        if (year % 4 == 0) {
            System.out.println(year + " Не весокосный год");
       }else if (year%100==0&&year%400!=0) {
            System.out.println(year + " Не весокосный год");
        }else if (year%4==0||year%400==0) {
            System.out.println(year + " Весокосный год");
       }

    }
    public static void task4() {
        int deliveryDistance = 69;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка 1 сутки "+deliveryDistance+" Км");
        } else if (deliveryDistance <= 20 || deliveryDistance <= 60) {
            System.out.println("Доставка 2е суток "+deliveryDistance+" Км");
        } else if (deliveryDistance <= 60 || deliveryDistance <= 100) {
            System.out.println("Доставка 3е суток "+deliveryDistance+" Км");
        } else if (deliveryDistance>100) {
            System.out.println("Доставки нет так как она превышает  "+deliveryDistance+" Км");

        }
    }
    public static void task5(){
        int monthNumber = 3;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

}









