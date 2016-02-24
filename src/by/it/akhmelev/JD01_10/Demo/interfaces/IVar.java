package by.it.akhmelev.JD01_10.Demo.interfaces;




public interface IVar extends IAdd,IDiv,IMul,ISub{
    String toString();            //метод вывода переменной в строку
    void setFrom(String str);     //метод чтения значения переменной из строки
}

