package MethodBuildingBlocks;

public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        // your code
        int arrLength = studentIdList.length;
        double[] gpaArr = new double[arrLength];

        for (int i = 0; i < studentsGrades.length; i++) {
            double computeGPA = 0;
            for (int j = 0; j < studentsGrades[i].length; j++) {

                switch (studentsGrades[i][j]) {
                    case 'A':
                        computeGPA += 4.0;
                        break;
                    case 'B':
                        computeGPA += 3.0;
                        break;
                    case 'C':
                        computeGPA += 2.0;
                        break;
                    default:
                        break;
                }
            }

            gpaArr[i] = computeGPA / studentsGrades[i].length;
        }
        return gpaArr;
    }

    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        int finalArrLength = studentIdList.length;
        int[] temp = new int[finalArrLength];
        int count = 0;
        // perform parameter validation. Return null if passed parameters are not valid
        if ((lower / 1) < 0 || (higher / 1) < 0 || (lower > higher))
            return null;
        // invoke calculateGPA
        double[] returnedArr = calculateGPA(studentIdList, studentsGrades);

        // construct the result array and return it. You would need an extra for loop to
        // compute the size of the resulting array
        for (int i = 0; i < returnedArr.length; i++) {
            if (lower <= returnedArr[i] && returnedArr[i] <= higher) {
                temp[i] = studentIdList[i];
                count++;
            }
        }
        // Reassign final array with non-zero values
        int[] finalArr = new int[count];
        for (int x = 0, j = 0; x < temp.length; x++) {
            if (temp[x] != 0) {
                finalArr[j] = temp[x];
                j++;
            }

        }

        return finalArr;
    }

    public static void main(String[] args) {

        int[] sList = { 1001, 1002, 1003, 1004 };
        char[][] sGrades = { { 'A', 'A', 'A', 'B' }, { 'A', 'A', 'B' }, { 'B', 'C', 'A', 'A' },
                { 'A', 'A', 'A', 'A' } };

        double[] endArr = calculateGPA(sList, sGrades);

        /*
         * for (int i = 0; i < endArr.length; i++) { System.out.println(endArr[i]); }
         */

        int[] finalArr = getStudentsByGPA(3.4, 4.2, sList, sGrades);

        for (int i = 0; i < finalArr.length; i++) {
            System.out.println(finalArr[i]);
        }
    }

}