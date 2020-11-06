package opros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class opros {

    public static void main(String[] args) throws IOException {

        File file = new File("opros.txt");
        if (!file.exists()){
            file.createNewFile();
        }

        FileWriter writer = new FileWriter(file,true);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Контактные данные(Ф.И.О.)");
        String answer_1 = scanner.nextLine();

        System.out.println("Номер телефона");
        String answer_2 = scanner.nextLine();

        System.out.println("Почтовый ящик(e-mail)");
        String answer_3 = scanner.nextLine();

        System.out.println("Город проживания");
        String answer_4 = scanner.nextLine();

        System.out.println("Дата рождения(дд.мм.гггг)");
        String answer_5 = scanner.nextLine();

        System.out.println("Пол(Мужской/Женский)");
        String answer_6 = scanner.nextLine();

        System.out.println("Гражданство");
        String answer_7 = scanner.nextLine();

        System.out.println("Опыт работы(Есть опыт работы/Нет опыта работы)");
        String answer_8 = scanner.nextLine();

        writer.write("Ф.И.О: " + answer_1);
        writer.append("\n");
        writer.write("Номер телефона: " + answer_2);
        writer.append("\n");
        writer.write("Электронная почта: " + answer_3);
        writer.append("\n");
        writer.write("Город проживания: " + answer_4);
        writer.append("\n");
        writer.write("Дата рождения: " + answer_5);
        writer.append("\n");
        writer.write("Пол: " + answer_6);
        writer.append("\n");
        writer.write("Гражданство: " + answer_7);
        writer.append("\n");
        writer.write("Опыт работы: " + answer_8);
        writer.append("\n");
        writer.append("\n");
        writer.close();

    }
}
