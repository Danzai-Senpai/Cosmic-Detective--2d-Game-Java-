package com.pFiction.gfx;

import com.pFiction.game.Game;

import java.awt.*;
import java.awt.image.BufferedImage;

public class AnimationManager {
    private SpriteSet spriteSet;
    private BufferedImage currentAnimationSheet;
    private int currentFrameTime;
    private int upPerFrame;
    private int frameIndex;

    public AnimationManager(SpriteSet spriteSet){
        this.spriteSet = spriteSet;
        this.upPerFrame = 20;
        this.frameIndex = 0;
        this.currentFrameTime = 0;
        playAnimation("walking");
    }

    public Image getSprite(){
        return currentAnimationSheet.getSubimage(
                frameIndex * Game.SPRITE_SIZE,
                0,
                Game.SPRITE_SIZE,
                Game.SPRITE_SIZE
        );
    }

    public void update(){
        currentFrameTime++;

        if (currentFrameTime >= upPerFrame){
            currentFrameTime =  0;
            frameIndex++;

            if (frameIndex >= currentAnimationSheet.getWidth() / Game.SPRITE_SIZE - 1){
                frameIndex = 0;
            }
        }
    }

    public void playAnimation(String name){
        this.currentAnimationSheet = (BufferedImage) spriteSet.get(name);
    }

}