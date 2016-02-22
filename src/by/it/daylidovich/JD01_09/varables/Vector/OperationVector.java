package by.it.daylidovich.JD01_09.varables.Vector;

import by.it.daylidovich.JD01_09.varables.Float.VarableFloat;
import by.it.daylidovich.JD01_09.varables.Varable;

public class OperationVector extends Varable {
    @Override
    public Varable add(Varable varable) {
        if (varable instanceof VarableFloat){
            VarableVector firstTerm = new VarableVector(((VarableVector)this).getVector());
            double secondTerm = ((VarableFloat)varable).getValue();
            for (int i = 0; i < firstTerm.getVector().length; i++) {
                firstTerm.getVector()[i] += secondTerm;
            }
            return firstTerm;
        }

        if (varable instanceof VarableVector){
            VarableVector firstTerm = new VarableVector(((VarableVector)this).getVector());
            VarableVector secondTerm = (VarableVector)varable;
            if (firstTerm.getVector().length == secondTerm.getVector().length){
                for (int i = 0; i < firstTerm.getVector().length; i++) {
                    firstTerm.getVector()[i] += secondTerm.getVector()[i];
                }
                return firstTerm;
            }
        }
        return super.add(varable);
    }

    @Override
    public Varable sub(Varable varable) {
        if (varable instanceof VarableFloat){
            VarableVector firstTerm = new VarableVector(((VarableVector)this).getVector());
            double secondTerm = ((VarableFloat)varable).getValue();
            for (int i = 0; i < firstTerm.getVector().length; i++) {
                firstTerm.getVector()[i] -= secondTerm;
            }
            return firstTerm;
        }

        if (varable instanceof VarableVector){
            VarableVector firstTerm = new VarableVector(((VarableVector)this).getVector());
            VarableVector secondTerm = (VarableVector)varable;
            if (firstTerm.getVector().length == secondTerm.getVector().length){
                for (int i = 0; i < firstTerm.getVector().length; i++) {
                    firstTerm.getVector()[i] -= secondTerm.getVector()[i];
                }
                return firstTerm;
            }
        }
        return super.sub(varable);
    }

    @Override
    public Varable mult(Varable varable) {
        if (varable instanceof VarableFloat){
            VarableVector firstTerm = new VarableVector(((VarableVector)this).getVector());
            double secondTerm = ((VarableFloat)varable).getValue();
            for (int i = 0; i < firstTerm.getVector().length; i++) {
                firstTerm.getVector()[i] *= secondTerm;
            }
            return firstTerm;
        }

        if (varable instanceof VarableVector){
            double sum = 0;
            VarableVector firstTerm = new VarableVector(((VarableVector)this).getVector());
            VarableVector secondTerm = (VarableVector)varable;
            if (firstTerm.getVector().length == secondTerm.getVector().length){
                for (int i = 0; i < firstTerm.getVector().length; i++) {
                    sum += firstTerm.getVector()[i] * secondTerm.getVector()[i];
                }
                return new VarableFloat(sum);
            }
        }
        return super.mult(varable);
    }

    @Override
    public Varable div(Varable varable) {
        if (varable instanceof VarableFloat){
            VarableVector firstTerm = new VarableVector(((VarableVector)this).getVector());
            double secondTerm = ((VarableFloat)varable).getValue();
            for (int i = 0; i < firstTerm.getVector().length; i++) {
                firstTerm.getVector()[i] /= secondTerm;
            }
            return firstTerm;
        }

        return super.div(varable);
    }
}
