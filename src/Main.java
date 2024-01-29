import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите одну строку текста с дубликатами слов");
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        String line = scanner.nextLine(); // будет сравнивать все, что ввели до энтер
        String[] words = line.split(" "); // пробел разобьет стринг на массив стрингов
        Set<String> dupicates = new HashSet<>(); // cет содержит уже существующие слова
        for (int i = 0; i < words.length; i++) { // пробегает по всем словам
            if(dupicates.contains(words[i])){ // если слово уже находится в дубликатах, то переходим к следующему
                continue;
            }
            for (int ii = i + 1; ii < words.length; ii++) { // пробегаем по всем словам, начиная с текущего до конца
                if(words[i].equals(words[ii])){ // сравнение слов
                    dupicates.add(words[i]); // сохранение слов в дубликатах
                    System.out.print("пицца "); // вместо первого дубликата печатаем пицца
                    break;
                }
            }
            if(dupicates.contains(words[i])){ // если слово уже в дубликатах, мы его не печатаем
                continue;
            }
            System.out.print(words[i]+" "); // если слово не в дубликатах, то печатаем его
        }

    }
}
