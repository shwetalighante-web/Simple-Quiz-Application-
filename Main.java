import java.util.ArrayList;
import java.util.Scanner;

class Question {
    String question;
    String[] options;
    int correctAnswer;

    Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    void displayQuestion() {
        System.out.println("\n" + question);

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "Which language is used for Android development?",
            new String[]{"Java", "HTML", "SQL", "C"},
            1
        ));

        questions.add(new Question(
            "Which keyword is used to create a class in Java?",
            new String[]{"function", "class", "define", "struct"},
            2
        ));

        questions.add(new Question(
            "Which collection allows duplicate elements?",
            new String[]{"ArrayList", "HashSet", "TreeSet", "None"},
            1
        ));

        questions.add(new Question(
            "Which method is the starting point of a Java program?",
            new String[]{"start()", "run()", "main()", "execute()"},
            3
        ));

        questions.add(new Question(
            "Which symbol is used to end a Java statement?",
            new String[]{".", ",", ";", ":"},
            3
        ));

        int score = 0;

        System.out.println("======================================");
        System.out.println("         SIMPLE QUIZ APPLICATION");
        System.out.println("======================================");

        for (int i = 0; i < questions.size(); i++) {

            System.out.println("\nQuestion " + (i + 1) + " of " + questions.size());

            questions.get(i).displayQuestion();

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer == questions.get(i).correctAnswer) {
                System.out.println("Correct answer!");
                score++;
            } else {
                System.out.println("Wrong answer!");
            }
        }

        System.out.println("\n======================================");
        System.out.println("              QUIZ RESULT");
        System.out.println("======================================");
        System.out.println("Total Questions : " + questions.size());
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + (questions.size() - score));
        System.out.println("Final Score     : " + score + "/" + questions.size());
        System.out.println("======================================");

        sc.close();
    }
}