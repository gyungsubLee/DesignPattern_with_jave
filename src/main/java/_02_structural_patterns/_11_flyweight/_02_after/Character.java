package _02_structural_patterns._11_flyweight._02_after;

import lombok.Getter;

/** 불변 객체 -> record  ( java 14 )
 public record Character(char value, String color, Font font) {
 }
 */

@Getter
public class Character {

    private final char value;
    private final String color;
    private final Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
