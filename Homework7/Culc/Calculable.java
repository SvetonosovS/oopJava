package Homework7.Culc;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    Calculable devide(int arg);
    int getResult();
}