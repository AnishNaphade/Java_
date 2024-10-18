class Solution {
    public boolean isPalindrome(int x) {

if(x<0){
    return false;
}



        int revnum = 0;
int lastdigit = 0;
int dupli = x;

        while(x != 0){
            lastdigit = x % 10;
            x = x/10;
            revnum = revnum*10 + lastdigit;
        }

        return dupli== revnum ;
        
    }
}