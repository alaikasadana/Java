class Fabi {
    public static void main(String ar[]){
         int fn = 0 ;
         int sn = 1;
         
         System.out.println(fn);
         System.out.println(sn);
         

         for(int i = 2 ; i <  8; i++){
            int temp = fn+sn;
             System.out.println(temp);

             fn=sn;
             sn=temp;
             



         }
    }
}