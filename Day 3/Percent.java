class Percent
{
    public static void main(String args[]) 
{
       
        int scoredMarks = 430;
        int totalMarks = 500;

        // Calculate percentage
        double percentage = (scoredMarks / (double) totalMarks) * 100;

        // Print the result
        System.out.println("Scored Marks: " + scoredMarks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
    }
}
