package _02_structural_patterns._07_bridge._01_before.champion;

import _02_structural_patterns._07_bridge._02_after.Skin;

public interface Champion extends Skin {
    void move();
    void skillQ();
    void skillW();
    void skillE();
    void skillR();
}
