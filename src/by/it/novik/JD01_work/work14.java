package by.it.novik.JD01_work;

public class work14 {
    public static void main(String[] args) {

        int arr[][]=new int[5][5];
        int i,j;

        for (i=0;i<arr.length/2+1;i++){
            for (j=0;j<arr[i].length;j++){
                if ((j<i) || (j>=(arr[i].length-i)))
                    arr[i][j]=0;
                else
                    arr[i][j]=1;

            }

        }
        for (i=arr.length-1; i>=arr.length/2+1; i--){
            for (j=0; j<arr[i].length; j++){
                if ((j<(arr[i].length-1-i)) || (j>i))
                    arr[i][j]=0;
                else
                    arr[i][j]=1;}
        }
        for (i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }


}

