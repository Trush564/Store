public class Size {
    private double chest;
    private double waist;
    private double hips;
    //Конструктор
    public Size(double chest, double waist, double hips) {
        this.chest = chest;
        this.waist = waist;
        this.hips = hips;
    }
    public double getChest() {
        return chest;
    }

    public double getWaist() {
        return waist;
    }

    public double getHips() {
        return hips;
    }
    //метод для виведення розмірів
    public void printSize(){
        System.out.println("Обхват грудей:"+ chest+ "см, талії:"+ waist+"см, стегон"+hips+"см");
    }
}


