package day40_FinalKeyward;

import day39_Recap.shapeTask.Circle;

public class EncapsulationReview {

    private Circle circle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        if (circle.getRadius() < 5) {
            return;
        }

        this.circle = circle;
    }
}
