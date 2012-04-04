package com.vinsol.sms_scheduler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class LinearLayoutExtended extends LinearLayout{

	public LinearLayoutExtended(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public LinearLayoutExtended(Context context, AttributeSet attrs) { 
        super(context, attrs); 
	} 
	
	@Override
	public void setPressed(boolean pressed) {
		if (pressed && ((View) getParent()).isPressed()) {
            return;
        }else{
        	setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					LinearLayoutExtended.this.getChildAt(0).setPressed(true);
				}
			});
//        	getChildAt(0).setPressed(true);
        }
//		super.setPressed(pressed);
	}

}
