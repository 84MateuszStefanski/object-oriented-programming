package enumexample;

public enum LevelEnum {
   LEVEL_1(10,10,10,100),
   LEVEL_2(12,10,12,500),
   LEVEL_3(15,10,14,1000),
   LEVEL_4(20,10,20,5000)
    ;

    private int length;
    private int width;
    private int cpuDifiiculty;
    private int maxScore;

    LevelEnum(int length, int width, int cpuDifiiculty, int maxScore) {
        this.length = length;
        this.width = width;
        this.cpuDifiiculty = cpuDifiiculty;
        this.maxScore = maxScore;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getCpuDifiiculty() {
        return cpuDifiiculty;
    }

    public int getMaxScore() {
        return maxScore;
    }
}
