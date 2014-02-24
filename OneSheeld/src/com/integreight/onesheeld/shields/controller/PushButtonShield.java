package com.integreight.onesheeld.shields.controller;

import android.app.Activity;

import com.integreight.firmatabluetooth.ShieldFrame;
import com.integreight.onesheeld.model.ArduinoConnectedPin;
import com.integreight.onesheeld.utils.ControllerParent;

public class PushButtonShield extends ControllerParent<PushButtonShield> {
	private int connectedPin;
	private boolean isButtonOn;

	public PushButtonShield() {
		super();
	}

	public PushButtonShield(Activity activity,String tag) {
		super(activity,tag);
	}

	@Override
	public void setConnected(ArduinoConnectedPin... pins) {
		connectedPin = pins[0].getPinID();
		super.setConnected(pins);
	}

	public boolean isButtonOn() {
		return isButtonOn;
	}

	public void setButton(boolean isButtonOn) {
		this.isButtonOn = isButtonOn;
		activity.getThisApplication().getAppFirmata()
				.digitalWrite(connectedPin, isButtonOn);
		CommitInstanceTotable();
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onNewShieldFrameReceived(ShieldFrame frame) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

}