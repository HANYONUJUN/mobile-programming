package com.inhatc.android_image;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public class AndroidView extends View{

    Drawable imgAndroid;
    int ix, iy;
    int imgWidth, imgHeight;

    public AndroidView(Context context, AttributeSet attrs) {
        super(context, attrs);

        imgAndroid= this.getResources().getDrawable(R.drawable.androi);
        imgWidth = imgAndroid.getIntrinsicWidth();
        imgHeight = imgAndroid.getIntrinsicHeight();
        ix=0;
        iy=0;
    }
    @Override
    protected void onDraw(Canvas canvas) {

        imgAndroid.setBounds(ix,iy, ix+imgWidth, iy+imgHeight);
        imgAndroid.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

        ix = (this.getWidth()-imgWidth)/2;
        iy= (this.getHeight()-imgHeight)/2;

        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        ix = (int)event.getX();
        iy = (int)event.getY();
        this.invalidate();
        return super.onTouchEvent(event);
    }

    //키보드로 움직이는 이벤트
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        
        switch(keyCode)
        {
            case KeyEvent.KEYCODE_DPAD_LEFT:
                ix -=15;
                if(ix <= 0) ix=0;
                break;
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                ix += 15;
                if(ix >= this.getWidth() -imgWidth) ix = this.getWidth()-imgWidth;
                break;
            case KeyEvent.KEYCODE_DPAD_UP:
                iy -= 15;
                if(iy <= 0) iy=0;
                break;
            case KeyEvent.KEYCODE_DPAD_DOWN:
                iy +=15;
                if(iy >= this.getHeight() -imgHeight) iy = this.getHeight() - imgHeight;
                break;
        }

        this.invalidate(); // 화면을 다시 그려달라는 명령어
        return super.onKeyDown(keyCode, event);
    }
}
