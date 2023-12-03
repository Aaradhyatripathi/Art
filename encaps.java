class encaps {
     private int rollno;
     public void setroll(int rollno1){
         rollno=rollno1;
     }
     public int getroll(){
         return rollno;
     }

    public static void main(String[] args) {
        encaps r=new encaps();
        r.rollno=101;
        System.out.println(r.getroll());
    }
}


