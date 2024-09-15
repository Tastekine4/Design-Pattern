package org.example.structuraldesignpatterns.adapterdesignpattern;

public class School {

    public static void main(String[] args) {

        AssignmentWork assignmentWork = new AssignmentWork();
//        PilotPen pilotPen = new PilotPen();
        // It needs an adapter like iphone 4g and 6 has different type plugin, so we use adapter for it.
//        assignmentWork.setP(pilotPen);
        Pen pen = new PenAdapter();
        assignmentWork.setP(pen);

        assignmentWork.writeAssignment("I am a bit tired to write Assignment");
    }
}
