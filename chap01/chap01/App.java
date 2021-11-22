package chap01;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int scores[] = null;
        boolean run = true;
        int studentNum=0;
        while (run){
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
            System.out.println("-------------------------------------------------------------");
            System.out.print("선택 > ");
            int selectNum = Integer.parseInt(scanner.nextLine());
            if (selectNum == 1){
                System.out.print("학생수 > ");
                studentNum = Integer.parseInt(scanner.nextLine());
            }
            else if (selectNum == 2) {
                scores = new int[studentNum]; 
                for (int i=0; i<studentNum;i++){
                    System.out.printf("scores[%s]>",i);
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
            }
            else if (selectNum == 3) {
                for (int i=0; i<studentNum;i++){
                    System.out.printf("scores[%1$d]> %2$d\n",i,scores[i]);
                }
            }
            else if (selectNum == 4) {
                int sum = 0;
                int max = 0;
                for (int score:scores) {
                    sum += score;
                    if (max < score){
                        max = score;
                    }
                }
                double avg = (double)sum / scores.length;
                System.out.println("최고 점수: "+max);
                System.out.println("평균 점수: "+avg);
            }
            else {
                System.out.println("프로그램 종료");
                run = false;
            }
        }


        scanner.close();
    }
}
