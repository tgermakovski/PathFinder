package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import java.util.Random;


public class Alien {

public Vector2 position;
public Vector2 position_initial;
public Vector2 position_bullet;
public Sprite sprite_bullet;
public float speed_bullet = 600;
public Sprite sprite;
public Boolean alive = true;
public Player player;
public Random rando = new Random();

public Alien(Vector2 position,Texture img, Texture img_bullet, Player p){
    player=p;
    this.position = position;
    this.position_initial = position;
    sprite = new Sprite(img);
    sprite_bullet = new Sprite(img_bullet);
    sprite_bullet.setScale(1);
    sprite.setScale(1);
    position_bullet = new Vector2(0,-10000);

}

public void Update(float deltaTime){

    if(position_bullet.y<0) {
        int chance = rando.nextInt(1000);
        if(chance==0){
            position_bullet.x = position.x+8;
            position_bullet.y = position.y - 13*sprite_bullet.getScaleY();
        }
    }


    position_bullet.y-=deltaTime*speed_bullet;
}

public void Draw(SpriteBatch batch){
    Update(Gdx.graphics.getDeltaTime());
    sprite.setPosition(position.x, position.y);
    sprite.draw(batch);
    sprite_bullet.setPosition(position_bullet.x, position_bullet.y);
    sprite_bullet.draw(batch);
}

}
