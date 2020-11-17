# CA_2_Time-Task
# Project in group
# HomeWork 3 task 1
# We had a zoom call today. We have decided that we gonna take ex1 from HM3(OOP). Every person can use instead of "B" the first later of your name. Out print - you are welcome to (your name) club.
# Mila
# Charles Jahn
# Thiago Santos


static void MilasMethod(){

    System.out.println("This is Mila's method");
    
    BufferedReader myKB = new BufferedReader (new InputStreamReader(System.in));
    String UserName = "";
    System.out.println("Please, enter your name");

    try{
    UserName = myKB.readLine();
     }
    
     catch (IOException e){
     System.out.println ("C");
     }
    
     char result = UserName.charAt(0);
     if (result == 'm'|| result == 'M'){
     System.out.println("Join Mila's club");
     }
     else {
     System.out.println("No entry =(");
     } 
     }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println ("The method is works");
    MilasMethod();
     
    }

