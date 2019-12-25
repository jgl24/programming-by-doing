public class Tab {
    public static void main(String[] args) {
        char[] directions = {'U', 'D', 'L', 'R', 'R','L', 'L'};
        int xPosition = 0;
        int yPosition = 0;

        for (int x = 0; x < directions.length; x++) {
            if (directions[x] == 'U') {
                yPosition++;
            }
            if (directions[x] == 'D') {
                yPosition--;
            }

            if (directions[x] == 'R') {
                xPosition++;
            }

            if (directions[x] == 'L') {
                xPosition--;
            }
        }

        if (xPosition == 0 && yPosition == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


// print out largest even number from an array