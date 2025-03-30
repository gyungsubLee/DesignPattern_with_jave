package _02_structural_patterns._07_bridge._02_after;

import _02_structural_patterns._07_bridge._02_after.champion.Champion;
import _02_structural_patterns._07_bridge._02_after.champion.아리;
import _02_structural_patterns._07_bridge._02_after.skin.KDA;
import _02_structural_patterns._07_bridge._02_after.skin.PoolParty;

public abstract class App implements Champion {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();
    }
}
