public class Frequencyarr {
    public static void main(String[] args) {
        int[] visit = {1, 3, 2, 4, 2, 3, 2, 1, 4};

        int count_of_1 = 0;
        int count_of_2 = 0;
        int count_of_3 = 0;
        int count_of_4 = 0;
        for (int i=0;i<visit.length; i++) {
            if(visit[i]==1){
                count_of_1++;
            }else if(visit[i]==2){
                count_of_2++;
            }else if(visit[i]==3){
                count_of_3++;
            }else if(visit[i]==4){
                count_of_4++;
            }
        }
        System.out.println("count of no 1 : " +count_of_1);
        System.out.println("count of no 2 : " +count_of_2);
        System.out.println("count of no 3 : " +count_of_3);
        System.out.println("count of no 4 : " +count_of_4);
    }    
}
