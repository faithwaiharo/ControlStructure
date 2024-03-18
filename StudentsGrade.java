import java.util.Scanner;
public class StudentsGrade{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter your marks ");
int averagescore = scanner.nextInt();
if(averagescore<25){
	System.out.println("Fail");
} else if (averagescore>=25&&averagescore<45){
	System.out.println("Below Average");

} else if(averagescore>=45&&averagescore<50){
	System.out.println("Average ");

} else if(averagescore>=50&&averagescore<60){
	System.out.println("Fair work");

} else if(averagescore>=60&&averagescore<80){
	System.out.println("Good Work");

} else if(averagescore>=80&&averagescore<100){
	System.out.println("Excellent Work");

}else {
	System.out.println("Not correct marks");
}
}
}

