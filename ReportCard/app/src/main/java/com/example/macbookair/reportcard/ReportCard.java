package com.example.macbookair.reportcard;

/**
 * Created by macbookair on 28/06/16.
 */
public class ReportCard {
    private int TotalMarks;
    private int Percentage;
    private int Physics;
    private int Chemistry;
    private int Computer;
    private int English;
    private int Maths;


    public ReportCard(int total, int percentage, int phy, int chem,
                      int english, int math, int computer) {
        this.TotalMarks = total;
        this.Percentage = percentage;
        this.Physics = phy;
        this.Chemistry = chem;
        this.English = english;
        this.Maths = math;
        this.Computer = computer;
    }

    public int getTotalMarks() {
        return TotalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.TotalMarks = totalMarks;
    }

    public int getPercentage() {
        return Percentage;
    }

    public void setPercentage(int percentage) {
        this.Percentage = percentage;
    }

    public int getPhysicsMarks() {
        return Physics;
    }

    public void setPhysicsMarks(int physics) {
        this.Physics = physics;
    }

    public int getChemistryMarks() {
        return Chemistry;
    }

    public void setChemistryMarks(int chemistry) {
        this.Chemistry = chemistry;
    }

    public int getEnglishMarks() {
        return English;
    }

    public void setEnglishMarks(int english) {
        this.English = english;
    }

    public int getMathsMarks() {
        return Maths;
    }

    public void setMathsMarks(int historyMarks) {
        this.Maths = historyMarks;
    }
    public int getComputerMarks() {
        return Computer;
    }

    public void setComputerMarks(int computer) {
        this.Computer = computer;
    }




    @Override
    public String toString() {
        return "Report Card {" +
                "Total Marks Obtained:" + TotalMarks +
                ",Overall Percentage:" + Percentage +
                ",Physics:" + Physics +
                ",Chemistry:"+Chemistry+
                ",Computer:"+Computer+
                ",English:" + English +
                ",Math:" + Maths +
                "}"+" Note:Marks are out of 100";
    }
}
