public class Shuttles {
    public static void main (String[] args){

            int count = 0;
            for (int shuttles = 1; shuttles <= 100; shuttles++){
                String shuttlesCount = Integer.toString(shuttles);
                if (shuttlesCount.contains("4")|| shuttlesCount.contains("9")){
                    continue;
                }
                System.out.println(shuttlesCount);
            }
        }
    }
