package ms1;

//1401. Circle and Rectangle Overlapping
class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
    int nearX = Math.max(x1,Math.min(x2,xCenter));
    int nearY = Math.max(y1,Math.min(y2,yCenter));
    int d = (int)Math.abs(Math.sqrt(Math.pow((xCenter-nearX),2)+Math.pow((yCenter-nearY),2)));
    if (d<=radius){
        return true;
    }
    return false;
    }
}
// int d1 = (int)Math.sqrt((x1-xCenter)*(x1-xCenter) + (y1-yCenter)*(y1-yCenter));
// int d2 = (int)Math.sqrt((x2-xCenter)*(x2-xCenter) + (y2-yCenter)*(y2-yCenter));
// int d = Math.min(d1,d2);
// if (d<=radius){
//     return true;
// }else{
//     return false;
// }
//This approach fails because:
// The correct logic involves finding the single nearest point on the rectangle to the circle's center. This point could lie:
// On the top, bottom, left, or right edge.
// At a corner.
// Inside the rectangle.
