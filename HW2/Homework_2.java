package Java2.HW2;

public class Homework_2 {

    private String [][] changeArToString (String inputString) throws ArrayIndexOutOfBoundsException{
        String[] ar = inputString.split("\n");
        String [][] outputArray = new String[4][4];
        for (int i = 0; i < ar.length; i++){
            String [] oneDimArr = ar[i].split(" ");
            for (int j = 0; j < oneDimArr.length; j++){
                outputArray[i][j] = oneDimArr[j];
            }
        }
        return outputArray;
    }

    private int arraySumDivHalf (String[][] inputArr) throws NumberFormatException {
        int sum = 0;
            for (int i = 0; i < inputArr.length; i++){
                for (int j = 0; j < inputArr[i].length; j++){
                    sum += Integer.parseInt(inputArr[i][j]);
                }
            }
        return sum/2;
    }

    public static void main(String[] args) {
        String s = "10 3 1 7\n2 3 2 2\n5 6 7 1\n300 3 1 0";

        Homework_2 hw = new Homework_2();
        String[][] str = new String [4][4];

        try {
            str = hw.changeArToString(s);
            hw.arraySumDivHalf(str);
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < str.length; i++){
            for (int j = 0; j < str[i].length; j++){
                System.out.print(str[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(hw.arraySumDivHalf(str));
    }
}
