import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int[]array=new int[10];
        int index=0;
        int sum=0;
        int countre=0;
        while (index<10){
            int number=random.nextInt(20);
            countre++;
            array[index]=number;
            sum+=array[index];
            System.out.print(" "+array[index]);
            index++;
        }
        System.out.println("\n"+sum+"\n"+sum/(double)countre);
    }
    }