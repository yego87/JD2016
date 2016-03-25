package by.it.zhuravlyov.JD01_10Matlab;

/**
 * Created by home borovai on 17.03.2016.
 */
public class variable implements Ivariable {
    public Double value;
    //пустой конструктор
    public variable(){

    }
    //конструктор по строке
    public variable(String string){
        this.value= Double.valueOf(string);
    }
    //конструктор по значению
    public variable(Double value){
        this.value=value;
    }

    @Override
    public variable add(variable varAdd) {
        variable out=new variable();
        out.value=this.value+varAdd.value;
        return out;
    }

    @Override
    public variable sub(variable varSub) {
        variable out=new variable();
        out.value=this.value-varSub.value;
        return out;
    }

    @Override
    public variable mul(variable varMul) {
        variable out=new variable();
        out.value=this.value*varMul.value;
        return out;
    }

    @Override
    public variable div(variable varDiv) {
        variable out=new variable();
        out.value=this.value/varDiv.value;
        return out;
    }
    //метод вывода значений
    public String toString(){
        return value.toString();
    }
}
