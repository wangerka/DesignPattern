package com.example.measurespecdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class CircleView extends View {

	public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	public CircleView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public CircleView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	Paint paint;

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		paint = new Paint();
		canvas.drawCircle(getWidth()/2, getHeight()/2, getWidth() > getHeight()? getHeight()/2 : getWidth()/2, paint);
	}
	
	@Override
	protected void onLayout(boolean changed, int left, int top, int right,
			int bottom) {
		// TODO Auto-generated method stub
		Log.i("gejun","onLayout getWidth = "+getWidth());
		Log.i("gejun","onLayout getHeight = "+getHeight());
		Log.i("gejun","onLayout getMeasuredWidth = "+getMeasuredWidth());
		Log.i("gejun","onLayout getMeasuredHeight = "+getMeasuredHeight());
		super.onLayout(changed, left, top, right, bottom);
	}
	
	
	/*
	 * …Ë÷√viewµƒwidth∫Õheight
	 * @see android.view.View#onMeasure(int, int)
	 */
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		int widthSize = MeasureSpec.getSize(widthMeasureSpec);
		int heightSize = MeasureSpec.getSize(heightMeasureSpec);
		int widthMode = MeasureSpec.getMode(widthMeasureSpec);
		int heightMode = MeasureSpec.getMode(heightMeasureSpec);
		
		if(widthMode == MeasureSpec.AT_MOST){
			widthMeasureSpec = MeasureSpec.makeMeasureSpec(200, widthMode);
		}
		if(heightMode == MeasureSpec.AT_MOST){
			heightMeasureSpec = MeasureSpec.makeMeasureSpec(200, heightMode);
		}
		Log.i("gejun","onMeasure getWidth = "+getWidth());
		Log.i("gejun","onMeasure getHeight = "+getHeight());
		Log.i("gejun","onMeasure getMeasuredWidth = "+getMeasuredWidth());
		Log.i("gejun","onMeasure getMeasuredHeight = "+getMeasuredHeight());
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		
		//setMeasuredDimension(wsize,hsize);//********
	}
}
