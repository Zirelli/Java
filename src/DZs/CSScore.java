public class CSScore {
    public static void main(String[] args) {
String first = ("First");
int firstPlayerFirst = 1, secondPlayerFirst = 3, thirdPlayerFirst = 5, fourthPlayerFirst = 2,
        fifthPlayerFirst = 2;

String second = ("Second");
int firstPlayerSecond = 2, secondPlayerSecond = 2, thirdPlayerSecond = 6,
        fourthPlayerSecond = 3, fifthPlayerSecond = 6;

int firstFrags = firstPlayerFirst*secondPlayerFirst*thirdPlayerFirst*fourthPlayerFirst*
        fifthPlayerFirst / 5;
int secondFrags = firstPlayerSecond*secondPlayerSecond*thirdPlayerSecond*
        fourthPlayerSecond*fifthPlayerSecond / 5;

String winner;
int winnerScore;
if (firstFrags > secondFrags){
    winner = first;
    winnerScore = firstFrags;
} else  {
    winner = second;
    winnerScore = secondFrags;
        }


System.out.println("winner is " + winner + " with a total number of score: "  +winnerScore);
}
    }