package org.firstinspires.ftc.teamcode.WebCam;

public class VisionObject {
    int left, right, top, bottom, centerX, centerY, angle;
    public VisionObject(int l, int r, int b, int t){
        left=l; right=r;
        bottom=b; top=t;
        centerX = (left+right)/2;
        centerY = (top+bottom)/2;
    }
}
