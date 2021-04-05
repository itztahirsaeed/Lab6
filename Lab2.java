package lab6;

public class Lab2 {
	 private static int objs=0;
	 private int a;
	 public Lab2(){
	 objs++;
	 }
	 public Lab2(int x){
	 a=x;
	 objs++;
	 }
	 public static int getObjs (){
	 return objs;
	 }
}
