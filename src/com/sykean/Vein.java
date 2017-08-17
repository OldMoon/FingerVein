package com.sykean;

public class Vein {

	public native int openPort(String path,int baudrate);
	public native int closePort();
	public native int openDev(short para);
	public native int closeDev();
	public native int setLedState(short color,short flush);
	public native int getButtonState();
	public native int rollStep(byte curModel);
	public native int rollFinish(int id,byte[] modelId);
	public native int identy(byte[] modelId);
	public native int getIDExist(int id,byte[] count);
	public native int cancelWait();
	public native int clearUser();
	public native int setUsbMode(byte mode);
	public native int getEmptyId(byte[] newId);
	public native int delUser(int modelId);
	public native int setBaudRate(byte speed);
	public native int setTimeout(byte timeout);
	public native int getUserNum(byte[] userCount,byte[] modelCount);
	public native int reset();
	public native int getSystemInfo(byte[] systemInfo);
	public native int uploadModel(int modelId,byte[] data,int dataSize);
	public native int downloadModel(int packSize,/*int modelSize,*/int modelId,byte[] outData,int[] outSize);
	public native byte getImage(short num);
}
