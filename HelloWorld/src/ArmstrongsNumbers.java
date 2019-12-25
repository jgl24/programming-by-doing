public class ArmstrongsNumbers {
    public static void main(String[] args){
        for(int x = 0; x < 9; x++){
            for(int y = 0; y < 9; y++){
                for(int z = 0; z < 9; z++){
                    String concactNum = x + "" + y + "" + z;
                    int num = Integer.parseInt(concactNum);

                    double xCube = Math.pow(x, 3);
                    double yCube = Math.pow(y, 3);
                    double zCube = Math.pow(z, 3);
                    if(xCube + yCube + zCube == num && num > 99){
                        System.out.println(num);
                    }
                }
            }
        }
    }
}
