package _02_structural_patterns._07_bridge._02_after.champion;

import _02_structural_patterns._07_bridge._02_after.skin.Skin;

public interface Champion extends Skin {
    void move();
    void skillQ();
    void skillW();
    void skillE();
    void skillR();
}
