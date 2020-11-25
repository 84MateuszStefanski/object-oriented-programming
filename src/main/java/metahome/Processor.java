package metahome;

import metadane.MyAnnotation;

public class Processor {

    private double frequency;
    private int numOfCores;
    private String yearOfProd;

    public Processor() {

    }

    public Processor(double frequency, int numOfCores, String yearOfProd) {
        this.frequency = frequency;
        this.numOfCores = numOfCores;
        this.yearOfProd = yearOfProd;
    }

    @ProcessorAnnotation(producer = "Intel", model = "Core i9")
    public double getFrequency() {
        return frequency;
    }

    public int getNumOfCores() {
        return numOfCores;
    }

    public String getYearOfProd() {
        return yearOfProd;
    }

    @Deprecated
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setNumOfCores(int numOfCores) {
        this.numOfCores = numOfCores;
    }

    public void setYearOfProd(String yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", numOfCores=" + numOfCores +
                ", yearOfProd='" + yearOfProd + '\'' +
                '}';
    }
}
