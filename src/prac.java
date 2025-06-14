

 class prac extends Exception{
    public  prac(String message){
        super(message);
    }
   }

    class Test {
       public static void main(String[] args) {
           try{
               throw new prac("Anu's exception");

           }catch(prac e){
               System.out.println("Anu's exception caught");
              System.out.println("exception is "+e.getMessage());
           }
       }
   }