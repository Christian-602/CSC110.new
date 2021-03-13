public class Logics {
    public static void main(String [] args){
        var a = true;
        var b = false;
        var c = true;

        var name = "j";
        if(a && b || c){
            System.out.println("What happened");
            name = "X";
        } else {
            name = "Y";
            System.out.println("did not expect");
        }

        var temp = 10;
        //cold or hot or very hot, celsius
        switch(temp){
            case 10:
                System.out.println("this is cold.");
                break;
            case 20:
                System.out.println("this is warmer but not quite cold.");
                break;
            case 50:
                System.out.println("this is very hot.");
                break;
        }
        //test for range(), doesnt work lol
        temp_hot = range([40...100]);
        System.out.println(temp_hot);
        if(temp == temp_hot){
            System.out.println("The temperature outside is very hot.");
        }
        if(temp <= temp_hot){
            System.out.println("The temperature is not so bad...");
        }
        name = "Y";

        switch(name){
            case "Y":
                System.out.println(" I am Y");
                break;
            case "X":
                System.out.println(" I am X");
                break;
            case "j":
                System.out.println(" I am j");
                break;

            default:
                System.out.println("Well I do not know");

        }

        while (true){
            System.out.println("Loop until true");
        }
        var isTrue = true;
        var val = 10;
        do{
            System.out.println("Select a range value")
            if(val>100){
                isTrue = false;
            }
            val = val + 10;
        }while (isTrue);

    }
}