package com.sist.common;


import java.awt.Image;

import javax.swing.*;
public class ImageChange
{
	public static Image getImage(ImageIcon ii, int width, int height) {
		Image deimg = ii.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return deimg;
	}
}
