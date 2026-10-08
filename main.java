import file2.failure;
public class Main {
    public static void main(String[] args) {
        //Вызов функции и объявление переменных
        failure funkcia = new failure();
        int valli = 6;
        int[] masiv = {45, 6, 23, 6, 5, 6, 6, 6, 11, 27};
        //Запускаем функцию и выводим ответ
        int otvet = funkcia.removeElementInplace(masiv, valli);
        System.out.println(otvet);
    }
}
