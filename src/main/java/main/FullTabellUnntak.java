package main;



public class  FullTabellUnntak extends RuntimeException {
    public FullTabellUnntak(int storrelse) {
        super(String.format("Storrelse: %d", storrelse));
    }
}
