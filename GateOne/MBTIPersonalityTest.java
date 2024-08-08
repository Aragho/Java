import java.util.Scanner;

public class MBTIPersonalityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	 System.out.println("Be yourself and answer honestly to find out your personality type");
        System.out.println("Learn how your personality type influences many areas of your life");
        System.out.println("Grow into the person you want to be with your optional premium suite");


        System.out.print("\n\nWhat's Your Name:");
        String name = input.nextLine();

        String[] QUESTIONS = {
            "1.(A) Expend Energy, Enjoy groups\t(B) Conserve Energy, Enjoy one on ones",
            "2.(A) Interpret Literally\t(B) Look for meaning and possibilities",
            "3.(A) Logical, thinking, questioning\t(B) Empathetic, Feeling, Accommodating", 
            "4.(A) Organized, Orderly\t(B) Flexible, adaptable",
            "5.(A) More outgoing, think out loud\t(B) More reserved, Think to yourself",
            "6.(A) Practical, Realistic, Experiential\t(B) Imaginative, Innovative, Theoretical",
            "7.(A) Candid, Straight Forward, Frank\t(B) Tactful, Kind, Encouraging",
            "8.(A) Plan, Schedule\t(B) Unplanned, Spontaneous",
            "9.(A) Seeks Many tasks, Public activities, Interaction with others\t(B) Seek private, Solitary activities with quiet to concentrate",
            "10.(A) Standard, Usual, Conventional\t(B) Different, Novel, Unique",
            "11.(A) Firm Tend to criticize, Hold the line\t(B) Gentle, Tend to appreciate, Conciliate",
            "12.(A) Regulated, Structured\t(B) Easy-going, live and let live",
            "13.(A) External, Communicative, Express yourself\t(B) Internal, Reticent, Keep to yourself",
            "14.(A) Focus on here-and-now\t(B) Look to the future, Global perspective, Big picture",
            "15.(A) Tough-minded, Just\t(B) Tender-hearted, merciful",
            "16.(A) Preparation, Plan ahead\t(B) Go with the flow, Adapt as you go",
            "17.(A) Active, Initiate\t(B) Reflective, Deliberate",
            "18.(A) Facts, things, What is\t(B) Ideas, Dreams, What could be, Philosophical",
            "19.(A) Matter of fact, Issue-oriented\t(B) Sensitive, People-oriented, Compassionate",
            "20.(A) Control, Govern\t(B) Latitude, Freedom"
        };

        int extroverted = 0;
        int introverted = 0;
        int sensing = 0;
        int intuitive = 0;
        int thinking = 0;
        int feeling = 0;
        int judging = 0;
        int perceptive = 0;

        for (int index = 0; index < QUESTIONS.length; index++) {
            System.out.println(QUESTIONS[index]);
            String answer = input.nextLine().toUpperCase();

            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")) {
                System.out.print("Please enter 'A' or 'B': ");
                answer = input.nextLine().toUpperCase();
            }

            switch (index) {
                case 0: case 4: case 8: case 12: case 16: {
                    if (answer.equalsIgnoreCase("A")) extroverted++;
                    else introverted++;
                }
                break;
                case 1: case 5: case 9: case 13: case 17: {
                    if (answer.equalsIgnoreCase("A")) sensing++;
                    else intuitive++;
                }
                break;
                case 2: case 6: case 10: case 14: case 18: {
                    if (answer.equalsIgnoreCase("A")) thinking++;
                    else feeling++;
                }
                break;
                case 3: case 7: case 11: case 15: case 19: {
                    if (answer.equalsIgnoreCase("A")) judging++;
                    else perceptive++;
                }
                break;
            }
        }

        String personalityType = "";
        personalityType += (extroverted > introverted) ? "E" : "I";
        personalityType += (sensing > intuitive) ? "S" : "N";
        personalityType += (thinking > feeling) ? "T" : "F";
        personalityType += (judging > perceptive) ? "J" : "P";

        System.out.println("Your MBTI Personality Test Type is: " + personalityType);

        System.out.println("""
            E - Extroverted
            I - Introverted
            N - Intuitive
            S - Sensing
            T - Thinking
            F - Feeling
            J - Judging
            P - Perceptive
        """);
	}
}