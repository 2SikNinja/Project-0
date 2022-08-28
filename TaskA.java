//Peter Nguyen
// CS 1400
    //Assignment 2 Task A
    //9/14/2021

    import java.util.Scanner;

    public class TaskA
    {
        
        public static void main(String[] args)
        {
            
            //Original Recipe for Four Dozen
            double fourDozenButterG = 250.0, fourDozenButterOz = 8.0;
            double fourDozenSugarG = 110.0, fourDozenSugarOz = 4.0;
            double fourDozenFlourG = 360.0, fourDozenFlourOz = 12.0;
    
            //Individual Shortbread Recipe Variables
            double individualDivisor = 48.0;
    
            double individualButterG = fourDozenButterG/individualDivisor;
            double individualButterOz = fourDozenButterOz/individualDivisor;
    
            double individualSugarG = fourDozenSugarG/individualDivisor;
            double individualSugarOz = fourDozenSugarOz/individualDivisor;
    
            double individualFlourG = fourDozenFlourG/individualDivisor;
            double individualFlourOz = fourDozenFlourOz/individualDivisor;
            
            //Asking user for how many pieces they would like
            System.out.print("How Many Pieces of Shortbread Woud You Like to Bake? ");
    
            //Scanner
            Scanner s;
            s = new Scanner(System.in);
            double userDoubleInput = s.nextDouble();
            
            //Calculations from User to Input to Recipe Output
            double userRecipeOutputButterG = (userDoubleInput * individualButterG);
            double userRecipeOutputButterOz = (userDoubleInput * individualButterOz);
    
            double userRecipeOutputSugarG = (userDoubleInput * individualSugarG);
            double userRecipeOutputSugarOz = (userDoubleInput * individualSugarOz);
    
            double userRecipeOutputFlourG = (userDoubleInput * individualFlourG);
            double userRecipeOutputFlourOz = (userDoubleInput * individualFlourOz);
            
            //Output Message For User
            System.out.println("You said you will need " + userDoubleInput + " indivudual shortbread pieces.");
            System.out.println("Hence, for this recipe, you will need:");
            System.out.println(userRecipeOutputButterG + "g / " + userRecipeOutputButterOz + "oz of Butter");
            System.out.println(userRecipeOutputSugarG + "g / " + userRecipeOutputSugarOz + "oz of Sugar");
            System.out.println(userRecipeOutputFlourG + "g / " + userRecipeOutputFlourOz + "oz of Flour");
    
        }
    }
    