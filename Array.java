class Array {
    public static void main(String args[]){

int []arr=new int[5] ;

int []arr1=new int[] {1,2,3,4,5};

int size = arr1.length/2;
System.out.println("mid value =" + arr1[size]);
for(int i=0 ; i<arr1.length; i++){
    if(i==arr1.length/2){
        System.out.println("mid value =" + arr1[i]);
    }
}

    }}