package Zad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    /* Stwórz Quiz, w którym użytkownik jest poproszony o podawanie listy sąsiadów Polski. Odliczanie czasu powinno
    pokazywać się w oddzielnym wątku.*/

    private static boolean check(Set<String>answers){
        return answers.contains("Slowacja")&& answers.contains("Czechy")&& answers.contains("Niemcy");
    }

    public static void main(String[] args) {
       Timer timer = new Timer();
       Thread ttimer = new Thread(timer);
       ttimer.start();

        Set<String>answers = new HashSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String answer = "";
            try{
                answer = br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
            answers.add(answer);
            if(check(answers)){
                System.out.println("Brawo Ty");
                System.exit(0);

            }

        }
    }
}
