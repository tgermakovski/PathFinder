package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import java.util.Random;


public class Loc {

    Vector2 position = new Vector2(0,0);

    int nsf=-1; //neither = -1, start = 0, finish = 1
    int impassability; // negative = portal, 0 = impassable water, 1-9 passable, 10 = impassable
    int xpl = -1; //unexplored = -1, explored = 0, path = 1

    public Loc(int x,int y,int imp){
        position.x=x;position.y=y;impassability=imp;
    }

    public void Update(float deltaTime){
        if(Gdx.input.isButtonJustPressed(0)) {}
        if(Gdx.input.isKeyPressed(Keys.A)) {}
        if(position.x<=0) {}
    }

    public void Draw(SpriteBatch batch){
        Update(Gdx.graphics.getDeltaTime());
        //sprite.setPosition(position.x, position.y);
        //sprite.draw(batch);
    }



}
