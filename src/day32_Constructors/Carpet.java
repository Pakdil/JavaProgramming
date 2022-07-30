package day32_Constructors;

public class Carpet {

   public double width, length, unitPrice;
   public boolean isPerisan;

    public Carpet(double width, double length, double unitPrice, boolean isPerisan) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPerisan = isPerisan;
    }

    public double calcCost() {

        double totalPrice = (width * length) * unitPrice;

        if (isPerisan) {

            totalPrice += 200;
        }

        return  totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPerisan=" + isPerisan +
                ", total price $" + calcCost() +
                '}';
    }
}

/*

1. Carpet Task:
   1.1 create a custom class for the Carpet class that should contain the following:
   Attributes:
        width, length, unitPrice, isPerisan(boolean)
   Add a constructor to set all the instances

 */