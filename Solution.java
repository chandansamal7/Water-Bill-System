class Solution {

    static int waterBill(int w){

        // i am just initialising ans1, ans2, ans3 as 0 and i have declaired one variable temp
        int ans1 = 0,ans2 = 0,ans3 = 0, temp1  ;

        for(int i = 1; i <= w ;i++){

            if (i <= 100) {

                ans1 = i * 15;

            }else if(w <= 200){

                temp1 = w - 100;

                for(int j = 1; j <= temp1;j++){
                    ans2 = j *14;
                }
            }else{
                temp1 = w - 200;

                for(int k = 1; k <= temp1;k++){
                    ans3 = k * 12;
                }
            }
        }
        return  ans1 + ans2 + ans3 ;
    }
}
