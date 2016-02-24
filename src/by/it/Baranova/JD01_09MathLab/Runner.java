package by.it.Baranova.JD01_09MathLab;


import by.it.Baranova.JD01_09MathLab.vars.VarFloatImpl;
import by.it.Baranova.JD01_09MathLab.vars.VarImpl;
import by.it.Baranova.JD01_09MathLab.vars.VarMatrixImpl;
import by.it.Baranova.JD01_09MathLab.vars.VarVectorImpl;

/**
 * Created by Ekaterina on 2/22/16.
 */
public class Runner {
    private static void one(VarImpl v){
        if (v!=null) System.out.println(v);
    }
    public static void main(String[] args) {
        System.out.println("\nпроверка операций со скалярами");
        one(new VarFloatImpl("1").add(new VarFloatImpl("2")));
        one(new VarFloatImpl("9").sub(new VarFloatImpl("7")));
        one(new VarFloatImpl("1.5").mul(new VarFloatImpl("2")));
        one(new VarFloatImpl("-4").div(new VarFloatImpl("-1")));

        String vec="{1,2,3}";
        System.out.println("\nпроверка операций с векторами справа и скалярами слева");
        one(new VarVectorImpl(vec).add(new VarFloatImpl("2")));
        one(new VarVectorImpl(vec).sub(new VarFloatImpl("1")));
        one(new VarVectorImpl(vec).mul(new VarFloatImpl("2")));
        one(new VarVectorImpl(vec).div(new VarFloatImpl("1")));

        System.out.println("\nпроверка операций со скалярами справа и векторами слева");
        one(new VarFloatImpl("1").add(new VarVectorImpl(vec)));
        one(new VarFloatImpl("2").sub(new VarVectorImpl(vec)));
        one(new VarFloatImpl("1").mul(new VarVectorImpl(vec)));
        one(new VarFloatImpl("2").div(new VarVectorImpl(vec)));

        System.out.println("\nпроверка операций с двумя векторами");
        one(new VarVectorImpl(vec).add(new VarVectorImpl(vec)));
        one(new VarVectorImpl(vec).sub(new VarVectorImpl(vec)));
        one(new VarVectorImpl(vec).mul(new VarVectorImpl(vec)));
        one(new VarVectorImpl(vec).div(new VarVectorImpl(vec)));

        String mat="{1,2,1}{2,1,3}{1,1,1}";
        System.out.println("\nпроверка операций с матрицей и вектором");
        one(new VarMatrixImpl(mat).add(new VarVectorImpl(vec)));
        one(new VarMatrixImpl(mat).sub(new VarVectorImpl(vec)));
        one(new VarMatrixImpl(mat).mul(new VarVectorImpl(vec)));
        one(new VarMatrixImpl(mat).div(new VarVectorImpl(vec)));

        System.out.println("\nпроверка операций с матрицей и матрицей");
        one(new VarMatrixImpl(mat).add(new VarMatrixImpl(mat)));
        one(new VarMatrixImpl(mat).sub(new VarMatrixImpl(mat)));
        one(new VarMatrixImpl(mat).mul(new VarMatrixImpl(mat)));
        one(new VarMatrixImpl(mat).div(new VarMatrixImpl(mat)));


    }
}
