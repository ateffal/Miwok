/**
 * Created by TEFFAL AMINE on 25/07/2017.
 */

public class ReportCard {

    String name;
    char englishGrade;
    String mathGrade;
    int historyGrade;
    double biologyGrade;

    public ReportCard(String name, char englishGrade, String mathGrade, int historyGrade, double biologyGrade) {
        this.name = name;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.biologyGrade = biologyGrade;
    }

    public void setEnglishGrade(char englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setMathGrade(String mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        this.historyGrade = historyGrade;
    }

    public void setBiologyGrade(double biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getEnglishGrade() {
        return englishGrade;
    }

    public String getMathGrade() {
        return mathGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public double getBiologyGrade() {
        return biologyGrade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name : " +  name +
                "; English Grade=" + englishGrade +
                "; Math Grade='" + mathGrade + '\'' +
                "; History Grade=" + historyGrade +
                "; Biology Grade=" + biologyGrade
                ;
    }
}
