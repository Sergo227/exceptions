// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Number4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите что-нибудь, кроме пустой строки и null: ");
        try {
            String s = reader.readLine();
            if (s == null || "".equals(s)) {
                throw new Exception("Неверный ввод"); 
                } 
            else {
            System.out.println("Вы ввели: "+ s);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
}

