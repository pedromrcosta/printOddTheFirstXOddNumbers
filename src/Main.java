public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.printXoddNumbers(7);
    }

    private void printXoddNumbers(int howManyOddNumbers) {

        int numberCounter = 0;
        int totalOddNumbers = 0;
        StringBuilder numberBuilder = new StringBuilder();

        while (totalOddNumbers < howManyOddNumbers) {
            if (!(numberCounter % 2 == 0)) {
                totalOddNumbers++;
                numberBuilder.append(numberCounter);
                numberBuilder.append(" ");
                System.out.println(numberBuilder);
            }
            numberCounter++;
        }

    }
}