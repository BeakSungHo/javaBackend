package j2023_05_30.input;

public class j_짝수홀수_갯수 {
    public static void main(String[] args) {
        int [] num_list={1,2,3,4,5};
        int[] answer=new int [2];
        for(int i = 0; i<num_list.length;i++)
        {
         if(num_list[i]%2==0)
             answer[0]+=1;
         else
             answer[1]+=1;
        }


    }
}
