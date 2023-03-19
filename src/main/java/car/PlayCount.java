package car;

public class PlayCount {
    private final int playCount;

    public PlayCount(int playCount) {
        if( playCount < 1 ){
            throw new IllegalArgumentException("1회이상 작동해야합니다");
        }
        this.playCount = playCount;
    }

    public int compare(int playCount){
        return Integer.compare(this.playCount, playCount);
    }
}
