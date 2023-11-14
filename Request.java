// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Request {
    public static void main(String[] args) {

        boolean as = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (as){
            System.out.println("Введите дробное число:");
            try{
        float Number = Float.parseFloat(reader.readLine());
        System.out.printf("Введенное число %f\n", Number);
        as = false;
    } catch (IOException | NumberFormatException e){
    System.out.println("Введите ИМЕННО ДРОБНОЕ число:");
}
}
}
}
